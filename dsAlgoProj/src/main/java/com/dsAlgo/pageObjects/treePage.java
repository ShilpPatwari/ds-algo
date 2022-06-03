package com.dsAlgo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class treePage extends Baseclass{

	JavascriptExecutor js;

	@FindBy(xpath = "//a[@href='overview-of-trees']")
	WebElement treeOverview;
	@FindBy(xpath = "//a[@href='/tree/terminologies/']")
	WebElement treeTerm;
	@FindBy(xpath = "//a[@href='/tree/types-of-trees/']")
	WebElement treeTypes;
	@FindBy(xpath = "//a[@href='/tree/tree-traversals/']")
	WebElement treeTraversal;
	@FindBy(xpath = "//a[@href='/tree/traversals-illustration/']")
	WebElement treeIllustration;
	@FindBy(xpath = "//a[@href='/tree/binary-trees/']")
	WebElement treeBinary;
	@FindBy(xpath = "//a[@href='/tree/types-of-binary-trees/']")
	WebElement treeBinaryTypes;
	@FindBy(xpath = "//a[@href='/tree/implementation-in-python/']")
	WebElement treePythonImpl;
	@FindBy(xpath = "//a[@href='/tree/binary-tree-traversals/']")
	WebElement treeBinaryTraversal;
	@FindBy(xpath = "//a[@href='/tree/implementation-of-binary-trees/']")
	WebElement treeBinaryImpl;
	@FindBy(xpath = "//a[@href='/tree/applications-of-binary-trees/']")
	WebElement treeBinaryApp;
	@FindBy(xpath = "//a[@href='/tree/binary-search-trees/']")
	WebElement treeBinarysearch;
	@FindBy(xpath = "//a[@href='/tree/implementation-of-bst/']")
	WebElement treebstImpl;
	
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere;
	@FindBy(xpath = "//textarea[@autocorrect='off']")
	WebElement codearea;
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement run;

	// Initialize the page objects
	public treePage() {
			
			PageFactory.initElements(driver, this);
			this.js = (JavascriptExecutor)Baseclass.driver;
		}

	public HomePageobjects treeValidation(String code) throws InterruptedException {

		Thread.sleep(1000);
		treeOverview.click();
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		js.executeScript("arguments[0].scrollIntoView();", treeTerm);
		// js.executeScript("window.scrollBy(0,-400)","");
		Thread.sleep(3000);

		treeTerm.click();
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		treeTypes.click();
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
		
		treeTraversal.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		treeIllustration.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		treeBinary.click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		treeBinaryTypes.click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		treePythonImpl.click();
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
		
		treeBinaryTraversal.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		treeBinaryImpl.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		treeBinaryApp.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		treeBinarysearch.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		treebstImpl.click();
		js.executeScript("window.scrollBy(0,500)");
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
