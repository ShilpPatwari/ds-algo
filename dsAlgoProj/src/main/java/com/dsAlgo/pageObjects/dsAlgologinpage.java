package com.dsAlgo.pageObjects;

//import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.util.dsScreenshots;

public class dsAlgologinpage extends Baseclass{

  	
	// Initialize the page objects
	// constructor
	public dsAlgologinpage() {
		
		PageFactory.initElements(driver, this);//this driver coming from base class. this driver initializes all the pageobjects
	// here this- means pointing to the current class object
	}
	
	// Step 1: Define the WebElements Page Factory - Object repository
	
	@FindBy(xpath = "//a[@href='/login']") WebElement Signin;
//	@FindBy(xpath = "//input[@name='username']") WebElement Uname;
	@FindBy(name="username") WebElement Uname;
//	@FindBy(xpath = "//input[@name='password']") WebElement Pword;
	@FindBy(name="password") WebElement Pword;
	@FindBy(xpath ="//input[@value='Login']") WebElement enterLogin;
	
	
	//Step 2: perform actions
	
	public HomePageobjects loginValidation(String uname, String pass) throws InterruptedException, Exception {
		
		Signin.click();
		Thread.sleep(2000);
		Uname.sendKeys(uname);
		Pword.sendKeys(pass);
		dsScreenshots.CaptureScreenshot(driver, "Img1.png");
		enterLogin.click();
		return new HomePageobjects();//login page is the landing page of home page
	}
	
}
