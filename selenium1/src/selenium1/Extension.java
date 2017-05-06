package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Extension {

	public static void main(String[] args) throws IOException {
		FirefoxProfile p = new FirefoxProfile();
		File f = new File("http://getfirebug.com");
		p.addExtension(f);
		p.setPreference("Extensions.firebug.currenVersion", "2.0.18");
		WebDriver d = new FirefoxDriver(p);
		d.get("https://login.naukri.com/nLogin/Login.php");

	}

}
