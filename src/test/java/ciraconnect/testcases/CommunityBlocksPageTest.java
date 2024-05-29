package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class CommunityBlocksPageTest  extends TestBase


{
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Closing Requests Page Title", groups = { "Smoke" })
	public void VerifyclosingRequeststURL() {

		LoggerManager.info("Verifying Closing Request Page Title");

		communityBlocksPage = loginPage.verifyCommunityBlocksPage(username, password);
		communityBlocksPage.CommunityBlocksPageLanding();
	}


	@Test(priority = 1, description = "Verify Closing Requests Page Title", groups = { "functional" })
	public void VerifycolumnChooserClick() {

		LoggerManager.info("Verifying Column chooser");


		communityBlocksPage.columnChooserClick();
	}

	@Test(priority = 2, description = "Verify Toolbar and Full Screen Option", groups = { "functional" })
	public void VerifyToolBarFullScreen()
	{
		communityBlocksPage.ToolBarFullScreen();
	}

	@Test(priority = 3, description = "Verify Export To Excel Option", groups = { "functional" })
	public void verifyExportToExcelDownload()
	{
		communityBlocksPage.verifyExportToExcel();
	}

	@Test(priority = 4, description = "Verify Expand and Click Option", groups = { "functional" })
	public void verifyExpandOptionClick()
	{
		communityBlocksPage.expandOptionClick();
	}


	@Test(priority = 5, description = "Verify Switching Tabs", groups = { "functional" })
	public void VerifySwitchingTabs()
	{
		communityBlocksPage.SwitchingTabs();
	}

	@Test(priority = 6, description = "Verify Add Block Button", groups = { "functional" })
	public void verifyAddBlock()
	{
		communityBlocksPage.AddBlock();
	}

	@Test(priority = 7, description = "Verify Edit Button", groups = { "functional" })
	public void verifyActiveEditButtonoption()
	{
		communityBlocksPage.verifyActiveEditButton();
	}

	@Test(priority = 8, description = "Verify Expire Edit Button", groups = { "functional" })
	public void verifyExpiredEditButtonoption()
	{
		communityBlocksPage.verifyExpiredEditButton();
	}


	@Test(priority = 9, description = "Verify Community Filter", groups = { "functional" })
	public void verifyCommunityFilteroption()
	{
		communityBlocksPage.verifyCommunityFilter();
	}





}
