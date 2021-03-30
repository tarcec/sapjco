package cl.tarce.sap.defs.bapi.fi;

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
import cl.tarce.sap.defs.structures.fi.DocumentHeaderInvoiceReceipt;
import cl.tarce.sap.defs.tables.commons.BapiRet2;
import cl.tarce.sap.defs.tables.fi.AccountPayableInvoiceReceipt;
import cl.tarce.sap.defs.tables.fi.CurrencyAmountInvoiceReceipt;

@BapiClass(implType = ImplType.JCO)
public interface AccountingInvoiceReceiptBAPI {
	@BapiMethod(method="BAPI_ACC_INVOICE_RECEIPT_POST")
	public void postInvoiceReceipt(
			@BapiInParameter(name="DOCUMENTHEADER", type = ParameterType.STRUCTURE)
			DocumentHeaderInvoiceReceipt documentHeaderInvoiceReceipt,
			
			@BapiInParameter(name="ACCOUNTPAYABLE", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.fi.AccountPayableInvoiceReceipt.class)
			List<AccountPayableInvoiceReceipt> accountPayableListInvoiceReceipt,
			
			@BapiInParameter(name="ACCOUNTGL", type = ParameterType.SCALAR)
			BapiScalar accountGL,
			
			@BapiInParameter(name="ACCOUNTTAX", type = ParameterType.SCALAR)
			BapiScalar accountTax,
			
			@BapiInParameter(name="CURRENCYAMOUNT", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.fi.CurrencyAmountInvoiceReceipt.class)
			List<CurrencyAmountInvoiceReceipt> currencyAmountListInvoiceReceipt,
			
			@BapiOutParameter(name="OBJ_TYPE", type = ParameterType.SCALAR)
			BapiScalar objType,
			
			@BapiOutParameter(name="OBJ_KEY", type = ParameterType.SCALAR)
			BapiScalar objKey,
			
			@BapiOutParameter(name="OBJ_SYS", type = ParameterType.SCALAR)
			BapiScalar objSys,
			
			@BapiOutParameter(name="RETURN", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.commons.BapiRet2.class)
			List<BapiRet2> bapiRet2List	
			) throws JCoException;
}
