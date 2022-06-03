package com.dsAlgo.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsAlgo.util.dsScreenshots;

public class HomePageobjects extends Baseclass {

	// Defining the WebElements
	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement datastructureLink;
	@FindBy(xpath = "//a[@href='array']")
	WebElement arrayLink;
	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement linkedlistLink;
	@FindBy(xpath = "//a[@href='stack']")
	WebElement stackLink;
	@FindBy(xpath = "//a[@href='queue']")
	WebElement queueLink;
	@FindBy(xpath = "//a[@href='tree']")
	WebElement treeLink;
	@FindBy(xpath = "//a[@href='graph']")
	WebElement graphLink;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement Signin;
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement Signout;

	// Initializing the page objects
	public HomePageobjects() {

		PageFactory.initElements(driver, this);
	}

	public dataStructurepage clickDatastructure() throws Exception {

		dsScreenshots.CaptureScreenshot(driver, "Img2.png");
		datastructureLink.click();
		Thread.sleep(2000);
		return new dataStructurepage();
	}

	public ArrayPage clickArray() throws Exception {

		arrayLink.click();
		Thread.sleep(2000);
		return new ArrayPage();
	}

	public linkedListPage clickLinkedList() throws Exception {

		linkedlistLink.click();
		Thread.sleep(2000);
		return new linkedListPage();
	}

	public stackPage clickStack() throws Exception {

		stackLink.click();
		Thread.sleep(2000);
		return new stackPage();
	}

	public QueuePage clickQueue() throws Exception {

		queueLink.click();
		Thread.sleep(2000);
		return new QueuePage();
	}

	public treePage clickTree() throws Exception {

		treeLink.click();
		Thread.sleep(2000);
		return new treePage();
	}

	public graphPage clickGraph() throws Exception {

		graphLink.click();
		Thread.sleep(2000);
		return new graphPage();
	}

	public void signOut() {

		Signout.click();
	}

}
