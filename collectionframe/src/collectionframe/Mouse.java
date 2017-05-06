package collectionframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("file://D:/IDM%20DOWNLOAD//Documents//form.html");
		Actions actions=new Actions(driver);
		
		// howering on the dropdown
		
		actions.moveToElement(driver.findElement(By.id("Month"))).perform();
		
		// Clicking on one of the items in the list options
		
		WebElement subLinkOption=driver.findElement(By.id("id of the sub link"));
		
		subLinkOption.click();


	}

}
