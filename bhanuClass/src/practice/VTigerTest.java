package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTigerTest {
	
	public static void main(String[] args) throws InterruptedException {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value='admin'");
		js.executeScript("document.getElementById('password').value='admin'");
		//driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys(Keys.ENTER);
		
	}
}
