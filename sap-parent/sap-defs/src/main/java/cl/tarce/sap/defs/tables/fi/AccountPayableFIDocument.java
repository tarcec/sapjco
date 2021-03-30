package cl.tarce.sap.defs.tables.fi;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class AccountPayableFIDocument {
	@BapiParameter(name = "ITEMNO_ACC", type = ParameterType.SCALAR)
	private Integer itemNumber;
	
	@BapiParameter(name = "VENDOR_NO", type = ParameterType.SCALAR)
	private String vendorNumber;
	
	@BapiParameter(name = "GL_ACCOUNT", type = ParameterType.SCALAR)
	private String glAccount;
	
	@BapiParameter(name = "REF_KEY_1", type = ParameterType.SCALAR)
	private String referenceKey1;
	
	@BapiParameter(name = "REF_KEY_2", type = ParameterType.SCALAR)
	private String referenceKey2;
	
	@BapiParameter(name = "REF_KEY_3", type = ParameterType.SCALAR)
	private String referenceKey3;
	
	@BapiParameter(name = "COMP_CODE", type = ParameterType.SCALAR)
	private String companyCode;
	
	@BapiParameter(name = "BUS_AREA", type = ParameterType.SCALAR)
	private String businessArea;
	
	@BapiParameter(name = "PMNTTRMS", type = ParameterType.SCALAR)
	private String paymentTerms;
	
	@BapiParameter(name = "BLINE_DATE", type = ParameterType.SCALAR)
	private String baseLineDate;
	
	@BapiParameter(name = "DSCT_DAYS1", type = ParameterType.SCALAR)
	private Integer discountDays1;
	
	@BapiParameter(name = "DSCT_DAYS2", type = ParameterType.SCALAR)
	private Integer discountDays2;
	
	@BapiParameter(name = "NETTERMS", type = ParameterType.SCALAR)
	private Integer netTerms;
	
	@BapiParameter(name = "DSCT_PCT1", type = ParameterType.SCALAR)
	private Double discountPercentage1;
	
	@BapiParameter(name = "DSCT_PCT2", type = ParameterType.SCALAR)
	private Double discountPercentage2;
	
	@BapiParameter(name = "PYMT_METH", type = ParameterType.SCALAR)
	private String paymentMethod;
	
	@BapiParameter(name = "PMTMTHSUPL", type = ParameterType.SCALAR)
	private String paymentMethodSupply;
	
	@BapiParameter(name = "PMNT_BLOCK", type = ParameterType.SCALAR)
	private String paymentBlock;
	
	@BapiParameter(name = "SCBANK_IND", type = ParameterType.SCALAR)
	private String centralBankIndicator;
	
	@BapiParameter(name = "SUPCOUNTRY", type = ParameterType.SCALAR)
	private String supplyCountry;
	
	@BapiParameter(name = "SUPCOUNTRY_ISO", type = ParameterType.SCALAR)
	private String supplyCountryISO;
	
	@BapiParameter(name = "BLLSRV_IND", type = ParameterType.SCALAR)
	private String billServiceIndicator;
	
	@BapiParameter(name = "ALLOC_NMBR", type = ParameterType.SCALAR)
	private String allocNumber;
	
	@BapiParameter(name = "ITEM_TEXT", type = ParameterType.SCALAR)
	private String itemText;
	
	@BapiParameter(name = "PO_SUB_NO", type = ParameterType.SCALAR)
	private String poSubNumber;
	
	@BapiParameter(name = "PO_CHECKDG", type = ParameterType.SCALAR)
	private String poCheckDigit;
	
	@BapiParameter(name = "PO_REF_NO", type = ParameterType.SCALAR)
	private String poReferenceNumber;
	
	@BapiParameter(name = "W_TAX_CODE", type = ParameterType.SCALAR)
	private String retentionTaxCode;
	
	@BapiParameter(name = "BUSINESSPLACE", type = ParameterType.SCALAR)
	private String businessPlace;
	
	@BapiParameter(name = "SECTIONCODE", type = ParameterType.SCALAR)
	private String sectionCode;
	
	@BapiParameter(name = "INSTR1", type = ParameterType.SCALAR)
	private Integer instruction1;
	
	@BapiParameter(name = "INSTR2", type = ParameterType.SCALAR)
	private Integer instruction2;
	
	@BapiParameter(name = "INSTR3", type = ParameterType.SCALAR)
	private Integer instruction3;
	
	@BapiParameter(name = "INSTR4", type = ParameterType.SCALAR)
	private Integer instruction4;
	
	@BapiParameter(name = "BRANCH", type = ParameterType.SCALAR)
	private String branch;
	
	@BapiParameter(name = "PYMT_CUR", type = ParameterType.SCALAR)
	private String paymentCurrency;
	
	@BapiParameter(name = "PYMT_AMT", type = ParameterType.SCALAR)
	private Double paymentAmount;
	
	@BapiParameter(name = "PYMT_CUR_ISO", type = ParameterType.SCALAR)
	private String paymentCurrencyISO;
	
	@BapiParameter(name = "SP_GL_IND", type = ParameterType.SCALAR)
	private String specialGLIndicator;
	
	@BapiParameter(name = "TAX_CODE", type = ParameterType.SCALAR)
	private String taxCode;
	
	@BapiParameter(name = "TAX_DATE", type = ParameterType.SCALAR)
	private String taxDate;
	
	@BapiParameter(name = "TAXJURCODE", type = ParameterType.SCALAR)
	private String taxJurisdictionCode;
	
	@BapiParameter(name = "ALT_PAYEE", type = ParameterType.SCALAR)
	private String alternativePayee;
	
	@BapiParameter(name = "ALT_PAYEE_BANK", type = ParameterType.SCALAR)
	private String alternativePayeeBank;
	
	@BapiParameter(name = "PARTNER_BK", type = ParameterType.SCALAR)
	private String partnerBank;
	
	@BapiParameter(name = "BANK_ID", type = ParameterType.SCALAR)
	private String bankId;
	
	@BapiParameter(name = "PARTNER_GUID", type = ParameterType.SCALAR)
	private String partnetGuid;
	
	@BapiParameter(name = "PROFIT_CTR", type = ParameterType.SCALAR)
	private String profitCenter;
	
	@BapiParameter(name = "FUND", type = ParameterType.SCALAR)
	private String fund;
	
	@BapiParameter(name = "GRANT_NBR", type = ParameterType.SCALAR)
	private String grantNumber;
	
	@BapiParameter(name = "MEASURE", type = ParameterType.SCALAR)
	private String measure;
	
	@BapiParameter(name = "HOUSEBANKACCTID", type = ParameterType.SCALAR)
	private String houseBankAccountId;
	
	@BapiParameter(name = "BUDGET_PERIOD", type = ParameterType.SCALAR)
	private String budgetPeriod;
	
	@BapiParameter(name = "PPA_EX_IND", type = ParameterType.SCALAR)
	private String ppaExInd;

	public Integer getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public String getGlAccount() {
		return glAccount;
	}

	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
	}

	public String getReferenceKey1() {
		return referenceKey1;
	}

	public void setReferenceKey1(String referenceKey1) {
		this.referenceKey1 = referenceKey1;
	}

	public String getReferenceKey2() {
		return referenceKey2;
	}

	public void setReferenceKey2(String referenceKey2) {
		this.referenceKey2 = referenceKey2;
	}

	public String getReferenceKey3() {
		return referenceKey3;
	}

	public void setReferenceKey3(String referenceKey3) {
		this.referenceKey3 = referenceKey3;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getBaseLineDate() {
		return baseLineDate;
	}

	public void setBaseLineDate(String baseLineDate) {
		this.baseLineDate = baseLineDate;
	}

	public Integer getDiscountDays1() {
		return discountDays1;
	}

	public void setDiscountDays1(Integer discountDays1) {
		this.discountDays1 = discountDays1;
	}

	public Integer getDiscountDays2() {
		return discountDays2;
	}

	public void setDiscountDays2(Integer discountDays2) {
		this.discountDays2 = discountDays2;
	}

	public Integer getNetTerms() {
		return netTerms;
	}

	public void setNetTerms(Integer netTerms) {
		this.netTerms = netTerms;
	}

	public Double getDiscountPercentage1() {
		return discountPercentage1;
	}

	public void setDiscountPercentage1(Double discountPercentage1) {
		this.discountPercentage1 = discountPercentage1;
	}

	public Double getDiscountPercentage2() {
		return discountPercentage2;
	}

	public void setDiscountPercentage2(Double discountPercentage2) {
		this.discountPercentage2 = discountPercentage2;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethodSupply() {
		return paymentMethodSupply;
	}

	public void setPaymentMethodSupply(String paymentMethodSupply) {
		this.paymentMethodSupply = paymentMethodSupply;
	}

	public String getPaymentBlock() {
		return paymentBlock;
	}

	public void setPaymentBlock(String paymentBlock) {
		this.paymentBlock = paymentBlock;
	}

	public String getCentralBankIndicator() {
		return centralBankIndicator;
	}

	public void setCentralBankIndicator(String centralBankIndicator) {
		this.centralBankIndicator = centralBankIndicator;
	}

	public String getSupplyCountry() {
		return supplyCountry;
	}

	public void setSupplyCountry(String supplyCountry) {
		this.supplyCountry = supplyCountry;
	}

	public String getSupplyCountryISO() {
		return supplyCountryISO;
	}

	public void setSupplyCountryISO(String supplyCountryISO) {
		this.supplyCountryISO = supplyCountryISO;
	}

	public String getBillServiceIndicator() {
		return billServiceIndicator;
	}

	public void setBillServiceIndicator(String billServiceIndicator) {
		this.billServiceIndicator = billServiceIndicator;
	}

	public String getAllocNumber() {
		return allocNumber;
	}

	public void setAllocNumber(String allocNumber) {
		this.allocNumber = allocNumber;
	}

	public String getItemText() {
		return itemText;
	}

	public void setItemText(String itemText) {
		this.itemText = itemText;
	}

	public String getPoSubNumber() {
		return poSubNumber;
	}

	public void setPoSubNumber(String poSubNumber) {
		this.poSubNumber = poSubNumber;
	}

	public String getPoCheckDigit() {
		return poCheckDigit;
	}

	public void setPoCheckDigit(String poCheckDigit) {
		this.poCheckDigit = poCheckDigit;
	}

	public String getPoReferenceNumber() {
		return poReferenceNumber;
	}

	public void setPoReferenceNumber(String poReferenceNumber) {
		this.poReferenceNumber = poReferenceNumber;
	}

	public String getRetentionTaxCode() {
		return retentionTaxCode;
	}

	public void setRetentionTaxCode(String retentionTaxCode) {
		this.retentionTaxCode = retentionTaxCode;
	}

	public String getBusinessPlace() {
		return businessPlace;
	}

	public void setBusinessPlace(String businessPlace) {
		this.businessPlace = businessPlace;
	}

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}

	public Integer getInstruction1() {
		return instruction1;
	}

	public void setInstruction1(Integer instruction1) {
		this.instruction1 = instruction1;
	}

	public Integer getInstruction2() {
		return instruction2;
	}

	public void setInstruction2(Integer instruction2) {
		this.instruction2 = instruction2;
	}

	public Integer getInstruction3() {
		return instruction3;
	}

	public void setInstruction3(Integer instruction3) {
		this.instruction3 = instruction3;
	}

	public Integer getInstruction4() {
		return instruction4;
	}

	public void setInstruction4(Integer instruction4) {
		this.instruction4 = instruction4;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCurrencyISO() {
		return paymentCurrencyISO;
	}

	public void setPaymentCurrencyISO(String paymentCurrencyISO) {
		this.paymentCurrencyISO = paymentCurrencyISO;
	}

	public String getSpecialGLIndicator() {
		return specialGLIndicator;
	}

	public void setSpecialGLIndicator(String specialGLIndicator) {
		this.specialGLIndicator = specialGLIndicator;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxDate() {
		return taxDate;
	}

	public void setTaxDate(String taxDate) {
		this.taxDate = taxDate;
	}

	public String getTaxJurisdictionCode() {
		return taxJurisdictionCode;
	}

	public void setTaxJurisdictionCode(String taxJurisdictionCode) {
		this.taxJurisdictionCode = taxJurisdictionCode;
	}

	public String getAlternativePayee() {
		return alternativePayee;
	}

	public void setAlternativePayee(String alternativePayee) {
		this.alternativePayee = alternativePayee;
	}

	public String getAlternativePayeeBank() {
		return alternativePayeeBank;
	}

	public void setAlternativePayeeBank(String alternativePayeeBank) {
		this.alternativePayeeBank = alternativePayeeBank;
	}

	public String getPartnerBank() {
		return partnerBank;
	}

	public void setPartnerBank(String partnerBank) {
		this.partnerBank = partnerBank;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getPartnetGuid() {
		return partnetGuid;
	}

	public void setPartnetGuid(String partnetGuid) {
		this.partnetGuid = partnetGuid;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getGrantNumber() {
		return grantNumber;
	}

	public void setGrantNumber(String grantNumber) {
		this.grantNumber = grantNumber;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public String getHouseBankAccountId() {
		return houseBankAccountId;
	}

	public void setHouseBankAccountId(String houseBankAccountId) {
		this.houseBankAccountId = houseBankAccountId;
	}

	public String getBudgetPeriod() {
		return budgetPeriod;
	}

	public void setBudgetPeriod(String budgetPeriod) {
		this.budgetPeriod = budgetPeriod;
	}

	public String getPpaExInd() {
		return ppaExInd;
	}

	public void setPpaExInd(String ppaExInd) {
		this.ppaExInd = ppaExInd;
	}
	
	
	
}
