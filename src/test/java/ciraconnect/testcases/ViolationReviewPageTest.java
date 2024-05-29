package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import ciraconnect.pages.ViolationReviewPage;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class ViolationReviewPageTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Violation Review Page Title", groups = { "Smoke" })
	public void verifyViolationReviewURL() 
	{
		LoggerManager.info("Verifying Violation Review Page Title");

		violationReviewPage = loginPage.verifyViolationReviewPage(username, password);
		violationReviewPage.ViolationReviewPageLanding();
	}
	 
	
	  @Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups
	  = { "functional" }) public void verifyToolbarFullScreenOption() {
		  violationReviewPage.ToolBarFullScreen(); }
	  
	  @Test(priority = 2, description = "Verify Toolbar Normal Screen option",groups = { "functional" }) 
	  public void verifyToolBarNormalScreenOption() {
		  violationReviewPage.ToolBarNormalScreen(); }
	 
	  
	  @Test(priority= 3, description= "Verify Violation History Popup", groups= {"functional"})
	  public void verifyViolationInspectionHistoryPopup() {
		  violationReviewPage.ViolationInspectionHistoryPopup();}
	  
	  @Test(priority= 4, description= "Verify Approve Button on the Popup", groups= {"functional"})
	  public void verifyApproveButton() {
		  violationReviewPage.ApproveButton();}
	  
	  @Test(priority= 5, description= "Verify No Button on the Popup", groups= {"functional"})
	  public void verifyNoButton() {
		  violationReviewPage.NoButton();}
	  
	  @Test(priority= 6, description= "Verify Violation Notes Text Area is editable", groups= {"functional"})
	  public void verifyViolationNotesTextArea() {
		  violationReviewPage.ViolationNotesTextArea();}
	  
	  @Test(priority= 7, description= "Verify Images", groups= {"functional"})
	  public void verifyImagesColumn() {
		  violationReviewPage.ImagesColumn();}
	  
	  @Test(priority= 8, description= "Verify Close Button", groups= {"functional"})
	  public void verifyCloseButton() {
		  violationReviewPage.CloseButton();}
	  
	  @Test(priority= 9, description= "Verify Logs Column", groups= {"functional"})
	  public void verifyLogsColumn() {
		  violationReviewPage.LogsColumn();}
	  
	  @Test(priority= 10, description= "Verify LogsClose Button", groups= {"functional"})
	  public void verifyLogsCloseButton() {
		  violationReviewPage.LogsCloseButton();}
	  
	  @Test(priority= 11, description= "Verify PopupClose Button", groups= {"functional"})
	  public void verifyPopupCloseButton() {
		  violationReviewPage.PopupCloseButton();}
	  
	  
	  
	  
}
