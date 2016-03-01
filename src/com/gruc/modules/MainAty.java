package com.gruc.modules;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainAty {
	
	/**
	 * Class in com.gruc.modules function: Manage elements in corresponding Activity.
	 * 
	 * MainAty is a class for managing MainActivity elements and method.
	 * 
	 * @author Yanxi
	 * @version 1.0
	 *
	 */

	public MainAty(AndroidDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/radio_button_chat")
	public WebElement chats_btn;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/radio_button_call")
	public WebElement calls_btn;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/radio_button_contacts")
	public WebElement contacts_btn;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/radio_button_settings")
	public WebElement more_btn;
	

}
