package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.findElement(By.xpath("//div[.='USERS']")).click();
		driver.findElement(By.xpath("(//div[.='Add User'])[3]")).click();
		driver.findElement(By.name("firstName")).sendKeys("abcd");
		
		Thread.sleep(2000);
		driver.findElement(By.id("closeUserDataLightBoxBtn")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		driver.close();
		
		
	}

}
