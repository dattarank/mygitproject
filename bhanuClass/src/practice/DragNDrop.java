package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source=driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target=driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions action=new Actions(driver);
		//method 1
		//action.dragAndDrop(source, target).perform();
		//method 2
		action.clickAndHold(source).moveToElement(target).release().perform();

	}

}
