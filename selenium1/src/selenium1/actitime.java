package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("http://localhost:808/administration/userlist.do?submitted=");
		Thread.sleep(12000);
		d.findElement(By.xpath("//div[@id='ext-gen7']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//table[@id='ext-comp-1132']/tbody/tr[1]/td[2]/em/button[@class='x-btn-text']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//table[@id='ext-gen145']/tbody/tr[2]/td/table[@class='x-date-inner']/tbody/tr[4]/td/a/em/span[text()='16']")).click();	
	
	}
	
}
