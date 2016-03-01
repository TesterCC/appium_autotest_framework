package com.gruc.modules;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.gruc.utils.Log;

/**
 * Class in com.gruc.modules function: Manage elements in corresponding Activity.
 * 
 * AdvanceSettingsAty is a class for managing AdvanceSettingsActivity elements and method.
 * 
 * @author Yanxi
 * @version 1.0
 *
 */

public class AdvanceSettingsAty {
	
	//Initial driver
	public AdvanceSettingsAty(AndroidDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Locate element in the activity.
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/btn_save")
	public WebElement save_btn;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/btn_cancel")
	public WebElement cancel_btn;
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement server_name;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_proxy_ip")
	public WebElement proxy_ip_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_domain")
	public WebElement domain_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_tunnel_ip")
	public WebElement tunnel_ip_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_tunnel_port")
	public WebElement tunnel_port_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_http_ip")
	public WebElement http_ip_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_http_port")
	public WebElement http_port_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_codecs")
	public WebElement codecs_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_im_server")
	public WebElement im_server_edittext;
	
	@AndroidFindBy(id="com.gobalroam.android.gruc:id/edt_im_port")
	public WebElement im_port_edittext;
	
	
	//Encapsulate test method
	public void getConfigs(){
		Log.info("~~~~~GRUC Configuration~~~~~");
		
		Log.info("Server Name: "+server_name.getText());
		Log.info("Proxy IP: "+proxy_ip_edittext.getText());
		Log.info("Domain: "+domain_edittext.getText());
		Log.info("Tunel IP: "+tunnel_ip_edittext.getText());
		Log.info("Tunnel Port: "+tunnel_port_edittext.getText());
		Log.info("Http IP: "+http_ip_edittext.getText());
		Log.info("Http Port: "+http_port_edittext.getText());
		Log.info("Codecs: "+codecs_edittext.getText());
		Log.info("IM Server: "+im_server_edittext.getText());
		Log.info("IM Port: "+im_port_edittext.getText());

		Log.info("~~~~~GRUC Configuration~~~~~");
	}

}