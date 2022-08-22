package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class TestCaseActivityAdapter extends TestListenerAdapter {
	
	@Override//when ever tc is failed automatically this on is executed
	public void onTestFailure(ITestResult arg0) {
		System.out.println("TC is failed:"+arg0.getName());
		System.out.println("Tc is failed bcz:"+arg0.getThrowable());//if tc is failed why it is failed inform having throwable
		try {
			ScreenshotUtility.takesScreenshot(arg0.getName());
		}
		catch (IOException e) {//no need one more exception surrounded select
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("TC is Skipped:"+arg0.getName());
		System.out.println("Tc is Skipped bcz:"+arg0.getThrowable());//if tc is failed why it is failed inform having throwable
		try {
			ScreenshotUtility.takesScreenshot(arg0.getName());
		} catch (IOException e) {//no need one more exception surrounded select
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override//before executing every tc automatically this on started
	public void onTestStart(ITestResult arg0) {
		System.out.println("tc is started:"+arg0.getName());
		
	}

	@Override//once tc is pass automatically this one is executed
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("tc is success:"+arg0.getName());
		
	}
	
	

}
