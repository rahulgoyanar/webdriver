package seleniumfile;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;

public class Screenshot {
	WebDriver d;

	@BeforeTest
	public void start() {
		d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
		
	}

	@org.testng.annotations.Test
	public void Test() throws IOException {
		try {
			d.get("https://www.google.com");
			d.findElement(By.xpath("//input[@class='buttonSumit']")).sendKeys("testing");
		} catch (Exception e) {
			EventFiringWebDriver ed = new EventFiringWebDriver(d);
			File srcImg = ed.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcImg, new File("D://IDM DOWNLOAD//test.png"));
		}
	}
}