package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//For login test first we should verify that the page is login page
public class ActiLoginTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		
		String hometitle = driver.getTitle();
		System.out.println(hometitle);
		driver.findElement(By.id("logoutLink")).click();
		
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		String loginTitle = driver.getTitle();
		System.out.println(loginTitle);
		//close browser
		driver.close();
	}
}