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

public class SelectDemo2 {

	public static void main(String[] args) {
		BaseClass.init();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Daths/Desktop/select.html");
		WebElement opt=driver.findElement(By.id("mtr"));
		Select select=new Select(opt);
		List<WebElement> allOptions = select.getOptions();
		int count = allOptions.size();
		System.out.println("options size:"+count);
		System.out.println("---------------------");
		for(WebElement options:allOptions) {
			System.out.println("options: "+options.getText());
		}
		for(int i=count-1;i>=0;i--) {
			select.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--) {
			select.deselectByIndex(i);
		}
		ArrayList<String> allText=new ArrayList<String>();
		for(WebElement option1:allOptions) {
			allText.add(option1.getText());
		}
		System.out.println("------------------");
		System.out.println("Sorted Order is:");
		Collections.sort(allText);
		for(String text:allText) {
			System.out.println(text);
		}
				
		if(select.isMultiple()) {
			System.out.println("-------------------");
			System.out.println("Multiple options");
		}else {
			System.out.println("Not Multiple");
		}
		
	}

}
