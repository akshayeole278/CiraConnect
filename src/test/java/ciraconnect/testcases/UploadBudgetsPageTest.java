package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import ciraconnect.pages.FulfillmentQueuePage;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class UploadBudgetsPageTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Upload Budgets Page Title", groups = { "Smoke" })
	public void verifyUploadBudgetsPageURL() throws InterruptedException 
	{
		LoggerManager.info("Verifying Upload Budgets Page Title");

		UploadBudgets = loginPage.verifyUploadBudgetsPage(username, password);
		UploadBudgets.UploadBudgetsPageLanding();
	}
	
	@Test(priority = 1, description = "Verify Upload_Budgets Page fields", groups = { "functional" })
	public void verifyUpload_BudgetsPage() throws InterruptedException, AWTException, IOException 
	{

		LoggerManager.info("Verifying Upload_Budgets Page");
		UploadBudgets.verifyUploadBudgetsPage();
		
	} 

	
	
}
