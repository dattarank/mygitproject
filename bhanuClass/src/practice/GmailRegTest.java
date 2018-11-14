package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GmailRegTest {
	

	public static void main(String[] args) throws InterruptedException {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		
		WebElement txt=driver.findElement(By.xpath("//div[contains(text(),'email')]"));
		
		String text=txt.getText();
		System.out.println(text);
		
		String weight=txt.getCssValue("font-weight");
		System.out.println("weight:"+weight);
		
		
		String style=txt.getCssValue("font-style");
		System.out.println("font Style is:"+style);
		
		String size = txt.getCssValue("font-size");
		System.out.println("Font size is:"+size);
		
		String fontFamily=txt.getCssValue("font-family");
		System.out.println("font family:"+fontFamily);
		
		String color=txt.getCssValue("color");
		System.out.println("Color:"+color);
		String hex=Color.fromString(color).asHex();
		System.out.println("Hex value:"+hex);
		
		if(hex.equals("#d50000") && fontFamily.contains("Arial") && size.equals("12px")) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
		}
		driver.close();
		
	
	}
}
