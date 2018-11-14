package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookGUITest {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	//facebook GUI Testing
	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://www.facebook.com/");
		WebElement un=driver.findElement(By.id("email"));
		WebElement pwd=driver.findElement(By.name("pass"));
		int unHeight = un.getSize().height;
		int unWidth = un.getSize().width;
		System.out.println(unHeight);
		System.out.println(unWidth);
		int pwdHeight = pwd.getSize().height;
		int pwdWidth = pwd.getSize().width;
		System.out.println(pwdHeight);
		System.out.println(pwdWidth);
		if(unHeight==pwdHeight && unWidth==pwdWidth) {
			System.out.println("passed");
		}else {
			System.out.println("Failed");
		}
		driver.close();
	}
}
