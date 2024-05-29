package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ciraconnect.pages.FulfillmentQueuePage;
import ciraconnect.pages.StatementApprovalQueuePage;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class StatementApprovalQueuePageTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Statement Approval Queue Page Title", groups = { "Smoke" })
	public void verifyStatementApprovalQueueURL() 
	{
		LoggerManager.info("Verifying Statement Approval Queue Page Title");

		statementApprovalQueuePage = loginPage.verifyStatementApprovalQueuePage(username, password);
		statementApprovalQueuePage.StatementApprovalQueuePageLanding();
	}
	
	
	  @Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups
	  = { "functional" }) public void verifyToolbarFullScreenOption() {
	  statementApprovalQueuePage.ToolBarFullScreen(); }
	  
	  @Test(priority = 2, description = "Verify Toolbar Normal Screen option",groups = { "functional" }) 
	  public void verifyToolBarNormalScreenOption() {
	  statementApprovalQueuePage.ToolBarNormalScreen(); }
	  
	  
	  @Test(priority = 3, description = "Verify Search Approvals Tab", groups = { "functional" })
	  public void verifySearchApprovalsTab() 
	  {
		  statementApprovalQueuePage.SearchApprovalTabClick();
	  }
	  
	  @Test(priority = 4, description = "Verify Select Date Type", groups = { "functional" })
	  public void verifyDateTypeDropdown() 
	  {
		  try 
		  {
			statementApprovalQueuePage.DateTypeDropdown1();
		  } 
		  catch (Exception e) 
		  {
			e.printStackTrace();
		  }
	  }
	  
	  @Test(priority = 5, description = "Verify Select Begin Date", groups = { "functional" })
	  public void verifyBeginDateDropdown() 
	  {
		  try 
		  {
			statementApprovalQueuePage.BeginDateDropdown();
		  } 
		  catch (Exception e) 
		  {
			e.printStackTrace();
		  }
		  
		  
	  }
	  
	  @Test(priority = 6, description = "Verify Logs Tab", groups = { "functional" })
	  public void verifyLogsColumn() 
	  {
		  statementApprovalQueuePage.LogsClick();
	  }
	  
	 @Test(priority = 7, description = "Verify Close Button", groups = { "functional" })
	  public void verifyCloseButton() 
	  {
		  statementApprovalQueuePage.CloseButtonClick();
	  }
	  
	 @Test(priority = 8, description = "Verify Statement PDF Tab", groups = { "functional" })
	  public void verifyStatementColumn() 
	  {
		  statementApprovalQueuePage.StatementColumnPDFClick();
	  }
	  
	 @Test(priority = 9, description = "Verify ErrorClose Button", groups = { "functional" })
	  public void verifyErrorCloseButton() 
	  {
		  statementApprovalQueuePage.ErrorCloseClick();
	  }
	  
	 @Test(priority = 10, description = "Verify LocationColumn", groups = { "functional" })
	  public void verifyLocationSearch() 
	  {
		  statementApprovalQueuePage.LocationColumnClick();
	  }
	 
	 /*@Test(priority = 11, description = "Verify Run ID Column", groups = { "functional" })
	  public void verifyRunIDClick() 
	  {
		  statementApprovalQueuePage.RunIDClick();
	  }*/
	 
	 
	 @Test(priority = 12, description = "Verify Clear Button", groups = { "functional" })
	  public void verifyClearButton() 
	  {
		  statementApprovalQueuePage.ClearButtonClick();
	  }
	 
	 
	  @Test(priority = 13, description = "Verify Statement Runs Tab", groups = { "functional" })
	  public void verifyStatementRunsTab() 
	  {
		  statementApprovalQueuePage.StatementRunsTabClick();
	  }
	  
	  
	  
	  
	  
	  
	  
}
