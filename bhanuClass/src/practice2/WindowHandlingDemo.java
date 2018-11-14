package practice2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		handle.remove(parent);
		for(String wh:handle) {
			driver.switchTo().window(wh).close();
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[.='Later']")).click();
		
		driver.findElement(By.id("[id='input_resumeParser']")).sendKeys("C:/Users/Daths/Desktop/a1.docx");
		}
	}

