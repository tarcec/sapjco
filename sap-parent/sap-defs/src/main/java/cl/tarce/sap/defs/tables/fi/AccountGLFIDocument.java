package cl.tarce.sap.defs.tables.fi;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class AccountGLFIDocument {
	@BapiParameter(name = "ITEMNO_ACC", type = ParameterType.SCALAR)
	private Integer itemNumber;
	
	@BapiParameter(name = "GL_ACCOUNT", type = ParameterType.SCALAR)
	private String glAccount;
	
	@BapiParameter(name = "ITEM_TEXT", type = ParameterType.SCALAR)
	private String itemText;
	
	@BapiParameter(name = "STAT_CON", type = ParameterType.SCALAR)
	private String staticalPosting;
	
	@BapiParameter(name = "LOG_PROC", type = ParameterType.SCALAR)
	private String logicalProcess;
	
	@BapiParameter(name = "AC_DOC_NO", type = ParameterType.SCALAR)
	private String accountingDocumentNumber;
	
	@BapiParameter(name = "REF_KEY_1", type = ParameterType.SCALAR)
	private String referenceKey1;
	
	@BapiParameter(name = "REF_KEY_2", type = ParameterType.SCALAR)
	private String referenceKey2;
	
	@BapiParameter(name = "REF_KEY_3", type = ParameterType.SCALAR)
	private String referenceKey3;
	
	@BapiParameter(name = "ACCT_KEY", type = ParameterType.SCALAR)
	private String accountingKey;
	
	@BapiParameter(name = "ACCT_TYPE", type = ParameterType.SCALAR)
	private String accountingType;
	
	@BapiParameter(name = "DOC_TYPE", type = ParameterType.SCALAR)
	private String documentType;
	
	@BapiParameter(name = "COMP_CODE", type = ParameterType.SCALAR)
	private String companyCode;
	
	@BapiParameter(name = "BUS_AREA", type = ParameterType.SCALAR)
	private String businessArea;
	
	@BapiParameter(name = "FUNC_AREA", type = ParameterType.SCALAR)
	private String functionalArea;
	
	@BapiParameter(name = "PLANT", type = ParameterType.SCALAR)
	private String plant;
	
	@BapiParameter(name = "FIS_PERIOD", type = ParameterType.SCALAR)
	private Integer fiscalPeriod;
	
	@BapiParameter(name = "FISC_YEAR", type = ParameterType.SCALAR)
	private Integer fiscalYear;
	
	@BapiParameter(name = "PSTNG_DATE", type = ParameterType.SCALAR)
	private String postingDate;
	
	@BapiParameter(name = "VALUE_DATE", type = ParameterType.SCALAR)
	private String valueArea;
	
	@BapiParameter(name = "FM_AREA", type = ParameterType.SCALAR)
	private String fmArea;
	
	@BapiParameter(name = "CUSTOMER", type = ParameterType.SCALAR)
	private String customer;
	
	@BapiParameter(name = "CSHDIS_IND", type = ParameterType.SCALAR)
	private String cshidsIndicator;
	
	@BapiParameter(name = "VENDOR_NO", type = ParameterType.SCALAR)
	private String vendorNumber;
	
	@BapiParameter(name = "ALLOC_NMBR", type = ParameterType.SCALAR)
	private String allocNumber;
	
	@BapiParameter(name = "TAX_CODE", type = ParameterType.SCALAR)
	private String taxCode;
	
	@BapiParameter(name = "TAXJURCODE", type = ParameterType.SCALAR)
	private String taxJurisdictionCode;
	
	@BapiParameter(name = "EXT_OBJECT_ID", type = ParameterType.SCALAR)
	private String externalOjectId;
	
	@BapiParameter(name = "BUS_SCENARIO", type = ParameterType.SCALAR)
	private String businessScenario;
	
	@BapiParameter(name = "COSTOBJECT", type = ParameterType.SCALAR)
	private String costObject;
	
	@BapiParameter(name = "COSTCENTER", type = ParameterType.SCALAR)
	private String costCenter;
	
	@BapiParameter(name = "ACTTYPE", type = ParameterType.SCALAR)
	private String activityType;
	
	@BapiParameter(name = "PROFIT_CTR", type = ParameterType.SCALAR)
	private String profitCenter;
	
	@BapiParameter(name = "PART_PRCTR", type = ParameterType.SCALAR)
	private String partnerProfitCenter;
	
	@BapiParameter(name = "NETWORK", type = ParameterType.SCALAR)
	private String network;
	
	@BapiParameter(name = "WBS_ELEMENT", type = ParameterType.SCALAR)
	private String wbsElement;
	
	@BapiParameter(name = "ORDERID", type = ParameterType.SCALAR)
	private String orderId;
	
	@BapiParameter(name = "ORDER_ITNO", type = ParameterType.SCALAR)
	private Integer orderIdItemNumber;
	
	@BapiParameter(name = "ROUTING_NO", type = ParameterType.SCALAR)
	private Integer routingNumber;
	
	@BapiParameter(name = "ACTIVITY", type = ParameterType.SCALAR)
	private String activity;
	
	@BapiParameter(name = "COND_TYPE", type = ParameterType.SCALAR)
	private String conditionType;
	
	@BapiParameter(name = "COND_COUNT", type = ParameterType.SCALAR)
	private Integer conditionCount;
	
	@BapiParameter(name = "COND_ST_NO", type = ParameterType.SCALAR)
	private Integer conditionStageNumber;
	
	@BapiParameter(name = "FUND", type = ParameterType.SCALAR)
	private String fund;
	
	@BapiParameter(name = "FUNDS_CTR", type = ParameterType.SCALAR)
	private String fundsCenter;
	
	@BapiParameter(name = "CMMT_ITEM", type = ParameterType.SCALAR)
	private String commitmentItem;
	
	@BapiParameter(name = "CO_BUSPROC", type = ParameterType.SCALAR)
	private String coBussinesProcess;
	
	@BapiParameter(name = "ASSET_NO", type = ParameterType.SCALAR)
	private String assetNumber;
	
	@BapiParameter(name = "SUB_NUMBER", type = ParameterType.SCALAR)
	private String assetSubNumber;
	
	@BapiParameter(name = "BILL_TYPE", type = ParameterType.SCALAR)
	private String billType;
	
	@BapiParameter(name = "SALES_ORD", type = ParameterType.SCALAR)
	private String salesOrder;
	
	@BapiParameter(name = "S_ORD_ITEM", type = ParameterType.SCALAR)
	private Integer salesOrderItem;
	
	@BapiParameter(name = "DISTR_CHAN", type = ParameterType.SCALAR)
	private String distributionChannel;
	
	@BapiParameter(name = "DIVISION", type = ParameterType.SCALAR)
	private String division;
	
	@BapiParameter(name = "SALESORG", type = ParameterType.SCALAR)
	private String salesOrganization;
	
	@BapiParameter(name = "SALES_GRP", type = ParameterType.SCALAR)
	private String salesGroup;
	
	@BapiParameter(name = "SALES_OFF", type = ParameterType.SCALAR)
	private String salesOffice;
	
	@BapiParameter(name = "SOLD_TO", type = ParameterType.SCALAR)
	private String soldTo;
	
	@BapiParameter(name = "DE_CRE_IND", type = ParameterType.SCALAR)
	private String deCreInd;
	
	@BapiParameter(name = "P_EL_PRCTR", type = ParameterType.SCALAR)
	private String partnerProfitCenterDelete;
	
	@BapiParameter(name = "XMFRW", type = ParameterType.SCALAR)
	private String updateAmountFI;
	
	@BapiParameter(name = "QUANTITY", type = ParameterType.SCALAR)
	private Double quantity;
	
	@BapiParameter(name = "BASE_UOM", type = ParameterType.SCALAR)
	private String baseUnitOfMeasure;
	
	@BapiParameter(name = "BASE_UOM_ISO", type = ParameterType.SCALAR)
	private String baseUnitOfMeasureISO;
	
	@BapiParameter(name = "INV_QTY", type = ParameterType.SCALAR)
	private Double inventoryQuantity;
	
	@BapiParameter(name = "INV_QTY_SU", type = ParameterType.SCALAR)
	private Double inventoryQuantitySupplyUnits;
	
	@BapiParameter(name = "SALES_UNIT", type = ParameterType.SCALAR)
	private String salesUnitOfMeasure;
	
	@BapiParameter(name = "SALES_UNIT_ISO", type = ParameterType.SCALAR)
	private String salesUnitOfMeasureISO;
	
	@BapiParameter(name = "PO_PR_QNT", type = ParameterType.SCALAR)
	private Double poProcurementQuantity;
	
	@BapiParameter(name = "PO_PR_UOM", type = ParameterType.SCALAR)
	private String poProcurementUnitOfMeasure;
	
	@BapiParameter(name = "PO_PR_UOM_ISO", type = ParameterType.SCALAR)
	private String poProcurementUnitOfMeasureISO;
	
	@BapiParameter(name = "ENTRY_QNT", type = ParameterType.SCALAR)
	private Double entryQuantity;
	
	@BapiParameter(name = "ENTRY_UOM", type = ParameterType.SCALAR)
	private String entryUnitOfMeasure;
	
	@BapiParameter(name = "ENTRY_UOM_ISO", type = ParameterType.SCALAR)
	private String entryUnitOfMeasureISO;
	
	@BapiParameter(name = "VOLUME", type = ParameterType.SCALAR)
	private Double volume;
	
	@BapiParameter(name = "VOLUMEUNIT", type = ParameterType.SCALAR)
	private String volumeUnitOfMeasure;
	
	@BapiParameter(name = "VOLUMEUNIT_ISO", type = ParameterType.SCALAR)
	private String volumeUnitOfMeasureISO;
	
	@BapiParameter(name = "GROSS_WT", type = ParameterType.SCALAR)
	private Double grossWeight;
	
	@BapiParameter(name = "NET_WEIGHT", type = ParameterType.SCALAR)
	private Double netWeight;
	
	@BapiParameter(name = "UNIT_OF_WT", type = ParameterType.SCALAR)
	private String weightUnitOfMeasure;
	
	@BapiParameter(name = "UNIT_OF_WT_ISO", type = ParameterType.SCALAR)
	private String weightUnitOfMeasureISO;
	
	@BapiParameter(name = "ITEM_CAT", type = ParameterType.SCALAR)
	private String itemCategory;
	
	@BapiParameter(name = "MATERIAL", type = ParameterType.SCALAR)
	private String material;
	
	@BapiParameter(name = "MATL_TYPE", type = ParameterType.SCALAR)
	private String materialType;
	
	@BapiParameter(name = "MVT_IND", type = ParameterType.SCALAR)
	private String movementIndicator;
	
	@BapiParameter(name = "REVAL_IND", type = ParameterType.SCALAR)
	private String revaluationIndicator;
	
	@BapiParameter(name = "ORIG_GROUP", type = ParameterType.SCALAR)
	private String originGrouo;
	
	@BapiParameter(name = "ORIG_MAT", type = ParameterType.SCALAR)
	private String originMaterial;
	
	@BapiParameter(name = "SERIAL_NO", type = ParameterType.SCALAR)
	private Integer serialNumber;
	
	@BapiParameter(name = "PART_ACCT", type = ParameterType.SCALAR)
	private String partnerAccount;
	
	@BapiParameter(name = "TR_PART_BA", type = ParameterType.SCALAR)
	private String partnerTradeBusinessArea;
	
	@BapiParameter(name = "TRADE_ID", type = ParameterType.SCALAR)
	private String tradeId;
	
	@BapiParameter(name = "VAL_AREA", type = ParameterType.SCALAR)
	private String valuationArea;
	
	@BapiParameter(name = "VAL_TYPE", type = ParameterType.SCALAR)
	private String valuationType;
	
	@BapiParameter(name = "ASVAL_DATE", type = ParameterType.SCALAR)
	private String valuationReferenceDate;
	
	@BapiParameter(name = "PO_NUMBER", type = ParameterType.SCALAR)
	private String poNumber;
	
	@BapiParameter(name = "PO_ITEM", type = ParameterType.SCALAR)
	private Integer poItem;
	
	@BapiParameter(name = "ITM_NUMBER", type = ParameterType.SCALAR)
	private Integer itemNumberCommercial;
	
	@BapiParameter(name = "COND_CATEGORY", type = ParameterType.SCALAR)
	private String conditionCategory;
	
	@BapiParameter(name = "FUNC_AREA_LONG", type = ParameterType.SCALAR)
	private String functionalAreaLong;
	
	@BapiParameter(name = "CMMT_ITEM_LONG", type = ParameterType.SCALAR)
	private Integer commitmentItemNumberLong;
	
	@BapiParameter(name = "GRANT_NBR", type = ParameterType.SCALAR)
	private String grantNumber;
	
	@BapiParameter(name = "CS_TRANS_T", type = ParameterType.SCALAR)
	private String classTransactionType;
	
	@BapiParameter(name = "MEASURE", type = ParameterType.SCALAR)
	private String measure;
	
	@BapiParameter(name = "SEGMENT", type = ParameterType.SCALAR)
	private String segment;
	
	@BapiParameter(name = "PARTNER_SEGMENT", type = ParameterType.SCALAR)
	private String partnerSegment;
	
	@BapiParameter(name = "RES_DOC", type = ParameterType.SCALAR)
	private String resDoc;
	
	@BapiParameter(name = "RES_ITEM", type = ParameterType.SCALAR)
	private Integer resItem;
	
	@BapiParameter(name = "BILLING_PERIOD_START_DATE", type = ParameterType.SCALAR)
	private String billingPeriodStartDate;
	
	@BapiParameter(name = "BILLING_PERIOD_END_DATE", type = ParameterType.SCALAR)
	private String billingPeriodEndDate;
	
	@BapiParameter(name = "PPA_EX_IND", type = ParameterType.SCALAR)
	private String ppaExInd;
	
	@BapiParameter(name = "FASTPAY", type = ParameterType.SCALAR)
	private String fastPayIndicator;
	
	@BapiParameter(name = "PARTNER_GRANT_NBR", type = ParameterType.SCALAR)
	private String partnerGrantNumber;
	
	@BapiParameter(name = "BUDGET_PERIOD", type = ParameterType.SCALAR)
	private String budgetPeriod;
	
	@BapiParameter(name = "PARTNER_BUDGET_PERIOD", type = ParameterType.SCALAR)
	private String partnerBudgetPeriod;
	
	@BapiParameter(name = "PARTNER_FUND", type = ParameterType.SCALAR)
	private String partnerFund;
	
	@BapiParameter(name = "ITEMNO_TAX", type = ParameterType.SCALAR)
	private Integer taxItemNumber;
	
	@BapiParameter(name = "PAYMENT_TYPE", type = ParameterType.SCALAR)
	private String paymentType;
	
	@BapiParameter(name = "EXPENSE_TYPE", type = ParameterType.SCALAR)
	private String expenseType;
	
	@BapiParameter(name = "PROGRAM_PROFILE", type = ParameterType.SCALAR)
	private String programProfile;

	public Integer getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getGlAccount() {
		return glAccount;
	}

	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
	}

	public String getItemText() {
		return itemText;
	}

	public void setItemText(String itemText) {
		this.itemText = itemText;
	}

	public String getStaticalPosting() {
		return staticalPosting;
	}

	public void setStaticalPosting(String staticalPosting) {
		this.staticalPosting = staticalPosting;
	}

	public String getLogicalProcess() {
		return logicalProcess;
	}

	public void setLogicalProcess(String logicalProcess) {
		this.logicalProcess = logicalProcess;
	}

	public String getAccountingDocumentNumber() {
		return accountingDocumentNumber;
	}

	public void setAccountingDocumentNumber(String accountingDocumentNumber) {
		this.accountingDocumentNumber = accountingDocumentNumber;
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

	public String getAccountingKey() {
		return accountingKey;
	}

	public void setAccountingKey(String accountingKey) {
		this.accountingKey = accountingKey;
	}

	public String getAccountingType() {
		return accountingType;
	}

	public void setAccountingType(String accountingType) {
		this.accountingType = accountingType;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
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

	public String getFunctionalArea() {
		return functionalArea;
	}

	public void setFunctionalArea(String functionalArea) {
		this.functionalArea = functionalArea;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public Integer getFiscalPeriod() {
		return fiscalPeriod;
	}

	public void setFiscalPeriod(Integer fiscalPeriod) {
		this.fiscalPeriod = fiscalPeriod;
	}

	public Integer getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(Integer fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public String getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}

	public String getValueArea() {
		return valueArea;
	}

	public void setValueArea(String valueArea) {
		this.valueArea = valueArea;
	}

	public String getFmArea() {
		return fmArea;
	}

	public void setFmArea(String fmArea) {
		this.fmArea = fmArea;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCshidsIndicator() {
		return cshidsIndicator;
	}

	public void setCshidsIndicator(String cshidsIndicator) {
		this.cshidsIndicator = cshidsIndicator;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public String getAllocNumber() {
		return allocNumber;
	}

	public void setAllocNumber(String allocNumber) {
		this.allocNumber = allocNumber;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxJurisdictionCode() {
		return taxJurisdictionCode;
	}

	public void setTaxJurisdictionCode(String taxJurisdictionCode) {
		this.taxJurisdictionCode = taxJurisdictionCode;
	}

	public String getExternalOjectId() {
		return externalOjectId;
	}

	public void setExternalOjectId(String externalOjectId) {
		this.externalOjectId = externalOjectId;
	}

	public String getBusinessScenario() {
		return businessScenario;
	}

	public void setBusinessScenario(String businessScenario) {
		this.businessScenario = businessScenario;
	}

	public String getCostObject() {
		return costObject;
	}

	public void setCostObject(String costObject) {
		this.costObject = costObject;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public String getPartnerProfitCenter() {
		return partnerProfitCenter;
	}

	public void setPartnerProfitCenter(String partnerProfitCenter) {
		this.partnerProfitCenter = partnerProfitCenter;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getWbsElement() {
		return wbsElement;
	}

	public void setWbsElement(String wbsElement) {
		this.wbsElement = wbsElement;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderIdItemNumber() {
		return orderIdItemNumber;
	}

	public void setOrderIdItemNumber(Integer orderIdItemNumber) {
		this.orderIdItemNumber = orderIdItemNumber;
	}

	public Integer getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(Integer routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getConditionType() {
		return conditionType;
	}

	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}

	public Integer getConditionCount() {
		return conditionCount;
	}

	public void setConditionCount(Integer conditionCount) {
		this.conditionCount = conditionCount;
	}

	public Integer getConditionStageNumber() {
		return conditionStageNumber;
	}

	public void setConditionStageNumber(Integer conditionStageNumber) {
		this.conditionStageNumber = conditionStageNumber;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getFundsCenter() {
		return fundsCenter;
	}

	public void setFundsCenter(String fundsCenter) {
		this.fundsCenter = fundsCenter;
	}

	public String getCommitmentItem() {
		return commitmentItem;
	}

	public void setCommitmentItem(String commitmentItem) {
		this.commitmentItem = commitmentItem;
	}

	public String getCoBussinesProcess() {
		return coBussinesProcess;
	}

	public void setCoBussinesProcess(String coBussinesProcess) {
		this.coBussinesProcess = coBussinesProcess;
	}

	public String getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getAssetSubNumber() {
		return assetSubNumber;
	}

	public void setAssetSubNumber(String assetSubNumber) {
		this.assetSubNumber = assetSubNumber;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getSalesOrder() {
		return salesOrder;
	}

	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}

	public Integer getSalesOrderItem() {
		return salesOrderItem;
	}

	public void setSalesOrderItem(Integer salesOrderItem) {
		this.salesOrderItem = salesOrderItem;
	}

	public String getDistributionChannel() {
		return distributionChannel;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSalesOrganization() {
		return salesOrganization;
	}

	public void setSalesOrganization(String salesOrganization) {
		this.salesOrganization = salesOrganization;
	}

	public String getSalesGroup() {
		return salesGroup;
	}

	public void setSalesGroup(String salesGroup) {
		this.salesGroup = salesGroup;
	}

	public String getSalesOffice() {
		return salesOffice;
	}

	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}

	public String getSoldTo() {
		return soldTo;
	}

	public void setSoldTo(String soldTo) {
		this.soldTo = soldTo;
	}

	public String getDeCreInd() {
		return deCreInd;
	}

	public void setDeCreInd(String deCreInd) {
		this.deCreInd = deCreInd;
	}

	public String getPartnerProfitCenterDelete() {
		return partnerProfitCenterDelete;
	}

	public void setPartnerProfitCenterDelete(String partnerProfitCenterDelete) {
		this.partnerProfitCenterDelete = partnerProfitCenterDelete;
	}

	public String getUpdateAmountFI() {
		return updateAmountFI;
	}

	public void setUpdateAmountFI(String updateAmountFI) {
		this.updateAmountFI = updateAmountFI;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getBaseUnitOfMeasure() {
		return baseUnitOfMeasure;
	}

	public void setBaseUnitOfMeasure(String baseUnitOfMeasure) {
		this.baseUnitOfMeasure = baseUnitOfMeasure;
	}

	public String getBaseUnitOfMeasureISO() {
		return baseUnitOfMeasureISO;
	}

	public void setBaseUnitOfMeasureISO(String baseUnitOfMeasureISO) {
		this.baseUnitOfMeasureISO = baseUnitOfMeasureISO;
	}

	public Double getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(Double inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

	public Double getInventoryQuantitySupplyUnits() {
		return inventoryQuantitySupplyUnits;
	}

	public void setInventoryQuantitySupplyUnits(Double inventoryQuantitySupplyUnits) {
		this.inventoryQuantitySupplyUnits = inventoryQuantitySupplyUnits;
	}

	public String getSalesUnitOfMeasure() {
		return salesUnitOfMeasure;
	}

	public void setSalesUnitOfMeasure(String salesUnitOfMeasure) {
		this.salesUnitOfMeasure = salesUnitOfMeasure;
	}

	public String getSalesUnitOfMeasureISO() {
		return salesUnitOfMeasureISO;
	}

	public void setSalesUnitOfMeasureISO(String salesUnitOfMeasureISO) {
		this.salesUnitOfMeasureISO = salesUnitOfMeasureISO;
	}

	public Double getPoProcurementQuantity() {
		return poProcurementQuantity;
	}

	public void setPoProcurementQuantity(Double poProcurementQuantity) {
		this.poProcurementQuantity = poProcurementQuantity;
	}

	public String getPoProcurementUnitOfMeasure() {
		return poProcurementUnitOfMeasure;
	}

	public void setPoProcurementUnitOfMeasure(String poProcurementUnitOfMeasure) {
		this.poProcurementUnitOfMeasure = poProcurementUnitOfMeasure;
	}

	public String getPoProcurementUnitOfMeasureISO() {
		return poProcurementUnitOfMeasureISO;
	}

	public void setPoProcurementUnitOfMeasureISO(
			String poProcurementUnitOfMeasureISO) {
		this.poProcurementUnitOfMeasureISO = poProcurementUnitOfMeasureISO;
	}

	public Double getEntryQuantity() {
		return entryQuantity;
	}

	public void setEntryQuantity(Double entryQuantity) {
		this.entryQuantity = entryQuantity;
	}

	public String getEntryUnitOfMeasure() {
		return entryUnitOfMeasure;
	}

	public void setEntryUnitOfMeasure(String entryUnitOfMeasure) {
		this.entryUnitOfMeasure = entryUnitOfMeasure;
	}

	public String getEntryUnitOfMeasureISO() {
		return entryUnitOfMeasureISO;
	}

	public void setEntryUnitOfMeasureISO(String entryUnitOfMeasureISO) {
		this.entryUnitOfMeasureISO = entryUnitOfMeasureISO;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public String getVolumeUnitOfMeasure() {
		return volumeUnitOfMeasure;
	}

	public void setVolumeUnitOfMeasure(String volumeUnitOfMeasure) {
		this.volumeUnitOfMeasure = volumeUnitOfMeasure;
	}

	public String getVolumeUnitOfMeasureISO() {
		return volumeUnitOfMeasureISO;
	}

	public void setVolumeUnitOfMeasureISO(String volumeUnitOfMeasureISO) {
		this.volumeUnitOfMeasureISO = volumeUnitOfMeasureISO;
	}

	public Double getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}

	public String getWeightUnitOfMeasure() {
		return weightUnitOfMeasure;
	}

	public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
		this.weightUnitOfMeasure = weightUnitOfMeasure;
	}

	public String getWeightUnitOfMeasureISO() {
		return weightUnitOfMeasureISO;
	}

	public void setWeightUnitOfMeasureISO(String weightUnitOfMeasureISO) {
		this.weightUnitOfMeasureISO = weightUnitOfMeasureISO;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getMovementIndicator() {
		return movementIndicator;
	}

	public void setMovementIndicator(String movementIndicator) {
		this.movementIndicator = movementIndicator;
	}

	public String getRevaluationIndicator() {
		return revaluationIndicator;
	}

	public void setRevaluationIndicator(String revaluationIndicator) {
		this.revaluationIndicator = revaluationIndicator;
	}

	public String getOriginGrouo() {
		return originGrouo;
	}

	public void setOriginGrouo(String originGrouo) {
		this.originGrouo = originGrouo;
	}

	public String getOriginMaterial() {
		return originMaterial;
	}

	public void setOriginMaterial(String originMaterial) {
		this.originMaterial = originMaterial;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getPartnerAccount() {
		return partnerAccount;
	}

	public void setPartnerAccount(String partnerAccount) {
		this.partnerAccount = partnerAccount;
	}

	public String getPartnerTradeBusinessArea() {
		return partnerTradeBusinessArea;
	}

	public void setPartnerTradeBusinessArea(String partnerTradeBusinessArea) {
		this.partnerTradeBusinessArea = partnerTradeBusinessArea;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getValuationArea() {
		return valuationArea;
	}

	public void setValuationArea(String valuationArea) {
		this.valuationArea = valuationArea;
	}

	public String getValuationType() {
		return valuationType;
	}

	public void setValuationType(String valuationType) {
		this.valuationType = valuationType;
	}

	public String getValuationReferenceDate() {
		return valuationReferenceDate;
	}

	public void setValuationReferenceDate(String valuationReferenceDate) {
		this.valuationReferenceDate = valuationReferenceDate;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public Integer getPoItem() {
		return poItem;
	}

	public void setPoItem(Integer poItem) {
		this.poItem = poItem;
	}

	public Integer getItemNumberCommercial() {
		return itemNumberCommercial;
	}

	public void setItemNumberCommercial(Integer itemNumberCommercial) {
		this.itemNumberCommercial = itemNumberCommercial;
	}

	public String getConditionCategory() {
		return conditionCategory;
	}

	public void setConditionCategory(String conditionCategory) {
		this.conditionCategory = conditionCategory;
	}

	public String getFunctionalAreaLong() {
		return functionalAreaLong;
	}

	public void setFunctionalAreaLong(String functionalAreaLong) {
		this.functionalAreaLong = functionalAreaLong;
	}

	public Integer getCommitmentItemNumberLong() {
		return commitmentItemNumberLong;
	}

	public void setCommitmentItemNumberLong(Integer commitmentItemNumberLong) {
		this.commitmentItemNumberLong = commitmentItemNumberLong;
	}

	public String getGrantNumber() {
		return grantNumber;
	}

	public void setGrantNumber(String grantNumber) {
		this.grantNumber = grantNumber;
	}

	public String getClassTransactionType() {
		return classTransactionType;
	}

	public void setClassTransactionType(String classTransactionType) {
		this.classTransactionType = classTransactionType;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getPartnerSegment() {
		return partnerSegment;
	}

	public void setPartnerSegment(String partnerSegment) {
		this.partnerSegment = partnerSegment;
	}

	public String getResDoc() {
		return resDoc;
	}

	public void setResDoc(String resDoc) {
		this.resDoc = resDoc;
	}

	public Integer getResItem() {
		return resItem;
	}

	public void setResItem(Integer resItem) {
		this.resItem = resItem;
	}

	public String getBillingPeriodStartDate() {
		return billingPeriodStartDate;
	}

	public void setBillingPeriodStartDate(String billingPeriodStartDate) {
		this.billingPeriodStartDate = billingPeriodStartDate;
	}

	public String getBillingPeriodEndDate() {
		return billingPeriodEndDate;
	}

	public void setBillingPeriodEndDate(String billingPeriodEndDate) {
		this.billingPeriodEndDate = billingPeriodEndDate;
	}

	public String getPpaExInd() {
		return ppaExInd;
	}

	public void setPpaExInd(String ppaExInd) {
		this.ppaExInd = ppaExInd;
	}

	public String getFastPayIndicator() {
		return fastPayIndicator;
	}

	public void setFastPayIndicator(String fastPayIndicator) {
		this.fastPayIndicator = fastPayIndicator;
	}

	public String getPartnerGrantNumber() {
		return partnerGrantNumber;
	}

	public void setPartnerGrantNumber(String partnerGrantNumber) {
		this.partnerGrantNumber = partnerGrantNumber;
	}

	public String getBudgetPeriod() {
		return budgetPeriod;
	}

	public void setBudgetPeriod(String budgetPeriod) {
		this.budgetPeriod = budgetPeriod;
	}

	public String getPartnerBudgetPeriod() {
		return partnerBudgetPeriod;
	}

	public void setPartnerBudgetPeriod(String partnerBudgetPeriod) {
		this.partnerBudgetPeriod = partnerBudgetPeriod;
	}

	public String getPartnerFund() {
		return partnerFund;
	}

	public void setPartnerFund(String partnerFund) {
		this.partnerFund = partnerFund;
	}

	public Integer getTaxItemNumber() {
		return taxItemNumber;
	}

	public void setTaxItemNumber(Integer taxItemNumber) {
		this.taxItemNumber = taxItemNumber;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getProgramProfile() {
		return programProfile;
	}

	public void setProgramProfile(String programProfile) {
		this.programProfile = programProfile;
	}
	
	
	
	
}
