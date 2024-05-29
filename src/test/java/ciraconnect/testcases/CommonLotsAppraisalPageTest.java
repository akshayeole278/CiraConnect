package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class CommonLotsAppraisalPageTest extends TestBase{
	
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	@Test(priority = 0, description = "Verify Work Orders Page Title", groups = { "Smoke" })
	public void verifyWorkOrdersPageURL() {

		LoggerManager.info("Verifying Work Orders Page Title");

		commonLotsAppraisalPage = loginPage.verifyCommonLotsAppraisalPage(username, password);
		commonLotsAppraisalPage.CommonLotsAppraisalPageLanding();

	}
	
	// Add New Common Lot popup and save
	
	@Test(priority = 1, description = "Verify Add New Common Lot Button", groups = { "Functional" })
	public void verifyAddCommonLotClick() {
		
		commonLotsAppraisalPage.clickAddNewCommonLot();
		
		// Add New Common Lot pop up is displayed. Set the focus on the pop up.
		// Need to switch the focus on the popup.
		
	}
	
	@Test(priority = 2, description = "Verify Common Lot dropdown", groups = { "Functional" })
	public void verifyCommonLotDropdownClick() {
		
		commonLotsAppraisalPage.clickEditCommonLot();
		
	}
}
