package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPriceTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	//Get flipkart all price list
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement text=driver.findElement(By.xpath("//div[text()='Headphones&Speakers']/../div[3]"));
		String txt=text.getText();
		System.out.println(txt);
	}
}
