package cl.tarce.sap.examples.fi;

import java.util.ArrayList;
import java.util.List;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.bapi.fi.AccountingDocumentBAPI;
import cl.tarce.sap.defs.structures.fi.DocumentHeaderFIDocument;
import cl.tarce.sap.defs.tables.commons.BapiRet2;
import cl.tarce.sap.defs.tables.fi.AccountGLFIDocument;
import cl.tarce.sap.defs.tables.fi.AccountPayableFIDocument;
import cl.tarce.sap.defs.tables.fi.CurrencyAmountFIDocument;

public class AccountingDocumentServiceExample {
	
	public void contabilizacion1() throws Exception{
		/**
		 * EJEMPLO CONTABILIZACION BANCO
		 */
		
		//DATOS DE CONEXION
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
				
		//CABECERA DOCUMENTO
		DocumentHeaderFIDocument documentHeader = new DocumentHeaderFIDocument();
		documentHeader.setDocumentType("04"); //FACTURA ELECTRONICA
		documentHeader.setCompanyCode("GC01"); //SOCIEDAD
		documentHeader.setDocumentDate("20170221"); //FECHA DOCUMENTO
		documentHeader.setPostingDate("20170221"); //FECHA CONTABILIZACION
		documentHeader.setReferenceDocumentNumber("12345678"); //REFERENCIA
		documentHeader.setUsername("DPACHECO"); //USUARIO
				
		//CONTABILIZACION FACTURA
		List<AccountPayableFIDocument> accountPayableList = new ArrayList<AccountPayableFIDocument>();
		AccountPayableFIDocument accountPayable = new AccountPayableFIDocument();
		accountPayable.setItemNumber(1); //LINEA
		accountPayable.setVendorNumber("0001000934"); //CODIGO PROVEEDOR
		accountPayable.setTaxCode("C1");
		accountPayableList.add(accountPayable);
		
		//CONTABILIZACION MAYOR
		List<AccountGLFIDocument> accountGLList = new ArrayList<AccountGLFIDocument>();
		
		AccountGLFIDocument accountGL = new AccountGLFIDocument();
		accountGL.setItemNumber(2);
		accountGL.setGlAccount("7710201000");
		accountGL.setTaxCode("C1");
		accountGL.setCostCenter("COR19200");
		accountGL.setProfitCenter("CORSANADM0");
		accountGLList.add(accountGL);
				
		//DETALLE MONEDAS
		List<CurrencyAmountFIDocument> currencyAmountList = new ArrayList<CurrencyAmountFIDocument>();
		CurrencyAmountFIDocument currencyAmount = new CurrencyAmountFIDocument();
		currencyAmount.setItemNumber(1);
		currencyAmount.setCurrencyType("00");
		currencyAmount.setCurrency("CLP");
		currencyAmount.setAmountDocumentCurrency(-100d);
		currencyAmount.setBaseAmountDocumentCurrency(-100d);
		currencyAmountList.add(currencyAmount);
		
		currencyAmount = new CurrencyAmountFIDocument();
		currencyAmount.setItemNumber(2);
		currencyAmount.setCurrencyType("00");
		currencyAmount.setCurrency("CLP");
		currencyAmount.setAmountDocumentCurrency(100d);
		currencyAmount.setBaseAmountDocumentCurrency(100d);
		currencyAmountList.add(currencyAmount);
		
		BapiScalar objType = new BapiScalar();
		BapiScalar objKey = new BapiScalar();
		BapiScalar objSys = new BapiScalar();
		
		List<BapiRet2> bapiRet2List = new ArrayList<BapiRet2>();
		
		
		BapiExecutor.executeFunction(AccountingDocumentBAPI.class, 
				"postDocument", 
				new Object[]{
					documentHeader,
					accountGLList,
					accountPayableList,
					currencyAmountList,
					objType,
					objKey,
					objSys,
					bapiRet2List
		});
		
		BapiExecutor.endTransactionWithCommit();
		
		String a = "2";
	}
	
	public static void main(String args[]) throws Exception{
		AccountingDocumentServiceExample service = new AccountingDocumentServiceExample();
		service.contabilizacion1();
	}
}
