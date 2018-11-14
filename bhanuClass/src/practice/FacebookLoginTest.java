package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("https://www.facebook.com");
		//get title
		String title=driver.getTitle();
		//verify title
				
		WebElement un=driver.findElement(By.id("email"));
		WebElement pw=driver.findElement(By.id("pass"));
		WebElement lbtn=driver.findElement(By.xpath(".//input[@value='Log In']"));

		boolean flag1=un.isDisplayed();
		boolean flag2=pw.isDisplayed();
		boolean flag3=lbtn.isDisplayed();
		if(flag1 && flag2 && flag3 && title.contains("log in")) {
			System.out.println("Passed - Title and User Name exist");
		}else {
			System.out.println("Failed - Title and User Name not exist");
		}
		//close browser
		driver.close();

	}

}
