package practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.BaseClass;

public class PopUpDemo1 {
//not working
	public static void main(String[] args) throws InterruptedException {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		//driver.findElement(By.xpath("//a[.='Login & Signup']")).click();

	}

}
