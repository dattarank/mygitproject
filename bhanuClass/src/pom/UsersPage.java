package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	private WebDriver driver;//globally declaration
	@FindBy(xpath="(//div[.='Add User'])[1]")
	private WebElement addUser;
	
	@FindBy(name="firstName")
	private WebElement userFN;
	
	@FindBy(id="closeUserDataLightBoxBtn")
	private WebElement closeBTN;
	
	public UsersPage(WebDriver driver){
	//Avoids NllPointerException
	this.driver=driver;//making it accessible for all the methods and members
	PageFactory.initElements(driver, this);
		
	}
	public void clickAddUser() {
		addUser.click();
	}
	
	public void setUserName(String fn) {
		userFN.sendKeys(fn);
	}
	
	public void cancelClick(){
		closeBTN.click();
	}
	public void closePopup() {
		driver.switchTo().alert().accept();
	}
	
	

}
