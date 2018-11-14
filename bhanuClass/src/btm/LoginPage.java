package btm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//initialization
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	//Utilization
	public void clickLogin() {
		loginBTN.click();
	}

}
