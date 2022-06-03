package com.dsAlgo.pageObjects;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.annotations.Test;

public class registerpage extends Baseclass{

  //  static WebDriver driver;
	
	public registerpage() {
		
  //	this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/register']") WebElement Register;
	@FindBy(xpath = "//input[@name='username']") WebElement Uname;
	@FindBy(xpath = "//input[@name='password1']") WebElement Password1;
	@FindBy(xpath = "//input[@name='password2']") WebElement confirmpassword;
	@FindBy(xpath ="//input[@value='Register']") WebElement enterRegister;
	
   	public void registerValidation(String uname, String password, String confirmPass) throws Exception {
		
		Register.click();
		//Enter the value for username
		Assert.assertTrue(Uname.isDisplayed());
		Uname.sendKeys(uname);
		
		String s = Uname.getAttribute("value");
	//	String p = password.getA
		if(s.isEmpty()) {
			System.out.println("Username textbox is empty");
		}
		else {
			System.out.println("Username entered");
		}
		Thread.sleep(2000);
		//Assert.assertThat("Field should not be empty", Uname.getAttribute("value"), isEmptyString());
		//Enter the value for password
		Assert.assertTrue(Password1.isDisplayed());
		Password1.sendKeys(password);
		//Enter the value for password
		Assert.assertTrue(confirmpassword.isDisplayed());
		Thread.sleep(2000);
		confirmpassword.sendKeys(confirmPass);
		// Click the login button
		enterRegister.click();
		
		
	}
	
	
}
