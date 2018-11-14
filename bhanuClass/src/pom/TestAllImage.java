package pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//program to count the images present on the Flipkart page
public class TestAllImage {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		AllImagesPage l=new AllImagesPage(driver);
		l.popupClose();
		System.out.println("pop-up closed");
		int count=l.getimageCount();
		System.out.println("The images present on flipkart page are: "+count);
		
		driver.close();
	}
}
