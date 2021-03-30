package cl.tarce.sap.examples.basis.bdc;

import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoException;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.bapi.basis.dcm.DocumentBAPI;
import cl.tarce.sap.defs.rfc.basis.bdc.BatchInputRFC;
import cl.tarce.sap.defs.tables.basis.bdc.BDCData;
import cl.tarce.sap.defs.tables.basis.bdc.BDCMsgColl;

public class BatchInputExample {
	public void fb60() throws Exception{
		
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		List<BDCData> BDCDataList = new ArrayList<BDCData>();
		BDCDataList.add(new BDCData("SAPMF05A", 1100, "X", "", ""));
		BDCDataList.add(new BDCData("", 0, "", "BDC_OKCODE", "=DUMMY"));
		BDCDataList.add(new BDCData("", 0, "", "RF05A-BUSCS", "R"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0010PAGE"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_CURSOR", "INVFO-MWSKZ"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-ACCNT", "1000934"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-BLDAT", "21.02.2017"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-XBLNR", "5550000"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-BUDAT", "21.02.2017"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-WRBTR", "100"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-WAERS", "CLP"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-MWSKZ", "C0"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLF0KI                                0100SUBBAS01"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFMFG_PPA_INV_EXT                    5001SUBBAS02"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPM_WRF_PREPAY_SCREENS                 0100SUBBAS03"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS04"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS05"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS06"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0070ADR"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFSKB                                0100ITEMS"));
		
		BDCDataList.add(new BDCData("SAPMF05A", 1100, "X", "", ""));
		BDCDataList.add(new BDCData("", 0, "", "BDC_OKCODE", "=DUMMY"));
		BDCDataList.add(new BDCData("", 0, "", "RF05A-BUSCS", "R"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0010PAGE"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_CURSOR", "INVFO-XMWST"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-ACCNT", "1000934"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-XBLNR", "5550000"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-WRBTR", "100"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-XMWST", "X"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-MWSKZ", "C0"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLF0KI                                0100SUBBAS01"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFMFG_PPA_INV_EXT                    5001SUBBAS02"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPM_WRF_PREPAY_SCREENS                 0100SUBBAS03"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS04"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS05"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS06"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0070ADR"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFSKB                                0100ITEMS"));
		
		BDCDataList.add(new BDCData("SAPMF05A", 1100, "X", "", ""));
		BDCDataList.add(new BDCData("", 0, "", "BDC_OKCODE", "=BU"));
		BDCDataList.add(new BDCData("", 0, "", "RF05A-BUSCS", "R"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0010PAGE"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-ACCNT", "1000934"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-XBLNR", "5550000"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-WRBTR", "100"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-XMWST", "X"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-MWSKZ", "C0"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLF0KI                                0100SUBBAS01"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFMFG_PPA_INV_EXT                    5001SUBBAS02"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPM_WRF_PREPAY_SCREENS                 0100SUBBAS03"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS04"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS05"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLSEXM                                0200SUBBAS06"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0070ADR"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFSKB                                0100ITEMS"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_CURSOR", "ACGL_ITEM-PRCTR(01)"));
		BDCDataList.add(new BDCData("", 0, "", "ACGL_ITEM-HKONT(01)", "7710201000"));
		BDCDataList.add(new BDCData("", 0, "", "ACGL_ITEM-WRBTR(01)", "100"));
		BDCDataList.add(new BDCData("", 0, "", "ACGL_ITEM-KOSTL(01)", "COR19200"));
		BDCDataList.add(new BDCData("", 0, "", "ACGL_ITEM-PRCTR(01)", "CORSANAMD0"));

		BDCDataList.add(new BDCData("SAPMF05A", 1100, "X", "", ""));
		BDCDataList.add(new BDCData("", 0, "", "BDC_OKCODE", "BU"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0020PAGE"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_CURSOR", "INVFO-ZFBDT"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-ZTERM", "YZ30"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-ZBD1T", "25"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-ZLSPR", "A"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-HBKID", "CH01"));
		BDCDataList.add(new BDCData("", 0, "", "INVFO-ZFBDT", "21.02.2017"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFDCB                                0070ADR"));
		BDCDataList.add(new BDCData("", 0, "", "BDC_SUBSCR", "SAPLFSKB                                0100ITEMS"));
		
		BapiScalar tCode = new BapiScalar("FB60");
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
		BatchInputExample batchInputExample = new BatchInputExample();
		batchInputExample.fb60();		
	}
}
