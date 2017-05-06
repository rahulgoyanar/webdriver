package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass4 {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://mail.google.com");
		d.findElement(By.id("Email")).sendKeys("rahulgoyanar");
		d.findElement(By.id("next")).click();
		d.findElement(By.id("Passwd")).sendKeys("preetiagrsl");
		d.findElement(By.id("signIn")).click();
		List<WebElement> lst = d.findElements(By.xpath("//table[@class='F cf zt']/tbody/tr/td[2]/div"));
		for (int i = 0; i < lst.size(); i++) {
			lst.get(i).click();
		}

	}
}
