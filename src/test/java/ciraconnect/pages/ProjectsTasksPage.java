package ciraconnect.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ciraconnect.utilities.LoggerManager;

public class ProjectsTasksPage {

	private WebDriver driver;

	// Initializing the Page Objects:
	public ProjectsTasksPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");

	}

	@FindBy(xpath = "//div[@class='header-text']//span[normalize-space()='My Work Queue']")
	public WebElement menuMyWorkQueue;
	
	@FindBy(xpath = "//div[@class='header-text']//span[normalize-space()='Projects / Tasks']")
	public WebElement menuProjectsTasks;

	@FindBy(xpath = "//span[normalize-space()='Add New Project / Task']")
	public WebElement AddNewProjects;

	@FindBy(xpath = "//dx-drop-down-box[@class='dx-show-invalid-badge dx-dropdownbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-outlined dx-widget drop-down-box dx-texteditor-empty dx-dropdowneditor dx-state-hover']//div[@class='dx-dropdowneditor-icon']")
	public WebElement communitydropdown;

	@FindBy(xpath = "//div[@class='dx-toolbar dx-widget dx-visibility-change-handler dx-collection dx-popup-title dx-has-close-button']//div[@class='dx-toolbar-items-container']")
	public WebElement AddNewTask;

	@FindBy(xpath = "//span[normalize-space()='1100 Trinity Mills Condos']")
	public WebElement communitydropdownselection;

	@FindBy(xpath = "//dx-text-box[@class='dx-show-invalid-badge dx-textbox dx-texteditor dx-editor-outlined dx-texteditor-empty dx-widget dx-state-hover dx-state-focused']//input[@role='textbox']")
	public WebElement Item;

	@FindBy(xpath = "//textarea[@role='textbox']")
	public WebElement shortdescription;

	@FindBy(xpath = "//dx-drop-down-box[@class='dx-show-invalid-badge dx-dropdownbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-outlined dx-widget drop-down-box dx-texteditor-empty dx-dropdowneditor dx-state-hover']//div[@class='dx-dropdowneditor-icon']")
	public WebElement responsible;

	@FindBy(xpath = "//td[normalize-space()='Ashley Gross']")
	public WebElement responsibledropdownselection;

	@FindBy(xpath = "//dx-button[@aria-label='Cancel']//div[@class='dx-button-content']")
	public WebElement btncancelbutton;

	@FindBy(xpath = "//a[@class='fas fa-question-circle']")
	public WebElement helpbutton;

	public void clickProjectsTaskMenu() {
		try {
			LoggerManager.info("============  Clicking on MyWorkQueue==>Projects Task ============");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

			menuMyWorkQueue.click();

			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", menuProjectsTasks);

			menuProjectsTasks.click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

			menuProjectsTasks.click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	/*
	 * public void addProjectsTask(){ WebDriverWait wait = new WebDriverWait(driver,
	 * Duration.ofSeconds(20));
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.
	 * xpath("//span[normalize-space()='Add New Project / Task']")));
	 * 
	 * 
	 * AddNewProjects.click();
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.
	 * xpath("//span[normalize-space()='Add New Project / Task']")));
	 * 
	 * 
	 * communitydropdown.click();
	 * 
	 * communitydropdownselection.click();
	 * 
	 * Item.sendKeys("Item Description");
	 * 
	 * shortdescription.sendKeys("Short Description");
	 * 
	 * responsible.click();
	 * 
	 * responsibledropdownselection.click();
	 * 
	 * wait.until(ExpectedConditions.visibilityOf(btncancelbutton));
	 * btncancelbutton.click();
	 * 
	 * 
	 * 
	 * }
	 * 
	 */	  
	public void VerifyProjectsTaskshelpIcon() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		helpbutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}
}
