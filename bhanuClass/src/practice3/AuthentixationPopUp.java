package practice3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthentixationPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("url");		
		WebDriverWait wait=new WebDriverWait(driver,10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
	}

}
