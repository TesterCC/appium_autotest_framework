package com.gruc.modules;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.gruc.driver.InitialDriver;
import com.gruc.settings.GlobalSettings;
import com.gruc.utils.Log;

public class LoginAty {
	
	/**
	 * Class in com.gruc.modules function: Manage elements in corresponding Activity.
	 * 
	 * LoginAty is a class for managing LoginActivity elements and method.
	 * 
	 * @author Yanxi
	 * @version 1.0
	 *
	 */
	
	
	public LoginAty(AndroidDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/Login_account")
	public WebElement username_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/Login_password")
	public WebElement password_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/btn_Login")
	public WebElement login_btn;
	
//	@AndroidFindBy(id="com.gobalroam.android.gruc:id/btn_setting")  
//  can use different method to locate elements
	@AndroidFindBy(name="Advance Settingss")
	public WebElement advset_btn;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/checkBox_autoLogin")
	public WebElement autologin_checkbox;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/txt_verison")
	public WebElement txt_version;
	
	
	
	public void clickAdvsetBtn(){
		Log.info("in LoginAty.clickBtn()");
		advset_btn.click();
		InitialDriver.mBack(); // equal to InitialDriver.AndroidKeyCode(4);//BACK
		Log.info("Back to Login Activity.");
	}
	
	public void getAppversion(){
		Log.info("GRUC App version: "+txt_version.getText());
	}
	
	public void loginApp() throws InterruptedException{
		
		Log.info("in LoginAty.loginApp()");
		
		username_edittext.clear();
		username_edittext.sendKeys(GlobalSettings.grucUsername);
		password_edittext.clear();
		password_edittext.sendKeys(GlobalSettings.grucPassword);
		
		login_btn.click();
		
	}
	
	

}
