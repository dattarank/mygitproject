package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);//seleniumhq.org
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		
		driver.findElement(By.id("logoutLink")).click();

	}

}
