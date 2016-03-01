package com.gruc.testcases;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gruc.utils.Log;
import com.gruc.customactions.CustomAction;
import com.gruc.driver.InitialDriver;
import com.gruc.modules.AdvanceSettingsAty;
import com.gruc.modules.LoginAty;
import com.gruc.modules.MainAty;
import com.gruc.modules.MoreAty;


public class TestEntrance{
	/**
	 * Class in com.gruc.testcases function: design testcases to execute. Run test from here.
	 * 
	 * Class run as TestNG
	 * 
	 * TestEntrance is a class for managing all test method.
	 * 
	 * 
	 * @author Yanxi
	 * @version 1.0
	 *
	 */
	
	private AndroidDriver<WebElement> driver;
	
	@BeforeClass
	public void beforeMethod() throws Exception{
		driver = InitialDriver.launchApp();

	}

	@AfterClass
	public void afterMethod() throws Exception{
		InitialDriver.killApp();
	}

	@Test(priority = 1) //priority decide the execution order of testcases
	public void testAdvanceSettingsAty() throws Exception {
		
		Log.info("Start testAdvanceSettingsAty().");
		
		LoginAty la = new LoginAty(driver);
		
		CustomAction.currentAty(driver);
		
		la.advset_btn.click();
		
		CustomAction.currentAty(driver);
		
		//get configuration
		AdvanceSettingsAty asa = new AdvanceSettingsAty(driver);
		asa.getConfigs();
		
		InitialDriver.mBack(); //Click Android BACK button
		
		Log.info("End testAdvanceSettingsAty().");
		
	}
	
	@Test(priority=2)
	public void testLoginAty() throws Exception {
		LoginAty la = new LoginAty(driver);
		
		la.getAppversion();
		la.autologin_checkbox.click();
		la.autologin_checkbox.click();
		
		la.loginApp();
		Thread.sleep(4000);
		
		Log.info("current activity: "+driver.currentActivity());
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void testLogout() throws Exception {
		MainAty mainaty = new MainAty(driver);
		mainaty.more_btn.click();
		
		MoreAty moreaty = new MoreAty(driver);
		moreaty.getInfo();
		
		moreaty.logout_textview.click();
		Thread.sleep(2000);
		
		Log.info("current activity: "+driver.currentActivity());
	}
	
	
}
