package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;//globally declaration
	@FindBy(xpath="//div[.='USERS']")
	private WebElement usersLink;
	
	public HomePage(WebDriver driver){
		this.driver=driver;//to Avoid NullPointerException
		PageFactory.initElements(driver, this);
		
	}
	
	/*public void clickUsers() {
		usersLink.click();
	}*/
	public UsersPage clickUsers() {
		usersLink.click();
		UsersPage up=new UsersPage(driver);
		return up;
	}

}
