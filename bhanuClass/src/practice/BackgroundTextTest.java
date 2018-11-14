package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundTextTest {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("http://localhost/login.do");
		//find the UN TB
		WebElement un=driver.findElement(By.id("username"));
		//get the background text present in the text box
		String bktxt = un.getAttribute("placeholder");
		System.out.println("Background text present in the Username tab:"+bktxt);
		WebElement pwd=driver.findElement(By.name("pwd"));
		String pwdtxt = pwd.getAttribute("placeholder");
		System.out.println("Backgroud text present is the Password tab:"+pwdtxt);
		driver.close();
	}
}
