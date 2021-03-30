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
import cl.tarce.sap.defs.structures.fi.DocumentHeaderFIDocument;
import cl.tarce.sap.defs.tables.commons.BapiRet2;
import cl.tarce.sap.defs.tables.fi.AccountGLFIDocument;
import cl.tarce.sap.defs.tables.fi.AccountPayableFIDocument;
import cl.tarce.sap.defs.tables.fi.CurrencyAmountFIDocument;
/**
 * 
 * @author Tarce
 *
 */
@BapiClass(implType = ImplType.JCO)
public interface AccountingDocumentBAPI{
	
	@BapiMethod(method="BAPI_ACC_DOCUMENT_POST")
	public void postDocument(
			@BapiInParameter(name="DOCUMENTHEADER", type = ParameterType.STRUCTURE)
			DocumentHeaderFIDocument documentHeader,
			
			@BapiInParameter(name="ACCOUNTGL", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.fi.AccountGLFIDocument.class)
			List<AccountGLFIDocument> accountGLList,
			
			@BapiInParameter(name="ACCOUNTPAYABLE", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.fi.AccountPayableFIDocument.class)
			List<AccountPayableFIDocument> accountPayableList,
			
			@BapiInParameter(name="CURRENCYAMOUNT", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.fi.CurrencyAmountFIDocument.class)
			List<CurrencyAmountFIDocument> currencyAmountList,
			
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
