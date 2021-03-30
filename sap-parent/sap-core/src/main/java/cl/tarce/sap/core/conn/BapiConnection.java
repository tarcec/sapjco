package cl.tarce.sap.core.conn;

/**
 * 
 * @author tarce
 *
 */
public class BapiConnection {
	private String jcoASHost;
	private String jcoSYSNr;
	private String jcoClient;
	private String jcoUser;
	private String jcoPassword;
	private String jcoLang;
	private String jcoPoolCapacity;
	private String jcoPeakLimit;
	
	public String getJcoASHost() {
		return jcoASHost;
	}
	public void setJcoASHost(String jcoASHost) {
		this.jcoASHost = jcoASHost;
	}
	public String getJcoSYSNr() {
		return jcoSYSNr;
	}
	public void setJcoSYSNr(String jcoSYSNr) {
		this.jcoSYSNr = jcoSYSNr;
	}
	public String getJcoClient() {
		return jcoClient;
	}
	public void setJcoClient(String jcoClient) {
		this.jcoClient = jcoClient;
	}
	public String getJcoUser() {
		return jcoUser;
	}
	public void setJcoUser(String jcoUser) {
		this.jcoUser = jcoUser;
	}
	public String getJcoPassword() {
		return jcoPassword;
	}
	public void setJcoPassword(String jcoPassword) {
		this.jcoPassword = jcoPassword;
	}
	public String getJcoLang() {
		return jcoLang;
	}
	public void setJcoLang(String jcoLang) {
		this.jcoLang = jcoLang;
	}
	public String getJcoPoolCapacity() {
		return jcoPoolCapacity;
	}
	public void setJcoPoolCapacity(String jcoPoolCapacity) {
		this.jcoPoolCapacity = jcoPoolCapacity;
	}
	public String getJcoPeakLimit() {
		return jcoPeakLimit;
	}
	public void setJcoPeakLimit(String jcoPeakLimit) {
		this.jcoPeakLimit = jcoPeakLimit;
	}
	
	
}
