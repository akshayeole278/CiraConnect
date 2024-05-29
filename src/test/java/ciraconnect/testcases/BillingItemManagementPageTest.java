package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class BillingItemManagementPageTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Billing Item Management Page Title", groups = { "Smoke" })
	public void VerifybillingItemManagementURL() {

		LoggerManager.info("Verifying Billing Item Management Page Title");

		billingItemManagementPage = loginPage.verifyBillingItemManagementPage(username, password);
		billingItemManagementPage.BillingItemMangementpageLanding();
	}

	@Test(priority = 1, description = "Verify Customer Grid Count ", groups = { "functional" })
	public void verifyCustomerGridCountloading()
	{
		billingItemManagementPage.verifyCustomerGridCount();

	}

	@Test(priority = 2, description = "Verify Add Button Click", groups = { "functional" })
	public void verifyaddBillingItem()
	{
		billingItemManagementPage.addBillingItem();
	}

	@Test(priority = 3, description = "Verify Action Edit Option", groups = { "functional" })
	public void verifyActionEditOption()
	{
		billingItemManagementPage.verifyActionEdit();
	}


	@Test(priority = 4, description = "Verify Action Delete No Option", groups = { "functional" })
	public void verifyActionDeleteNoOption()
	{
		billingItemManagementPage.verifyActionDeleteNo();
	}


	@Test(priority = 5, description = "Verify Action Delete Yes Option", groups = { "functional" })
	public void verifyActionDeleteYesOption()
	{
		billingItemManagementPage.verifyActionDeleteYes();
	}

	@Test(priority = 6, description = "Verify Expand and Click Option", groups = { "functional" })
	public void verifyExpandOptionClick()
	{
		billingItemManagementPage.expandOptionClick();
	}


	@Test(priority = 7, description = "Verify Column Chooser Option", groups = { "functional" })
	public void verifycolumnChooserClick()
	{
		billingItemManagementPage.columnChooserClick();

	}

	@Test(priority = 8, description = "Verify Toolbar and Full Screen Option", groups = { "functional" })
	public void VerifyToolBarFullScreen()
	{
		billingItemManagementPage.ToolBarFullScreen();
	}

	@Test(priority = 9, description = "Verify Export To Excel Option", groups = { "functional" })
	public void verifyExportToExcelDownload()
	{
		billingItemManagementPage.verifyExportToExcel();
	}

	@Test(priority = 10, description = "Verify Import Button Click", groups = { "functional" })
	public void VerifyImportButton()
	{
		billingItemManagementPage.VerifyImport();
	}


}
