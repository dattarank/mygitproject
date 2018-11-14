package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesion {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//a[@data-labelname='iphone x']")).click();
		
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		for(WebElement a:prices) {
			String s = a.getAttribute("display-price");
			int iprice = Integer.parseInt(s);
			num.add(iprice);
		}
		
		Collections.sort(num);
		System.out.println(num);
		
		int last = num.size();
		System.out.println(num.get(last-1));
		
		driver.close();
		
		
		
		

	}

}
