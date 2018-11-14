package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {
	public static void main(String[] args) throws InterruptedException {
		BaseClass.property();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/license.jsp;jsessionid=383k8ik0ujgim");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=1;i<=10;i++) {
			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(500);
			}
		for(int j=1;j<=10;j++) {
			js.executeScript("window.scrollBy(0,-100)");
			Thread.sleep(500);
		}
		WebElement scr=driver.findElement(By.xpath("//h2[contains(text(),'Miscellaneous')]"));
		Point p = scr.getLocation();
		int y = p.getY();
		System.out.println(y);
		//code optimization:
		String xpath="//h2[contains(text(),'Miscellaneous')]";
		int x=driver.findElement(By.xpath(xpath)).getLocation().getX();
		System.out.println(x);
		js.executeScript("window.scrollTo("+x+","+y+")");//two arguments
		driver.close();
		
	}

}
