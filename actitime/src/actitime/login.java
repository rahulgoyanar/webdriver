package actitime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.internal.WrapsDriver;

public class login {
	public static void main(String[] args) {
		
	
		FirefoxProfile prof = new FirefoxProfile();
		prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
		prof.setPreference("startup.homepage_welcome_url.additional",  "about:blank");
	    FirefoxDriver d= new FirefoxDriver(prof);
	     d.get("http://google.com");
	     
	      
}
}
