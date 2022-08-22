package com.rameshsoft.automation.utilities;

public interface FilePaths {//by default every interface variable public static final//by default every interface becomes abstract

	String txtFile=System.getProperty("user.dir")+"\\mavendemo2\\src\\test\\java\\com\\rameshoft\\automation\\supporters\\demo.txt";
	String xmlFile="";
	String excelFile=System.getProperty("user.dir")+"\\mavendemo2\\src\\test\\java\\com\\rameshsoft\\automation\\appln\\testdata\\TestData.xls";
	String orFile=System.getProperty("user.dir")+"\\mavendemo2\\src\\test\\java\\com\\rameshsoft\\automation\\gmail\\objectrepository\\or.properties";
	String confFile=System.getProperty("user.dir")+"\\mavendemo2\\config.properties";       //here we convey the path to  key value value type

	
}
