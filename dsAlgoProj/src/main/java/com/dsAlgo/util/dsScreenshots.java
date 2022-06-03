package com.dsAlgo.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class dsScreenshots {


	public static void CaptureScreenshot(WebDriver driver, String fileName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;  
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src/../Screenshots/"+System.currentTimeMillis()+fileName));
		// if filename is not passed through method - (means no String fileName option)
	//	FileUtils.copyFile(file, new File("src/../Screenshots/"+System.currentTimeMillis()+".png"));
		
	}
}
