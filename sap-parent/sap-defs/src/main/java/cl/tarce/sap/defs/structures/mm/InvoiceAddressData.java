package cl.tarce.sap.defs.structures.mm;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class InvoiceAddressData {
	@BapiParameter(name = "ACC_1_TIME", type = ParameterType.SCALAR)
	private String accountForOneTime;
	@BapiParameter(name = "NAME", type = ParameterType.SCALAR)
	private String name;
	@BapiParameter(name = "NAME_2", type = ParameterType.SCALAR)
	private String name2;
	@BapiParameter(name = "NAME_3", type = ParameterType.SCALAR)
	private String name3;
	@BapiParameter(name = "NAME_4", type = ParameterType.SCALAR)
	private String name4;
	@BapiParameter(name = "POSTL_CODE", type = ParameterType.SCALAR)
	private String postalCode;
	@BapiParameter(name = "CITY", type = ParameterType.SCALAR)
	private String city;
	@BapiParameter(name = "COUNTRY", type = ParameterType.SCALAR)
	private String country;
	@BapiParameter(name = "STREET", type = ParameterType.SCALAR)
	private String street;
	@BapiParameter(name = "PO_BOX", type = ParameterType.SCALAR)
	private String poBox;
	@BapiParameter(name = "POBX_PCD", type = ParameterType.SCALAR)
	private String poBoxPCD;
	@BapiParameter(name = "POBK_CURAC", type = ParameterType.SCALAR)
	private String poBoxCURAC;
	@BapiParameter(name = "BANK_ACCT", type = ParameterType.SCALAR)
	private String bankAccount;
	@BapiParameter(name = "BANK_NO", type = ParameterType.SCALAR)
	private String bankNumber;
	@BapiParameter(name = "BANK_CTRY", type = ParameterType.SCALAR)
	private String bankCountry;
	@BapiParameter(name = "TAX_NO_1", type = ParameterType.SCALAR)
	private String taxNumber1;
	@BapiParameter(name = "TAX_NO_2", type = ParameterType.SCALAR)
	private String taxNumber2;
	@BapiParameter(name = "SLS_PUR_TX", type = ParameterType.SCALAR)
	private String slsPurchaseTax;
	@BapiParameter(name = "EQUAL_TAX", type = ParameterType.SCALAR)
	private String equalTax;
	@BapiParameter(name = "REGION", type = ParameterType.SCALAR)
	private String region;
	@BapiParameter(name = "CTRL_KEY", type = ParameterType.SCALAR)
	private String controlKey;
	@BapiParameter(name = "INSTR_KEY", type = ParameterType.SCALAR)
	private String instructionKey;
	@BapiParameter(name = "DME_IND", type = ParameterType.SCALAR)
	private String dmeIndicator;
	@BapiParameter(name = "LANGU", type = ParameterType.SCALAR)
	private String language;
	@BapiParameter(name = "ENCR_PAYM_RECIP", type = ParameterType.SCALAR)
	private String encryptPaymentReceipt;
	@BapiParameter(name = "TAX_CATEGORY", type = ParameterType.SCALAR)
	private String taxCategory;
	@BapiParameter(name = "TAX_NO_TY", type = ParameterType.SCALAR)
	private String taxNumberType;
	@BapiParameter(name = "SOLE_PROP", type = ParameterType.SCALAR)
	private String soleProp;
	@BapiParameter(name = "TAX_NO_3", type = ParameterType.SCALAR)
	private String taxNumber3;
	@BapiParameter(name = "TAX_NO_4", type = ParameterType.SCALAR)
	private String taxNumber4;
	@BapiParameter(name = "BANK_REF", type = ParameterType.SCALAR)
	private String bankReference;
	@BapiParameter(name = "REP_NAME", type = ParameterType.SCALAR)
	private String repName;
	@BapiParameter(name = "BUS_TYPE", type = ParameterType.SCALAR)
	private String bussinessType;
	@BapiParameter(name = "IND_TYPE", type = ParameterType.SCALAR)
	private String industryType;
	@BapiParameter(name = "FORM_OF_ADDR", type = ParameterType.SCALAR)
	private String formOfAddr;
	@BapiParameter(name = "VAT_REG_NO", type = ParameterType.SCALAR)
	private String vatRegNumber;	
}
