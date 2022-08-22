package com.rameshsoft.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTcs implements IRetryAnalyzer {

	private int retrycount=0;
	private static final int maxcount=2;//2 times execute again the failed tc.
	
	
	@Override
	public boolean retry(ITestResult result) {
		if(retrycount < maxcount)
		{
			retrycount++;
			return true;
		}
					
		return false;
	}

}
//after writing the code in the rerun class mention or annotate the
// @Test(retryAnalyzer = ReRunFailedTcs.class)
// Annotate@Test(retryAnalyzer=classname.class)
//At the testcase