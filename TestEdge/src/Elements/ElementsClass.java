package Elements;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementsClass {
	
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
			driver.get("https://www.amazon.in//");
			
			//driver.findElement(By.xpath("//*[@class='nav-line-1']")).click();
			//Google I'm feeling Lucky
			//driver.findElement(By.xpath("//*[@class='FPdoLc tfB0Bf']/center/input[2]")).click();
			
			//driver.get("https://www.google.com/");
			//Locating the elements using name locator for the text box
			driver.findElement(By.id("nav-link-accountList")).click();
			//Locating the elements using name locator for the text box
			driver.findElement(By.id("ap_email")).sendKeys("nivitha@gmail.com");

			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("nivitha");
			
			driver.findElement(By.id("signInSubmit")).click();
			

			// locator for Google search button
			//WebElement searchIcon = driver.findElement(By.name("btnK"));
			
			
			//searchIcon.click();
			System.exit(0);
			//driver.close();
			}
		
	

}
