package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class PreferencesPageTest extends TestBase {

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	@Test(priority = 0, description = "Verify Preferences", groups = { "Functional" })
	public void clickPreferences() {
		LoggerManager.info("Verifying Preferences");
		preferencePage = loginPage.verifyPreferencesPage(username, password);
		
		preferencePage.clickPreferences();

	}
	
}
