package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableTest {

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) {
			//open browser
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
			WebElement ck=driver.findElement(By.xpath("//input[@type='checkbox' and @name='others']"));
			ck.click();
			boolean flag1=ck.isSelected();
			WebElement txt=driver.findElement(By.name("other_text"));
			boolean flag2=txt.isEnabled();
			
			if(flag1 && flag2) {
				System.out.println("Pass: textbox enabled and text is entered");
				txt.sendKeys("abcd");
			}else {
				System.out.println("Fail: Textbox disabled");
			}
			
			driver.close();

	}

}
