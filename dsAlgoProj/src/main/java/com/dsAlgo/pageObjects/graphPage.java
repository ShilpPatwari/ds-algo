package com.dsAlgo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class graphPage extends Baseclass{

	JavascriptExecutor js;

	@FindBy(xpath = "//a[@href='graph']")
	WebElement graph;
	@FindBy(xpath = "//a[@href='/graph/graph-representations/']")
	WebElement graphRep;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere;
	@FindBy(xpath = "//textarea[@autocorrect='off']")
	WebElement codearea;
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement run;

	// Initialize the page objects
	@SuppressWarnings("static-access")
	public graphPage() {
			
			PageFactory.initElements(driver, this);
			this.js = (JavascriptExecutor)this.driver;
		}

	public HomePageobjects graphValidation(String code) throws InterruptedException {

		Thread.sleep(1000);
		graph.click();
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		js.executeScript("arguments[0].scrollIntoView();", graphRep);
		// js.executeScript("window.scrollBy(0,-400)","");
		Thread.sleep(3000);

		graphRep.click();
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
	  // driver.navigate().back();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		
		return new HomePageobjects();
	}
	
}
