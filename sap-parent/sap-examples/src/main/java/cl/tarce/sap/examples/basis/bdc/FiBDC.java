package cl.tarce.sap.examples.basis.bdc;

import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoException;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.rfc.basis.bdc.BatchInputRFC;
import cl.tarce.sap.defs.structures.basis.bdc.CTUParams;
import cl.tarce.sap.defs.tables.basis.bdc.BDCData;
import cl.tarce.sap.defs.tables.basis.bdc.BDCMsgColl;

public class FiBDC {
	public void anulacionCompensacion(
			String documentoCompensacion,
			String sociedad,
			String ejercicio,
			String motivoAnulacion,
			String fechaAnulacion,
			String periodoAnulacion) 
					throws Exception{
		
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		List<BDCData> BDCDataList = new ArrayList<BDCData>();
		BDCDataList.add(new BDCData("SAPMF05R",100,"X","",""));
		BDCDataList.add(new BDCData("",0,"","BDC_CURSOR","RF05R-GJAHR"));
		BDCDataList.add(new BDCData("",0,"","BDC_OKCODE","=RAGL"));
		BDCDataList.add(new BDCData("",0,"","RF05R-AUGBL",documentoCompensacion));
		BDCDataList.add(new BDCData("",0,"","RF05R-BUKRS",sociedad));
		BDCDataList.add(new BDCData("",0,"","RF05R-GJAHR",ejercicio));
		
		//COCAK
		BDCDataList.add(new BDCData("SAPLSPO1",300,"X","",""));
		BDCDataList.add(new BDCData("",0,"","BDC_OKCODE","=YES"));
		
		//MOTIVO DE ANULACION
		BDCDataList.add(new BDCData("SAPMF05R",300,"X","",""));
		BDCDataList.add(new BDCData("",0,"","BDC_CURSOR","RF05R-MONAT"));
		BDCDataList.add(new BDCData("",0,"","BDC_OKCODE","=ENTR"));
		BDCDataList.add(new BDCData("",0,"","RF05R-STGRD",motivoAnulacion));
		BDCDataList.add(new BDCData("",0,"","RF05R-BUDAT",fechaAnulacion));
		BDCDataList.add(new BDCData("",0,"","RF05R-MONAT",periodoAnulacion));
		
		//OPCIONES
		CTUParams optionsStructure = new CTUParams();
		optionsStructure.setDisMode("A");
		optionsStructure.setUpdMode("S");
		optionsStructure.setDefSize("X");
		optionsStructure.setCattMode(" ");
		optionsStructure.setRaCommit("X");
		optionsStructure.setNoBInpt("X");
		optionsStructure.setNoBIEnd("X");

		BapiScalar tCode = new BapiScalar("FBRA");
		BapiScalar skipScreen = null;
		BapiScalar modeVal = new BapiScalar("Q");
		BapiScalar updateVal = new BapiScalar("S");
		BapiScalar subRC = new BapiScalar();
		List<BDCMsgColl> messageTabList = new ArrayList<BDCMsgColl>();
		
		BapiExecutor.executeFunction(BatchInputRFC.class, 
				"isdfpsCallTransaction", 
				new Object[]{
					tCode,
					skipScreen,
					BDCDataList,
					optionsStructure,
					messageTabList
		});
		
//		BapiExecutor.executeFunction(BatchInputRFC.class, 
//				"abap4CallTransaction", 
//				new Object[]{
//					tCode,
//					skipScreen,
//					modeVal,
//					updateVal,
//					BDCDataList,
//					subRC,
//					messageTabList
//		});
		
		BapiExecutor.endTransaction();
		
	}
	public static void main(String args[]) throws Exception{		
		FiBDC batchInputExample = new FiBDC();
		batchInputExample.anulacionCompensacion(
				"8000042508",
				"GC01",
				"2017",
				"02",
				"01.05.2017",
				"5");

	}
}
