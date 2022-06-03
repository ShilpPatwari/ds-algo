package com.dsAlgo.pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static Properties prop; //global var
	public static WebDriver driver; // class level driver used inside child classes too

	//constructor  https://www.youtube.com/watch?v=LxJzeiTQGoE&list=PLFGoYjJG_fqq6cHeqfsDes3pdVh3kpl74&index=2
	public Baseclass() {

        // initializing the properties var 		
		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"C:/Users/patwa/Selenium_Training/dsAlgoProject/src/main/java/com/dsAlgo/util/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public static void initialization() {

		// read the properties from prop file
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			//initializing the class level driver
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("gecko")) {

		//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\patwa\\Documents\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else {
			System.out.println("Browser is not available");
		}

		// maximize the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // new selenium version command
		

		// Launch the browser
		driver.get(prop.getProperty("url"));
		
	}
	
	public static void commonwebLocators() {
		
		driver.findElement(By.xpath(prop.getProperty("tryhere"))).click();
		driver.findElement(By.xpath(prop.getProperty("codearea"))).sendKeys(prop.getProperty("code"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(prop.getProperty("run"))).click();
		
	}

}
