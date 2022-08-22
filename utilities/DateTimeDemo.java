package com.rameshsoft.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDateTime localdatetime= LocalDateTime.now();//currentdate|present date
		System.out.println("Before formating:"+localdatetime);

	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		String formattedDate=localdatetime.format(formatter);
		System.out.println("after formatting:"+formattedDate);
		
		/*LocalDate yesterdatDate=localdate.minusDays(1);
		System.out.println(yesterdatDate);
		LocalDate tomorrowdatDate=localdate.plusDays(1);
		System.out.println(tomorrowdatDate);
		LocalTime localtime=LocalTime.now();
		System.out.println(localtime);
		LocalDateTime localdatetime=LocalDateTime.now();
        System.out.println(localdatetime);

*/


	}
		
	}
	

