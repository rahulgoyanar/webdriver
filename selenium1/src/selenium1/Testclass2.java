package selenium1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testclass2 {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("file://D:/IDM DOWNLOAD/Documents/form.html");
		Select sel=new Select(d.findElement(By.name("Hobby")));
		for(int i=0;i<8;i++)
		{
			sel.selectByIndex(i);
		}
		sel.deselectAll();
		}
	}