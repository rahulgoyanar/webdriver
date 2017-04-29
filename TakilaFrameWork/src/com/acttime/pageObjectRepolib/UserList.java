package com.acttime.pageObjectRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.acttime.genericlib.WebDriverCommonLib;

public class UserList extends WebDriverCommonLib{

	@FindBy(xpath="//input[@value='Add New User']")
	private WebElement addNewUSerBtn;
	
	@FindBy(className="successmsg")
	private WebElement succMSg;


	public WebElement getAddNewUSerBtn() {
		return addNewUSerBtn;
	}


	public WebElement getSuccMSg() {
		return succMSg;
	}





	public void navigateToCreateUSerPAge(){
		addNewUSerBtn.click();
		waitForPageToLoad();
	}
	
	
}
