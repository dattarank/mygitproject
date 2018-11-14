package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.BaseClass;

public class CalendarDemo {

	public static void main(String[] args) {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.id("nqame2")).sendKeys("policy123");
		driver.findElement(By.id("dtDOB")).click();
		
		driver.findElement(By.linkText("15")).click();

	}

}
