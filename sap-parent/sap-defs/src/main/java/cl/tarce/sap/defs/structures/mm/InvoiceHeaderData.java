package cl.tarce.sap.defs.structures.mm;

import java.util.Date;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

/**
 * 
 * @author Tarce
 *
 */
public class InvoiceHeaderData {
	@BapiParameter(name = "INVOICE_IND", type = ParameterType.SCALAR)
	private String invoiceIndicator;
	@BapiParameter(name = "DOC_TYPE", type = ParameterType.SCALAR)
	private String documentType;
	@BapiParameter(name = "DOC_DATE", type = ParameterType.SCALAR)
	private String documentDate;
	@BapiParameter(name = "PSTNG_DATE", type = ParameterType.SCALAR)
	private String postingDate;
	@BapiParameter(name = "REF_DOC_NO", type = ParameterType.SCALAR)
	private String referenceDocumentNumber;
	@BapiParameter(name = "COMP_CODE", type = ParameterType.SCALAR)
	private String companyCode;
	@BapiParameter(name = "DIFF_INV", type = ParameterType.SCALAR)
	private String diffInvoicer;
	@BapiParameter(name = "CURRENCY", type = ParameterType.SCALAR)
	private String currency;
	@BapiParameter(name = "CURRENCY_ISO", type = ParameterType.SCALAR)
	private String currencyISO;
	@BapiParameter(name = "EXCH_RATE", type = ParameterType.SCALAR)
	private Double exchangeRate;
	@BapiParameter(name = "EXCH_RATE_V", type = ParameterType.SCALAR)
	private Double exchangeRateV;
	@BapiParameter(name = "GROSS_AMOUNT", type = ParameterType.SCALAR)
	private Double grossAmount;
	@BapiParameter(name = "CALC_TAX_IND", type = ParameterType.SCALAR)
	private String calcTaxInd;
	@BapiParameter(name = "PMNTTRMS", type = ParameterType.SCALAR)
	private String paymentCondition;
	@BapiParameter(name = "BLINE_DATE", type = ParameterType.SCALAR)
	private String bottomLineDate;
	@BapiParameter(name = "DSCT_DAYS1", type = ParameterType.SCALAR)
	private Integer discountDays1;
	@BapiParameter(name = "DSCT_DAYS2", type = ParameterType.SCALAR)
	private Integer discountDays2;
	@BapiParameter(name = "NETTERMS", type = ParameterType.SCALAR)
	private Integer netTerms;
	@BapiParameter(name = "DSCT_PCT1", type = ParameterType.SCALAR)
	private Integer disccountPCT1;
	@BapiParameter(name = "DSCT_PCT2", type = ParameterType.SCALAR)
	private Integer disccountPCT2;
	@BapiParameter(name = "IV_CATEGORY", type = ParameterType.SCALAR)
	private String invoiceCategory;
	@BapiParameter(name = "HEADER_TXT", type = ParameterType.SCALAR)
	private String headerText;
	@BapiParameter(name = "PMNT_BLOCK", type = ParameterType.SCALAR)
	private String paymentBlocking;
	@BapiParameter(name = "DEL_COSTS", type = ParameterType.SCALAR)
	private Double deliveryCosts;
	@BapiParameter(name = "DEL_COSTS_TAXC", type = ParameterType.SCALAR)
	private String deliveryCostsTaxCost;
	@BapiParameter(name = "DEL_COSTS_TAXJ", type = ParameterType.SCALAR)
	private String deliveryCostsJurisdictionTax;
	@BapiParameter(name = "PERSON_EXT", type = ParameterType.SCALAR)
	private String personExt;
	@BapiParameter(name = "PYMT_METH", type = ParameterType.SCALAR)
	private String paymentMethod;
	@BapiParameter(name = "PMTMTHSUPL", type = ParameterType.SCALAR)
	private String paymentMethodSupplement;
	@BapiParameter(name = "INV_DOC_NO", type = ParameterType.SCALAR)
	private String invoiceDocumentNumber;
	@BapiParameter(name = "SCBANK_IND", type = ParameterType.SCALAR)
	private String centralBankIndicator;
	@BapiParameter(name = "SUPCOUNTRY", type = ParameterType.SCALAR)
	private String supplyCountry;
	@BapiParameter(name = "BLLSRV_IND", type = ParameterType.SCALAR)
	private String billServiceIndicator;
	@BapiParameter(name = "REF_DOC_NO_LONG", type = ParameterType.SCALAR)
	private String referenceDocumentNumberLong;
	@BapiParameter(name = "DSCT_AMOUNT", type = ParameterType.SCALAR)
	private Double discountAmmount;
	@BapiParameter(name = "PO_SUB_NO", type = ParameterType.SCALAR)
	private String poSubNO;
	@BapiParameter(name = "PO_CHECKDG", type = ParameterType.SCALAR)
	private String poCheckingDigit;
	@BapiParameter(name = "PO_REF_NO", type = ParameterType.SCALAR)
	private String poReferenceNumber;
	@BapiParameter(name = "PAYEE_PAYER", type = ParameterType.SCALAR)
	private String payeePayer;
	@BapiParameter(name = "PARTNER_BK", type = ParameterType.SCALAR)
	private String partnerBank;
	@BapiParameter(name = "HOUSEBANKID", type = ParameterType.SCALAR)
	private String houseBankId;
	@BapiParameter(name = "ALLOC_NMBR", type = ParameterType.SCALAR)
	private String allocNumber;
	@BapiParameter(name = "PAYMT_REF", type = ParameterType.SCALAR)
	private String paymentReference;
	@BapiParameter(name = "INV_REF_NO", type = ParameterType.SCALAR)
	private String invoiceReferenceNumber;
	@BapiParameter(name = "INV_YEAR", type = ParameterType.SCALAR)
	private Integer invoiceYear;
	@BapiParameter(name = "INV_REC_DATE", type = ParameterType.SCALAR)
	private Integer invoiceReceptionDate;
	@BapiParameter(name = "PLANNING_LEVEL", type = ParameterType.SCALAR)
	private String planningLevel;
	@BapiParameter(name = "PLANNING_DATE", type = ParameterType.SCALAR)
	private String planningDate;
	@BapiParameter(name = "FIXEDTERMS", type = ParameterType.SCALAR)
	private String fixedTerms;
	@BapiParameter(name = "BUS_AREA", type = ParameterType.SCALAR)
	private String bussinessArea;
	@BapiParameter(name = "LOT_NUMBER", type = ParameterType.SCALAR)
	private String lotNumber;
	@BapiParameter(name = "ITEM_TEXT", type = ParameterType.SCALAR)
	private String itemText;
	@BapiParameter(name = "EU_TRIANG_DEAL", type = ParameterType.SCALAR)
	private String ueTriangDeal;
	@BapiParameter(name = "REPCOUNTRY", type = ParameterType.SCALAR)
	private String repCountry;
	@BapiParameter(name = "VAT_REG_NO", type = ParameterType.SCALAR)
	private String vatRegNumber;
	@BapiParameter(name = "BUSINESS_PLACE", type = ParameterType.SCALAR)
	private String businessPlace;
	@BapiParameter(name = "TAX_EXCH_RATE", type = ParameterType.SCALAR)
	private Double taxExchangeRate;
	@BapiParameter(name = "GOODS_AFFECTED", type = ParameterType.SCALAR)
	private String goodsAffected;
	@BapiParameter(name = "RET_DUE_PROP", type = ParameterType.SCALAR)
	private String retentionDueProp;
	@BapiParameter(name = "DELIV_POSTING", type = ParameterType.SCALAR)
	private String deliveryPosting;
	@BapiParameter(name = "RETURN_POSTING", type = ParameterType.SCALAR)
	private String returnPosting;
	@BapiParameter(name = "INV_TRAN", type = ParameterType.SCALAR)
	private String invoiceTransaction;
	@BapiParameter(name = "SIMULATION", type = ParameterType.SCALAR)
	private String simulation;
	public String getInvoiceIndicator() {
		return invoiceIndicator;
	}
	public void setInvoiceIndicator(String invoiceIndicator) {
		this.invoiceIndicator = invoiceIndicator;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentDate() {
		return documentDate;
	}
	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}
	public String getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}
	public String getReferenceDocumentNumber() {
		return referenceDocumentNumber;
	}
	public void setReferenceDocumentNumber(String referenceDocumentNumber) {
		this.referenceDocumentNumber = referenceDocumentNumber;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getDiffInvoicer() {
		return diffInvoicer;
	}
	public void setDiffInvoicer(String diffInvoicer) {
		this.diffInvoicer = diffInvoicer;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrencyISO() {
		return currencyISO;
	}
	public void setCurrencyISO(String currencyISO) {
		this.currencyISO = currencyISO;
	}
	public Double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public Double getExchangeRateV() {
		return exchangeRateV;
	}
	public void setExchangeRateV(Double exchangeRateV) {
		this.exchangeRateV = exchangeRateV;
	}
	public Double getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public String getCalcTaxInd() {
		return calcTaxInd;
	}
	public void setCalcTaxInd(String calcTaxInd) {
		this.calcTaxInd = calcTaxInd;
	}
	public String getPaymentCondition() {
		return paymentCondition;
	}
	public void setPaymentCondition(String paymentCondition) {
		this.paymentCondition = paymentCondition;
	}
	public String getBottomLineDate() {
		return bottomLineDate;
	}
	public void setBottomLineDate(String bottomLineDate) {
		this.bottomLineDate = bottomLineDate;
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
	public Integer getDisccountPCT1() {
		return disccountPCT1;
	}
	public void setDisccountPCT1(Integer disccountPCT1) {
		this.disccountPCT1 = disccountPCT1;
	}
	public Integer getDisccountPCT2() {
		return disccountPCT2;
	}
	public void setDisccountPCT2(Integer disccountPCT2) {
		this.disccountPCT2 = disccountPCT2;
	}
	public String getInvoiceCategory() {
		return invoiceCategory;
	}
	public void setInvoiceCategory(String invoiceCategory) {
		this.invoiceCategory = invoiceCategory;
	}
	public String getHeaderText() {
		return headerText;
	}
	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}
	public String getPaymentBlocking() {
		return paymentBlocking;
	}
	public void setPaymentBlocking(String paymentBlocking) {
		this.paymentBlocking = paymentBlocking;
	}
	public Double getDeliveryCosts() {
		return deliveryCosts;
	}
	public void setDeliveryCosts(Double deliveryCosts) {
		this.deliveryCosts = deliveryCosts;
	}
	public String getDeliveryCostsTaxCost() {
		return deliveryCostsTaxCost;
	}
	public void setDeliveryCostsTaxCost(String deliveryCostsTaxCost) {
		this.deliveryCostsTaxCost = deliveryCostsTaxCost;
	}
	public String getDeliveryCostsJurisdictionTax() {
		return deliveryCostsJurisdictionTax;
	}
	public void setDeliveryCostsJurisdictionTax(String deliveryCostsJurisdictionTax) {
		this.deliveryCostsJurisdictionTax = deliveryCostsJurisdictionTax;
	}
	public String getPersonExt() {
		return personExt;
	}
	public void setPersonExt(String personExt) {
		this.personExt = personExt;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentMethodSupplement() {
		return paymentMethodSupplement;
	}
	public void setPaymentMethodSupplement(String paymentMethodSupplement) {
		this.paymentMethodSupplement = paymentMethodSupplement;
	}
	public String getInvoiceDocumentNumber() {
		return invoiceDocumentNumber;
	}
	public void setInvoiceDocumentNumber(String invoiceDocumentNumber) {
		this.invoiceDocumentNumber = invoiceDocumentNumber;
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
	public String getBillServiceIndicator() {
		return billServiceIndicator;
	}
	public void setBillServiceIndicator(String billServiceIndicator) {
		this.billServiceIndicator = billServiceIndicator;
	}
	public String getReferenceDocumentNumberLong() {
		return referenceDocumentNumberLong;
	}
	public void setReferenceDocumentNumberLong(String referenceDocumentNumberLong) {
		this.referenceDocumentNumberLong = referenceDocumentNumberLong;
	}
	public Double getDiscountAmmount() {
		return discountAmmount;
	}
	public void setDiscountAmmount(Double discountAmmount) {
		this.discountAmmount = discountAmmount;
	}
	public String getPoSubNO() {
		return poSubNO;
	}
	public void setPoSubNO(String poSubNO) {
		this.poSubNO = poSubNO;
	}
	public String getPoCheckingDigit() {
		return poCheckingDigit;
	}
	public void setPoCheckingDigit(String poCheckingDigit) {
		this.poCheckingDigit = poCheckingDigit;
	}
	public String getPoReferenceNumber() {
		return poReferenceNumber;
	}
	public void setPoReferenceNumber(String poReferenceNumber) {
		this.poReferenceNumber = poReferenceNumber;
	}
	public String getPayeePayer() {
		return payeePayer;
	}
	public void setPayeePayer(String payeePayer) {
		this.payeePayer = payeePayer;
	}
	public String getPartnerBank() {
		return partnerBank;
	}
	public void setPartnerBank(String partnerBank) {
		this.partnerBank = partnerBank;
	}
	public String getHouseBankId() {
		return houseBankId;
	}
	public void setHouseBankId(String houseBankId) {
		this.houseBankId = houseBankId;
	}
	public String getAllocNumber() {
		return allocNumber;
	}
	public void setAllocNumber(String allocNumber) {
		this.allocNumber = allocNumber;
	}
	public String getPaymentReference() {
		return paymentReference;
	}
	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}
	public String getInvoiceReferenceNumber() {
		return invoiceReferenceNumber;
	}
	public void setInvoiceReferenceNumber(String invoiceReferenceNumber) {
		this.invoiceReferenceNumber = invoiceReferenceNumber;
	}
	public Integer getInvoiceYear() {
		return invoiceYear;
	}
	public void setInvoiceYear(Integer invoiceYear) {
		this.invoiceYear = invoiceYear;
	}
	public Integer getInvoiceReceptionDate() {
		return invoiceReceptionDate;
	}
	public void setInvoiceReceptionDate(Integer invoiceReceptionDate) {
		this.invoiceReceptionDate = invoiceReceptionDate;
	}
	public String getPlanningLevel() {
		return planningLevel;
	}
	public void setPlanningLevel(String planningLevel) {
		this.planningLevel = planningLevel;
	}
	public String getPlanningDate() {
		return planningDate;
	}
	public void setPlanningDate(String planningDate) {
		this.planningDate = planningDate;
	}
	public String getFixedTerms() {
		return fixedTerms;
	}
	public void setFixedTerms(String fixedTerms) {
		this.fixedTerms = fixedTerms;
	}
	public String getBussinessArea() {
		return bussinessArea;
	}
	public void setBussinessArea(String bussinessArea) {
		this.bussinessArea = bussinessArea;
	}
	public String getLotNumber() {
		return lotNumber;
	}
	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}
	public String getUeTriangDeal() {
		return ueTriangDeal;
	}
	public void setUeTriangDeal(String ueTriangDeal) {
		this.ueTriangDeal = ueTriangDeal;
	}
	public String getRepCountry() {
		return repCountry;
	}
	public void setRepCountry(String repCountry) {
		this.repCountry = repCountry;
	}
	public String getVatRegNumber() {
		return vatRegNumber;
	}
	public void setVatRegNumber(String vatRegNumber) {
		this.vatRegNumber = vatRegNumber;
	}
	public String getBusinessPlace() {
		return businessPlace;
	}
	public void setBusinessPlace(String businessPlace) {
		this.businessPlace = businessPlace;
	}
	public Double getTaxExchangeRate() {
		return taxExchangeRate;
	}
	public void setTaxExchangeRate(Double taxExchangeRate) {
		this.taxExchangeRate = taxExchangeRate;
	}
	public String getGoodsAffected() {
		return goodsAffected;
	}
	public void setGoodsAffected(String goodsAffected) {
		this.goodsAffected = goodsAffected;
	}
	public String getRetentionDueProp() {
		return retentionDueProp;
	}
	public void setRetentionDueProp(String retentionDueProp) {
		this.retentionDueProp = retentionDueProp;
	}
	public String getDeliveryPosting() {
		return deliveryPosting;
	}
	public void setDeliveryPosting(String deliveryPosting) {
		this.deliveryPosting = deliveryPosting;
	}
	public String getReturnPosting() {
		return returnPosting;
	}
	public void setReturnPosting(String returnPosting) {
		this.returnPosting = returnPosting;
	}
	public String getInvoiceTransaction() {
		return invoiceTransaction;
	}
	public void setInvoiceTransaction(String invoiceTransaction) {
		this.invoiceTransaction = invoiceTransaction;
	}
	public String getSimulation() {
		return simulation;
	}
	public void setSimulation(String simulation) {
		this.simulation = simulation;
	}
	
	
	
	
	
}
