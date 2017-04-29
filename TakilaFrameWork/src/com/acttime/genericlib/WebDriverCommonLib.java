package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	public void waitForPageToLoad(){
    	BrowserDriver.driver.manage().timeouts().
    	               implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForXpathPresent(String wbxpath){
		WebDriverWait wait = new WebDriverWait
				                      (BrowserDriver.driver, 10);
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath(wbxpath)));
		
	}
	public void waitForNamePresent(String wbName){
		WebDriverWait wait = new WebDriverWait
				                     (BrowserDriver.driver, 10);
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.name(wbName)));	
	}
	public void waitForIDPresent(String wbID){
		WebDriverWait wait = new WebDriverWait
				                 (BrowserDriver.driver, 10);
		wait.until(ExpectedConditions.
				presenceOfElementLocated(By.id(wbID)));
		
	}
	
	public boolean verifyText(String txpath, String expText){
		boolean flag = false; 
		String actVal = BrowserDriver.driver.findElement
				                 (By.xpath(txpath)).getText();
		if(expText.equals(actVal)){
			flag = true;
			System.out.println("text is verfied==PASS");
		}else{
			System.out.println("text is verfied==Fail");
		}
		return flag;
	}
	
	
}
