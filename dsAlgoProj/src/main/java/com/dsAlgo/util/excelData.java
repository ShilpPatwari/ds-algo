package com.dsAlgo.util;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelData {
	
	static XSSFWorkbook wb;

	public static Object[][] testData(String excelFile, String sheetName) throws IOException{
	
	FileInputStream fis = new FileInputStream(excelFile);
	 wb = new XSSFWorkbook(fis);
    XSSFSheet sheet = wb.getSheet(sheetName);
    Row row = sheet.getRow(1);
    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    int colCount = row.getLastCellNum();
    Object[][] excelData = new Object[rowCount][colCount];
    
    for(int i=1; i<=rowCount; i++) {
    	
    	for(int j=0; j<row.getLastCellNum(); j++) {
    		
    		excelData[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
    	}
    }
    
	return excelData;
	
    }
//	wb.close();
}