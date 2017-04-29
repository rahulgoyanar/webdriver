package com.acttime.usertest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
import com.gargoylesoftware.htmlunit.Page;

 public class UserTest {
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
		   // object intialization
		    eLib = new ExcelLib();
			wlib = new WebDriverCommonLib();
			//get browser from framework
			driver = BrowserDriver.getBrowser();
			loginPage = PageFactory.initElements(driver, Login.class);
			taskPage = PageFactory.initElements(driver, OpenTAsk.class);
			 userPage = PageFactory.initElements(driver, UserList.class);
			 addUSerPAge = PageFactory.initElements(driver, AddNewUser.class);
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
	public void createUserTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		//read data from excel
		String userName = eLib.getExcelData("Sheet1", 1, 2);
		String firstName = eLib.getExcelData("Sheet1", 1, 3);
		String lastName = eLib.getExcelData("Sheet1", 1, 4);
		String userPassword = eLib.getExcelData("Sheet1", 1, 5);
		String expMsg = eLib.getExcelData("Sheet1", 1, 6);
		//step 2: navigate to USer Page
		taskPage.navigateToUSerPAge();
		//step 3 : create User
		userPage.navigateToCreateUSerPAge();
		addUSerPAge.creatUSer(userName, firstName, lastName, userPassword);
		//step 4 : verify USer
		String actMSg = userPage.getSuccMSg().getText();
		Assert.assertEquals(actMSg, expMsg,"text is not verfied=FAIL");
	
	}
	@Test
	public void modifyUSerTest() throws EncryptedDocumentException, InvalidFormatException, IOException{
		//read data from excel
		String userName = eLib.getExcelData("Sheet1", 2, 2);
		String firstName = eLib.getExcelData("Sheet1", 2, 3);
		String lastName = eLib.getExcelData("Sheet1", 2, 4);
		String userPassword = eLib.getExcelData("Sheet1", 2, 5);
		String expMsg = eLib.getExcelData("Sheet1", 2, 6);
		//step 2: navigate to USer Page
		taskPage.navigateToUSerPAge();
		//step 3 : create User
		userPage.navigateToCreateUSerPAge();
		addUSerPAge.creatUSer(userName, firstName, lastName, userPassword);
		//step 4 : modify user
		//step 5 : verify user
		String actMSg = userPage.getSuccMSg().getText();
		Assert.assertEquals(actMSg, expMsg,"text is not verfied=FAIL");
	
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

