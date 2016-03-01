package com.gruc.modules;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.gruc.utils.Log;

public class MoreAty {
	
	/**
	 * Class in com.gruc.modules function: Manage elements in corresponding Activity.
	 * 
	 * MainAty is a class for managing MainActivity elements and methods.
	 * 
	 * @author Yanxi
	 * @version 1.0
	 *
	 */

	public MoreAty(AndroidDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/tvCurrentAccount")
	public WebElement current_account;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/tvAppVersion")
	public WebElement app_version;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/tvLogin_out")
	public WebElement logout_textview;
	
	public void getInfo(){
		Log.info("Current account: "+current_account.getText());
		Log.info("App Version: "+app_version.getText());
	}
	

}
