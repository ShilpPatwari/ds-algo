package com.dsAlgo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage extends Baseclass{

	
	JavascriptExecutor js;

	@FindBy(xpath = "//a[@href='implementation-lists']")
	WebElement qImplementation;
	@FindBy(xpath = "//a[@href='/queue/implementation-collections/']")
	WebElement qCollections;
	@FindBy(xpath = "//a[@href='/queue/Implementation-array/']")
	WebElement qArray;
	@FindBy(xpath = "//a[@href='/queue/QueueOp/']")
	WebElement qOperations;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere;
	@FindBy(xpath = "//textarea[@autocorrect='off']")
	WebElement codearea;
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement run;

	// Initialize the page objects
	@SuppressWarnings("static-access")
	public QueuePage() {
			
			PageFactory.initElements(driver, this);
			this.js = (JavascriptExecutor)this.driver;
		}

	public HomePageobjects queueValidation(String code) throws InterruptedException {

		Thread.sleep(1000);
		qImplementation.click();
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		js.executeScript("arguments[0].scrollIntoView();", qCollections);
		// js.executeScript("window.scrollBy(0,-400)","");
		Thread.sleep(3000);

		qCollections.click();
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		// driver.navigate().to("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
		Thread.sleep(2000);

		qArray.click();
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		qOperations.click();
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
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
