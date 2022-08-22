package com.rameshsoft.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface DateTimeUtilities {

	public static String getdatemonthyear()
	{
		LocalDate localDate=LocalDate.now();
		String dmy=localDate.toString();
		return dmy;
		}
	public static String gettime()
	{
		LocalTime localtime=LocalTime.now();
		String time=localtime.toString();
		return time;
		}
	
	public static String gettimedmy()
	{
		LocalDateTime localdatetime=LocalDateTime.now();
		String localdatetime1=localdatetime.toString();
		return localdatetime1;
			}
	
	public static String getcurrentdate()
	{
		String dmy=getdatemonthyear();//2022-05-31
		String[] str=dmy.split(" - ");//[2022 05 31
	String date=str[2];
	return date;
		}
	public static String getcurrentmonth()
	{
		String dmy=getdatemonthyear();//2022-05-31
		String[] str=dmy.split(" - ");//[2022 05 31
	String month=str[1];
	return month;
		}
	public static String getcurrentyear()
	{
		String dmy=getdatemonthyear();//2022-05-31
		String[] str=dmy.split(" - ");//[2022 05 31
	String year=str[0];
	return year;
		}
	public static String getpastdate(int numberofdaystosubtract)
	{
		/*LocalDate localdate=LocalDate.now();
		LocalDate pastDate=localdate.minusDays(numberofdaystosubtract);
		String pastDates=pastDate.toString();
		return pastDate;
		*/
	return LocalDate.now().minusDays(numberofdaystosubtract).toString();
		}
	public static String getfuturedate(int numberofdaystoadd)
	{
		return LocalDate.now().minusDays(numberofdaystoadd).toString();
	}
}
