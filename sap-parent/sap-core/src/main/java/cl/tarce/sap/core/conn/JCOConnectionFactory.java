package cl.tarce.sap.core.conn;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.ext.DestinationDataProvider;

/**
 * 
 * @author tarce
 *
 */
public class JCOConnectionFactory {
	private static String LIB_SAP_JCO_3_PATH = "c:\\sapjco3.dll";
		private static String DESTINATION_NAME1 = "ABAP_AS";
	
	private static JCOConnectionFactory me = null;
	private static JCoDestination jcoDestination = null;
	
	public JCOConnectionFactory(BapiConnection bapiConnection){
	//      if(OSValidator.getOS().equals(EnumSO.WIN.codigo)){
	//      URL sap = JCOConnectionFactory.class.getClassLoader().getResource("sap");        
	//      System.load(sap.getPath().concat("/sapjco3.dll"));
	//      System.setProperty("java.library.path", sap.getPath());
	//  }
	  
		this.generateDestinationFile(bapiConnection);
		System.load(LIB_SAP_JCO_3_PATH);
	     
        
		
	}
	
	public static JCOConnectionFactory getInstance(BapiConnection bapiConnection){
		if(me == null)
			me = new JCOConnectionFactory(bapiConnection);
		return me;
	}
	
	public static JCoDestination getJcoDestination() throws JCoException{
		if(jcoDestination == null)
			jcoDestination = JCoDestinationManager.getDestination(DESTINATION_NAME1);
		return jcoDestination;
	}
	
	private void generateDestinationFile(BapiConnection bapiConnection){
        Properties connectProperties = new Properties();

        connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST, bapiConnection.getJcoASHost());
        connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR,  bapiConnection.getJcoSYSNr());
        connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT, bapiConnection.getJcoClient());
        connectProperties.setProperty(DestinationDataProvider.JCO_USER,   bapiConnection.getJcoUser());
        connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD, bapiConnection.getJcoPassword());
        connectProperties.setProperty(DestinationDataProvider.JCO_LANG,   bapiConnection.getJcoLang());
        connectProperties.setProperty(DestinationDataProvider.JCO_USE_SAPGUI, "1");
        
        if(bapiConnection.getJcoPoolCapacity() != null && 
        		!bapiConnection.getJcoPoolCapacity().equalsIgnoreCase(""))
        	connectProperties.setProperty(DestinationDataProvider.JCO_POOL_CAPACITY, bapiConnection.getJcoPoolCapacity());
        
        if(bapiConnection.getJcoPeakLimit() != null && 
        		!bapiConnection.getJcoPeakLimit().equalsIgnoreCase(""))
        	connectProperties.setProperty(DestinationDataProvider.JCO_PEAK_LIMIT, bapiConnection.getJcoPeakLimit());
        
        File destCfg = new File(DESTINATION_NAME1 + ".jcoDestination");
        try{
            FileOutputStream fos = new FileOutputStream(destCfg, false);
            connectProperties.store(fos, "for tests only !");
            fos.close();
        }

        catch (Exception e){
            throw new RuntimeException(e);
        }
	}
	
	public static void main(String args[]) throws JCoException{
		JCOConnectionFactory.getInstance(null).getJcoDestination();
	}
}
