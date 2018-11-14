package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import package3.BaseClass;

public class Selectdemo3 {
	public static void main(String[] args) {
	BaseClass.init();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("file:///C:/Users/Daths/Desktop/select1.html");
	WebElement opt=driver.findElement(By.id("mtr"));
	Select select=new Select(opt);
	
	List<WebElement> allOptions = select.getOptions();
	//list contains only address of all options
	ArrayList<String> allText=new ArrayList<String>();
	
	for(WebElement options:allOptions) {
		allText.add(options.getText());
		//getting all options text and storin it in array list
	}
	//soring in array list
	Collections.sort(allText);
	System.out.println(allText);
	
	Collections.sort(allText,String.CASE_INSENSITIVE_ORDER);
	System.out.println(allText);

	
	
	driver.close();
	
	
	
}
}