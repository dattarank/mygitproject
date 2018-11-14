package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Daths/Desktop/Bhanu%20sir/qsp.html");
//		driver.findElement(By.tagName("a")).click();
//		System.out.println("method 1 done");
//		driver.navigate().back();
//		driver.findElement(By.id("a1")).click();
//		System.out.println("method 2 done");
//		driver.navigate().back();
//		driver.findElement(By.name("n1")).click();
//		System.out.println("method 3 done");
//		driver.navigate().back();
//		driver.findElement(By.className("c1")).click();
//		System.out.println("method 4 done");
//		driver.navigate().back();
//		driver.findElement(By.linkText("Google")).click();
//		System.out.println("method 5 done");
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("Goo")).click();
//		System.out.println("method 6 done");
//		driver.navigate().back();
//		//css selector syntax=tagName[attributeName='attributeValue']
//		driver.findElement(By.cssSelector("a[id='a1']")).click();
//		System.out.println("method 7 done");
//		driver.navigate().back();
//		//shortcut 1
//		driver.findElement(By.cssSelector("a#a1")).click();
//		System.out.println("method 8 done");
//		driver.navigate().back();
//		//shortcut 2
//		driver.findElement(By.cssSelector("#a1")).click();
//		System.out.println("method 9 done");
//		driver.navigate().back();
//		driver.findElement(By.cssSelector("a[class='c1']")).click();
//		System.out.println("method 10 done");
//		driver.navigate().back();
//		driver.findElement(By.cssSelector("a.c1")).click();
//		System.out.println("method 11 done");
//		driver.navigate().back();
//		driver.findElement(By.cssSelector(".c1")).click();
//		System.out.println("method 12 done");
//		driver.navigate().back();
//using xpath locator
		driver.findElement(By.xpath("./html/body/a")).click();
		System.out.println("method 13 done");
		driver.navigate().back();
		driver.close();
		}

}
