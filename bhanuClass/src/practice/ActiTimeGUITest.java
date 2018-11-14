package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeGUITest {

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) {
			//open browser
			WebDriver driver=new ChromeDriver();
			//enter url
			driver.get("http://localhost/login.do");
			WebElement un=driver.findElement(By.id("username"));
			WebElement pwd=driver.findElement(By.name("pwd"));
			int unloc = un.getLocation().getX();
			System.out.println(unloc);
			int pwdloc = pwd.getLocation().getX();
			System.out.println(pwdloc);
			if(unloc==pwdloc) {
				System.out.println("passed");
			}else {
				System.out.println("Failed");
			}
			driver.close();

	}

}
