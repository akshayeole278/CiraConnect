package ciraconnect.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ciraconnect.utilities.LoggerManager;

public class TimeandExpensePage 
{

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	public WebDriver driver;


	public TimeandExpensePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Time and Expense  ======== ");
	}

	
	
	
	
	
	String TimeandExpensePageURL = "https://sandbox.ciranet.com/v2/managementportal/gcb/te/time-and-expense-management";
	
	String pageLoader = "(//div[@class='dx-loadpanel-indicator dx-loadindicator dx-widget']//div[@class='dx-loadindicator-content'])[2]";
	
	
	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[1]")
	public WebElement entityDropdown;	
	
	@FindBy(xpath = "(//div[@role='option']//div[@class=\"dx-item-content dx-list-item-content\"])[1]")
	public WebElement realManageDropdown;	
	
	@FindBy(xpath = "//div[@aria-label='Refresh']//i[@class='dx-icon dx-icon-refresh']")
	public WebElement refresh;
	
	
	@FindBy(xpath = "(//div[@role='option']//div[@class=\"dx-item-content dx-list-item-content\"])[2]")
	public WebElement ciraManageDropdown;	
	
	@FindBy(xpath = "(//div[@role='option']//div[@class=\"dx-item-content dx-list-item-content\"])[3]")
	public WebElement grandManorsDropdown;	
	
	
	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content'])[2]")
	public WebElement generalExpense;	
	
	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content'])[1]")
	public WebElement timeExpense;
	
	@FindBy(xpath = "(//div[@class='dx-item-content dx-tab-content'])[3]")
	public WebElement mileageExpense;
	
	
	@FindBy(xpath = "(//dx-button[@class=\"dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon\"])[2]")
	public WebElement newTimeEntry;
	
	@FindBy(xpath = "(//div[@class='dx-template-wrapper dx-button-content'])[11]")
	public WebElement customerDrop;
	
	
	@FindBy(xpath = "(//span[@class='dx-button-text'])[6]")
	//@FindBy(xpath = "(//div[@class='dx-button-content'][contains(.,'Action')])[4]")
			//(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-runner'])[5]
	public WebElement action;
	
	
	@FindBy(xpath = "(//div[@class='menu-text'])[1]")
	public WebElement copy;
	
	
	@FindBy(xpath = "(//td[@aria-describedby='dx-col-16'])[2]")
	//(//td[@aria-describedby='dx-col-16'])[2]
	public WebElement customerValue;
	
	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[9]")//div[@class='dx-dropdowneditor-icon'])[9]
	public WebElement chargeCode;
	
	
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[58]")
	public WebElement mileageChargeCode;
			
	@FindBy(xpath = "(//td[@aria-describedby='dx-col-16'])[2]")
	public WebElement chargeCodeValue;
	
	
	@FindBy(xpath = "//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon']")
	public WebElement save;
	
	@FindBy(xpath = "(//div[@class='menu-text'])[3]")
	public WebElement mileageExpensebutton;
	
	@FindBy(xpath = "(//div[@class='menu-text'])[5]")
	public WebElement deletebutton;
	
	@FindBy(xpath = "//div[@aria-label='Yes']//div[@class='dx-button-content']")
	public WebElement deleteYes;
	
	@FindBy(xpath = "(//div[@class=\"dx-button-content\"]//span[@class='dx-button-text'])[2]")
	public WebElement myPlaces;
	
	
	@FindBy(xpath = "(//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-runner'])[35]")
	public WebElement actionMyplaces;
	
	@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
	public WebElement ActionEdit;
	
	
	@FindBy(xpath = "(//i[@class=\"dx-icon fas fa-times\"])[2]")
	public WebElement closeButton;

	@FindBy(xpath = "(//i[@class=\"dx-icon fas fa-times\"])[1]")
	public WebElement myPlacescloseButton;

	
	@FindBy(xpath = "//i[@class='dx-icon fas fa-upload']")
	public WebElement submitForApproval;

	@FindBy(xpath = "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[5]")
	public WebElement cancel;
	
	
	@FindBy(xpath= "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text dx-button-has-icon'])[2]")
    public WebElement submit;
	
	
	@FindBy(xpath = "(//div[@class='dx-checkbox-container'])[2]")
	public WebElement submitForApprovalcheckbox;
	
	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[3]")
	public WebElement fromDate;
	
	@FindBy(xpath = "//td[@class='dx-calendar-cell dx-calendar-selected-date dx-calendar-contoured-date']")
	public WebElement fromDatevalue;
	
	
	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[4]")
	public WebElement toDate;
	
	@FindBy(xpath = "(//td[@class='dx-calendar-cell dx-calendar-selected-date dx-calendar-contoured-date'])[2]")
	public WebElement toDatevalue;
	
	
	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[8]")
	public WebElement entityCustomerDropdown;
	
	@FindBy(xpath = "(//td[@aria-describedby='dx-col-92'])[2]")
	public WebElement entityCustomerDropdownvalue;
	
	@FindBy(xpath = "(//tr[@class='dx-row dx-data-row dx-column-lines'])[1]")
	public WebElement chargecodevaluebutton;
	
	public void TimeandExpensePageLanding() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(TimeandExpensePageURL);

		// Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to Time and Expense Page ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

	}
	
	public void RealManageDropdown()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		entityDropdown.click();
		System.out.println("Clicked Entity Dropdown");
		
		realManageDropdown.click();
		System.out.println("Clicked Real Manage Dropdown");
		
		refresh.click();
		System.out.println("Clicked Refresh Button");
		
    }
	
	public void CiraManagementDropdown()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		entityDropdown.click();
		System.out.println("Clicked Entity Dropdown");
		
		ciraManageDropdown.click();
		System.out.println("Clicked Cira Manage Dropdown");
		
		refresh.click();
		System.out.println("Clicked Refresh Button");
		
    }
	
	public void GrandManorsDropdown()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		entityDropdown.click();
		System.out.println("Clicked Entity Dropdown");
		
		grandManorsDropdown.click();
		System.out.println("Clicked GrandManors Dropdown");
		
		refresh.click();
		System.out.println("Clicked Refresh Button");
		
    }
	
	public void TabSwitchingTimeandGeneralExpense()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		generalExpense.click();
		System.out.println("Switched to General Expense Tab");
		
		timeExpense.click();
		System.out.println("Switched to Time Expense Tab");
	}
	
	
	public void TabSwitchingGeneralExpenseandMileageExpense()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		generalExpense.click();
		System.out.println("Switched to General Expense Tab");
		
		mileageExpense.click();
		System.out.println("Switched to Mileage Expense Tab");
	}
	
	
	public void TabSwitchingMileageExpenseandTime()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		timeExpense.click();
		System.out.println("Switched to Time Expense Tab");
		
	 	mileageExpense.click();
		System.out.println("Switched to Mileage Expense Tab");
		
		timeExpense.click();
		System.out.println("Switched to Time Expense Tab");
	}
	
	public void NewTimeEntrySaveButton()
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		wait.until(ExpectedConditions.elementToBeClickable(newTimeEntry));

		js.executeScript("arguments[0].click();", newTimeEntry);
		//newTimeEntry.click();
		System.out.println("Clicked on new time Entry");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		entityCustomerDropdown.click();
		System.out.println("Clicked on customer entity dropdown");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		customerValue.click();
		System.out.println("Clicked on customer entity dropdown value");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		chargeCode.click();
		System.out.println("Clicked on Chargecode Dropdown");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		chargecodevaluebutton.click();
		System.out.println("Clicked on Chargecode Value");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		save.click();
		System.out.println("Clicked on save Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
	}
	
	public void NewTimeEntryActionCopyButton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		//wait.until(ExpectedConditions.elementToBeClickable(action));

		//js.executeScript("arguments[0].click();", action);
		
		
		action.click();
		System.out.println("Clicked on action button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		copy.click();
		System.out.println("Clicked on copy button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		//customerDrop.click();
		//System.out.println("Clicked on customer Dropdown button");
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		//customerValue.click();
		//System.out.println("Clicked on customer value button");
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		chargeCode.click();
		System.out.println("Clicked on Chargecode Dropdown");
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		chargecodevaluebutton.click();
		System.out.println("Clicked on Chargecode Value");
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		
		save.click();
		System.out.println("Clicked on save Button");
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		
		
	}
	
	
	      public void NewTimeEntryActionCreateMileageExpenseButton()
	   {
		
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	  		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	    	  
	    	 action.click();
	  		System.out.println("Clicked on action button");
	  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	  		
	  		mileageExpensebutton.click();
	  		System.out.println("Clicked on Mileage Expense  button");
	  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	  		
	  		chargeCode.click();
			System.out.println("Clicked on Chargecode Dropdown");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
			
			chargecodevaluebutton.click();
			System.out.println("Clicked on Chargecode Value");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
			
			
			save.click();
			System.out.println("Clicked on save Button");
			//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
			
	   }
	      
	      
	      public void NewTimeEntryActionDeleteButton()
	      {
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		  		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		    	  
		    	 action.click();
		  		System.out.println("Clicked on action button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		deletebutton.click();
		  		System.out.println("Clicked on delete  button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		deleteYes.click();
		  		System.out.println("Deleted the entry");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		
		  		Actions action = new Actions(driver);
		  		action.sendKeys(Keys.ESCAPE).build().perform();
		  		
		  		
	      }
	      
	      public void MyPlacesActionEdit()

          {
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		  		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		 
		  		 
			  	mileageExpense.click();
		  		System.out.println("Clicked on Mileage Expense  button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		myPlaces.click();
		  		System.out.println("Clicked on My Places button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		actionMyplaces.click();
		  		System.out.println("Clicked on My Places Action button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		ActionEdit.click();
		  		System.out.println("Clicked on My Places Action Edit button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		closeButton.click();
		  		System.out.println("Clicked on Close button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		myPlacescloseButton.click();
		  		System.out.println("Clicked on My Places  Close button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		 
	    	  }
	      
	      
	      public void SubmitForApprovalCancelButton()
	      {
	    	  
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		  		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		 
		  		submitForApproval.click();
		  		System.out.println("Clicked on submit for Approval button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		cancel.click();
		  		System.out.println("Clicked on cancel button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	    	  
	      }
	      
	      public void SubmitForApprovalSubmitButton()
	      {
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		  		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		 
		  		submitForApproval.click();
		  		System.out.println("Clicked on submit for Approval button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		submitForApprovalcheckbox.click();
		  		System.out.println("Clicked on checkbox for submit for Approval button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		
		  		
		  		submit.click();
		  		System.out.println("Clicked on submit button");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	    	  
	      }
	      
	      public void CustomerDropdown()
	      {
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		  	   wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		 
		  		customerDrop.click();
		  		System.out.println("Clicked on customer dropdown");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		   
		  		customerValue.click();
		  		System.out.println("Clicked on customer dropdown value");
		  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	      }
	      
	      public void FromToDropdown()
	      {
	    	  
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		  		 
		     fromDate.click();
		  	System.out.println("Clicked on from date");
	  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	  		
	  		fromDatevalue.click();
	  		System.out.println("selected value from date");
	  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	    	  
	  		toDate.click();
	  		System.out.println("Clicked on to date");
	  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	  		
	  		
	  		toDatevalue.click();
	  		System.out.println("selected value to date");
	  		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
	  		
	  		driver.quit();
	      }
	      }
