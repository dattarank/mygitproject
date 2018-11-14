package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeActions {

	public static void main(String[] args) {
		//program to open new tab in background 
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement link=driver.findElement(By.linkText("actiTIME Inc."));
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL).click(link).perform();
		//action.

	}

}
