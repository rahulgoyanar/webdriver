package seleniumfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploading {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		 WebDriver d = new FirefoxDriver();
		 d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 d.get("http://gmail.com");    

		d.findElement(By.id("Email")).sendKeys("rahulgoyanar");
		d.findElement(By.id("next")).click();
		d.findElement(By.id("Passwd")).sendKeys("preetiagrsl");
		d.findElement(By.id("signIn")).click();
		d.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		d.findElement(By.id(":ob")).click();
		Runtime.getRuntime().exec("C:/Users/rahul/Desktop/selenium.exe");
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[@class='gb_b gb_6a gb_R']/span[@class='gb_1a gbii']")).click();
		d.findElement(By.id("gb_71")).click();

		
	}
}
