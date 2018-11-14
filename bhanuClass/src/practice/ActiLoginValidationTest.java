package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ActiLoginValidationTest {
	
	public static void main(String[] args) throws InterruptedException {
		//validating Login Validation Text Properties
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		WebElement txt=driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		String text=txt.getText();
		System.out.println(text);
		String colorOfText=txt.getCssValue("color");
		System.out.println("RGB value of the text color is:"+colorOfText);
		String hex = Color.fromString(colorOfText).asHex();
		System.out.println("Hexa decimal value of the color is:"+hex);
		
		if(hex.equals("#ce0100")) {
		System.out.println("pass: msg color is red");
		}else {
			System.out.println("Fail: mag color is not red");
		}
		driver.close();
	}

}
