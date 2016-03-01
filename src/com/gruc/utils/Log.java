package com.gruc.utils;

import org.apache.log4j.Logger;


/**
 * Class in com.gruc.utils function: provide needed Utils class for testing.
 * 
 * Log is a class for encapsulating Log class.
 * 
 * @author Yanxi
 * @version 1.0
 *
 */

public class Log {
	//Initial Logger object
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	//Initial a static method，print info when testcases startup.
	public static void startTestCase(String sTestCaseName){
		Log.info("-------------------------------------－－---------");
		Log.info("***********"+sTestCaseName+"**********");
		
	}
	
	//Initial a static method，print info when testcases teardown.
	public static void endTestCase(String sTestCaseName){
//		Log.info("***********"+"End of executing testcases."+"**********");
		Log.info("***"+"Finish Run Testcases."+sTestCaseName+"***");
		Log.info("-------------------------------------－－---------");
		
	}
	
	//Initial a static method to print INFO level Log.
	public static void info(String message){
		Log.info(message);
	}
	
	//Initial a static method to print WARN level Log.
	public static void warn(String message){
		Log.warn(message);
	}
	
	//Initial a static method to print ERROR level Log.
	public static void error(String message){
		Log.error(message);
	}
	
	//Initial a static method to print FATAL level Log.
	public static void fatal(String message){
		Log.fatal(message);
	}
	
	//Initial a static method to print DEBUG level Log.
	public static void debug(String message){
		Log.debug(message);
	}
	
	

}
