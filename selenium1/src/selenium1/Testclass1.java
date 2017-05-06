package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass1 {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("https://mail.google.com");
		d.findElement(By.id("Email")).sendKeys("rahulgoyanar");
		//String val = d.findElement(By.id("Email")).getAttribute("value");
	//	System.out.println(val);
		d.findElement(By.id("next")).click();
		d.findElement(By.id("Passwd")).sendKeys("preetiagrsl");
		d.findElement(By.id("signIn")).click();
		d.findElement(By.xpath("//a[@class='gb_b gb_6a gb_R']/span[@class='gb_1a gbii']")).click();
		d.findElement(By.id("gb_71")).click();
		

	}
}