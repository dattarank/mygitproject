package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		private WebDriver driver;//globally declaration
		//initialization
		final String s="username";
		@FindBy(id=s)
		private WebElement unTB;
		
		@FindBy(name="pwd")
		private WebElement pwTB;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement loginBTN;
		
		//Initialization
		LoginPage(WebDriver driver){
			this.driver=driver;//to Avoid NullPointerException
			PageFactory.initElements(driver, this);		//'this' represents current class instances
		}
		
		//Utilization
		public void login(String un, String pw) {
			unTB.sendKeys(un);
			pwTB.sendKeys(pw);
		}
		
		/*public void clickLogin() {
			loginBTN.click();
		}*/
		
		public HomePage clickLogin() {
			loginBTN.click();
			HomePage hp=new HomePage(driver);
			return hp;
		}

}
