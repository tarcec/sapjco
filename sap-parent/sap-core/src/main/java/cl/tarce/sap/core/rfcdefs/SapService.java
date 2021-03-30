package cl.tarce.sap.core.rfcdefs;

import cl.tarce.sap.core.conn.BapiConnection;

/**
 * 
 * @author tarce
 *
 */
public class SapService {
	private BapiConnection bapiConnection;
	
//	public SapService(BapiConnection bapiConnection){
//		this.bapiConnection = bapiConnection;
//	}
	
	public void setConnection(BapiConnection bapiConnection){
		this.bapiConnection = bapiConnection;
	}
	
	public BapiConnection getConnection(){
		return this.bapiConnection;
	}
}
