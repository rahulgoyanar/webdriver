package seleniumfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;

public class mouse {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://www.flipkart.com");

		WebElement wb = d.findElement(By.xpath("//span[text()='Books & More']"));
		Actions act = new Actions(d);
		act.moveToElement(wb).perform();
		d.findElement(By.xpath("//span[text()='Xbox 360']")).click();
		d.close();
	}
}
