package btm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestLogin {
	
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
		LoginPage lp=new LoginPage();
		PageFactory.initElements(driver, lp);
		
		//Call LoginPage methods with invalid credentials
		System.out.println("click Login1");
		lp.clickLogin();
		Thread.sleep(1000);
		//after clicking page get refreshed, so address of the element is changed.
		//initElement of PageFactory will initialize the elements
		System.out.println("click Login2");
		lp.clickLogin();
	}
}
