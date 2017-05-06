package selenium1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://localhost:808/login.do");
		EventFiringWebDriver ed = new EventFiringWebDriver(driver);
		File scrFile = ed.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\selenium\\screenshot2.png"));
		driver.quit();
	}
}
