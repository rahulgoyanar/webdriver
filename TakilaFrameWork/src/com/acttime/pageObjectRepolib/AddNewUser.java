package com.acttime.pageObjectRepolib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUser {

	@FindBy(name="username")
	private WebElement userNAmeEDt;
	
	@FindBy(name="firstName")
	private WebElement firstNAmeEDt;
	
	@FindBy(name="lastName")
	private WebElement lastNAmeEDt;
	
	@FindBy(name="passwordText")
	private WebElement passwordEDt;

	@FindBy(name="passwordTextRetype")
	private WebElement reTypePasswordEDt;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement createUSerBtn;
	
	public void creatUSer(String userNAme, String fName, String lNAme, String psw){
		userNAmeEDt.sendKeys(userNAme);
		firstNAmeEDt.sendKeys(fName);
		lastNAmeEDt.sendKeys(lNAme);
		passwordEDt.sendKeys(psw);
		reTypePasswordEDt.sendKeys(psw);
		createUSerBtn.click();
		
	}
	
	
	
	
}
