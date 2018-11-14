package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JScriptDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Daths/Desktop/Bhanu%20sir/jscript.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//printing a message as an alert
		js.executeScript("alert('Textbox disable enter text into it by using java script')");
		Thread.sleep(2000);
		//handling alert message
		driver.switchTo().alert().accept();
		//entering value into disabled element using javascriptExecutor
		js.executeScript("document.getElementById('t1').value='bang'");
		//clear the value without using clear()
		Thread.sleep(3000);
		js.executeScript("document.getElementById('t1').value=''");
		js.executeScript("document.getElementById('t1').value='greatings...'");
		Thread.sleep(3000);
		driver.close();
	}
}
