package com.rameshsoft.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.rameshsoft.automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public interface RegExUtility {
	
	public static boolean isValidPhNum(String phNum)
		{
		boolean status=true;
		Pattern pattern=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher matcher= pattern.matcher(phNum);
		if(matcher.find()&&matcher.group().equalsIgnoreCase(phNum))
		{
			BaseTest.getExtenttest().log(LogStatus.PASS,"it is a valid phone number:"+phNum);
		}
		else
		{
			BaseTest.getExtenttest().log(LogStatus.PASS,"it is a valid phone number:"+phNum);
			status=false;
		}
		
		return status;
		}
	
	}

