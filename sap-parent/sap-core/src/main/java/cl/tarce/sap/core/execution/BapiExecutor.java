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
import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.conn.JCOConnectionFactory;
import cl.tarce.sap.core.rfcdefs.SapService;
import cl.tarce.sap.core.scalars.BapiScalar;

/**
 * 
 * @author tarce
 *
 */

public class BapiExecutor{

	private static String BAPI_TRANSACTION_COMMIT = "BAPI_TRANSACTION_COMMIT";
	
	private static JCoDestination destination 	= null;
	private static JCoFunction function 		= null;
	
	public static void executeFunction(Class bapiClazz, String bapiMethodName, Object args[]) throws JCoException {
		//EJECUTAR BAPI ...
		Method bapiMethod 	= getMethod(bapiClazz, bapiMethodName);
				
		//DETERMINAR TIPO DE IMPLEMENTACION
		ImplType implType = getImplType(bapiClazz);
		if(implType.equals(ImplType.JCO))
			executeAsJCO( bapiMethod, args);
		else if (implType.equals(ImplType.WINDLL))
			executeAsWinDLL(bapiMethod, args);	
	}
	
	public static void initTransaction(BapiConnection bapiConnection) throws JCoException {	
		//INICIAR CONEXION Y TRANSACCIONALIDAD
		
		//CONECTAR
    	destination = JCOConnectionFactory.getInstance(bapiConnection).getJcoDestination();
    	if(Counter.getCounter() == 0){
    		JCoContext.begin(destination);
    		Counter.addCounter();
    	}
	}
	
	public static void endTransactionWithCommit() throws JCoException{
		//FINALIZAR CONEXION Y TRANSACCIONALIDAD		
        function = destination.getRepository().getFunction(BAPI_TRANSACTION_COMMIT);
        function.execute(destination);
        
		JCoContext.end(destination);
	}
	
	public static void endTransaction() throws JCoException{
		//FINALIZAR CONEXION	      
		JCoContext.end(destination);
	}
	
	private static void executeAsJCO(Method bapiMethod, Object[] args) throws JCoException{
		JCoParameterList jcoInParameterList 	= null;
		JCoParameterList jcoOutParameterList 	= null;		
    	
		//OBTENER FUNCION
		String functionName = getFunction(bapiMethod);	
		function = destination.getRepository().getFunction(functionName);
		
		//PARAMETROS DE ENTRADA
		setImportParameterList(bapiMethod, args);
		
		//EJECUTAR
		function.execute(destination);
		
		//PARAMETROS DE SALIDA
		getExportParameterList(bapiMethod, args);
	}
	
	private static void executeAsWinDLL(Method bapiMethod, Object[] args) throws JCoException{
		/** TO:DO
		 * 
		 */
	}
	
	private static Method findMethodByName(String methodName, Class bapiClazz){
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
	
	private static ImplType getImplType(Class bapiClazz){
		Annotation annotation = bapiClazz.getAnnotation(BapiClass.class);
		Annotation[] annotations = bapiClazz.getAnnotations();
		BapiClass bapiClass = (BapiClass) annotation;
		
		return bapiClass.implType();
	}
	
	private static String getFunction(Method bapiMethodd){
		Annotation annotation = bapiMethodd.getAnnotation(BapiMethod.class);
		BapiMethod bapiMethod = (BapiMethod) annotation;
		
		return bapiMethod.method();
	}
	
	private static void setImportParameterList(Method bapiMethod, Object[] args){
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
								setTableValues(parameterValue, tableMappingClass, jcoTable);
								function.getTableParameterList().setValue(parameterName, jcoTable);
							}
							//ES TABLA EN SECCION IMPORT DEL FM
							else if(ParameterType.TABLE_AS_PARAM.equals(parameterType)){
								JCoTable jcoTable = function.getImportParameterList().getTable(parameterName);
								setTableValues(parameterValue, tableMappingClass, jcoTable);
								function.getImportParameterList().setValue(parameterName, jcoTable);
							}
							//ES ESTRUCTURA
							else if(ParameterType.STRUCTURE.equals(parameterType)){
								JCoStructure jcoStructure = function.getImportParameterList().getStructure(parameterName);
								setStructureValues(parameterValue, jcoStructure);
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
	
	private static void getExportParameterList(Method bapiMethod, Object[] args){
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
							getStructureValues(jcoStructure, args[parameterIndex]);
						}
						//ES TABLA
						else if(ParameterType.TABLE.equals(parameterType)){
							JCoTable jcoTable = function.getTableParameterList().getTable(parameterName);
							System.out.println(jcoTable);
							getTableValues(jcoTable, tableMappingClass, args[parameterIndex]);
						}
						//ES TABLA EN SECCION EXPORTE DEL FM
						else if(ParameterType.TABLE_AS_PARAM.equals(parameterType)){
							JCoTable jcoTable = function.getExportParameterList().getTable(parameterName);
							System.out.println(jcoTable);
							getTableValues(jcoTable, tableMappingClass, args[parameterIndex]);
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
	
	private static void setStructureValues(Object object, JCoStructure jcoStructure){
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
	
	private static void getStructureValues(JCoStructure jcoStructure, Object object){
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
	
	private static void setTableValues(Object objectList, Class tableMappingClass, JCoTable jcoTable){
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
	
	private static void getTableValues(JCoTable jcoTable, Class tableMappingClass, Object object){
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
	
	public static Method getMethod(Class clazz, String methodName){
		Method rtrn = null;
		
		Method[] methodList = clazz.getDeclaredMethods();
		
		for(Method method: methodList){
			if(methodName.equalsIgnoreCase(method.getName())){
				rtrn = method;
				break;
			}				
		}
		
		return rtrn;
	}
}
