package com.dsAlgo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class stackPage extends Baseclass {

	JavascriptExecutor js;

	@FindBy(xpath = "//a[@href='operations-in-stack']")
	WebElement stackOperations;
	@FindBy(xpath = "//a[@href='/stack/implementation/']")
	WebElement stackImplement;
	@FindBy(xpath = "//a[@href='/stack/stack-applications/']")
	WebElement stackApp;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere;
	@FindBy(xpath = "//textarea[@autocorrect='off']")
	WebElement codearea;
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement run;

	// Initialize the page objects
	@SuppressWarnings("static-access")
	public stackPage() {
			
			PageFactory.initElements(driver, this);
			this.js = (JavascriptExecutor)this.driver;
		}

	public HomePageobjects stackValidation(String code) throws InterruptedException {

		stackOperations.click();
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		tryhere.click();
		// Thread.sleep(2000);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		run.click();
		Thread.sleep(2000);
		driver.navigate().back();
		js.executeScript("arguments[0].scrollIntoView();", stackImplement);
		// js.executeScript("window.scrollBy(0,-400)","");
		Thread.sleep(3000);

		stackImplement.click();
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

		stackApp.click();
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
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		return new HomePageobjects();
	}
}
