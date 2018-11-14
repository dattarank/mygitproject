package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueRetivalTest {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.unitconverters.net/length/feet-to-cm.htm");
		driver.findElement(By.id("ucfrom")).sendKeys("100");
		
		WebElement to=driver.findElement(By.id("ucto"));
		String result = to.getAttribute("value");
		System.out.println(result);
		//print the result
		
		WebElement txt=driver.findElement(By.xpath("//div[@id='ucresult']"));
		String text = txt.getText();
		System.out.println(text);
		driver.close();

	}

}
