package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VTigerMouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		Actions action=new Actions(driver);
		
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		action.moveToElement(link).perform();
		//click on contacts
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String xpathOfContact="//div[contains(text(),'Human Resources	')]";
		int a = driver.findElement(By.xpath(xpathOfContact)).getLocation().getY();
		js.executeScript("window.scrollTo(0,"+a+")");
		System.out.println(a);
		Thread.sleep(3000);
		String pno="//div[contains(text(),'Human Resources	')]/ancestor::div[1]/div[2]";
		WebElement pno1=driver.findElement(By.xpath(pno));
		String phoneNo=pno1.getText();
		System.out.println(phoneNo);
		driver.close();

	}

}
