package com.dsAlgo.pageObjects;

//import org.openqa.selenium.By;
//import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.dsAlgo.util.dsScreenshots;

public class dataStructurepage extends Baseclass{

	JavascriptExecutor js;
	
	@FindBy(xpath = "//a[@href='time-complexity']") WebElement timecomplexity;
/*	@FindBy(xpath = "//a[@href='/tryEditor']") WebElement tryhere;
	@FindBy(xpath = "//textarea[@autocorrect='off']") WebElement codearea;
	@FindBy(xpath = "//button[contains(text(),'Run')]") WebElement run;*/

	// Initialize the page objects
	@SuppressWarnings("static-access")
	public dataStructurepage() {
		
		PageFactory.initElements(driver, this);
		this.js = (JavascriptExecutor)this.driver;
	}

	public HomePageobjects dataStructureValidation(String code) throws InterruptedException, Exception {
		
		timecomplexity.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	/*	tryhere.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("tryhere"))).click();
		driver.findElement(By.xpath(prop.getProperty("codearea"))).sendKeys(code);
		codearea.sendKeys(code);
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("run"))).click();
		run.click();*/
		commonwebLocators();
		dsScreenshots.CaptureScreenshot(driver, "Img3.png");
		Thread.sleep(2000);
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
		Thread.sleep(2000);
		return new HomePageobjects();
	}
	
}
