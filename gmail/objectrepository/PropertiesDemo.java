package com.rameshsoft.automation.gmail.objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo  {

	public static void main(String[] args) throws IOException {
	//File file=new File("C:\\Users\\new\\eclipse-workspace\\mavendemo2\\config.properties");//to read the data from properties file 
	FileInputStream fip=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\mavendemo2\\config.properties");
	Properties properties=new Properties();
	properties.load(fip);//without load not generate file
		
	properties.setProperty("job","selenium");
	properties.put("hardwork","job");
	
	properties.setProperty("job1","selenium1");
	properties.put("hardwork1","job1");
	
	
	FileOutputStream fop=new FileOutputStream("C:\\Users\\new\\eclipse-workspace\\mavendemo2\\config.properties");
	properties.store(fop, "file is sucessful");//to write the data to the properties file and saved
	
	/*String qa_url_value=properties.getProperty("qa_url");
	System.out.println(qa_url_value);
	String qa_un_value=properties.getProperty("qa_un");
	System.out.println(qa_un_value);
	String dev_url_value=properties.getProperty("dev_url1");//if key not there default jvm null value get
	System.out.println(dev_url_value);
	String dev_url_value1=properties.getProperty("dev_url1","java with selenium");//if key not there but user defined value assigned will get
	System.out.println(dev_url_value1);

	Object url=properties.getProperty("qa_url");//get values from hashtable also.map interface
	System.out.println(url);
	
	Object obj=properties.getOrDefault("dev_url2","job");
	System.out.println(obj);

	
*/	
	}
	
	
	
}
