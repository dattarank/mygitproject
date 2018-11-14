package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPrices {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//div[starts-with(text(),'Now') or starts-with(text(),'From')]"));
		int count = prices.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = prices.get(i).getText();
			System.out.println(text);
		}
		driver.close();

	}

}
