package cl.tarce.sap.examples.mm;

import java.util.ArrayList;
import java.util.List;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.rfcdefs.SapService;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.bapi.mm.IncomingInvoiceBAPI;
import cl.tarce.sap.defs.structures.mm.InvoiceHeaderData;
import cl.tarce.sap.defs.tables.commons.BapiRet2;
import cl.tarce.sap.defs.tables.mm.InvoiceItemData;

public class IncomingInvoiceServiceExample {
	
	public void recepcionFacturaConOC() throws Exception{
		//SECCION DAT. BASICOS
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
				
		BapiExecutor.initTransaction(bapiConnection);
		
		InvoiceHeaderData invoiceHeaderData = new InvoiceHeaderData();
		invoiceHeaderData.setInvoiceIndicator("X"); //INDICADOR DE FACTURA
		invoiceHeaderData.setCompanyCode("GC01");	//SOCIEDAD
		invoiceHeaderData.setDocumentDate("20170228"); //FECHA FACTURA
		invoiceHeaderData.setPostingDate("20170228"); //FECHA CONTABILIZACION
		invoiceHeaderData.setReferenceDocumentNumber("600002"); //REFERENCIA
		invoiceHeaderData.setCurrency("CLP"); //MONEDA
		invoiceHeaderData.setCalcTaxInd("X"); //CALCULAR IMPUESTOS AUTOMATICAMENTE
		invoiceHeaderData.setGrossAmount(11236d); //IMPORTE
		invoiceHeaderData.setDiffInvoicer("0001000750"); //PROVEEDOR
				
		//SECCION PAGO 
		invoiceHeaderData.setBottomLineDate("20170228"); //FECHA BASE
		invoiceHeaderData.setHouseBankId("BC01"); //BANCO PROPIO
		
		//SECCION REFERENCIA A PEDIDO
		List<InvoiceItemData> invoiceItemDataList = new ArrayList<InvoiceItemData>();		
		InvoiceItemData invoiceItemData = new InvoiceItemData();
		invoiceItemData.setInvoiceDocumentItem(1);
		invoiceItemData.setPurchaseOrderNumber("0010018201"); //OC
		invoiceItemData.setPurchaseOrderItem(1); //LINEA OC
		invoiceItemData.setReferenceDoucment("5000145121"); //RECEPCION
		invoiceItemData.setReferenceDocumentYear(2017); //ANNO RECEPCION
		invoiceItemData.setReferenceDocumentItem(1); //ITEM RECEPCION
		invoiceItemData.setTaxCode("C0"); //INDICADOR DE IMPUESTOS
		invoiceItemData.setQuantity(1d); //CANTIDAD
		invoiceItemData.setItemAmount(11236d); //MONTO
		invoiceItemData.setPurchaseOrderUnitOfMeasure("EA"); //UNIDAD DE MEDIDA
		//invoiceItemData.setPurchaseOrderUnitOfMeasureISO("CS"); //UNIDAD DE MEDIDA
		invoiceItemDataList.add(invoiceItemData);
		
		//PARAMETROS DE SALIDA
		BapiScalar invoiceNumber = new BapiScalar();
		BapiScalar fiscalYear = new BapiScalar();
		List<BapiRet2> bapiRet2List = new ArrayList<BapiRet2>();
		
		//CALL
		BapiExecutor.executeFunction(IncomingInvoiceBAPI.class,
				"createIncomingInvoice",
				new Object[]{
					invoiceHeaderData,
					null, 
					invoiceItemDataList, 
					null, 
					null, 
					invoiceNumber, 
					fiscalYear, 
					bapiRet2List
		});
		
		System.out.println("*****************************************************");
		System.out.println("invoiceNumber 	= " + invoiceNumber.getStringValue());
		System.out.println("fiscalYear 		= " + fiscalYear.getStringValue());
		System.out.println("*****************************************************");
		
		BapiExecutor.endTransactionWithCommit();
		
		String a = "2";
	}
	
	public void reversarContabilizacionMiro(){
		
	}
	
	public static void main(String args[]) throws Exception{
		//PARAMETROS DE CONEXION
		IncomingInvoiceServiceExample incomingInvoiceServiceExample = new IncomingInvoiceServiceExample();
		incomingInvoiceServiceExample.recepcionFacturaConOC();
	}
}
