package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllImagesPage {
	@FindBy(xpath="//img")
	private List<WebElement> allImages;
	
	@FindBy(xpath="(//button)[2]")
	private WebElement popup;
	
	public AllImagesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public int getimageCount() {
		int size=allImages.size();
		return size;
	}
	public void popupClose() {
		popup.click();
	}
			
	

}
