package cl.tarce.sap.defs.bapi.basis.masterdata;

import java.util.List;

import com.sap.conn.jco.JCoException;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.defs.structures.commons.BapiReturn;
import cl.tarce.sap.defs.tables.fi.CompanyCodeList;

/**
 * 
 * @author tarce
 *
 */
@BapiClass(implType = ImplType.JCO)
public interface VendorBAPI{
	
	@BapiMethod(method="BAPI_COMPANYCODE_GETLIST")
	public void getVendors(
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn bapiReturn,
			
			@BapiOutParameter(name="COMPANYCODE_LIST", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.fi.CompanyCodeList.class)
			List<CompanyCodeList> companyCodeList
			) throws JCoException;
	
	
}
