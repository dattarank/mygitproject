package practice2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpDemo2 {

	static {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		handle.remove(parent);
		for(String wh:handle) {
			driver.switchTo().window(wh).close();
		}
		driver.switchTo().window(parent);
				
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//handling hidden division popup
		

	}

}
