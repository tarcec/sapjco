package cl.tarce.sap.core.execution;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.sap.conn.jco.JCoContext;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoParameterList;
import com.sap.conn.jco.JCoStructure;
import com.sap.conn.jco.JCoTable;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiInParameter;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.core.conn.JCOConnectionFactory;
import cl.tarce.sap.core.rfcdefs.SapService;
import cl.tarce.sap.core.scalars.BapiScalar;

/**
 * 
 * @author tarce
 *
 */

@Aspect
public class BapiServiceAspect{

	private static String BAPI_TRANSACTION_COMMIT = "BAPI_TRANSACTION_COMMIT";
	
	JCoDestination destination 	= null;
	JCoFunction function 		= null;
	
	@After("execution(* *(..)) && @annotation(com.redtogreen.rpa.sap.core.annotations.BapiMethod)")
	public void executeFunction(JoinPoint joinPoint) throws Throwable {
		//CLASE
		String fullBapiClazzName	= joinPoint.getTarget().getClass().getName();
		Class bapiClazz				= Class.forName(fullBapiClazzName);
		
		//METODO
		Method bapiMethod			= this.findMethodByName(joinPoint.getSignature().getName(), bapiClazz);
		
		//ARGS
		Object[] args				= joinPoint.getArgs();
		
		//OBJETO
		Object object				= joinPoint.getTarget();
				
		//DETERMINAR TIPO DE IMPLEMENTACION
		ImplType implType = this.getImplType(bapiClazz);
		if(implType.equals(ImplType.JCO))
			this.executeAsJCO(bapiClazz, bapiMethod, object, args);
		else if (implType.equals(ImplType.WINDLL))
			this.executeAsWinDLL(bapiClazz, bapiMethod, object, args);	
	}
	
	@Before("execution(* *(..)) && @annotation(com.redtogreen.rpa.sap.core.annotations.BapiTransaction)")
	public void initTransaction(JoinPoint joinPoint) throws Throwable{	
		
		//INICIAR CONEXION Y TRANSACCIONALIDAD
		
		//OBJETO
		Object object				= joinPoint.getTarget();
		
		//GENERAR ARCHIVO DE CONEXION
		SapService sapService = (SapService) object;
			
		//CONECTAR
    	destination = JCOConnectionFactory.getInstance(sapService.getConnection()).getJcoDestination();
    	if(Counter.getCounter() == 0){
    		JCoContext.begin(destination);
    		Counter.addCounter();
    	}
	}
	
	@After("execution(* *(..)) && @annotation(com.redtogreen.rpa.sap.core.annotations.BapiTransaction)")
	public void endTransaction(JoinPoint joinPoint) throws Throwable{
		//FINALIZAR CONEXION Y TRANSACCIONALIDAD		
        function = destination.getRepository().getFunction(BAPI_TRANSACTION_COMMIT);
        function.execute(destination);
        
		JCoContext.end(destination);
	}
	
	private void executeAsJCO(Class bapiClazz, Method bapiMethod, Object object, Object[] args) throws JCoException{
		JCoParameterList jcoInParameterList 	= null;
		JCoParameterList jcoOutParameterList 	= null;		
		
//		//GENERAR ARCHIVO DE CONEXION
//		SapService sapService = (SapService) object;
//			
//		//CONECTAR
//    	destination = JCOConnectionFactory.getInstance(sapService.getConnection()).getJcoDestination();
//    	if(Counter.getCounter() == 0){
//    		JCoContext.begin(destination);
//    		Counter.addCounter();
//    	}
    	
		//OBTENER FUNCION
		String functionName = this.getFunction(bapiMethod);	
		function = destination.getRepository().getFunction(functionName);
		
		//PARAMETROS DE ENTRADA
		this.setImportParameterList(bapiMethod, args);
		
		//EJECUTAR
		function.execute(destination);
		
		//PARAMETROS DE SALIDA
		this.getExportParameterList(bapiMethod, args);
		
//		//DESCONECTAR
//		JCoContext.end(destination);
	}
	
	private void executeAsWinDLL(Class bapiClazz, Method bapiMethod, Object object, Object[] args) throws JCoException{
		/** TO:DO
		 * 
		 */
	}
	
	private Method findMethodByName(String methodName, Class bapiClazz){
		Method rtrnMethod = null;
		
		Method[] methods = bapiClazz.getMethods();
		
		for(Method method : methods){
			if(method.getName().equals(methodName)){
				rtrnMethod = method;
				break;
			}
		}
		
		return rtrnMethod;
	}
	
