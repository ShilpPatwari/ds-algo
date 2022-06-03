package com.dsAlgo.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.dsAlgo.dataProviders.DataProvider1;
import com.dsAlgo.pageObjects.Baseclass;
import com.dsAlgo.pageObjects.GetStartedpage;
import com.dsAlgo.pageObjects.registerpage;

public class dsAlgoregisterTest extends Baseclass{
	
	registerpage dsregister;
	GetStartedpage started;
	
   public dsAlgoregisterTest() {
		
		super();
	}
	
	@BeforeTest
	public void setUp() {
		
		initialization();
		started = new GetStartedpage();
		dsregister = new registerpage();
	}
	
   	  @Test(priority=0,dataProvider ="ExcelRegister",dataProviderClass = DataProvider1.class)
		public void registration(String username, String password, String confirmPass) throws Exception {
			
			started.clickStart();
			Thread.sleep(3000);
			dsregister.registerValidation(username,password,confirmPass);
			Thread.sleep(3000);
		}
  
}
