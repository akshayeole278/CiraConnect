package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class TimeandExpensePageTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Resident Contact Logs", groups = { "Smoke" })
	public void verifyTimeandExpensePageURL() 
	{

		LoggerManager.info("Verifying Resident Contact Logs Page Title");
		timeandExpensePage = loginPage.verifyTimeandExpensePage(username, password);
		timeandExpensePage.TimeandExpensePageLanding();
	} 
	@Test(priority =3 , description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyRealManageDropdown() 
	{

		LoggerManager.info("Verifying Real Manage Dropdown");
		timeandExpensePage.RealManageDropdown();
	} 
	
	@Test(priority = 1, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyCiraManagementDropdown() 
	{

		LoggerManager.info("Verifying Real Manage Dropdown");
		timeandExpensePage.CiraManagementDropdown();
	} 
	 
	
	@Test(priority = 2, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyGrandManorsDropdown() 
	{

		LoggerManager.info("Verifying Real Manage Dropdown");
		timeandExpensePage.GrandManorsDropdown();
	} 
	
	@Test(priority = 4, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyTabSwitchingTimeandGeneralExpense() 
	{

		LoggerManager.info("Verifying Real Manage Dropdown");
		timeandExpensePage.TabSwitchingTimeandGeneralExpense();
	} 
	
	
	@Test(priority = 5, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyTabSwitchingGeneralExpenseandMileageExpense() 
	{

		LoggerManager.info("Verifying Real Manage Dropdown");
		timeandExpensePage.TabSwitchingGeneralExpenseandMileageExpense();
	} 
	
	@Test(priority = 6, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyTabSwitchingMileageExpenseandTime() 
	{

		LoggerManager.info("Verifying Real Manage Dropdown");
		timeandExpensePage.TabSwitchingMileageExpenseandTime();
	} 
	@Test(priority = 7, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyNewTimeEntrySaveButton() 
	{

		timeandExpensePage.NewTimeEntrySaveButton();
	} 
	
	 @Test(priority = 8, description = "Verify Real Manage Dropdown", groups = { "functional" })
		public void verifyNewTimeEntryActionCopyButton() 
		{

			timeandExpensePage.NewTimeEntryActionCopyButton();
		} 
	
	
	@Test(priority = 9, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyNewTimeEntryActionCreateMileageExpenseButton() 
	{

		timeandExpensePage.NewTimeEntryActionCreateMileageExpenseButton();
	} 
	
	@Test(priority = 10, description = "Verify Real Manage Dropdown", groups = { "functional" })
		public void verifyNewTimeEntryActionDeleteButton() 
		{

			timeandExpensePage.NewTimeEntryActionDeleteButton();
		} 
	@Test(priority = 11, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyMyPlacesActionEdit() 
	{

		timeandExpensePage.MyPlacesActionEdit();
	} 
	
	@Test(priority = 12, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifySubmitForApprovalCancelButton() 
	{

		timeandExpensePage.SubmitForApprovalCancelButton();
	} 
	
	
	@Test(priority = 13, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifySubmitForApprovalSubmitButton() 
	{

		timeandExpensePage.SubmitForApprovalSubmitButton();
	} 
	
	
	@Test(priority = 14, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyCustomerDropdown() 
	{

		timeandExpensePage.CustomerDropdown();
	} 
	
	@Test(priority = 15, description = "Verify Real Manage Dropdown", groups = { "functional" })
	public void verifyFromToDropdown() 
	{

		timeandExpensePage.FromToDropdown();
	}
}


