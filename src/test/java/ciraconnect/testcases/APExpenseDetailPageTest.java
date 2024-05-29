package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import ciraconnect.pages.ViolationReviewPage;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class APExpenseDetailPageTest extends TestBase {

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify AP Expense Details Page Title", groups = { "Smoke" })
	public void verifyAPExpenseDetailURL() {
		LoggerManager.info("Verifying AP Expense Details Title");

		apExpenseDetailPage = loginPage.verifyAPExpenseDetailPage(username, password);
		apExpenseDetailPage.APExpenseDetailPageLanding();
	}

	@Test(priority = 1, description = "Verify Community Alert Popup", groups = { "functional" })
	public void verifyCommunityAlertPopup() {
		apExpenseDetailPage.CrossMark();
	}

	@Test(priority = 2, description = "Verify Toolbar Full Screen Option", groups = { "functional" })
	public void verifyToolbarFullScreenOption() {
		apExpenseDetailPage.ToolBarFullScreen();
	}

	@Test(priority = 3, description = "Verify Toolbar Normal Screen option", groups = { "functional" })
	public void verifyToolBarNormalScreenOption() {
		apExpenseDetailPage.ToolBarNormalScreen();
	}
	
	
	@Test(priority = 4, description = "Verify Amount Value is clicked", groups = { "functional" })
	public void verifyAmountClick() {
		apExpenseDetailPage.AmountColumn();
	}
	
	@Test(priority = 5, description = "Verify Reclassify Button", groups = { "functional" })
	public void verifyReclassifyButtonClick() {
		apExpenseDetailPage.ReclassifyButton();
	}
	
	@Test(priority = 6, description = "Verify Close Button on the Error", groups = { "functional" })
	public void verifyErrorCloseButtonClick() {
		apExpenseDetailPage.ErrorCloseButton();
	}
	
	@Test(priority = 7, description = "Verify Right Pane on the Setting", groups = { "functional" })
	public void verifySetting1Click() {
		apExpenseDetailPage.SettingButton();
	}
	
	@Test(priority = 8, description = "Verify Left Pane on the Setting", groups = { "functional" })
	public void verifySetting2Click() {
		apExpenseDetailPage.SettingButton1();
	}
	
	@Test(priority = 9, description = "Verify Internal Notes", groups = { "functional" })
	public void verifyInternalNotes() throws InterruptedException {
		apExpenseDetailPage.InternalNotesIcon();
	}
	
	@Test(priority = 10, description = "Verify Workflow History", groups = { "functional" })
	public void verifyWorkflowHistory() throws InterruptedException {
		apExpenseDetailPage.WorkflowHistoryIcon();
	}
	

}
