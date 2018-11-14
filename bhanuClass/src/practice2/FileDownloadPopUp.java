package practice2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopUp { 
	//program to download file in Firefox browser
	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
		Thread.sleep(4000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);//alt + s to select 'save to' option
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ESCAPE);//to cancel download
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		/* try following code????
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CANCEL);
		r.keyRelease(KeyEvent.VK_CANCEL);

*/	}

}
