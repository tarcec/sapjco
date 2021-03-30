package cl.tarce.sap.examples.basis.bdc;

import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoException;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.rfc.basis.bdc.BatchInputRFC;
import cl.tarce.sap.defs.tables.basis.bdc.BDCData;
import cl.tarce.sap.defs.tables.basis.bdc.BDCMsgColl;

public class ReferenciaExample {
	public void cambiarReferencia(String numeroDocumento,
			String sociedad,
			String ejercicio,
			String referencia) throws JCoException{
		
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		List<BDCData> BDCDataList = new ArrayList<BDCData>();
		BDCDataList.add(new BDCData("SAPMF05L",100,"X","",""));
		BDCDataList.add(new BDCData("",0,"","BDC_CURSOR","RF05L-GJAHR"));
		BDCDataList.add(new BDCData("",0,"","BDC_OKCODE","/00"));
		BDCDataList.add(new BDCData("",0,"","RF05L-BELNR", "5100040062"));
		BDCDataList.add(new BDCData("",0,"","RF05L-BUKRS", "GC01"));
		BDCDataList.add(new BDCData("",0,"","RF05L-GJAHR", "2016"));
		
		BDCDataList.add(new BDCData("SAPMF05L",700,"X","",""));
		BDCDataList.add(new BDCData("",0,"","BDC_CURSOR","BKPF-BELNR"));
		BDCDataList.add(new BDCData("",0,"","BDC_OKCODE","=VK"));
		
		BDCDataList.add(new BDCData("SAPMF05L",1710,"X","",""));
		BDCDataList.add(new BDCData("",0,"","BDC_CURSOR","BKPF-XBLNR"));
		BDCDataList.add(new BDCData("",0,"","BDC_OKCODE","=ENTR"));
		BDCDataList.add(new BDCData("",0,"","BKPF-XBLNR", "PRU2 - 2199715"));
		
		BDCDataList.add(new BDCData("SAPMF05L",700,"X","",""));
		BDCDataList.add(new BDCData("",0,"","BDC_CURSOR","BKPF-BELNR"));
		BDCDataList.add(new BDCData("",0,"","BDC_OKCODE","=AE"));
				
		BapiScalar tCode = new BapiScalar("FB02");
		BapiScalar mode = new BapiScalar("N"); //N NO DISPLAY
		BapiScalar subRC = new BapiScalar();
		List<BDCMsgColl> LErrorsList = new ArrayList<BDCMsgColl>();
		
		BapiExecutor.executeFunction(BatchInputRFC.class, 
				"callTransactionUsing", 
				new Object[]{
					tCode,
					mode,
					BDCDataList,
					subRC,
					LErrorsList
		});
		
		BapiExecutor.endTransaction();
	}
	
	public static void main(String args[]) throws Exception{		
		ReferenciaExample batchInputExample = new ReferenciaExample();
	
		batchInputExample.cambiarReferencia("5100040062",
				"GC01", 
				"2016", 
				"PRU2 - 2199715");
	}
}
