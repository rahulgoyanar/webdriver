package seleniumfile;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukariApply {
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php");
		driver.manage().window().maximize();
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
		List<WebElement> lst = driver.findElements(By.xpath("//span[contains(@id,'_sp')]"));
		if(!lst.isEmpty()){
		for (int i = 0; i < 4; i++) {
			lst.get(i).click();
		}
		}
		driver.close();
	}
}
