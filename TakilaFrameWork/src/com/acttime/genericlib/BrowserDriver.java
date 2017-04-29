package com.acttime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver {
	 public static WebDriver driver;

	 
	public static WebDriver getBrowser(){
		//if(Constants.browser.equals("chrome")){
		   //  System.setProperty("webdriver.chrome.driver", "D:\\Users\\Qsp-tyy-24\\Desktop\\server\\chromedriver.exe");
		  //  driver = new ChromeDriver();
		//}else if(Constants.browser.equals("ie")) {
		//	System.setProperty("webdriver.ie.driver", "D:\\Users\\Qsp-tyy-24\\Desktop\\server\\IEDriverServer.exe");
			//driver = new InternetExplorerDriver();
		//}else 
		if(Constants.browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else{
			driver = new FirefoxDriver();
		}
				return driver;
	}

}
