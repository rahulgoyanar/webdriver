package selenium1;

import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testclass3 {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		d.get("file:///D:/IDM%20DOWNLOAD/Documents/form.html");
		Select sel = new Select(d.findElement(By.name("Hobby")));
		sel.selectByVisibleText("chess");
		sel.isMultiple();
		assertTrue("WELCOME TO THIS PAGE", d.getTitle().equals("WELCOME TO THIS PAGE"));
	d.quit();
	}
}
