package com.rameshsoft.automation.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rameshsoft.automation.utilities.ScreenshotUtility;

public class TestCaseActivity implements ITestListener{//class implements interface so all the methods in the interface provide the implementations 

	@Override//once suite execution is completed automatically this one is executed 
	public void onFinish(ITestContext arg0) {
		System.out.println("suite execution is completed");
		
	}

	@Override//once suite execution is started automatically this one is executed 
	public void onStart(ITestContext arg0) {
		System.out.println("suite execution is started");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override//when ever tc is failed automatically this on is executed
	public void onTestFailure(ITestResult arg0) {
		System.out.println("TC is failed:"+arg0.getName());
		System.out.println("Tc is failed bcz:"+arg0.getThrowable());//if tc is failed why it is failed inform having throwable
		try {
			ScreenshotUtility.takesScreenshot(arg0.getName());
		} catch (IOException e) {//no need one more exception surrounded select
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
