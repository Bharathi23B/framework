package com.rameshsoft.automation.customisedexceptions;

import java.io.FileNotFoundException;

public class FrameWorkException extends Exception{//throwable is main|1st exception class 2nd is Exception class
//our own exceptions will write so 1st we need to check wheather class is throwable class or not.
	
/**
 * 	
 */
	private static final long serialVersionUID =1L;
	
	public FrameWorkException() {
	super();
	}
	
	public FrameWorkException(String exceptionMsg) {
		super(exceptionMsg);
	}
	}

	
	