	private ImplType getImplType(Class bapiClazz){
		Annotation annotation = bapiClazz.getAnnotation(BapiClass.class);
		Annotation[] annotations = bapiClazz.getAnnotations();
		BapiClass bapiClass = (BapiClass) annotation;
		
		return bapiClass.implType();
	}
	
	private String getFunction(Method bapiMethodd){
		Annotation annotation = bapiMethodd.getAnnotation(BapiMethod.class);
		BapiMethod bapiMethod = (BapiMethod) annotation;
		
		return bapiMethod.method();
	}
	
	private void setImportParameterList(Method bapiMethod, Object[] args){
		Integer parameterIndex = 0;
		
		if(function.getImportParameterList() != null){
			function.getImportParameterList().clear();		
			
			Annotation[][] annotations = bapiMethod.getParameterAnnotations();
			
			for(Annotation[] parameterIterator : annotations){
				for(Annotation anotation : parameterIterator){
					//PARAMETRO DE ENTRADA
					if(anotation.annotationType().equals(BapiInParameter.class)){
						BapiInParameter bapiInParameter = (BapiInParameter) anotation;
						ParameterType parameterType = bapiInParameter.type();
						String parameterName = bapiInParameter.name();
						Class tableMappingClass = bapiInParameter.mappingClass();
						Object parameterValue = args[parameterIndex];
						
						if(parameterValue != null){						
							//ES TABLA
							if(ParameterType.TABLE.equals(parameterType)){
								JCoTable jcoTable = function.getTableParameterList().getTable(parameterName);
								this.setTableValues(parameterValue, tableMappingClass, jcoTable);
								function.getTableParameterList().setValue(parameterName, jcoTable);
							}
							//ES ESTRUCTURA
							else if(ParameterType.STRUCTURE.equals(parameterType)){
								JCoStructure jcoStructure = function.getImportParameterList().getStructure(parameterName);
								this.setStructureValues(parameterValue, jcoStructure);
								function.getImportParameterList().setValue(parameterName, jcoStructure);
							}						
							//ES ESCALAR
							else{
								function.getImportParameterList().setValue(parameterName, ((BapiScalar)parameterValue).getValue());
							}
						}
					}
				}
				parameterIndex++;
			}
		}
	}
	
