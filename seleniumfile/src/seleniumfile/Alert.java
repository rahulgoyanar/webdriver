package seleniumfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		String expected = "Enter Value for  UserName";
		d.get("https://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/login.do");
		d.findElement(By.xpath("//input[@class='buttonSubmit']")).click();
		String actual = d.switchTo().alert().getText();
		if (expected.equals(actual)) {
			System.out.println("test case is pass");
		} else {
			System.out.println("test case is fail ");
		}
		d.switchTo().alert().accept();
		d.close();
	}

}
