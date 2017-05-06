package selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@id='emailRad']")).click();
		WebElement wb=driver.findElement(By.xpath("//input[@id='emailTxt']"));
		wb.sendKeys("rahulagrawal");

		Actions act = new Actions(driver);
		act.doubleClick(wb).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL, "v")).perform();
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@id='pwd1']")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		//to clear text from edit box
		driver.quit();

	}

}
