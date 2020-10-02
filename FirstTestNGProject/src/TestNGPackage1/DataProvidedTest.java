package TestNGPackage1;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidedTest {

	public String baseUrl = "https://www.google.com/";
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
	
	 
	
	 @Test(dataProvider="SearchProvider")
	    public void testMethod(String author,String searchKey) throws InterruptedException{
	    {
	        WebElement searchText = driver.findElement(By.name("q"));
	        //search value in google searchbox
	        searchText.sendKeys(searchKey);
	        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
	        Thread.sleep(3000);
	        String testValue = searchText.getAttribute("value");
	        System.out.println(testValue +"::::"+searchKey);
	        searchText.clear();
	        //Verify if the value in google search box is correct
	        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	    }
	    }
	 
	 @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "Guru99", "India" },
	            { "Krishna", "UK" },
	            { "Bhupesh", "USA" }
	        };

	    }
	 
	 @AfterTest
	  public void BrowserShutdown()
	  {
		  driver.quit();
	  }
}
