package ciraconnect.boardmember;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ciraconnect.utilities.LoggerManager;

public class BoardMemberPage {

	protected WebDriver driver;

	public Boolean blnLogin = false;

	WebDriverWait wait;
	
	public BoardMemberPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		LoggerManager.debug("======== Initializing the Home Page Objects ======== ");

	}
	
 
}

