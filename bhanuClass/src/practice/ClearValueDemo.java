package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearValueDemo {
	
	public static void main(String[] args) throws InterruptedException {
	BaseClass.property();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Daths/Desktop/Bhanu%20sir/jscript1.html");
	WebElement e=driver.findElement(By.id("t1"));
	//clearing the value of text box without using clear() method
	e.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(3000);
	e.sendKeys(Keys.DELETE);
	}
}
