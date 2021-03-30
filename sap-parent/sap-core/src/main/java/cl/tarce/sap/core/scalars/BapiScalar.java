package cl.tarce.sap.core.scalars;
/**
 * 
 * @author tarce
 *
 */
public class BapiScalar {
	private Object value;
	
	public BapiScalar(){		
	}
	
	public BapiScalar(Object value){
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public String getStringValue(){
		return (String) value;
	}
	
	public Integer getIntegerValue(){
		return (Integer) value;
	}
	
	public Double getDoubleValue(){
		return (Double) value;
	}
}
