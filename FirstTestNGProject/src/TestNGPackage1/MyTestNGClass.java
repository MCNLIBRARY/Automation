package TestNGPackage1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MyTestNGClass {

	public static void main(String[] args) {

		//Setting system properties of EdgeDriver
		System.setProperty("webdriver.edge.driver", "C:\\edgeDriver\\msedgedriver.exe");

		//Creating an object of EdgeDriver
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		//Deleting all the cookies
		driver.manage().deleteAllCookies();

		//Specifiying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//launching the specified URL
		driver.get("https://www.google.com/");
		
		//Google I'm feeling Lucky
		driver.findElement(By.xpath("//*[@class='FPdoLc tfB0Bf']/center/input[2]")).click();
		
		driver.get("https://www.google.com/");
		//Locating the elements using name locator for the text box
		driver.findElement(By.name("q")).sendKeys("Selenium For Beginners");

		// locator for Google search button
		WebElement searchIcon = driver.findElement(By.name("btnK"));
		
		
		searchIcon.click();
		System.exit(0);
		//driver.close();
		}
	
}
