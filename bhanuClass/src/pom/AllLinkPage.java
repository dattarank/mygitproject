package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllLinkPage {
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public AllLinkPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public int getLinkCount() {
		int size=allLinks.size();
		return size;
	}
	public void links() {
		
		
		for(WebElement s:allLinks) {
			String text=s.getText();
			System.out.println(text);
		}
		
	}


}
