package ciraconnect.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ciraconnect.utilities.LoggerManager;

public class PreferencesPage {
	protected WebDriver driver;

	public Boolean blnLogin = false;

	WebDriverWait wait;

	// Initializing the Page Objects:
	public PreferencesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		LoggerManager.debug("======== Initializing the Preferences Objects ======== ");

	}

	//@FindBy(xpath = "//div[@class='dx-item dx-box-item']//div[@class='dx-item-content dx-box-item-content']//dx-select-box[@valueexpr='name']")
	@FindBy(xpath ="(//div[contains(@class,'dx-texteditor-container')])[32]")
	public WebElement themeWD;


	//@FindBy(xpath = "//div[@class='dx-item dx-box-item']//div[@class='dx-item-content dx-box-item-content']//dx-select-box[@ng-reflect-value='internal']")
	@FindBy(xpath = "(//div[contains(@class,'dx-texteditor-container')])[34]")

	public WebElement behaviourWD;


	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[34]")
	public WebElement behaviourDropdown;

	@FindBy(xpath = "//span[normalize-space()='Preferences']")
	public WebElement preferencesMenu;


	@FindBy(xpath="//dx-select-box[@valueexpr='name']//input[@role='combobox']")
	WebElement selectedTheme;
	//dx-select-box[@valueexpr='name']//div[@class='dx-dropdowneditor-icon']

	@FindBy(xpath ="(//div[contains(@class,'dx-texteditor-container')])[33]")
	public WebElement docFileLinkDropdown;


	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[33]")
	WebElement documentFileLinks;

	@FindBy(xpath ="(//div[contains(@class,'dx-texteditor-container')])[35]")
	public WebElement scrollModeDropdown;

	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[35]")
	WebElement scrollMode;

	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[36]")
	WebElement scrollType;


	@FindBy(xpath="(//input[contains(@autocomplete,'off')])[37]")
	WebElement autoshowTopMenu;

	@FindBy(xpath = "//div[@class='cc-user-panel-name']")
	public WebElement userPanel;

	@FindBy(xpath="//div[@title='Save Preferences']//div[@class='dx-button-content']")
	WebElement applyButton;

	@FindBy(xpath="//div[@class='dx-item-content dx-menu-item-content'][contains(.,'Logout')]")
	WebElement logoutLink;

	public void clickPreferences() {

		LoggerManager.info("============  Clicking on Preferences ==> Popup selection ============");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));


		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(userPanel));
		//System.out.println("Preferences Page");
		wait.until(ExpectedConditions.elementToBeClickable(userPanel));
		userPanel.click();
		preferencesMenu.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String preferencesPopUp = driver.getWindowHandle();
		driver.switchTo().window(preferencesPopUp);

		Actions act = new Actions(driver);

		behaviourWD.click();

		System.out.println("Current Behaviour is ==> "+ behaviourDropdown.getAttribute("value"));

		if (behaviourDropdown.getAttribute("value").equalsIgnoreCase("Open in same window"))
		{ 
			WebElement wEleNewWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Open in new window')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Open in new window')]"))).click();
			act.moveToElement(wEleNewWindow).build().perform(); 
		} else if (behaviourDropdown.getAttribute("value").equalsIgnoreCase("Open in new window"))
		{ 
			WebElement wEleSameWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Open in same window')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Open in same window')]"))).click();
			act.moveToElement(wEleSameWindow).build().perform(); 

		}

		System.out.println("New Value of Behaviour is ===>" + behaviourDropdown.getAttribute("value"));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println("Changed Behaviour is ==> "+ behaviourDropdown.getAttribute("value"));

		themeWD.click();

		System.out.println("Current background color is ===>"+ selectedTheme.getAttribute("value"));

		if (selectedTheme.getAttribute("value").equalsIgnoreCase("Blue Dark Background")){

			WebElement wEleTealLight = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Teal Light Background')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Teal Light Background')]"))).click();
			act.moveToElement(wEleTealLight).build().perform();

		} else if (selectedTheme.getAttribute("value").equalsIgnoreCase("Teal Light Background")){
			System.out.println("In Else");
			WebElement wEleBlueDark = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Blue Dark Background')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Blue Dark Background')]"))).click();
			act.moveToElement(wEleBlueDark).build().perform();

		}

		System.out.println("Changed background color is ===>"+ selectedTheme.getAttribute("value"));
		
		//// Code for Document / File Links
		documentFileLinks.click();

		System.out.println("Current Behaviour is ==> "+ documentFileLinks.getAttribute("value"));

		if (documentFileLinks.getAttribute("value").equalsIgnoreCase("Always Download"))
		{ 
			WebElement wEleNewWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Open In Browser')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Open In Browser')]"))).click();
			act.moveToElement(wEleNewWindow).build().perform(); 
		} else if (documentFileLinks.getAttribute("value").equalsIgnoreCase("Open In Browser"))
		{ 
			WebElement wEleSameWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Always Download')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Always Download')]"))).click();
			act.moveToElement(wEleSameWindow).build().perform(); 

		}

		System.out.println("New Value of Document/File is ===>" + documentFileLinks.getAttribute("value"));


		////////////// Document or File Link Ends here


		//// Code for Scroll Mode
		scrollMode.click();

		System.out.println("Current Scrollbar Mode is ==> "+ scrollMode.getAttribute("value"));

		if (scrollMode.getAttribute("value").equalsIgnoreCase("Always"))
		{ 
			WebElement wEleNewWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'On Scroll')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'On Scroll')]"))).click();
			act.moveToElement(wEleNewWindow).build().perform(); 
		} else if (scrollMode.getAttribute("value").equalsIgnoreCase("On Scroll"))
		{ 
			WebElement wEleSameWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Always']")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='Always']"))).click();
			act.moveToElement(wEleSameWindow).build().perform(); 

		}

		System.out.println("New Value of Scroll Bar mode is ===>" + scrollMode.getAttribute("value"));


		////////////// Scroll Mode Ends here

		//// Code for Scroll Type Mode
		scrollType.click();

		System.out.println("Current Scroll Type is ==> "+ scrollType.getAttribute("value"));

		if (scrollType.getAttribute("value").equalsIgnoreCase("Classic Look"))
		{ 
			WebElement wEleNewWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Modern Look')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Modern Look')]"))).click();
			act.moveToElement(wEleNewWindow).build().perform(); 
		} else if (scrollType.getAttribute("value").equalsIgnoreCase("Modern Look"))
		{ 
			WebElement wEleSameWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Classic Look')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Classic Look')]"))).click();
			act.moveToElement(wEleSameWindow).build().perform(); 

		}

		System.out.println("New Value of Scroll Type is ===>" + scrollType.getAttribute("value"));


		////////////// Scroll Type Ends here


		//// Code for Auto Show Top Menu Mode
		autoshowTopMenu.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Current Auto Show Top Menu is ==> "+ autoshowTopMenu.getAttribute("value"));

		if (autoshowTopMenu.getAttribute("value").equalsIgnoreCase("Yes"))
		{ 
			WebElement wEleNewWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'No')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'No')]"))).click();
			act.moveToElement(wEleNewWindow).build().perform(); 
		} else if (autoshowTopMenu.getAttribute("value").equalsIgnoreCase("No"))
		{ 
			WebElement wEleSameWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Yes')]")));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Yes')]"))).click();
			act.moveToElement(wEleSameWindow).build().perform(); 

		}

		System.out.println("New Value of Auto Show Top Menu is ===>" + autoshowTopMenu.getAttribute("value"));


		////////////// Auto Show Top Menu Ends here

		applyButton.click();
		System.out.println("Preferences Saved");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div[@class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable dx-popup-inherit-height']"))
		.sendKeys(Keys.ESCAPE);
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.switchTo().activeElement();

		/*
		 * new WebDriverWait(driver,
		 * Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(userPanel));
		 * //System.out.println("Preferences Page");
		 * wait.until(ExpectedConditions.elementToBeClickable(userPanel));
		 * userPanel.click();
		 * 
		 * new WebDriverWait(driver,
		 * Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(logoutLink));
		 * //System.out.println("Preferences Page");
		 * wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		 * logoutLink.click();
		 */

		System.out.println("Logout is clicked");
	}



}
