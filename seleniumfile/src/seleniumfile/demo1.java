package seleniumfile;
//addon
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class demo1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d = new FirefoxDriver();
		String s="install";
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://addons.mozilla.org/en-US/firefox/addon/firebug/");
		d.findElement(By.xpath("//a[@href='/firefox/downloads/latest/1843/addon-1843-latest.xpi?src=dp-btn-primary']"))
				.click();
		Alert alt = d.switchTo().alert();
		if (s.equals(alt.getText())) {
			alt.accept();
		}

	}
}
