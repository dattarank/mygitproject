package pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp=new LoginPage(driver);
		
		System.out.println("login with invalid credencials");
		lp.login("admin", "danager");
		lp.clickLogin();
		
		Thread.sleep(3000);
		System.out.println("login with valid credencials");
		lp.login("admin", "manager");
		lp.clickLogin();
		
	}

}
