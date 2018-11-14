package practice2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import package3.BaseClass;

public class SelectDemo {

		public static void main(String[] args) throws InterruptedException {
		BaseClass.init();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Daths/Desktop/select.html");
		
		List<WebElement> we = driver.findElements(By.xpath("//option"));
		for(WebElement e:we) {
			System.out.println("option: "+e.getText());
		}

		
		WebElement opt=driver.findElement(By.id("mtr"));
		Select s1=new Select(opt);
		System.out.println("Is multi selected: "+s1.isMultiple());
				
		s1.selectByValue("b");
		
		s1.selectByValue("s");
		
		s1.selectByValue("p");
		
		s1.selectByValue("v");
		
		s1.selectByValue("i");
		
		
		
		System.out.println("Number of options in the list: "+s1.getOptions().size());
		System.out.println("Selected options lenght: "+s1.getAllSelectedOptions().size());
		System.out.println("first selected option: "+s1.getFirstSelectedOption().getText());
		
		s1.deselectByValue("b");
		s1.deselectByValue("s");
		s1.deselectByValue("p");
		s1.deselectByValue("v");
		s1.deselectByValue("i");
		
		List<WebElement> we2 = driver.findElements(By.xpath("//option"));
		for(WebElement e:we2) {
			e.click();
			Thread.sleep(00);
			e.click();
		}
		driver.close();
	}
}
		