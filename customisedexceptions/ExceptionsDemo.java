package com.rameshsoft.automation.customisedexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsDemo {

public static void main(String[] args) throws FileNotFoundException {
	
	System.out.println("1");
	System.out.println("2");
	
	try
	{
	FileInputStream fip=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\mavendemo2\\config.properties");
	
	//System.out.println();//between try and catch blocks we not write any stmnts getting compile time error
	try {
		System.out.println("inner try block");
	}
	
	catch(Exception exception)
	{
		System.out.println("inne catch block");
	}
	}
	catch(FileNotFoundException fnfe)//after child catch we not mentioned catch of file parent so getting error
	{//java 1.8 onwards inside the catch resources are there
		System.out.println("fnfe");
	
	try
	{//inner catch|try blocks we can take try and catch blocks
		
	}
	catch(Exception exception)
	{
		
	}
	}
	
	
	catch(Exception exception)
	{
	System.out.println("catch block");
	//exception.printStackTrace();//total stacktrace of exception information why it get exception 
	//System.out.println(exception.getMessage());//why it getting exception
	//System.out.println(exception.toString());//with obj reference tostring()
	System.out.println(exception);
		}
	
	/*catch(FileNotFoundException fnfe)//after child catch we not mentioned catch of file parent so getting error
	{
		System.out.println("fnfe");
	}
	*/
finally//java 1.9 onwards only try is given also get the o/p
{//is block always executed whether we not handle exceptions or get the exceptions try and catch
	System.out.println("finally block");
}
	
	System.out.println("3");
	System.out.println("4");
		
}
}
