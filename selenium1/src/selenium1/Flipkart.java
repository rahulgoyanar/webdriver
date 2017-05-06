package selenium1; 

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriverWait wdw = new WebDriverWait(driver, 40);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < checkBoxes.size(); i++) {
			wdw.until(ExpectedConditions.elementToBeClickable(checkBoxes.get(i)));
			checkBoxes.get(i).click();

			checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		}

	}

}
