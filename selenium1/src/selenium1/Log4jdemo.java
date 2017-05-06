package selenium1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Log4jdemo {
	public static void main(String[] args)throws IOException {
		Logger log = Logger.getLogger(Log4jdemo.class);
try{
		
		PropertyConfigurator.configure("log4j.properties");
		WebDriver driver = new FirefoxDriver();
		log.info("launche browser");
		driver.get("https://login.naukri.com/nLogin/Login.php");
		log.info("launche naukari");
		driver.manage().window().maximize();
		log.info("browser maximize");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		WebElement wb = driver.findElement(By.xpath("//input[@id='emailTxt']"));
		wb.sendKeys("rahulagrawal720@gmail.com");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//input[@id='pwd1']")).sendKeys("112233");
		act.sendKeys(Keys.ENTER).perform();
		WebElement notif = driver.findElement(By.xpath("//a[@id='blobId']"));
		act.moveToElement(notif).perform();
		WebElement recom = driver.findElement(By.xpath("//a[@href='https://www.naukri.com/recommendedjobs']"));
		recom.click();
		log.info("check message");
	    log.debug("naukari");
}
catch(Exception e){
	log.warn("please remove");
	log.error("code error");
}
}


	}


