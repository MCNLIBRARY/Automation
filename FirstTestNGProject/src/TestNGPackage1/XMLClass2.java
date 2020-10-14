package TestNGPackage1;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;

import org.testng.annotations.*;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLClass2 {
	
	public String baseUrl = "https://www.amazon.in/";
    String driverPath = "C:\\\\edgeDriver\\\\msedgedriver.exe";
    public WebDriver driver ; 
    
    @BeforeTest
    public void BrowserSetup()
    {
  	  System.out.println("launching browser"); 
        System.setProperty("webdriver.edge.driver", driverPath);
        driver = new EdgeDriver();
        driver.get(baseUrl);
    }
    
    @Test(priority=1)
    @Parameters({"author"})
    public void verifyXMLParameters(String searchKey)throws InterruptedException
    {
  	  
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchKey);
      
    }
      
       
    @AfterTest
    public void BrowserShutdown()
    {
  	 // driver.quit();
    }

}

