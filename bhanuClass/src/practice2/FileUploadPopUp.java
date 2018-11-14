package practice2;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		//program to upload CV in monster India job portal
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.monsterindia.com/");
		
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		handles.remove(parent);
		for(String wh:handles) {
			driver.switchTo().window(wh).close();
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[.='Upload Resume']")).click();
		driver.findElement(By.id("name")).sendKeys("abcd");
		driver.findElement(By.id("mob_no")).sendKeys("9876543210");
		
		//relative path does not work in sendKeys
		File f=new File("./data/gadgil.txt");
		String path=f.getAbsolutePath();//converting relative path to absolute path
		driver.findElement(By.id("wordresume")).sendKeys(path);//converted to absolute path
		
		System.out.println("file upload done successfuly");
		
		driver.close();

	}

}
