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

public class ExcelDemo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//File file=new File("C:\Users\new\eclipse-workspace\mavendemo2\src\test\java\com\rameshsoft\automation\appln\testdata\TestData.xml");
		FileInputStream fip=new FileInputStream("C:\\Users\\new\\eclipse-workspace\\mavendemo2\\src\\test\\java\\com\\rameshsoft\\automation\\appln\\testdata\\TestData.xls");
		Workbook workbook =WorkbookFactory.create(fip); //class WorkbookFactory--call static method create(fip) 
		//Sheet sheet=workbook.getSheetAt(0);//by using index base
			Sheet sheet=workbook.getSheet("Gmail_Data");//sheet is interface which is specially designed for interfaces	
		
			int sheetRows=sheet.getLastRowNum();//sheet contains no rows
				System.out.println("no.of rows are:"+sheetRows);
			
				Row row0=sheet.getRow(0);//sheet contains 0th row
		int row0cellcount=row0.getLastCellNum();//in this row having cells
		System.out.println("0th row cell count is:"+row0cellcount);
		
		Cell cell00=row0.getCell(0);//in this 0throw and 0thcell value
		String cell00value=cell00.getStringCellValue();
		System.out.println("0th row 0th cell data is:"+cell00value);
		
		Cell cell01=row0.getCell(1);//in this 0throw and 1stcell value
		String cell01value=cell01.getStringCellValue();//string data if not getting any string data get the exception other than string like int or boolean
		System.out.println("0th row 1st cell data is:"+cell01value);
		
		Cell cell02=row0.getCell(2);//in this 0throw and 2ndcell value
		String cell02value=cell02.getStringCellValue();
		System.out.println("0th row 2nd cell data is:"+cell02value);
		
		Row row1=sheet.getRow(1);
		int row1cellcount=row1.getLastCellNum();
		System.out.println("1st row 0th cell count is:"+row1cellcount);
		
		Cell cell10=row1.getCell(0);
		 String cell10value=cell10.getStringCellValue();
		System.out.println("1st row 0th cell is:"+cell10value);
		
		Cell cell11=row1.getCell(1);
		String cell11value=cell11.getStringCellValue();
		System.out.println("1st row 1st cell is:"+cell11value);
		
		Cell cell12=row1.getCell(2);
		String cell12value=cell12.getStringCellValue();
		System.out.println("1st row 2nd cell is:"+cell12value);
		
	
	
	
	}
	
	
}
