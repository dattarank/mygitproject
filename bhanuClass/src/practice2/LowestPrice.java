package practice2;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LowestPrice {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.name("origin")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("destination")).sendKeys("delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Indira')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.ui-state-active")).click();
		Thread.sleep(1000);
		
		WebElement adults=driver.findElement(By.id("Adults"));
		Select s=new Select(adults);
		s.selectByIndex(1);
		
		WebElement child=driver.findElement(By.id("Childrens"));
		Select s2=new Select(child);
		s2.selectByIndex(1);
		
		WebElement infant=driver.findElement(By.id("Infants"));
		Select s3=new Select(infant);
		s3.selectByIndex(1);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("SearchBtn")).click();
		
		Thread.sleep(6000);
		
		//List<WebElement> names = driver.findElements(By.xpath("//th[@class='vendor  count1']"));
		TreeSet<Integer> allPriceNum=new TreeSet<Integer>();
		
		List<WebElement> prices = driver.findElements(By.xpath("//th[@class='price']"));
		 		
		for(WebElement a:prices) {
			
			String r1 = a.getText().substring(1).replaceAll(",", "");
			allPriceNum.add(Integer.parseInt(r1));
			
		}
		System.out.println("last price is:"+allPriceNum.last());
	}
}
