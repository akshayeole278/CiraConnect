package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;


public class PropertyConveyanceWorkQueuePageTest extends TestBase{
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Property Coveyance Work Queue Page Title", groups = { "Smoke" })
	public void verifyPropertyConveyanceWorkQueuePageURL() {

		LoggerManager.info("Verifying Property Conveyance Work Queue Page Title");

		propertyConveyanceWorkQueuePage = loginPage.verifyPropertyConveyanceWorkQueuePage(username, password);
		propertyConveyanceWorkQueuePage.PropertyConveyanceWorkQueuePageLanding();
	}

	@Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		propertyConveyanceWorkQueuePage.ToolBarFullScreen();
	}

	@Test(priority = 2, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		propertyConveyanceWorkQueuePage.ToolBarNormalScreen();
	}
	
	@Test(priority = 3, description = "Verify Toolbar - Column Chooser icon click", groups = { "Functional" },alwaysRun=true)
	public void verifyColumnChooserOption() {
		propertyConveyanceWorkQueuePage.columnChooserClick();
	}

	@Test(priority = 4, description = "Verify Toolbar - Expand icon click", groups = { "Functional" })
	public void verifyExpandOption() {
		//assertTrue(propertyConveyanceWorkQueuePage.expandOptionClick(),"Expand icon is not clicked");
		propertyConveyanceWorkQueuePage.expandOptionClick();
	}

   @Test(priority = 5, description = "Verify Edit Community Cancel Button", groups = { "Functional" })
	public void VerifyactionEditCommunityCancel() 
	{
		propertyConveyanceWorkQueuePage.actionEditCommunityCancel();
	}

	@Test(priority = 6, description = "Verify Edit Community Update Button", groups = { "Functional" })
	public void VerifyactionEditCommunityUpdate() 
	{
		propertyConveyanceWorkQueuePage.actionEditCommunityUpdate();
	}
	
	@Test(priority = 7, description = "Verify clear Community  Button", groups = { "Functional" })
	public void VerifyactionClearCommunity() 
	{
		propertyConveyanceWorkQueuePage.actionClearCommunity();
	}
	
	@Test(priority = 8 , description = "Verify Delete Community  Button", alwaysRun=true, groups = { "Functional" })
	public void VerifyactionDeleteCommunity() 
	{
		propertyConveyanceWorkQueuePage.verifyActionDelete();
	}
	
	@Test(priority = 9 , description = "Verify Refresh  Button", groups = { "Functional" })
	public void Verifyrefresh() 
	{
		propertyConveyanceWorkQueuePage.verifyRefreshButton();
	}
	
	
	@Test(priority = 10, description = "Verify Process Property Conveyance Menu and Toggle Compact Mode", alwaysRun=true, groups = { "Functional" })
	public void verifyCompactModeOnPropertyConveyancePopup() {
		propertyConveyanceWorkQueuePage.compactModeToggleOnPropertyConveyancePopup();
	}
	
	@Test(priority = 11, description = "Verify Toggle Completed and Open Tabs", alwaysRun=true, groups = { "Functional" })
	public void verifyToggleCompletedTabOpenTabs() {
		propertyConveyanceWorkQueuePage.toggleCompletedOpenTabClick();
	}
	
	@Test(priority = 12, description = "Verify Search Work Queue button click", alwaysRun=true, groups = { "Functional" })
	public void verifySearchWorkQueueButton() {
		propertyConveyanceWorkQueuePage.searchWorkQueueButtonClick();
	}
	
	@Test(priority = 13 , description = "Verify Process Property conveynance", alwaysRun=true, groups = { "Functional" })
	public void verifyActionProcessPropertyConveyanceCommunity() throws InterruptedException 
	{
		propertyConveyanceWorkQueuePage.verifyActionProcessPropertyConveyance();
	}
}
