package cl.tarce.sap.defs.bapi.mm;

import java.util.List;











import org.springframework.stereotype.Component;

import com.sap.conn.jco.JCoException;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiInParameter;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.structures.mm.InvoiceAddressData;
import cl.tarce.sap.defs.structures.mm.InvoiceHeaderData;
import cl.tarce.sap.defs.tables.commons.BapiRet2;
import cl.tarce.sap.defs.tables.mm.InvoiceAccountingData;
import cl.tarce.sap.defs.tables.mm.InvoiceGLAccountData;
import cl.tarce.sap.defs.tables.mm.InvoiceItemData;

/**
 * 
 * @author Tarce
 *
 */
@BapiClass(implType = ImplType.JCO)
public interface IncomingInvoiceBAPI{
	
	@BapiMethod(method="BAPI_INCOMINGINVOICE_CREATE")
	public void createIncomingInvoice(
		@BapiInParameter(name="HEADERDATA", type = ParameterType.STRUCTURE)
		InvoiceHeaderData invoiceHeaderData,
		
		@BapiInParameter(name="ADDRESSDATA", type = ParameterType.STRUCTURE)
		InvoiceAddressData invoiceAddressData,
		
		@BapiInParameter(name="ITEMDATA", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.mm.InvoiceItemData.class)
		List<InvoiceItemData> invoiceItemDataList,
		
		@BapiInParameter(name="ACCOUNTINGDATA", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.mm.InvoiceAccountingData.class)
		List<InvoiceAccountingData> invoiceAccountingDataList,
		
		@BapiInParameter(name="GLACCOUNTDATA", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.mm.InvoiceGLAccountData.class)
		List<InvoiceGLAccountData> invoiceGLAccountDataList,
		
		@BapiOutParameter(name="INVOICEDOCNUMBER", type = ParameterType.SCALAR)
		BapiScalar invoiceNumber,
		
		@BapiOutParameter(name="FISCALYEAR", type = ParameterType.SCALAR)
		BapiScalar fiscalYear,
					
		@BapiOutParameter(name="RETURN", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.commons.BapiRet2.class)
		List<BapiRet2> bapiRet2List
		) throws JCoException;
		
	@BapiMethod(method="BAPI_INCOMINGINVOICE_PARK")
	public void createParkedIncomingInvoice(
		@BapiInParameter(name="HEADERDATA", type = ParameterType.STRUCTURE)
		InvoiceHeaderData invoiceHeaderData,
		
		@BapiInParameter(name="ADDRESSDATA", type = ParameterType.STRUCTURE)
		InvoiceAddressData invoiceAddressData,
		
		@BapiInParameter(name="ITEMDATA", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.mm.InvoiceItemData.class)
		List<InvoiceItemData> invoiceItemDataList,
		
		@BapiInParameter(name="ACCOUNTINGDATA", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.mm.InvoiceAccountingData.class)
		List<InvoiceAccountingData> invoiceAccountingDataList,
		
		@BapiInParameter(name="GLACCOUNTDATA", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.mm.InvoiceGLAccountData.class)
		List<InvoiceGLAccountData> invoiceGLAccountDataList,
		
		@BapiOutParameter(name="INVOICEDOCNUMBER", type = ParameterType.SCALAR)
		BapiScalar invoiceNumber,
		
		@BapiOutParameter(name="FISCALYEAR", type = ParameterType.SCALAR)
		BapiScalar fiscalYear,
					
		@BapiOutParameter(name="RETURN", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.commons.BapiRet2.class)
		List<BapiRet2> bapiRet2List
		) throws JCoException;
	
	@BapiMethod(method="BAPI_INCOMINGINVOICE_POST")
	public void postParkedIncomingInvoice(
		@BapiInParameter(name="INVOICEDOCNUMBER", type = ParameterType.SCALAR)
		BapiScalar invoiceNumber,
		
		@BapiInParameter(name="FISCALYEAR", type = ParameterType.SCALAR)
		BapiScalar fiscalYear,
					
		@BapiOutParameter(name="RETURN", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.commons.BapiRet2.class)
		List<BapiRet2> bapiRet2List
			) throws JCoException;
	
	@BapiMethod(method="BAPI_INCOMINGINVOICE_CANCEL")
	public void cancelIncomingInvoice(
		@BapiInParameter(name="INVOICEDOCNUMBER", type = ParameterType.SCALAR)
		BapiScalar invoiceNumber,
		
		@BapiInParameter(name="FISCALYEAR", type = ParameterType.SCALAR)
		BapiScalar fiscalYear,
		
		@BapiInParameter(name="REASONREVERSAL", type = ParameterType.SCALAR)
		BapiScalar reasonForReversal,
		
		@BapiOutParameter(name="INVOICEDOCNUMBER_REVERSAL", type = ParameterType.SCALAR)
		BapiScalar invoiceNumberReversal,
					
		@BapiOutParameter(name="RETURN", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.commons.BapiRet2.class)
		List<BapiRet2> bapiRet2List
			) throws JCoException;
}
