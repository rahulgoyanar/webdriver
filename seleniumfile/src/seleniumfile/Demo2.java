package seleniumfile;
//fav string
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("http://www.google.com");

		driver.findElement(By.id("lst-ib")).sendKeys("cognizant i");

		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i).getText());
		}

	}

}