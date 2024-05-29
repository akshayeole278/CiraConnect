package ciraconnect.pages;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ciraconnect.utilities.LoggerManager;

public class CommonLotsAppraisalPage {
	
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	public CommonLotsAppraisalPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");

	}

	String commonLotsAppraisalURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/common-lots/appraisal";

	@FindBy (xpath = "//span[@class='dx-button-text'][text()='Add New Common Lot']")
	WebElement btnAddNewCommonLot;
	
	@FindBy (xpath = "//div[@class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable']")
	WebElement popupAddNewCommonLot;
	
	@FindBy (xpath = "//input[contains(@id,'phase')]")
	WebElement phaseDropdown;
	
	@FindBy (xpath ="//div[@class='dx-item-content dx-list-item-content'][contains(.,'None')]")
	WebElement phaseAsNone;
	
	
	@FindBy (xpath = "//input[contains(@id,'section')]")
	WebElement sectionDropdown;
	
	@FindBy (xpath ="(//div[@class='dx-item-content dx-list-item-content'][contains(.,'None')])[2]")
	WebElement sectionAsNone;
	
	@FindBy (xpath =  "//input[contains(@id,'block')]")
	WebElement blockTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'lot')]")
	WebElement lotTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'streetNumber')]")
	WebElement streetNumberTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'streetName')]")
	WebElement streetDropdown;
	
	@FindBy (xpath = "(//div[@class='dx-item-content dx-list-item-content'][contains(.,'None')])[3]")
	WebElement streetAsNone;

	@FindBy (xpath =  "//input[contains(@id,'city')]")
	WebElement cityTextbox;

	@FindBy (xpath =  "//input[contains(@id,'state')]")
	WebElement stateDropdown;
	
	//@FindBy (xpath = "//div[@class='dx-item-content dx-list-item-content'][contains(.,'Alabama')]")
	//WebElement stateAsNewYork;
	
	@FindBy (xpath =  "//input[contains(@id,'zip')]")
	WebElement zipTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'country')]")
	WebElement countryTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'parcelNumber')]")
	WebElement parcelTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'improvedValue')]")
	WebElement improvedValueTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'totalAcerage')]")
	WebElement totalAcreageTextbox;
	
	@FindBy (xpath =  "//input[contains(@id,'commonAreaTypeId')]")
	WebElement commonAreaType;
	
	@FindBy (xpath = "//div[@class='dx-item-content dx-list-item-content'][contains(.,'Lift Statione')]")
	WebElement commonAreaTypeValue;
	
	
	@FindBy(xpath = "//textarea[contains(@id,'commonAreaDescription')]")
	WebElement lotDescrTextArea;
	
	@FindBy (xpath = "//span[contains(.,'Cancel')]")
	WebElement cancelButton;
	
	@FindBy (xpath = "//span[contains(.,'Save')]")
	WebElement saveButton;
	
	@FindBy (xpath = "(//div[@class='dx-dropdowneditor-icon'])[4]")
	WebElement dropdownCommonLots;
	
	@FindBy (xpath = "//td[contains(.,'None')]")
	WebElement dropdownValue;
	
	
	@FindBy (xpath="//span[normalize-space()='Edit Common Lot']")
	WebElement btnEditCommonLot;
	
	
	public void CommonLotsAppraisalPageLanding() {
		driver.navigate().to(commonLotsAppraisalURL);
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("======== Navigating to Common Lots Appraisal ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, commonLotsAppraisalURL);
	}
	
	
	public void clickAddNewCommonLot() {
		
		System.out.println("++++++ In Add New Common Lot +++++++");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(btnAddNewCommonLot));
		
		btnAddNewCommonLot.click();
		String AddNewTaskPopup = driver.getWindowHandle();
		driver.switchTo().window(AddNewTaskPopup);
		
		System.out.println("Inside Add new common lot");
		wait.until(ExpectedConditions.elementToBeClickable(popupAddNewCommonLot));
		popupAddNewCommonLot.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		phaseDropdown.click();
		wait.until(ExpectedConditions.visibilityOf(phaseAsNone)).click();
		
		
		sectionDropdown.click();
		wait.until(ExpectedConditions.visibilityOf(sectionAsNone)).click();
		
		blockTextbox.sendKeys("Block1");
		lotTextbox.sendKeys("2222");
		streetNumberTextbox.sendKeys("1212");  
		streetDropdown.click();
		
		wait.until(ExpectedConditions.visibilityOf(streetAsNone)).click();
		
		cityTextbox.sendKeys("NY");
		//stateDropdown.click();
		//wait.until(ExpectedConditions.visibilityOf(stateAsNewYork)).click();
		
		
		zipTextbox.sendKeys("12345");
		
		countryTextbox.sendKeys("USA");
		
		Random random = new Random();
		int randomNumberInRange = random.nextInt(10000) + 1;
		
				
		
		parcelTextbox.sendKeys(String.valueOf(randomNumberInRange));
		
		improvedValueTextbox.sendKeys("123456");
		//totalAcreageTextbox.sendKeys("82772");

		//commonAreaType.click();
		//wait.until(ExpectedConditions.visibilityOf(commonAreaTypeValue)).click();
		
		lotDescrTextArea.sendKeys("This is lot description");
	
		saveButton.click();
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//dropdownCommonLots.click();
	}

	// This method is used to select the entry from the dropdown
	public void clickEditCommonLot() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(dropdownCommonLots)).click();
		// dropdownCommonLots.click();
		wait.until(ExpectedConditions.elementToBeClickable(dropdownValue)).click();
		
		btnEditCommonLot.click();
		
		String editCommonLotPopup = driver.getWindowHandle();
		driver.switchTo().window(editCommonLotPopup);
		
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		saveButton.click();
	}
	
}
