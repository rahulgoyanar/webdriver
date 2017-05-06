package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass6 {
	public static void main(String[] args) {

		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("cognizant carrers", Keys.ENTER);

	}
}
