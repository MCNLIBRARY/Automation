package TestNGPackage1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class DataProvidedTest {

	public String baseUrl = "https://www.google.com/";
    String driverPath = "C:\\\\edgeDriver\\\\msedgedriver.exe";
    public WebDriver driver ; 
    

	 @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "Guru99", "India" },
	            { "Krishna", "UK" },
	            { "Bhupesh", "USA" }
	        };

	    }
	 
	 
}
