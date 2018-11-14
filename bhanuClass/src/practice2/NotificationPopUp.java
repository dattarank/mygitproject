package practice2;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

//handling browser Notifications
public class NotificationPopUp {

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		FirefoxProfile ffoptions = new FirefoxProfile();
		ffoptions.setPreference("dom.webnotifications.enabled", false);
		
		//WebDriver driver=new FirefoxDriver(ffoptions);
		//WebDriver driver=new ChromeDriver(option);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://www.cleartrip.com/");
		
		
	}

}
