package cl.tarce.sap.defs.tables.fi;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class CompanyCodeList {
	@BapiParameter(name = "COMP_CODE", type = ParameterType.SCALAR)
	private String companyCode;
	@BapiParameter(name = "COMP_NAME", type = ParameterType.SCALAR)
	private String companyName;
	
	public CompanyCodeList(){
		
	}
	
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}	
}
