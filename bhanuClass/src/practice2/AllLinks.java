package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		//Getting Size and Text of all Links
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkSize = links.size();
		System.out.println(linkSize);
		for(int i=0;i<linkSize;i++) {
			String s = links.get(i).getText();
			System.out.println(s);
		}
		driver.close();
	}
}
