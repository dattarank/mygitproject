package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeOperations {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp=new LoginPage(driver);
		
		//Login using valid credentials
		lp.login("admin", "manager");
		HomePage hp = lp.clickLogin();//by clicking we are landing to HomePage 
		
		//Click on USERS link in Home Page
		//HomePage hp=new HomePage(driver);
		UsersPage up = hp.clickUsers();//by clicking we are landing to UsersPage 
		
		//Click on add User in Users Page
		//UsersPage up=new UsersPage(driver);
		up.clickAddUser();
		
		//Write First Name
		up.setUserName("Datta");
		Thread.sleep(2000);
		
		//Click on cancel Button
		up.cancelClick();
		Thread.sleep(2000);
		
		//Switch to Alert and close it
		up.closePopup();
		Thread.sleep(2000);
		
		
		//Close the browser
		driver.close();
	 
			
		
	}
}
