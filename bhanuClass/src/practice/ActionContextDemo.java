package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionContextDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//opening the link in new tab
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.login.do");
		WebElement link=driver.findElement(By.linkText("actiTIME Inc."));
		Actions action =new Actions(driver);
		action.contextClick(link).perform();
		Thread.sleep(2000);
		action.contextClick(link).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		Set<String> handle = driver.getWindowHandles();
		for(String s:handle) {
			driver.switchTo().window(s);
			}
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
