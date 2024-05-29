package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class NewARPaymentTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify New AR Payment", groups = { "Smoke" })
	public void verifyNewARPaymentPageURL() throws InterruptedException 
	{

		LoggerManager.info("Verifying New AR Payment Page Title");
		newARPaymentPage = loginPage.verifyNewARPaymentPageURL(username, password);
		newARPaymentPage.NewARPaymentPageLanding();
	} 
}


