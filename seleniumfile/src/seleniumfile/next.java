package seleniumfile;

//fav string next
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class next {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/SeleniumStuff/selenium prog/SeleniumWork/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		driver.findElement(By.id("lst-ib")).sendKeys("modi", Keys.ENTER);
		WebElement val = driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));

		boolean a = val.isDisplayed();
		int i = 1;
		while (a) {

			val.click();
			Thread.sleep(2000);
			val = driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']"));
			a = val.isDisplayed();
			
			System.out.println(i++);
			
		}
		}
			
		

	}

