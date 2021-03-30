package cl.tarce.sap.examples.basis.masterdata;

import java.util.ArrayList;
import java.util.List;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.rfc.basis.masterdata.TableRFC;
import cl.tarce.sap.defs.tables.basis.masterdata.Data;
import cl.tarce.sap.defs.tables.basis.masterdata.Field;
import cl.tarce.sap.defs.tables.basis.masterdata.Option;

public class TableExample {
	public void query() throws Exception{
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		BapiScalar queryTable = new BapiScalar("T001");
		BapiScalar delimiter = new BapiScalar("|");
		BapiScalar noData = null;
		BapiScalar rowSkips = null;
		BapiScalar rowCount = null;
		
		List<Option> optionsList = null;
		
		List<Field> fieldsList = new ArrayList<Field>();
		fieldsList.add(new Field("BUKRS", null, null, null, null));
		fieldsList.add(new Field("BUTXT", null, null, null, null));
		
		List<Data> dataList = new ArrayList<Data>();
		
		BapiExecutor.executeFunction(TableRFC.class, 
				"readTable", 
				new Object[]{
					queryTable,
					delimiter,
					noData,
					rowSkips,
					rowCount,
					optionsList,
					fieldsList,
					dataList
		});
		
		BapiExecutor.endTransaction();
		
		String a = "2";
	}
	
	public void obtenerListaContabilizaciones() throws Exception{
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		BapiScalar queryTable = new BapiScalar("BKPF");
		BapiScalar delimiter = new BapiScalar("|");
		BapiScalar noData = null;
		BapiScalar rowSkips = null;
		BapiScalar rowCount = new BapiScalar(500);
		
		List<Option> optionsList = new ArrayList<Option>();
		optionsList.add(new Option("BUDAT >= '01.04.2017' AND BUDAT <= '30.04.2017'"));
		
		List<Field> fieldsList = new ArrayList<Field>();
		fieldsList.add(new Field("MANDT", null, null, null, null)); //ID SISTEMA
		fieldsList.add(new Field("BUKRS", null, null, null, null)); //SOCIEDAD
		fieldsList.add(new Field("BELNR", null, null, null, null)); //NUMERO DOC CONTAB
		fieldsList.add(new Field("GJAHR", null, null, null, null)); //EJERCICIO
		fieldsList.add(new Field("BLART", null, null, null, null)); //CLASE DOCUMENTO
		fieldsList.add(new Field("MONAT", null, null, null, null)); //MES CONTABLE
		fieldsList.add(new Field("BLDAT", null, null, null, null)); //FECHA DOCUMENTO FACTURA
		fieldsList.add(new Field("BUDAT", null, null, null, null)); //FECHA CONTABILIZACION
		fieldsList.add(new Field("USNAM", null, null, null, null)); //NOMBRE USUARIO 
		fieldsList.add(new Field("TCODE", null, null, null, null)); //COD TX QUE HIZO LA CONTAB
		fieldsList.add(new Field("AWTYP", null, null, null, null)); //TIPO REFERENCIA
		fieldsList.add(new Field("AWKEY", null, null, null, null)); //NUMERO REFERENCIA (MIRO)
		
		List<Data> dataList = new ArrayList<Data>();
		
		BapiExecutor.executeFunction(TableRFC.class, 
				"readTable", 
				new Object[]{
					queryTable,
					delimiter,
					noData,
					rowSkips,
					rowCount,
					optionsList,
					fieldsList,
					dataList
		});
		
		BapiExecutor.endTransaction();
		
		String a = "2";
	}
	
	public void obtenerListadoCompensacionesProveedores() throws Exception{
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		BapiScalar queryTable = new BapiScalar("BSAK");
		BapiScalar delimiter = new BapiScalar("|");
		BapiScalar noData = null;
		BapiScalar rowSkips = null;
		BapiScalar rowCount = new BapiScalar(500);
		
		List<Option> optionsList = new ArrayList<Option>();
		optionsList.add(new Option("BUDAT >= '01.04.2017' AND BUDAT <= '30.04.2017'"));
		
		List<Field> fieldsList = new ArrayList<Field>();
		fieldsList.add(new Field("MANDT", null, null, null, null));
		fieldsList.add(new Field("BUKRS", null, null, null, null));
		fieldsList.add(new Field("AUGBL", null, null, null, null)); //DOC COMPENSACION
		fieldsList.add(new Field("AUGDT", null, null, null, null)); //FEC COMPENSACION
		fieldsList.add(new Field("GJAHR", null, null, null, null));
		fieldsList.add(new Field("BELNR", null, null, null, null)); //DOC COMPENSADO
		fieldsList.add(new Field("BLART", null, null, null, null)); //CLASE DOC
		fieldsList.add(new Field("MONAT", null, null, null, null));
		fieldsList.add(new Field("BUDAT", null, null, null, null));
		fieldsList.add(new Field("BLDAT", null, null, null, null));
		fieldsList.add(new Field("SHKZG", null, null, null, null));
		fieldsList.add(new Field("HKONT", null, null, null, null));
		fieldsList.add(new Field("DMBTR", null, null, null, null));
		
		List<Data> dataList = new ArrayList<Data>();
		
		BapiExecutor.executeFunction(TableRFC.class, 
				"readTable", 
				new Object[]{
					queryTable,
					delimiter,
					noData,
					rowSkips,
					rowCount,
					optionsList,
					fieldsList,
					dataList
		});
		
		BapiExecutor.endTransaction();
		
		String a = "2";
	}
	
	public void obtenerDetalleContabilizaciones() throws Exception{
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		BapiScalar queryTable = new BapiScalar("BSEG");
		BapiScalar delimiter = new BapiScalar("|");
		BapiScalar noData = null;
		BapiScalar rowSkips = null;
		BapiScalar rowCount = new BapiScalar(500);
		
		List<Option> optionsList = new ArrayList<Option>();
		optionsList.add(new Option("BELNR = 2000013843"));
		
		List<Field> fieldsList = new ArrayList<Field>();
		fieldsList.add(new Field("MANDT", null, null, null, null)); //SISTEMA
		fieldsList.add(new Field("BUKRS", null, null, null, null)); //SOCIEDAD
		fieldsList.add(new Field("BELNR", null, null, null, null)); //NUMERO DOC CONTABLE
		fieldsList.add(new Field("GJAHR", null, null, null, null)); //EJERCICIO
		fieldsList.add(new Field("BUZEI", null, null, null, null)); //LINEA
		fieldsList.add(new Field("AUGDT", null, null, null, null)); //FEC COMPENSACION
		fieldsList.add(new Field("AUGBL", null, null, null, null)); //DOC COMPENSACION
				
		List<Data> dataList = new ArrayList<Data>();
		
		BapiExecutor.executeFunction(TableRFC.class, 
				"readTable", 
				new Object[]{
					queryTable,
					delimiter,
					noData,
					rowSkips,
					rowCount,
					optionsList,
					fieldsList,
					dataList
		});
		
		BapiExecutor.endTransaction();
		
		String a = "2";
	}
	
	public static void main(String args[]) throws Exception{
		TableExample tableExample = new TableExample();
		tableExample.query();
	}
}