	private void getExportParameterList(Method bapiMethod, Object[] args){
		try{
			Integer parameterIndex = 0;
		
			Annotation[][] annotations = bapiMethod.getParameterAnnotations();
			
			for(Annotation[] parameterIterator : annotations){
				for(Annotation anotation : parameterIterator){
					//PARAMETRO DE SALIDA
					if(anotation.annotationType().equals(BapiOutParameter.class)){
						BapiOutParameter bapiOutParameter = (BapiOutParameter) anotation;
						ParameterType parameterType = bapiOutParameter.type();
						String parameterName = bapiOutParameter.name();
						Class tableMappingClass = bapiOutParameter.mappingClass();
					
						//DETERMINAR SI ES ESTRUCUTRA
						if(ParameterType.STRUCTURE.equals(parameterType)){
							JCoStructure jcoStructure = function.getExportParameterList().getStructure(parameterName);
							this.getStructureValues(jcoStructure, args[parameterIndex]);
						}
						//ES TABLA
						else if(ParameterType.TABLE.equals(parameterType)){
							JCoTable jcoTable = function.getTableParameterList().getTable(parameterName);
							System.out.println(jcoTable);
							this.getTableValues(jcoTable, tableMappingClass, args[parameterIndex]);
						}
						//ES ESCALAR
						else{
							BeanUtils.setProperty(args[parameterIndex], "value", function.getExportParameterList().getValue(parameterName));
						}					
					}
				}
				parameterIndex++;
			}
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	private void setStructureValues(Object object, JCoStructure jcoStructure){
		try{
			Class structureClazz 		= object.getClass();		
			Field[] arrFields 			= structureClazz.getDeclaredFields();
						
			//PARA CADA PROPIEDAD DE LA ESTRUCTURA DESTINO
			for(Field field : arrFields){
				//OBTENER ANOTACIONES
				Annotation annotation = field.getAnnotation(BapiParameter.class);
				
				if(annotation != null){
					BapiParameter bapiParameter = (BapiParameter) annotation;
					ParameterType parameterType = bapiParameter.type();
					String parameterName = bapiParameter.name();
					Object propertyValue = BeanUtils.getProperty(object, field.getName());
					
					//RECURSION CUANDO SE TRATA DE UN PARAMETRO TABLA
					if(ParameterType.TABLE.equals(parameterType)){
						//this.processTable(bapiParameterName, parameterValue);
					}
					//PARAMETRO ESCALAR
					else{										
						jcoStructure.setValue(parameterName, propertyValue);
					}
				}			
			}			
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	private void getStructureValues(JCoStructure jcoStructure, Object object){
		try{
			Class structureClazz 		= object.getClass();		
			Field[] arrFields 			= structureClazz.getDeclaredFields();
						
			//PARA CADA PROPIEDAD DE LA ESTRUCTURA DESTINO
			for(Field field : arrFields){
				//OBTENER ANOTACIONES
				Annotation annotation = field.getAnnotation(BapiParameter.class);
				
				if(annotation != null){
					BapiParameter bapiParameter = (BapiParameter) annotation;
					ParameterType parameterType = bapiParameter.type();
					String parameterName = bapiParameter.name();
					
					//RECURSION CUANDO SE TRATA DE UN PARAMETRO TABLA
					if(ParameterType.TABLE.equals(parameterType)){
						//this.processTable(bapiParameterName, parameterValue);
					}
					//PARAMETRO ESCALAR
					else{										
						Object jcoStructureValue = jcoStructure.getValue(parameterName);
						BeanUtils.setProperty(object, field.getName(), jcoStructureValue);
					}
				}			
			}			
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	private void setTableValues(Object objectList, Class tableMappingClass, JCoTable jcoTable){
		Integer i;
		
		Integer listSize = ((List) objectList).size();
		jcoTable.appendRows(listSize);
		
		try{
			Class arrayComponentClazz 	= tableMappingClass;				
			Field[] arrFields 			= arrayComponentClazz.getDeclaredFields();
			
			for(i = 0; i < jcoTable.getNumRows(); i++){
				jcoTable.setRow(i);
				Object objectItem = ((List) objectList).get(i);
								
				//PARA CADA PROPIEDAD DE LA ESTRUCTURA ORIGEN
				for(Field field : arrFields){
					//OBTENER ANOTACIONES
					Annotation annotation = field.getAnnotation(BapiParameter.class);
										
					if(annotation != null){
						//OBTENCION METADATA
						BapiParameter bapiParameter = (BapiParameter) annotation;
						ParameterType parameterType = bapiParameter.type();
						String parameterName = bapiParameter.name();
						
						Object objectValue = BeanUtils.getProperty(objectItem, field.getName());
						
						if(objectValue != null){
							//RECURSION CUANDO SE TRATA DE UN PARAMETRO TABLA
							if(ParameterType.TABLE.equals(parameterType)){
								/**
								 * @to do
								 **/
							}
							//PARAMETRO ESCALAR
							else{
								jcoTable.setValue(parameterName, objectValue);
							}
						}
					}
				}
			}
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}	
	}
	
	private void getTableValues(JCoTable jcoTable, Class tableMappingClass, Object object){
		Integer i;
				
		try{
			Class arrayComponentClazz 	= tableMappingClass;					
			Field[] arrFields 			= arrayComponentClazz.getDeclaredFields();
			
			for(i = 0; i < jcoTable.getNumRows(); i++){
				jcoTable.setRow(i);
				
				//CREAR INSTANCIA DEL OBJETO
				Object rtnrObj = arrayComponentClazz.newInstance();
				
				//PARA CADA PROPIEDAD DE LA ESTRUCTURA DESTINO
				for(Field field : arrFields){
					//OBTENER ANOTACIONES
					Annotation annotation = field.getAnnotation(BapiParameter.class);
					
					if(annotation != null){
						BapiParameter bapiParameter = (BapiParameter) annotation;
						ParameterType parameterType = bapiParameter.type();
						String parameterName = bapiParameter.name();
						
						//RECURSION CUANDO SE TRATA DE UN PARAMETRO TABLA
						if(ParameterType.TABLE.equals(parameterType)){
							//this.processTable(bapiParameterName, parameterValue);
						}
						//PARAMETRO ESCALAR
						else{										
							Object jcoTableValue = jcoTable.getValue(parameterName);
							BeanUtils.setProperty(rtnrObj, field.getName(), jcoTableValue);
						}
					}			
				}
				
				//ANADIR OBJETO A LISTA DE RETORNO
				((List) object).add(rtnrObj);
			}
		}		
		catch(Exception e){
			throw new RuntimeException(e);
		}		
	}	
}
