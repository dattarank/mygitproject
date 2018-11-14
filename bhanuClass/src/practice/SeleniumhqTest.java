package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumhqTest {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
//handling dynamic element using xapth independent-dependent element concept
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		WebElement cltvrsno=driver.findElement(By.xpath("//td[text()='Ruby']/../td[2]"));
		String text = cltvrsno.getText();
		System.out.println(text);
		driver.close();

	}

}
