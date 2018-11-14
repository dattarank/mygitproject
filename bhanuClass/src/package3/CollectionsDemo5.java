package package3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CollectionsDemo5 {

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
				if(lhm.containsKey(text)) {//finds the duplicate key
					Integer v=lhm.get(text);//get the value
					v++;//if duplicate increment its value
					lhm.put(text, v);//over right the value
				}
				else {
				lhm.put(text, 1);
				}
			}
			//printing the options in list box with their occurrence
			System.out.println(lhm);
			//check if the given option is present or not
			String given="idly";
			if(lhm.containsKey(given)) {
				System.out.println("Yes, given option "+given+" is present");
			}
			else {
				System.out.println("No, Given option "+given+" is not present");
			}
			//Q5. check the given option is duplicate or not
			String given1="Puri";
			if(lhm.get(given1)>1) {
				System.out.println("Yes, given option "+given1+" is duplicate");
			}
			else {
				System.out.println("No, Given option "+given1+" is not duplicate");
			}
			//Q6. print only unique options present in the list box
			Set<String> allKeys = lhm.keySet();
			System.out.println("unique options:");
			for(String key:allKeys) {
				Integer count = lhm.get(key);
				if(count==1) {
					System.out.println(key);
				}
			}
			//Q7.print only duplicate options present in the list box
			System.out.println("Duplicate options:");
			for(String key:allKeys) {
				Integer count = lhm.get(key);
				if(count>1) {
					System.out.println(key);
				}
			}
			//
			
			
			driver.close();
	}
}
