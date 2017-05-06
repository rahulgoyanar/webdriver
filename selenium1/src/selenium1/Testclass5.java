package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass5 {
	public static void main(String[] args) {

		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// d.get("http://www.nytimes.com");
		// d.findElement(By.xpath("//a[@href='http://www.nytimes.com/gst/mostpopular.html']")).click();
		d.get("http://www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("cognizant");
		List<WebElement> lst = d.findElements(By.xpath("//div[@class='sbdd_b']"));
		for (int i = 0; i < lst.size(); i++) {
			lst.get(i);
			System.out.println(lst);
		}
	}
}
