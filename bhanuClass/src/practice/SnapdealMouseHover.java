package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealMouseHover {
	
	public static void main(String[] args) {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Actions action=new Actions(driver);
		//mouse hover on mens
		WebElement link=driver.findElement(By.xpath("//span[contains(text(),'All Offers')]"));
		action.moveToElement(link).perform();
		driver.findElement(By.xpath("//a/span[contains(text(),'Rakhi Store')]")).click();
		WebElement text=driver.findElement(By.xpath("//div[contains(text(),'Dhoops & Incense Sticks')]"));
		String textValue=text.getText();
		System.out.println(textValue);

		
		
		driver.close();
	}
}
