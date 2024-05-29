package ciraconnect.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ciraconnect.utilities.LoggerManager;

public class MyWorkInboxPage {

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	public MyWorkInboxPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Closing Requests Page Objects ======== ");


	}
	
	String myWorkInboxURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/mywork-inbox";
	String pageLoader = "//div[@class='dx-loadpanel-indicator dx-loadindicator dx-widget']//div[@class='dx-loadindicator-content'])[2]";

	
	
	

}
