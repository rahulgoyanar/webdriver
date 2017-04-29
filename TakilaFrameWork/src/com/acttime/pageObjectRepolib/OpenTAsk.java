package com.acttime.pageObjectRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebDriverCommonLib;

public class OpenTAsk extends WebDriverCommonLib{

	@FindBy(linkText="Users")
	private WebElement userLnk;
	@FindBy(linkText="Reports")
	private WebElement reportLnk;
	
	public void navigateToUSerPAge(){
		userLnk.click();
		waitForPageToLoad();
		
	}
	public void navigateToReportPAge(){
		reportLnk.click();
		waitForPageToLoad();
		
	}
	
	
	
}
