package ciraconnect.testcases;

import org.testng.annotations.Test;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class ClosingRequestsPageTest  extends TestBase{
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Closing Requests Page Title", groups = { "Smoke" })
	public void VerifyclosingRequeststURL() {
		LoggerManager.info("Verifying Closing Request Page Title");

		closingRequestsPage = loginPage.verifyClosingRequestsPage(username, password);
		closingRequestsPage.ClosingRequestspageLanding();
	}

	@Test(priority = 1, description = "Verify Assign Property", groups = { "Functional" })
	public void verifyActionAssignPropertyOption() 
	{
		closingRequestsPage.VerifyActionAssignProperty();
	}

	@Test(priority = 2, description = "Verify Fulfill Compact On Option", groups = { "Functional" })
	public void verifyFulfillCompactOnOption() 
	{
		closingRequestsPage.VerifyFulfillCompactOn();
	}

	@Test(priority = 3, description = "Verify Fulfill Compact Off Option", groups = { "Functional" })
	public void verifyFulfillCompactOffOption() 
	{
		closingRequestsPage.VerifyFulfillCompactOff();
	}

	@Test(priority = 4, description = "Verify Action Transfer to Processing", groups = { "Functional" })
	public void verifyActionTransfertoProcessingOption() 
	{
		closingRequestsPage.VerifyActionTransfertoProcessing();
	}

	@Test(priority = 5, description = "Verify Action Transfer to Collection", groups = { "Functional" })
	public void verifyActionTransfertoCollectionsOption() 
	{
		closingRequestsPage.VerifyActionTransfertoCollections();
	}

	@Test(priority = 6, description = "Verify Action Transfer to Transition", groups = { "Functional" })
	public void verifyActionTransfertoTransitionOption() 
	{
		closingRequestsPage.VerifyActionTransfertoTransition();
	}

	@Test(priority = 7, description = "Verify Action cancel request", groups = { "Functional" })
	public void ActionCancleRequestOption() 
	{
		closingRequestsPage.ActionCancelRequest();
	}

	@Test(priority = 8, description = "Verify Request Type Filter", groups = { "Functional" })
	public void VerifyRequestTypeFilter() 
	{
		closingRequestsPage.RequestTypeFilter();
	}

	@Test(priority = 9, description = "Verify Search Button", groups = { "Functional" })
	public void verifySearchButton() 
	{
		closingRequestsPage.SearchButton();
	}

	@Test(priority = 10, description = "Verify Switching Tab", groups = { "Functional" })
	public void VerifySwitchingTabs() 
	{
		closingRequestsPage.SwitchingTabs();
	}

	@Test(priority = 11, description = "Verify Search Tab", groups = { "Functional" })
	public void VerifySearchTab() 
	{
		closingRequestsPage.SearchTab();
	}

	@Test(priority = 12, description = "Verify Toolbar and Full Screen", groups = { "Functional" })
	public void VerifyToolBarFullScreen() 
	{
		closingRequestsPage.ToolBarFullScreen();
	}
}