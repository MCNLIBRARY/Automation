package TestNGPackage1;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;




public class FirstTestNGTest {
	
	public String baseUrl = "https://www.google.com/";
    String driverPath = "C:\\\\edgeDriver\\\\msedgedriver.exe";
    public WebDriver driver ; 
    
    @Test
    public void ExcelRead() throws IOException
    	{
    		ReadFromExcelClass objExcelFile = new ReadFromExcelClass();

    		//Prepare the path of excel file

    		String filePath = "C:\\Users\\nivit\\Documents";
    		
    		objExcelFile.readExcel(filePath,"Book1.xls","Sheet1");
    	}
    
    @Test
    public void ExcelWrite() throws IOException
    
    {
    	 String[] valueToWrite = {"Padmanabhan","Excellent"};

         //Create an object of current class

         WriteToExcelClass objExcelFile = new WriteToExcelClass();

         //Write the file using file name, sheet name and the data to be filled
         String filePath = "C:\\Users\\nivit\\Documents";

         objExcelFile.writeExcel("C:\\Users\\nivit\\Documents","Book1.xls","Sheet1",valueToWrite);
    }
    
  @BeforeTest
  public void BrowserSetup()
  {
	  System.out.println("launching browser"); 
      System.setProperty("webdriver.edge.driver", driverPath);
      driver = new EdgeDriver();
      driver.get(baseUrl);
  }
  
  @AfterTest
  public void BrowserShutdown()
  {
	  driver.quit();
  }
  
  @Test(priority=2)
  public void verifyHomepageTitle1(){
	  
	 
	    
      String expectedTitle = "Mercury";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
     
  }
  
  @Test(priority=1)
  public void verifyHomepageTitle2(){
	  
	  
      String expectedTitle = "Google";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
     
  }
}
