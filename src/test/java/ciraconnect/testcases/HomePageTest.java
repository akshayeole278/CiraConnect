package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class HomePageTest extends TestBase {

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	@Test(priority = 0, description = "Verify HomePage", groups = { "Functional" })
	public void verifyHomePageSearch() {
		LoggerManager.info("Verifying HomePage");
		
		homePage = loginPage.verifyHomePage(username, password);

//		homePage.clickCommunity();


	}
	
}
