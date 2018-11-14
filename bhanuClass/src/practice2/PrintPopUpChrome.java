package practice2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopUpChrome {

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		String parent = driver.getWindowHandle();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		driver.findElement(By.xpath("(//button[text()='Cancel'])[1]")).click();
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.close();
		//r.keyPress(KeyEvent.VK_ESCAPE);
		//r.keyRelease(KeyEvent.VK_ESCAPE);
		
	}
}
