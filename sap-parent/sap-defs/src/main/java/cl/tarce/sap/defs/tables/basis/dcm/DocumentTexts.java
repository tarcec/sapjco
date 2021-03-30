package cl.tarce.sap.defs.tables.basis.dcm;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class DocumentTexts {
	@BapiParameter(name = "DELETEVALUE", type = ParameterType.SCALAR)
	private String deleteValue;
	
	@BapiParameter(name = "LANGUAGE", type = ParameterType.SCALAR)
	private String language;
	
	@BapiParameter(name = "LANGUAGE_ISO", type = ParameterType.SCALAR)
	private String languageISO;
	
	@BapiParameter(name = "TEXTLINE", type = ParameterType.SCALAR)
	private String textLine;

	public String getDeleteValue() {
		return deleteValue;
	}

	public void setDeleteValue(String deleteValue) {
		this.deleteValue = deleteValue;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguageISO() {
		return languageISO;
	}

	public void setLanguageISO(String languageISO) {
		this.languageISO = languageISO;
	}

	public String getTextLine() {
		return textLine;
	}

	public void setTextLine(String textLine) {
		this.textLine = textLine;
	}
	
	
}
