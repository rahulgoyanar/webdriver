package com.acttime.pageObjectRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebDriverCommonLib;

public class Common extends WebDriverCommonLib{
	@FindBy(xpath="//img[@alt='Logout']")
	private WebElement logoutImg;
	
	public void logout(){
		logoutImg.click();
	}

}
