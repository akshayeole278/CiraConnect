package ciraconnect.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import ciraconnect.utilities.LoggerManager;
import org.openqa.selenium.interactions.Actions;

//Every line of code that runs in Java must be inside a class
public class APExpenseDetailPage {
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	// Initializing the Page Objects:
	public APExpenseDetailPage(WebDriver driver) {
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	// URL of the sandbox
	String APExpenseDetailURL = "https://sandbox.ciranet.com/v2/managementportal/cb/730/ap/expensedetail";

	// Loading progress xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";
	// Initializing the Page Objects
	@FindBy(xpath = "//div[@title=\"Fullscreen View\"]")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//div[@title=\"Normal View\"]")
	WebElement normalScreenIcon;

	@FindBy(xpath = "//i[@class=\"dx-icon fas fa-times\"]")
	WebElement crossMark;

	@FindBy(xpath = "(//a[@class=\"cc-hyperlink dx-theme-accent-as-text-color\"])[1]")
	WebElement amountColumn;

	@FindBy(xpath = "//dx-button[@aria-label=\"Reclassify\"]")
	WebElement reclassifyButton;

	@FindBy(xpath = "(//dx-button[@aria-label=\"Close\"])[2]")
	WebElement errorCloseButton;

	@FindBy(xpath = "//dx-button[@title=\"Settings\"]")
	WebElement settingButton;

	@FindBy(xpath = "//span[text()=\"Show Invoice On Right Pane\"]")
	WebElement rightPane;

	@FindBy(xpath = "//dx-button[@title=\"Settings\"]")
	WebElement settingButton1;

	@FindBy(xpath = "//span[text()=\"Show Invoice On Left Pane\"]")
	WebElement leftPane;
	//////////////////////////////////////////////////////

	@FindBy(xpath = "//div[text()=\"Internal Notes\"]")
	WebElement internalNotesIcon;

	@FindBy(xpath = "(//div[@class='dx-texteditor-container']//textarea[@class='dx-texteditor-input'])[2]")
	WebElement newNotesTextbox;

	@FindBy(xpath = "//dx-button[@aria-label=\"Save\"]")
	WebElement newNotesSave;

	@FindBy(xpath = "//i[@title=\"Invoice History\"]")
	WebElement workflowHistoryIcon;

	@FindBy(xpath = "(//i[@class=\"dx-icon dx-icon-close\"])[3]")
	WebElement historyCloseButton;

	public String expectedCommunityURL = "https://sandbox.ciranet.com/v2/managementportal/cb/730/ap/expensedetail";

	// method declaration
	public <communitytabs> void APExpenseDetailPageLanding() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(APExpenseDetailURL);

		// Webdriver wait to check if the element is Present or visible or enabled or
		// disabled or Clickable
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to AP Expense Details ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

		// method used to compare the actual and expected results
		Assert.assertEquals(actualURL, APExpenseDetailURL);
	}

	public void CrossMark() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", crossMark);

		// statement which prints the argument passed to it
		System.out.println("Community Alerts popup gets closed");

	}

	public void ToolBarFullScreen() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		// allows to execute JavaScript code
		js.executeScript("arguments[0].click();", fullScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		// if statement to specify a block of Java code to be executed if a condition is
		// true
		if (normalScreenIcon.isDisplayed()) {
			System.out.println("FullScreen Menu button clicked");
		}
		// block of code to be executed if the condition is false
		else {
			System.out.println("FullScreen Menu button not clicked");
		}
	}

	public void ToolBarNormalScreen() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));
		js.executeScript("arguments[0].click();", normalScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		if (fullScreenIcon.isDisplayed()) {
			System.out.println("NormalScreen Menu button clicked");
		} else {
			System.out.println("NormalScreen Menu button not clicked");
		}

	}

	public void AmountColumn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", amountColumn);

		// statement which prints the argument passed to it
		System.out.println("AP Bill popup gets open");

	}

	public void ReclassifyButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", reclassifyButton);

		// statement which prints the argument passed to it
		System.out.println("Reclassify Button Clicked");

	}

	public void ErrorCloseButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", errorCloseButton);

		// statement which prints the argument passed to it
		System.out.println("Error Close Button Clicked");

	}

	public void SettingButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", settingButton);
		js.executeScript("arguments[0].click();", rightPane);

		// statement which prints the argument passed to it
		System.out.println("Setting Button Clicked");
		System.out.println("Right Pane Open");

	}

	public void SettingButton1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", settingButton1);
		js.executeScript("arguments[0].click();", leftPane);

		// statement which prints the argument passed to it
		System.out.println("Setting Button Clicked");
		System.out.println("Left Pane Open");

	}

	public void InternalNotesIcon() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", internalNotesIcon);

		// statement which prints the argument passed to it
		System.out.println("Internal Notes Icon Clicked");
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", newNotesTextbox);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		// Thread.sleep(5000);
		newNotesTextbox.sendKeys("AP Expense Details");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		js.executeScript("arguments[0].click();", newNotesSave);
		
		wait.until(ExpectedConditions.elementToBeClickable(newNotesSave));

		newNotesSave.click();

		System.out.println("New Notes Saved");
	}
	
	public void WorkflowHistoryIcon() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", workflowHistoryIcon);
		
		System.out.println("Workflow History icon clicked");
		
		Thread.sleep(10000);
		js.executeScript("arguments[0].click();", historyCloseButton);
		
		System.out.println("Workflow History popup closed");
	}
	

	
}
