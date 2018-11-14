package btr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter URL
		driver.get("https://demo.actitime.com/login.do");
		
		//create Object of LoginPage class
		LoginPage lp=new LoginPage(driver);
		
		//Call LoginPage methods with invalid credentials
		lp.setUserName("adm");
		lp.setUserPassword("danager");
		lp.clickLogin();
		
		Thread.sleep(2000);
				
		//Call LoginPage methods with valid credentials by creating one more object, will work
		//LoginPage lp1=new LoginPage(driver);
		
		lp.setUserName("admin");
		lp.setUserPassword("manager");
		lp.clickLogin();
	}

}
