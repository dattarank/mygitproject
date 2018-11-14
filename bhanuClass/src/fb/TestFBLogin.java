package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFBLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//enter URL
		driver.get("https://www.facebook.com/");
		
		//create Object of LoginPage class
		LoginPage lp=new LoginPage(driver);
		
		//Call LoginPage methods
		lp.setUserName("ms.dattara");
		lp.setUserPassword(Base.pass);
		lp.clickLogin();

	}

}
