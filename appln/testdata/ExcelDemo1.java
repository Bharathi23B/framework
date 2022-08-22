package com.rameshsoft.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo1 {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//File file=new File("C:\Users\new\eclipse-workspace\mavendemo2\src\test\java\com\rameshsoft\automation\appln\testdata\TestData.xml");
	FileInputStream fip=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\mavendemo2\\src\\test\\java\\com\\rameshsoft\\automation\\appln\\testdata\\TestData.xls");
	Workbook workbook =WorkbookFactory.create(fip); //class WorkbookFactory--call static method create(fip) 
	//Sheet sheet=workbook.getSheetAt(0);//by using index base
		Sheet sheet=workbook.getSheet("Gmail_Data");//sheet is interface which is specially designed for interfaces	
	for(int i=0;i<=sheet.getLastRowNum();i++)
	{
		Row row=sheet.getRow(i);
		for(int j=0; j<row.getLastCellNum();j++)
		{
			Cell cell=row.getCell(j);
		    String cellvalue=cell.getStringCellValue();
		System.out.println(cellvalue);
		  	    		
		}
		
	}
	
	
	
	
	
}










}
