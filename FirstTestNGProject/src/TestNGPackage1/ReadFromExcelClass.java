package TestNGPackage1;
import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelClass
{
	
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException
	
	{
		//Create an object of File class to open xlsx file

	    File file =    new File(filePath+"\\"+fileName);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);
	    
	    Workbook guru99Workbook = null;
	    
	    guru99Workbook = new HSSFWorkbook(inputStream);
	    
	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
	  //Find number of rows in excel file

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) 
	    	{

	    		Row row = guru99Sheet.getRow(i);

	    		//Create a loop to print cell values in a row

	    			for (int j = 0; j < row.getLastCellNum(); j++)
	    				{

	    					//Print Excel data in console

	    					System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	    				}

	    			System.out.println();
	    	} 

	}


public static void main(String...strings) throws IOException{

    //Create an object of ReadGuru99ExcelFile class

	ReadFromExcelClass objExcelFile = new ReadFromExcelClass();

    //Prepare the path of excel file

    //String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
    String filePath = "C:\\Users\\nivit\\Documents";
    

    //Call read file method of the class to read data

    objExcelFile.readExcel(filePath,"Book1.xls","Sheet1");

    }

}