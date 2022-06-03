package com.dsAlgo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkedListPage extends Baseclass {

	JavascriptExecutor js;

	@FindBy(xpath = "//a[@href='introduction']")
	WebElement linkIntro;
	@FindBy(xpath = "//a[@href='/linked-list/creating-linked-list/']")
	WebElement linkCreation;
	@FindBy(xpath = "//a[@href='/linked-list/types-of-linked-list/']")
	WebElement linkTypes;
	@FindBy(xpath = "//a[@href='/linked-list/implement-linked-list-in-python/']")
	WebElement linkImplement;
	@FindBy(xpath = "//a[@href='/linked-list/traversal/']")
	WebElement linkTraversal;
	@FindBy(xpath = "//a[@href='/linked-list/insertion-in-linked-list/']")
	WebElement linkInsertion;
	@FindBy(xpath = "//a[@href='/linked-list/deletion-in-linked-list/']")
	WebElement linkDeletion;
	@FindBy(xpath = "//a[@href='/tryEditor']")  WebElement tryhere;
	@FindBy(xpath = "//textarea[@autocorrect='off']")  WebElement codearea;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement run;

	// Initialize the page objects
	@SuppressWarnings("static-access")
	public linkedListPage() {
			
			PageFactory.initElements(driver, this);
			this.js = (JavascriptExecutor)this.driver;
		}

	public HomePageobjects linkedListValidation(String code) throws InterruptedException {
		
		linkIntro.click();
		js.executeScript("window.scrollBy(0,1000)","");
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
		js.executeScript("arguments[0].scrollIntoView();", linkCreation);
	//	js.executeScript("window.scrollBy(0,-1300)","");
		Thread.sleep(3000);
		
		linkCreation.click();
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
		
		linkTypes.click();
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
		
		linkImplement.click();
		Thread.sleep(2000);
		tryhere.click();
	//	Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		linkTraversal.click();
		Thread.sleep(2000);
		tryhere.click();
	//	Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		linkInsertion.click();
		Thread.sleep(2000);
		tryhere.click();
	//	Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		linkDeletion.click();
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
