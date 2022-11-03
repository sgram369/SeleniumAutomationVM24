package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

    
    Properties prop;
    
    public ReadConfig() throws Exception {

        FileInputStream fis = new FileInputStream(".\\testData\\config_parameters.properties");

        prop = new Properties();

        prop.load(fis);
        
        

    }
    
    
    
    public String getAppURL() {
        
        return prop.getProperty("appURL");
        
    }
    
  public String getAppURLAdmin() {
        
        return prop.getProperty("appURLAdmin");
        
    }
    
    
    public String getBrowser() {
        
        return prop.getProperty("browser");
        
    }
    
    

}

