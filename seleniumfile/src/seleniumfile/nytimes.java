package seleniumfile;
//ny times
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class nytimes {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http:/www.google.com/");
		//d.findElement(By.linkText("Most Viewed")).click();
		/*d.findElement(By.xpath("//a[@href='http://www.nytimes.com/gst/mostpopular.html']")).click();
		List<WebElement> lst = d.findElements(By.xpath("div[@class='tab-content most-viewed']/ol/li/a/article/h2"));
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i).getText());*/

//	}
}
}