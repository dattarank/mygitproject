package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTagNameTest {

	//set property
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get("http://localhost/login.do");
		//find element ---- licenseLik
		//WebElement link=driver.findElement(By.id("licenseLink"));
		WebElement logo=driver.findElement(By.xpath("//img[contains(@src,'logo.png')]"));
		driver.findElement(By.cssSelector("#logoContainer>div>div>img"));
		String tagName2=logo.getTagName();
		//get tag name
		//String tagName1 = link.getTagName();
		//print tag name
		System.out.println("tag name is: "+tagName2);
		//compare
		if(tagName2.equals("img")) {
			System.out.println("pass");
		}else {
			System.out.println("Failed");
		}
	}
		
}
