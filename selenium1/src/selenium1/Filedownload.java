package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Filedownload {

	public static void main(String[] args) {

		FirefoxProfile p = new FirefoxProfile();
		p.setPreference("browser.download~folderList", 0);
		p.setPreference("browser.helperApps.neverAsk.saveDisk", "application/zip");
		p.setPreference("browser.download.dir", "C:\\Users\\rahul\\Desktop");
		WebDriver d = new FirefoxDriver(p);
		d.get("http://files.all-free-download.com/downloadfiles/graphic/graphic_1/love_it039s_eternal_197644.zip");

	}

}
