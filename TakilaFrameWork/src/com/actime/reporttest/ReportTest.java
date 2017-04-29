package com.actime.reporttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acttime.genericlib.BrowserDriver;
import com.acttime.genericlib.Constants;
import com.acttime.genericlib.ExcelLib;
import com.acttime.genericlib.WebDriverCommonLib;
import com.acttime.pageObjectRepolib.AddNewUser;
import com.acttime.pageObjectRepolib.Common;
import com.acttime.pageObjectRepolib.Login;
import com.acttime.pageObjectRepolib.OpenTAsk;
import com.acttime.pageObjectRepolib.UserList;

 public class ReportTest {
	 //object declaration
	 ExcelLib eLib;
	 WebDriverCommonLib wlib;
	 WebDriver driver;
	 Login loginPage;
	 OpenTAsk taskPage;
	 UserList userPage;
	 AddNewUser addUSerPAge;
	 Common cPage;
	 
	 @BeforeClass
	 public void configBeforeClass(){

			//get browser from framework
			driver = BrowserDriver.getBrowser();
			loginPage = PageFactory.initElements(driver, Login.class);
			cPage = PageFactory.initElements(driver, Common.class);
	 }
	 
	 @BeforeMethod
	 public void beforMtd(){
			String userID = Constants.userNAme; 	
			String password = Constants.password;
			//step 1 : login 
			loginPage.login(userID, password);
	 }
	
	@Test
	public void createReportTest(){
		System.out.println("execute createReportTest");
	}
	@Test
	public void modifyReportTest(){
		System.out.println("execute modifyReportTest");
	}
	@Test
	public void deleteReportTest(){
		System.out.println("execute deleteReportTest");
	}
	
	 @AfterMethod
	 public void afterMtd(){
			//step 5 : logout
			cPage.logout();
	 }
	
	@AfterClass
	public void afterClass(){
		driver.quit();
	}
	
	
	
}

