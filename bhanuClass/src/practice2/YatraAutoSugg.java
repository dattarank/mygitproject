package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraAutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com");
		driver.findElement(By.xpath("//span[.='Hotels']")).click();
		driver.findElement(By.id("BE_hotel_destination_city")).sendKeys("Bang");
		String xp="//strong[text()='Bang']/..";
		List<WebElement> allAutoSug = driver.findElements(By.xpath(xp));
		int size = allAutoSug.size();
		
		System.out.println(size);
		for(WebElement e:allAutoSug) {
			System.out.println(e.getText());
		}
		allAutoSug.get(0).click();
		//driver.findElement(By.id("BE_hotel_checkin_date")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-date='03/09/2018']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BE_hotel_checkout_date")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@data-date='04/09/2018']")).click();
		driver.findElement(By.id("BE_hotel_htsearch_btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[contains(@ng-src,'flexistay-laptop-roadtrip.png')]")).click();
		WebElement price=driver.findElement(By.xpath("(//p[.='For 1 night'])[1]/following-sibling::p[1]"));
		System.out.println(price.getText());
		
		
		//driver.close();


	}

}
