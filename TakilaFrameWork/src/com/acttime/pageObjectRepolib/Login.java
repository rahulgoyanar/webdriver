package com.acttime.pageObjectRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.BrowserDriver;
import com.acttime.genericlib.Constants;
import com.acttime.genericlib.WebDriverCommonLib;

public class Login extends WebDriverCommonLib{
	@FindBy(name="username")
	private WebElement userNameEdt;
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn;
	
	public void login(String userName, String password){
		BrowserDriver.driver.get(Constants.url);
		BrowserDriver.driver.manage().window().maximize();
		userNameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginBtn.click();
		waitForPageToLoad();
	}
	
	
	
	
	
	

}
