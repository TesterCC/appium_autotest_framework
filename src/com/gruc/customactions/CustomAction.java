package com.gruc.customactions;

import org.openqa.selenium.WebElement;

import com.gruc.utils.Log;

import io.appium.java_client.android.AndroidDriver;


public class CustomAction {
	
	/**
	 * 
	 * A class for encapsulating Custom Action
	 * @author Yanxi
	 * @version 1.0
	 *
	 */

    //Action 1 -- output current activity
    public static void currentAty(AndroidDriver<WebElement> driver){
    	Log.info("Current Activity --> "+driver.currentActivity());
    }		
}
