package com.rameshsoft.automation.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {

	public static void main(String[] args) {
		ExtentReports extentreports=new ExtentReports("C:\\Users\\new\\eclipse-workspace\\mavendemo2\\Reports\\report.html");
		//copy the path from Reports folder----//right click on mavendemo2--refresh will get reports.html in reports folder
		ExtentTest extenttest=extentreports.startTest("login","hello");
		extenttest.log(LogStatus.PASS,"browser is opened");
		extenttest.log(LogStatus.PASS,"url is entered as https://www.gmail.com");
		extenttest.log(LogStatus.PASS,"Data is done on username with testdata is rameshsoft.9177791456");
		extenttest.log(LogStatus.PASS,"clicked on next button");
		extenttest.log(LogStatus.PASS,"Dta is done on password with testdata is hardwork");
		
		extentreports.endTest(extenttest);
		extentreports.flush();
		extentreports.close();
			
	}
	
	
	
}
