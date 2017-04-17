package seleniumfile;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class crm {


	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/SeleniumStuff/selenium prog/SeleniumWork/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		driver.get("https://cs.lenovo.com/sap/crm_logon/default.htm");
		System.out.println("finding inbox");
		driver.get("https://cs.lenovo.com/sap/crm_logon/default.htm");

		driver.findElement(By.id("sap-user")).sendKeys("seprahulgoya");
		driver.findElement(By.id("sap-password")).sendKeys("Lenovo@1234");
		driver.findElement(By.xpath("//span[@class='urBtnCntTxt']")).click();

		driver.findElement(By.cssSelector(".th-bt-b")).click();
		Thread.sleep(6000);

		WebElement inbox=driver.findElement(By.xpath("//a[@id='C4_W18_V19_IC_INBOX']"));
		System.out.println("finding complete:"+inbox.getText());
	
		
		driver.quit();
		
	}



}
