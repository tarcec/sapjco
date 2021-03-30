package cl.tarce.sap.defs.tables.fi;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class AccountTaxFIDocument {
	@BapiParameter(name = "ITEMNO_ACC", type = ParameterType.SCALAR)
	private Integer itemNumber;
	
	@BapiParameter(name = "GL_ACCOUNT", type = ParameterType.SCALAR)
	private String glAccount;
	
	@BapiParameter(name = "COND_KEY", type = ParameterType.SCALAR)
	private String conditionKey;
	
	@BapiParameter(name = "ACCT_KEY", type = ParameterType.SCALAR)
	private String accountingKey;
	
	@BapiParameter(name = "TAX_CODE", type = ParameterType.SCALAR)
	private String taxCode;
	
	@BapiParameter(name = "TAX_RATE", type = ParameterType.SCALAR)
	private Double taxRate;
	
	@BapiParameter(name = "TAX_DATE", type = ParameterType.SCALAR)
	private String taxDate;
	
	@BapiParameter(name = "TAXJURCODE", type = ParameterType.SCALAR)
	private String taxJurisdictionCode;
	
	@BapiParameter(name = "TAXJURCODE_DEEP", type = ParameterType.SCALAR)
	private String taxJurisdictionCodeDeep;
	
	@BapiParameter(name = "TAXJURCODE_LEVEL", type = ParameterType.SCALAR)
	private String taxJurisdictionCodeLevel;
	
	@BapiParameter(name = "ITEMNO_TAX", type = ParameterType.SCALAR)
	private Integer itemNumberTax;
	
	@BapiParameter(name = "DIRECT_TAX", type = ParameterType.SCALAR)
	private String directTax;
	
	
}
