package com.dsAlgo.dataProviders;

import org.testng.annotations.DataProvider;

import com.dsAlgo.util.excelData;

public class DataProvider1 {
	
	
	@DataProvider(name = "ExcelRegister")
    public Object[][] getData() throws Exception{
		
		Object[][] data = excelData.testData("C:/Users/patwa/Selenium_Training/dsAlgoProject/src/test/resources/Testdata/dsAlgoexcelData.xlsx", "Register");
		return data;
	}

	@DataProvider(name = "ExcelProvider1")
    public Object[][] getData1() throws Exception{
		
		Object[][] data = excelData.testData("C:/Users/patwa/Selenium_Training/dsAlgoProject/src/test/resources/Testdata/dsAlgoexcelData.xlsx", "Login");
		return data;
	}
	@DataProvider(name="ExcelProvider2")
	public Object[][] getData2() throws Exception{
		
		Object[][] data = excelData.testData("C:/Users/patwa/Selenium_Training/dsAlgoProject/src/test/resources/Testdata/dsAlgoexcelData.xlsx", "code");
		return data;
	}
	
	
	
}
