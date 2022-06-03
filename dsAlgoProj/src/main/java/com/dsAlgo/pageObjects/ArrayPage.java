package com.dsAlgo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage extends Baseclass {
	
	
	JavascriptExecutor js;
	
	@FindBy(xpath = "//a[@href='arrays-in-python']") WebElement arrPython;
	@FindBy(xpath = "//a[@href='/array/arrays-using-list/']") WebElement arrList;
	@FindBy(xpath = "//a[@href='/array/basic-operations-in-lists/']") WebElement basicOperations;
	@FindBy(xpath = "//a[@href='/array/applications-of-array/']") WebElement appArray;
	@FindBy(xpath = "//a[@href='/tryEditor']") WebElement tryhere;
	@FindBy(xpath = "//textarea[@autocorrect='off']") WebElement codearea;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement run;
	
	// Initialize the page objects
		public ArrayPage() {
			
			PageFactory.initElements(driver, this);
			this.js = (JavascriptExecutor)Baseclass.driver;
		}

		public HomePageobjects arrayValidation(String code) throws InterruptedException {
			
			
		//	String parent = driver.getWindowHandle();
			arrPython.click();
			js.executeScript("window.scrollBy(0,1300)","");
			Thread.sleep(2000);
			tryhere.click();
		//	Thread.sleep(2000);
			codearea.sendKeys(code);
			Thread.sleep(1000);
			run.click();
			Thread.sleep(2000);
		//	driver.navigate().to("https://dsportalapp.herokuapp.com/home");
			driver.navigate().back();
		//	driver.switchTo().window(parent);
			js.executeScript("arguments[0].scrollIntoView();", arrList);
		//	js.executeScript("window.scrollBy(0,-1300)","");
			Thread.sleep(3000);
			
			arrList.click();
			js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);
			tryhere.click();
		//	Thread.sleep(2000);
			codearea.sendKeys(code);
			Thread.sleep(1000);
			run.click();
			Thread.sleep(2000);
			driver.navigate().back();
		//	driver.navigate().to("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
			Thread.sleep(2000);
			
			basicOperations.click();
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(2000);
			tryhere.click();
		//	Thread.sleep(2000);
			codearea.sendKeys(code);
			Thread.sleep(1000);
			run.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			appArray.click();
			Thread.sleep(2000);
			tryhere.click();
		//	Thread.sleep(2000);
			codearea.sendKeys(code);
			Thread.sleep(1000);
			run.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().to("https://dsportalapp.herokuapp.com/home");
			
			return new HomePageobjects();
		}
		
	
}
