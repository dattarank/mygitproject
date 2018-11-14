package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCount {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		int size = allAutoSugg.size();
		System.out.println(size);
		for(WebElement e:allAutoSugg) {
			System.out.println(e.getText());
		}
		allAutoSugg.get(0).click();
		driver.close();

	}

}
