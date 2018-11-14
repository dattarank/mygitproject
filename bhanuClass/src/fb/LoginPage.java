package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//Declaration
		private WebElement unTB;
		private WebElement pwTB;
		private WebElement loginBTN;
		
		//Initialization
		public LoginPage(WebDriver driver) {
			unTB=driver.findElement(By.id("email"));
			pwTB=driver.findElement(By.id("pass"));
			loginBTN=driver.findElement(By.xpath("//input[@value='Log In']"));
		}
		
		//Utilization
		public void setUserName(String un) {
			unTB.sendKeys(un);
		}
		public void setUserPassword(String pw) {
			pwTB.sendKeys(pw);
		}
		public void clickLogin() {
			loginBTN.click();
		}

}
