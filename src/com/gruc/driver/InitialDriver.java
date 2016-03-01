package com.gruc.driver;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.apache.log4j.xml.DOMConfigurator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.gruc.settings.GlobalSettings;
import com.gruc.utils.Log;

public class InitialDriver {
	/**
	 * 
	 * InitialDriver:A class for encapsulating driver for launch app.
	 * @author Yanxi
	 * @version 1.0
	 *
	 */
	  
	public static AndroidDriver<WebElement> driver;
	
    public static AndroidDriver<WebElement> launchApp() throws Exception {
    	//Read log4j configuration files
    	DOMConfigurator.configure("log4j.xml"); 
    	Log.startTestCase("Start Launch Driver.");
    	
        //Setup appium capabilities, some variables are global variable.
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName",GlobalSettings.deviceName); 
        capabilities.setCapability("udid", GlobalSettings.deviceUdid);
        capabilities.setCapability("platformName", GlobalSettings.platformName);
        capabilities.setCapability("platformVersion", GlobalSettings.platformVersion);
        capabilities.setCapability("appPackage", GlobalSettings.packageName);
        capabilities.setCapability("appActivity", GlobalSettings.launchactivityName);
        
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);//manual change
        driver.isAppInstalled(GlobalSettings.packageName);
        
        Thread.sleep(3000);

        return driver;
    }
	
    
    //Encapsulate killApp method
    public static AndroidDriver<WebElement> killApp() throws Exception {
    	driver.closeApp();
    	Log.endTestCase("Closed Launch Driver.");
		return driver;
	}
    
        
    //===========general action
	//encapsulate BACK.
	public static void mBack(){
		driver.pressKeyCode(AndroidKeyCode.BACK); 
	}    
	
}
