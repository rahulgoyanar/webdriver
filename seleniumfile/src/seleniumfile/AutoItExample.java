package seleniumfile;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/rahul/Desktop/Rahul.html");
		driver.findElement(By.name("rahul")).click();
		Runtime.getRuntime().exec("C:/Users/rahul/Desktop/r.exe");
		
	}

}
