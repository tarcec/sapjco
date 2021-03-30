package cl.tarce.sap.core.conn;

/**
 * 
 * @author srios
 */
public enum EnumSO {

    WIN         ("WINDOWS"),
    MAC     	("MAC OSX"),
    UNIX     	("UNIX"),
    SOL     	("SOLARIS"),
    ;
    
	EnumSO(String codigo){
        this.codigo = codigo;
    }
    
    public String codigo;
}
