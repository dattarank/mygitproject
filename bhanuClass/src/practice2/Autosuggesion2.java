package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesion2 {
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
			String s = a.getText();
			//String s1=s.replaceAll("Rs. ", "");
			//String s2=s1.replaceAll(",", "");
			//int iprice = Integer.parseInt(s2);
			String s1=s.replaceAll("Rs. ", "").replaceAll(",", "");//code optimized
			int iprice = Integer.parseInt(s1);
			num.add(iprice);
		}
		
		//Collections.sort(num);//ascendind order sort
		Collections.sort(num,Collections.reverseOrder());//descending order
		System.out.println(num);
		
		//int last = num.size();
		//System.out.println(num.get(last-1));
		System.out.println(num.get(0));//first element of descending order list
		driver.close();
	}
}
