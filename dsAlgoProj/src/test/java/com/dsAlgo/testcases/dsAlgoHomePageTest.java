package com.dsAlgo.testcases;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.dsAlgo.dataProviders.DataProvider1;
import com.dsAlgo.pageObjects.ArrayPage;
import com.dsAlgo.pageObjects.Baseclass;
import com.dsAlgo.pageObjects.GetStartedpage;
import com.dsAlgo.pageObjects.HomePageobjects;
import com.dsAlgo.pageObjects.QueuePage;
import com.dsAlgo.pageObjects.dataStructurepage;
import com.dsAlgo.pageObjects.dsAlgologinpage;
import com.dsAlgo.pageObjects.linkedListPage;
import com.dsAlgo.pageObjects.stackPage;

public class dsAlgoHomePageTest extends Baseclass {
	
	dsAlgologinpage dslogin;
	GetStartedpage started;
	HomePageobjects homePage;
	dataStructurepage dspage;
	ArrayPage arrayPage;
	linkedListPage linkPage;
	stackPage stPage;
	QueuePage qPage;

	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Sparkreport.html");

	public dsAlgoHomePageTest() {

		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		dslogin = new dsAlgologinpage();
		started = new GetStartedpage();
		homePage = new HomePageobjects();
		dspage = new dataStructurepage();
		arrayPage = new ArrayPage();
		linkPage = new linkedListPage();
		stPage = new stackPage();
		qPage = new QueuePage();

		//setting the theme and title of the report
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("dsAlgo project report");
		extent.attachReporter(spark);
	}

	@Test(priority = 0, dataProvider = "ExcelProvider1", dataProviderClass = DataProvider1.class)
	public void login(String uname, String pwd) throws Exception {

	// who is the author of test: what type of test: In which device the test is launched
		
		ExtentTest test = extent.createTest("Launch the website and validate login module").assignAuthor("Shilpa")
				.assignCategory("Smoke test").assignDevice("Windows");
		test.log(Status.PASS,"Launch the browser and Website");
		started.clickStart();
		Thread.sleep(3000);
		// logging extent logs
		// test.log(String,String) is used
		test.log(Status.PASS, "User entered login credentials");
		dslogin.loginValidation(uname, pwd);
		// test.pass(String) is used
		test.pass("Login into Homepage");
		Thread.sleep(3000);
	}

	@Test(priority = 1, dataProvider = "ExcelProvider2", dataProviderClass = DataProvider1.class)
	public void dsValidation(String code) throws Exception {

		ExtentTest test = extent.createTest("Validate DataStructure module").assignAuthor("Karthik")
				.assignCategory("Functional Test").assignDevice("MAC");
		test.info("Extract the homepage title ");
		String pageTitle = driver.getTitle();
		test.info("The homepage titile is : "+pageTitle);
		
// select equals but not contentEquals. contentEquals compare only partial string and pass the condition
		
		if(pageTitle.equals("NumpyNinja"))
		{
			test.pass("Page Title is verified : title captured "+pageTitle);
		}else {
			test.fail("Page Title is not matched : "+pageTitle);
		}
		
		homePage.clickDatastructure();
		Thread.sleep(2000);
		test.log(Status.PASS, "Enter python code for DataStructure");
		dspage.dataStructureValidation(code);
		Thread.sleep(2000);
		// test.pass(String) is used
		test.pass("Python code is validated");
		test.info("User is redirected to Home page");
	//	test.fail("Unable to login");
	//	test.warning("Reset password");
	}

	@Test(priority = 2, dataProvider = "ExcelProvider2", dataProviderClass = DataProvider1.class)
	public void arrayValidation(String code) throws Exception {

		ExtentTest test = extent.createTest("Validate Array module");
		homePage.clickArray();
		Thread.sleep(2000);
		test.log(Status.PASS, "Enter python code Array");
		arrayPage.arrayValidation(code);
		Thread.sleep(2000);
		test.pass("Python code is validated Array");
		test.info("User is redirected to Home page");
	}

	@Test(priority = 3, dataProvider = "ExcelProvider2", dataProviderClass = DataProvider1.class)
	public void linkedListValidation(String code) throws Exception {

		ExtentTest test = extent.createTest("Validate Linkedlist module");
		homePage.clickLinkedList();
		Thread.sleep(2000);
		test.log(Status.PASS, "Enter python code for Linkedlist");
		linkPage.linkedListValidation(code);
		Thread.sleep(2000);
		test.pass("Python code is validated for Linkedlist");
		test.info("User is redirected to Home page");	
	//	test.fail("Reports getting crashed");
	}

	@Test(priority = 4, dataProvider = "ExcelProvider2", dataProviderClass = DataProvider1.class)
	public void stValidation(String code) throws Exception {

		ExtentTest test = extent.createTest("Validate Stack module");
		homePage.clickStack();
		Thread.sleep(2000);
		test.log(Status.PASS, "Enter python code for Stack");
		stPage.stackValidation(code);
		Thread.sleep(2000);
		test.pass("Python code is validated for Stack");
		test.info("User is redirected to Home page");
	//	test.skip("Skip the Stack module");
	}

	@Test(priority = 5, dataProvider = "ExcelProvider2", dataProviderClass = DataProvider1.class)
	public void qValidation(String code) throws Exception {

		ExtentTest test = extent.createTest("Validate Queue module");
		homePage.clickQueue();
		Thread.sleep(2000);
		test.log(Status.PASS, "Enter python code for Queue");
		qPage.queueValidation(code);
		Thread.sleep(2000);
		test.pass("Python code is validated for Queue");
		test.info("User is redirected to Home page");
		
	}
	
	
	//inorder to skip a test throw a skip exception
	@Test
	public void skipTest() {
		
		throw new SkipException("Skipping the test");
	}

	@AfterTest
	public void tearDown() throws InterruptedException {

		// homePage.signOut();
	//this method is used to add the contents to html reports	
		extent.flush();
		//Thread.sleep(2000);
		driver.quit();
	}

	
	

}
