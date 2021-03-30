package cl.tarce.sap.defs.tables.basis.masterdata;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class Field {
	
	public Field(){		
	}
	
	public Field(String fieldName,
			String offset,
			String length,
			String type,
			String fieldText){
		
		this.fieldName = fieldName;
		this.offset = offset;
		this.length = length; 
		this.type = type;
		this.fieldText = fieldText;
	}
	
	@BapiParameter(name = "FIELDNAME", type = ParameterType.SCALAR)
	private String fieldName;
	
	@BapiParameter(name = "OFFSET", type = ParameterType.SCALAR)
	private String offset;
	
	@BapiParameter(name = "LENGTH", type = ParameterType.SCALAR)
	private String length;
	
	@BapiParameter(name = "TYPE", type = ParameterType.SCALAR)
	private String type;
	
	@BapiParameter(name = "FIELDTEXT", type = ParameterType.SCALAR)
	private String fieldText;

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFieldText() {
		return fieldText;
	}

	public void setFieldText(String fieldText) {
		this.fieldText = fieldText;
	}
	
	
}
