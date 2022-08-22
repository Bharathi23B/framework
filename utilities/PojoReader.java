package com.rameshsoft.automation.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.rameshoft.automation.supporters.ExcelReader;
import com.rameshoft.automation.supporters.PropertiesReader;
import com.rameshoft.automation.supporters.TextReader;

public class PojoReader {//predefined class [we defined our own class]for reading the data and writing the data

	public static PropertiesReader getPrConfObj() throws IOException
	{
		PropertiesReader prConf = new PropertiesReader(FilePaths.confFile);//[//abstract class of  interface]
		return prConf;
			}
	
	public static PropertiesReader getPrOrObj() throws IOException
	{
		PropertiesReader por = new PropertiesReader(FilePaths.orFile);
		return por;
			}

public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException
{
	ExcelReader excelreader=new ExcelReader(FilePaths.excelFile);
	return excelreader;
}
	
public static TextReader gettextreader() throws IOException {
	
	TextReader textreader=new TextReader(FilePaths.txtFile);
	return textreader;
	

}

}
