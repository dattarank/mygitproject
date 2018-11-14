package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseHover {
//Mouse Hover
	public static void main(String[] args) {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Actions action=new Actions(driver);
		//mouse hover on mens
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Men')]"));
		action.moveToElement(link).perform();
		//click on sunglasses and frames
		driver.findElement(By.xpath("(//a[contains(text(),'Sunglasses and Frames')])[1]")).click();
		//locate first item
		String firstItem="(//div[contains(text(),'Floyd')])[1]/../div[2]/span/span[1]";
		WebElement price=driver.findElement(By.xpath(firstItem));
		//get item price
		String amount=price.getText();
		System.out.println(amount);
		driver.close();

	}

}
