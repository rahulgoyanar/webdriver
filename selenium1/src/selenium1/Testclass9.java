package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Testclass9 {
	public static void main(String[] args) {
		FirefoxProfile p = new FirefoxProfile();
		p.setAssumeUntrustedCertificateIssuer(false);
		WebDriver d = new FirefoxDriver(p);
		d.get("https://hdfcbank.com");
	}

}
