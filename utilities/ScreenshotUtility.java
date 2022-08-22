package com.rameshsoft.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.rameshsoft.automation.base.BaseTest;

public interface ScreenshotUtility {//interface not extends Basetest class.interface extends interface

		public static String takesScreenshot() throws IOException
		{
			
			TakesScreenshot takesscreenshot=(TakesScreenshot)BaseTest.getDriver();//if it is Webdriver use takesscreenshort .if it is remotedriver use getscreenshort.so need type casting 
			 File fileImage1=takesscreenshot.getScreenshotAs(OutputType.FILE);
		String imagepath1=System.getProperty(("./screenshot/image1.jpg"));//\\screenshots\BaseTest.getTcName()
			 FileUtils.copyFile(fileImage1, new File(imagepath1));//screenshorts path.
	return imagepath1;
		}
	
		public static String takesScreenshot(String tcName) throws IOException//static--not override[main() not ovrride],,we can overrload passing different args[main()]
		{
			
			TakesScreenshot takesscreenshot=(TakesScreenshot)BaseTest.getDriver();//if it is Webdriver use takesscreenshort .if it is remotedriver use getscreenshort.so need type casting 
			 File fileImage1=takesscreenshot.getScreenshotAs(OutputType.FILE);
		String imagepath1=System.getProperty(("./screenshot/image1.jpg"));//\\screenshots\BaseTest.getTcName()
			 FileUtils.copyFile(fileImage1, new File(imagepath1));//screenshorts path.
	return imagepath1;
		}
	
		
		
}
