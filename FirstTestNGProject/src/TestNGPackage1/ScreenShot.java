package TestNGPackage1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.File;

public class ScreenShot {
	
	public static void main(String[] args) throws IOException
		{
			System.setProperty("webdriver.edge.driver", "C:\\edgeDriver\\msedgedriver.exe");

			//Creating an object of EdgeDriver
			WebDriver driver = new EdgeDriver();
	
			//launching the specified URL
			driver.get("https://www.testandquiz.com/selenium/testing.html");
	
			CaptureAndSaveScreenShot(driver,"C:\\Users\\nivit\\Documents\\FirstScreenShot.png");
			
			//driver.close();
	
		}
	
	public static void CaptureAndSaveScreenShot(WebDriver driver,String FileWithPath) throws IOException
		{
		
		    driver.findElement(By.id("fname")).sendKeys("JavaTPoint");
		    driver.findElement(By.id("idOfButton")).click();
		    
		    driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
			
			driver.findElement(By.name("firstName")).clear();
			driver.findElement(By.className("Automation")).click();
			
			driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
			
			driver.findElement(By.tagName("input")).sendKeys("TestNG");
			driver.findElement(By.tagName("Button")).click();
			
			driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(800, TimeUnit.SECONDS);
			
			driver.findElement(By.linkText("This is a link")).click();
			
			driver.get("https://www.testandquiz.com/selenium/testing.html");
			
			driver.findElement(By.partialLinkText("This is")).click();
			
			driver.get("https://www.testandquiz.com/selenium/testing.html");
			
			driver.findElement(By.cssSelector("input#fname")).sendKeys("cssSelector worked");
			driver.findElement(By.cssSelector("Button#idOfButton")).click();
			
			driver.findElement(By.cssSelector("input.Automation")).click();
			
			driver.findElement(By.cssSelector("input[id=fname]")).clear();
			driver.findElement(By.cssSelector("Button[id=idOfButton]")).click();
			
			
			driver.findElement(By.cssSelector("input[id^='fna']")).sendKeys("cssSelector completed");
			
			
			driver.get("https://www.google.com");
			driver.findElement(By.cssSelector("input.gsfi[name=q]")).sendKeys("Googling successfully");
			driver.findElement(By.cssSelector("input.jsp[value=Google Search]")).click();
			
			
			
			TakesScreenshot scrsht=((TakesScreenshot)driver);
			File SrcFile=scrsht.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(FileWithPath);
			FileUtils.copyFile(SrcFile,DestFile);
		}

}
