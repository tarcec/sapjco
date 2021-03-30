package cl.tarce.sap.defs.tables.fi;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class CurrencyAmountInvoiceReceipt {
	@BapiParameter(name = "ITEMNO_ACC", type = ParameterType.SCALAR)
	private Integer itemNumber;
	
	@BapiParameter(name = "CURR_TYPE", type = ParameterType.SCALAR)
	private String currencyType;
	
	@BapiParameter(name = "CURRENCY", type = ParameterType.SCALAR)
	private String currency;
	
	@BapiParameter(name = "CURRENCY_ISO", type = ParameterType.SCALAR)
	private String currencyISO;
	
	@BapiParameter(name = "AMT_DOCCUR", type = ParameterType.SCALAR)
	private Double amountDocumentCurrency;
	
	@BapiParameter(name = "EXCH_RATE", type = ParameterType.SCALAR)
	private Double exchangeRate;
	
	@BapiParameter(name = "AMT_BASE", type = ParameterType.SCALAR)
	private Double baseAmountDocumentCurrency;
	
	@BapiParameter(name = "DISC_BASE", type = ParameterType.SCALAR)
	private Double baseDiscountDocumentCurrency;
	
	@BapiParameter(name = "EXCH_RATE_V", type = ParameterType.SCALAR)
	private Double exchangeRateIndirect;

	public Integer getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(Integer itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
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

	public Double getAmountDocumentCurrency() {
		return amountDocumentCurrency;
	}

	public void setAmountDocumentCurrency(Double amountDocumentCurrency) {
		this.amountDocumentCurrency = amountDocumentCurrency;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Double getExchangeRateIndirect() {
		return exchangeRateIndirect;
	}

	public void setExchangeRateIndirect(Double exchangeRateIndirect) {
		this.exchangeRateIndirect = exchangeRateIndirect;
	}

	public Double getBaseAmountDocumentCurrency() {
		return baseAmountDocumentCurrency;
	}

	public void setBaseAmountDocumentCurrency(Double baseAmountDocumentCurrency) {
		this.baseAmountDocumentCurrency = baseAmountDocumentCurrency;
	}

	public Double getBaseDiscountDocumentCurrency() {
		return baseDiscountDocumentCurrency;
	}

	public void setBaseDiscountDocumentCurrency(Double baseDiscountDocumentCurrency) {
		this.baseDiscountDocumentCurrency = baseDiscountDocumentCurrency;
	}
	
}
