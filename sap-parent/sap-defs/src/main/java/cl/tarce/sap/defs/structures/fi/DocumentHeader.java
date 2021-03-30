package cl.tarce.sap.defs.structures.fi;

import java.util.Date;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

/**
 * 
 * @author Tarce
 *
 */
public class DocumentHeader {
	@BapiParameter(name = "OBJ_TYPE", type = ParameterType.SCALAR)
	private String objType;
	@BapiParameter(name = "OBJ_KEY", type = ParameterType.SCALAR)
	private String objKey;
	@BapiParameter(name = "OBJ_SYS", type = ParameterType.SCALAR)
	private String objSys;
	@BapiParameter(name = "BUS_ACT", type = ParameterType.SCALAR)
	private String busAct;
	@BapiParameter(name = "USERNAME", type = ParameterType.SCALAR)
	private String username;
	@BapiParameter(name = "HEADER_TXT", type = ParameterType.SCALAR)
	private String headerTxt;
	@BapiParameter(name = "COMP_CODE", type = ParameterType.SCALAR)
	private String companyCode;
	@BapiParameter(name = "DOC_DATE", type = ParameterType.SCALAR)
	private String documentDate;
	@BapiParameter(name = "PSTNG_DATE", type = ParameterType.SCALAR)
	private String postingDate;
	@BapiParameter(name = "TRANS_DATE", type = ParameterType.SCALAR)
	private String transDate;
	@BapiParameter(name = "FISC_YEAR", type = ParameterType.SCALAR)
	private Integer fiscalYear;
	@BapiParameter(name = "FIS_PERIOD", type = ParameterType.SCALAR)
	private Integer fiscalPeriod;
	@BapiParameter(name = "DOC_TYPE", type = ParameterType.SCALAR)
	private String documentType;
	@BapiParameter(name = "REF_DOC_NO", type = ParameterType.SCALAR)
	private String referenceDocumentNumber;
	@BapiParameter(name = "AC_DOC_NO", type = ParameterType.SCALAR)
	private String accountingDocumentNumber;
	@BapiParameter(name = "OBJ_KEY_R", type = ParameterType.SCALAR)
	private String keyForReverse;
	@BapiParameter(name = "REASON_REV", type = ParameterType.SCALAR)
	private String reasonForReverse;
	@BapiParameter(name = "COMPO_ACC", type = ParameterType.SCALAR)
	private String componentOfAccounting;
	@BapiParameter(name = "REF_DOC_NO_LONG", type = ParameterType.SCALAR)
	private String referenceDocumentNumberLong;
	@BapiParameter(name = "ACC_PRINCIPLE", type = ParameterType.SCALAR)
	private String accountingPrinciple;
	@BapiParameter(name = "NEG_POSTNG", type = ParameterType.SCALAR)
	private String negativePosting;
	@BapiParameter(name = "OBJ_KEY_INV", type = ParameterType.SCALAR)
	private String objectKeyInvoice;
	@BapiParameter(name = "BILL_CATEGORY", type = ParameterType.SCALAR)
	private String billingCategory;
	@BapiParameter(name = "VATDATE", type = ParameterType.SCALAR)
	private String vatDate;
	@BapiParameter(name = "INVOICE_REC_DATE", type = ParameterType.SCALAR)
	private String invoiceReceptionDate;
	@BapiParameter(name = "ECS_ENV", type = ParameterType.SCALAR)
	private String ecsEnvirorment;
	@BapiParameter(name = "PARTIAL_REV", type = ParameterType.SCALAR)
	private String partialReverse;
	
	public String getObjType() {
		return objType;
	}
	public void setObjType(String objType) {
		this.objType = objType;
	}
	public String getObjKey() {
		return objKey;
	}
	public void setObjKey(String objKey) {
		this.objKey = objKey;
	}
	public String getObjSys() {
		return objSys;
	}
	public void setObjSys(String objSys) {
		this.objSys = objSys;
	}
	public String getBusAct() {
		return busAct;
	}
	public void setBusAct(String busAct) {
		this.busAct = busAct;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHeaderTxt() {
		return headerTxt;
	}
	public void setHeaderTxt(String headerTxt) {
		this.headerTxt = headerTxt;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
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
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public Integer getFiscalYear() {
		return fiscalYear;
	}
	public void setFiscalYear(Integer fiscalYear) {
		this.fiscalYear = fiscalYear;
	}
	public Integer getFiscalPeriod() {
		return fiscalPeriod;
	}
	public void setFiscalPeriod(Integer fiscalPeriod) {
		this.fiscalPeriod = fiscalPeriod;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getReferenceDocumentNumber() {
		return referenceDocumentNumber;
	}
	public void setReferenceDocumentNumber(String referenceDocumentNumber) {
		this.referenceDocumentNumber = referenceDocumentNumber;
	}
	public String getAccountingDocumentNumber() {
		return accountingDocumentNumber;
	}
	public void setAccountingDocumentNumber(String accountingDocumentNumber) {
		this.accountingDocumentNumber = accountingDocumentNumber;
	}
	public String getKeyForReverse() {
		return keyForReverse;
	}
	public void setKeyForReverse(String keyForReverse) {
		this.keyForReverse = keyForReverse;
	}
	public String getReasonForReverse() {
		return reasonForReverse;
	}
	public void setReasonForReverse(String reasonForReverse) {
		this.reasonForReverse = reasonForReverse;
	}
	public String getComponentOfAccounting() {
		return componentOfAccounting;
	}
	public void setComponentOfAccounting(String componentOfAccounting) {
		this.componentOfAccounting = componentOfAccounting;
	}
	public String getReferenceDocumentNumberLong() {
		return referenceDocumentNumberLong;
	}
	public void setReferenceDocumentNumberLong(String referenceDocumentNumberLong) {
		this.referenceDocumentNumberLong = referenceDocumentNumberLong;
	}
	public String getAccountingPrinciple() {
		return accountingPrinciple;
	}
	public void setAccountingPrinciple(String accountingPrinciple) {
		this.accountingPrinciple = accountingPrinciple;
	}
	public String getNegativePosting() {
		return negativePosting;
	}
	public void setNegativePosting(String negativePosting) {
		this.negativePosting = negativePosting;
	}
	public String getObjectKeyInvoice() {
		return objectKeyInvoice;
	}
	public void setObjectKeyInvoice(String objectKeyInvoice) {
		this.objectKeyInvoice = objectKeyInvoice;
	}
	public String getBillingCategory() {
		return billingCategory;
	}
	public void setBillingCategory(String billingCategory) {
		this.billingCategory = billingCategory;
	}
	public String getVatDate() {
		return vatDate;
	}
	public void setVatDate(String vatDate) {
		this.vatDate = vatDate;
	}
	public String getInvoiceReceptionDate() {
		return invoiceReceptionDate;
	}
	public void setInvoiceReceptionDate(String invoiceReceptionDate) {
		this.invoiceReceptionDate = invoiceReceptionDate;
	}
	public String getEcsEnvirorment() {
		return ecsEnvirorment;
	}
	public void setEcsEnvirorment(String ecsEnvirorment) {
		this.ecsEnvirorment = ecsEnvirorment;
	}
	public String getPartialReverse() {
		return partialReverse;
	}
	public void setPartialReverse(String partialReverse) {
		this.partialReverse = partialReverse;
	}
	
	
	
}
