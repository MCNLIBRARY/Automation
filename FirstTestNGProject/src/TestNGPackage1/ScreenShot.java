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
			driver.get("https://www.amazon.in//");
	
			CaptureAndSaveScreenShot(driver,"C:\\Users\\nivit\\Documents\\FirstScreenShot.png");
	
		}
	
	public static void CaptureAndSaveScreenShot(WebDriver driver,String FileWithPath) throws IOException
		{
			TakesScreenshot scrsht=((TakesScreenshot)driver);
			File SrcFile=scrsht.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(FileWithPath);
			FileUtils.copyFile(SrcFile,DestFile);
		}

}
