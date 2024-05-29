package ciraconnect.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class ProjectsTasksPageTest extends TestBase{
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	@Test(priority = 0, description = "Verify HomePage Title", groups = { "Smoke" })
	public void verifyProjectsTasksPageURL() {

		LoggerManager.info("Verifying Project Task Page");

		projectsTasksPage = loginPage.verifyProjectsTaskPage(username, password);
		
		projectsTasksPage.clickProjectsTaskMenu();
		

		
		String expectedURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/projects-tasks";
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
		
	}
	
	/*
	 * @Test(priority = 1, description = "Verify HomePage Title", groups = {
	 * "Functional" }) public void verifyAddProjectsTasks() {
	 * 
	 * 
	 * projectsTasksPage.addProjectsTask();
	 * 
	 * }
	 */
	
	@Test(priority = 2, description = "Help button ", groups = { "Functional" })
	public void VerifyProjectsTaskshelpIcon() 
	{
		LoggerManager.info("Verifying Project Task Help");
		projectsTasksPage.VerifyProjectsTaskshelpIcon();
		
	}


}
