package package3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CollectionsDemo4 {
	

	public static void main(String[] args) {
	BaseClass.init();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("file:///C:/Users/Daths/Desktop/select2.html");
	WebElement listBox=driver.findElement(By.id("mtr"));
	Select select=new Select(listBox);
	List<WebElement> options = select.getOptions();
	
	
	LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
	
	for(WebElement option1:options) {
		String text = option1.getText();
		lhm.put(text, 1);
	}
	System.out.println(lhm);
	}

}
