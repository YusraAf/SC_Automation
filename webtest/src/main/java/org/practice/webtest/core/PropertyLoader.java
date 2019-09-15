package org.practice.webtest.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

	
	  public static void load(final String propertyPath) throws IOException {
	        Properties properties = new Properties();
	        properties.load(new FileInputStream(new File(propertyPath)));
	        for (String key : properties.stringPropertyNames()) {
	            System.setProperty(key, properties.getProperty(key));
	        }
	    }
	  
	  public static void loadDefaultProperties() throws IOException {
		  load("./properties/default/log4j.properties");
		  load("./properties/test.properties");
		  load("./properties/webdriver.properties");
		  load("./properties/"+System.getProperty("active.env")+"/"+"db.properties");
		  load("./properties/"+System.getProperty("active.env")+"/"+"app.properties");
	  } 
	  
}
