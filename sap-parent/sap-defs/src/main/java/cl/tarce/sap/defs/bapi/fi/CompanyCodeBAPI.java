package cl.tarce.sap.defs.bapi.fi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sap.conn.jco.JCoException;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.rfcdefs.SapService;
import cl.tarce.sap.defs.bapi.basis.masterdata.VendorBAPI;
import cl.tarce.sap.defs.structures.commons.BapiReturn;
import cl.tarce.sap.defs.tables.fi.CompanyCodeList;

/**
 * 
 * @author tarce
 *
 */
@BapiClass(implType = ImplType.JCO)
public interface CompanyCodeBAPI{

	@BapiMethod(method="BAPI_COMPANYCODE_GETLIST")
	public void getCompanyCodes(
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn bapiReturn,
			
			@BapiOutParameter(name="COMPANYCODE_LIST", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.fi.CompanyCodeList.class)
			List<CompanyCodeList> companyCodeList
			) throws JCoException;
	
}

