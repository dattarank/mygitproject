package practice;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleDriveActions {

	public static void main(String[] args) throws InterruptedException {
		BaseClass.property();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/drive/");
		driver.findElement(By.xpath("(//a[.='Go to Google Drive'])[2]")).click();
		// Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("ms.dattara");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		// Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(BaseClass.pw);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		// Thread.sleep(2000);
		// WebDriverWait wait=new WebDriverWait(driver,5);
		// wait.until(ExpectedCondition.)
		driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
		Scanner scn = new Scanner(System.in);
		// Thread.sleep(3000);
		System.out.println("enter OTP:");

		String s = scn.nextLine();
		driver.findElement(By.id("idvPin")).sendKeys(s);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='My Drive']")).click();
		WebElement e = driver.findElement(By.xpath("//span[.='QSpiders']"));
		Actions act = new Actions(driver);
		act.doubleClick(e).perform();
	}
}
