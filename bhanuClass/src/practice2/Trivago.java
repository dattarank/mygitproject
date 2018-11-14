package practice2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("horus-querytext")).sendKeys("bang");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'alore International Airport')])[1]")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		//first hotel name
		String text1 = driver.findElement(By.xpath("(//h3[@title])[1]")).getText();
		System.out.println(text1);
		//first hotel price
		String price = driver.findElement(By.xpath("(//strong[contains(@class,'item__best-price')])[1]")).getText();
		System.out.println(price);
		
		List<WebElement> titles = driver.findElements(By.xpath("//h3[@title]"));
		Thread.sleep(4000);
		List<WebElement> prices = driver.findElements(By.xpath("(//strong[contains(@class,'item__best-price')])"));
		
		/*for(WebElement e:prices) {
			System.out.println(e.getText());
		}*/
		
		
		System.out.println(titles.size());
				
		for(int i=0;i<titles.size();i++) {
			String names=titles.get(i).getText();
			Thread.sleep(2000);
			String cost=prices.get(i).getText();
		
			System.out.println(names+"---->"+cost);
			}	
					
		}
	
	}

