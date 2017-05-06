package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass7 {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://seleniumhq.github.io/selenium/docs/api/java/");
		d.switchTo().frame("classFrame");
		d.findElement(By.linkText("com.thoughtworks.selenium.webdriven.commands")).click();
		d.switchTo().defaultContent();
		d.switchTo().frame("packageFrame");
		d.findElement(By.linkText("AddConfig")).click();

	}

}
