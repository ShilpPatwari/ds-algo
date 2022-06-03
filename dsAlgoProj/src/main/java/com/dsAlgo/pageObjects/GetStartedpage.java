package com.dsAlgo.pageObjects;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedpage extends Baseclass{
	
	//static WebDriver driver;
	
	public GetStartedpage() {
		
	//	this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	// Step 1
	@FindBy(xpath = "//button[text()='Get Started']") WebElement start;
	
	
	// Step 2
	public void clickStart() {
		
		// click the Get Started button to enter
		start.click();
	}
	

}
