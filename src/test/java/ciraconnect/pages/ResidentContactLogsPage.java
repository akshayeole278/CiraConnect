package ciraconnect.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

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

public class ResidentContactLogsPage 
{
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;


	public ResidentContactLogsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Resident Contact Logs Page Objects ======== ");
	}

	String ResidentContactLogsURL = "https://sandbox.ciranet.com/v2/managementportal/community/730/resident-contact-logs";
	
	String pageLoader = "//div[@class='dx-loadpanel-indicator dx-loadindicator dx-widget']//div[@class='dx-loadindicator-content'])[2]";
    
	//Initializing Page Objects
	@FindBy(xpath = "//i[@title='Alerts']")
	public WebElement alerticon;	
	
	@FindBy(xpath = "//div[@role='toolbar']//div[@class='dx-toolbar-items-container']")
	public WebElement communityalertspopup;
	
	@FindBy(xpath = "//span[normalize-space()='Current']")
	public WebElement communityalertscurrenttab;
	
	@FindBy(xpath = "//span[normalize-space()='Historical']")
	public WebElement communityalertshistoricaltab;
	
	@FindBy(xpath = "//span[normalize-space()='Upcoming']")
	public WebElement CommunityAlertUpcoming;
	
	//@FindBy(xpath = "//dx-button[@aria-label='Add']//div[@class='dx-button-content']")
	//public WebElement CommunityAddbutton;
	
	@FindBy(xpath = "//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon']//div[@class='dx-button-content']")
	public WebElement CommunityAddbutton;
	
	@FindBy(xpath = "//div[@class='dx-radiobutton-icon']")
	public WebElement Addbuttonpriority;
	
	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[1]")
	public WebElement addbuttonBegin_Date;
	
	@FindBy(xpath="(//input[@class='dx-texteditor-input' and @type='text' and @role='combobox'])[2]")
	public WebElement addbuttonEnd_Date;
	
	@FindBy(xpath="//span[@class='dx-checkbox-icon']")
	public WebElement addbuttonNoEndDate;
	
	@FindBy(xpath="(//div[@class='dx-texteditor-input-container']//input[@autocomplete='off'])[6]")
	public WebElement addbuttonsubject;
	
	@FindBy(xpath="//div[@class='dx-texteditor-input-container']//textarea[@autocomplete='off']")
	public WebElement addbuttontext;
	
	@FindBy(xpath="//span[normalize-space()='OK']")
	public WebElement addbuttonOKbutton;
	
	@FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//i[@class='dx-icon fas fa-times']")
	public WebElement addbuttonCancelbutton;
	
	@FindBy(xpath="//div[@role='toolbar']//div[@class='dx-toolbar-before']")
	public WebElement AddCommunityAlert;
	
	@FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[1]")
	public WebElement communityalertclose;
	
	@FindBy(xpath="(//div[@class='dx-template-wrapper']//a[@class='cc-hyperlink'])[1]")
	public WebElement AccountHistoricallink;
	
	@FindBy(xpath="(//td[@aria-selected='false'])[2]")
	public WebElement issuesortascendingorder;
	
	@FindBy(xpath="(//div[@class='dx-column-indicators'])[3]")
	public WebElement HistoricalFilter;
	
	@FindBy(xpath="(//div[@class='dx-checkbox-container']//span[@class='dx-checkbox-icon'])[1]")
	public WebElement SelectCheckBox;
	
	@FindBy(xpath="(//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text'])[1]")
	public WebElement SelectOkButton;
	
	@FindBy(xpath="(//div[@class='dx-template-wrapper']//a[@class='cc-hyperlink'])[4]")
	public WebElement CollectionsLink;
	
	@FindBy(xpath="//td[@aria-selected='false']//div[@class='dx-column-indicators']//span[@class='dx-header-filter dx-header-filter-empty']")
	public WebElement CallerFilter;
	
    @FindBy(xpath="(//div[@class='dx-list-item-before-bag dx-list-select-checkbox-container']//div[@class='dx-checkbox-container'])[1]")
	public WebElement CallerCheckBox;
	
    @FindBy(xpath="//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text' and @aria-label='OK']")
	public WebElement CallerOkButton;
	
	@FindBy(xpath="//div[@class='dx-datagrid-filter-panel-clear-filter']")
	public WebElement CliearCallerFilter;
	
	@FindBy(xpath="(//div[@class='dx-column-indicators']//span[@class='dx-header-filter dx-header-filter-empty'])[1]")
	public WebElement IssueFilter;
	
	@FindBy(xpath="(//div[@class='dx-checkbox-container']//span[@class='dx-checkbox-icon'])[1]")
	public WebElement IssueCheckBox;
	
	@FindBy(xpath="(//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text'])[1]")
	public WebElement IssueOkButton;
	
	@FindBy(xpath="(//td[@aria-selected='false'])[8]")
	public WebElement AccStatus;
	
	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	public WebElement Fullscreen;
	
	@FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	public WebElement Normalscreen;
	
	public void ResidentContactLogsLanding() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(ResidentContactLogsURL);

		// Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to Resident Contact Logs ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

	}
	
	public void CommunityAlerticon()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
		
		//allows to execute JavaScript code
		js.executeScript("arguments[0].click();", alerticon);
	
		wait.until(ExpectedConditions.elementToBeClickable(communityalertscurrenttab));
		
		//if statement to specify a block of Java code to be executed if a condition is true
		if (communityalertshistoricaltab.isDisplayed()) {
			System.out.println("community alerts Historical tab is displayed");
		}
		
		//block of code to be executed if the condition is false
		else 
		{
			System.out.println("community alerts Historical tab is not displayed");
		}
		
	}
	
	public void CommunityAlertHistoricalTab()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		//if statement to specify a block of Java code to be executed if a condition is true
		if (communityalertshistoricaltab.isDisplayed() && communityalertshistoricaltab.isEnabled()) 
		{
			//allows to execute JavaScript code
			js.executeScript("arguments[0].click();", communityalertshistoricaltab);
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			System.out.println("Community alerts >> Historical tab clicked");
		}
		//block of code to be executed if the condition is false
		else 
		{
			System.out.println("Community alerts >> Historical tab not clicked");
		}
				
	}
	
	public void CommunityAlertUpcomingTab()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		//if statement to specify a block of Java code to be executed if a condition is true
		if (CommunityAlertUpcoming.isDisplayed() && CommunityAlertUpcoming.isEnabled()) 
		{
			//allows to execute JavaScript code
			js.executeScript("arguments[0].click();", CommunityAlertUpcoming);
			//communityalertshistoricaltab.click();
			
			System.out.println("Community alerts >> Upcoming tab clicked");
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//block of code to be executed if the condition is false
		else 
		{
			System.out.println("Community alerts >> Upcoming tab is not clicked");
		}
	}
	
	public void CommunityAlertAddCommunityalertbutton()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.elementToBeClickable(CommunityAddbutton));
		//allows to execute JavaScript code
		
		
		js.executeScript("arguments[0].click();", CommunityAddbutton);
		
		String expectedHeading = "Add Community Alert";
    	
    	//Storing the text of the heading in a string
    	String heading = AddCommunityAlert.getText();
    	
    	if(expectedHeading.equalsIgnoreCase(heading))
    	{
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	}
    	else 
    	{
    		
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
    	}
	
		
		wait.until(ExpectedConditions.elementToBeClickable(Addbuttonpriority));
		js.executeScript("arguments[0].click();", Addbuttonpriority);
		
		wait.until(ExpectedConditions.elementToBeClickable(addbuttonBegin_Date));
		js.executeScript("arguments[0].click();", addbuttonBegin_Date);
		
		addbuttonBegin_Date.sendKeys("11/01/2018");
		
		wait.until(ExpectedConditions.elementToBeClickable(addbuttonEnd_Date));
		js.executeScript("arguments[0].click();", addbuttonEnd_Date);
		
		addbuttonEnd_Date.sendKeys("11/30/2022");
		
		wait.until(ExpectedConditions.elementToBeClickable(addbuttonsubject));
		js.executeScript("arguments[0].click();", addbuttonsubject);
		addbuttonsubject.sendKeys("Add Community Alert High Priority");
		
		wait.until(ExpectedConditions.elementToBeClickable(addbuttontext));
		js.executeScript("arguments[0].click();", addbuttontext);
		addbuttontext.sendKeys("Add Community Alert textbox");
		
		wait.until(ExpectedConditions.elementToBeClickable(addbuttonCancelbutton));
		js.executeScript("arguments[0].click();", addbuttonCancelbutton);
		
		wait.until(ExpectedConditions.elementToBeClickable(communityalertclose));
		js.executeScript("arguments[0].click();", communityalertclose);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		System.out.println("community alert pop-up window closed ");
		
		Robot robot;
		 try {
			 robot = new Robot();
			 robot.keyPress(KeyEvent.VK_ESCAPE);
			 robot.delay(300);
			 robot.keyRelease(KeyEvent.VK_ESCAPE);
			 robot.delay(300);
			 
			 System.out.println("Esc button pressed");
		 } 
		 
		 catch (java.awt.AWTException e) 
		 {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void CommunityAlertAddCommunityalertpopupCancelbutton() {
		
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		js.executeScript("arguments[0].click();", alerticon);
		wait.until(ExpectedConditions.elementToBeClickable(CommunityAddbutton));
		
		//allows to execute JavaScript code
		js.executeScript("arguments[0].click();", CommunityAddbutton);
		
		//String expectedHeading = "Add Community Alert";
		
		wait.until(ExpectedConditions.elementToBeClickable(addbuttonCancelbutton));
		js.executeScript("arguments[0].click();", addbuttonCancelbutton);
		
		wait.until(ExpectedConditions.elementToBeClickable(communityalertclose));
		js.executeScript("arguments[0].click();", communityalertclose);
		
		System.out.println("community alert pop-up window closed ");
		
	}
	
	 public void HistoricalColumnFilter() 
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		 wait.until(ExpectedConditions.elementToBeClickable(HistoricalFilter));
		 HistoricalFilter.click();
    	 System.out.println("Historical Filter is clicked");
    	 SelectCheckBox.click();
    	 System.out.println("Select Check Box is Clocked");
    	 SelectOkButton.click();
    	 System.out.println("Ok button is clicked");
    	 
     }
		
		public void IssueColumn() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		IssueFilter.click();
		System.out.println("Issue Filter is clicked");
		IssueCheckBox.click();
		System.out.println("Issue Check Box is clicked");
		IssueOkButton.click();
		System.out.println("Issue Ok Button is clicked");
		if(AccStatus.isDisplayed()) 
		{
			System.out.println("Filter is appiled");
		}
		else
		{
			System.out.println("Filter is not applied");
		}
			
	}
		public void AccountStatusBalance_History()
		{   
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
			wait.until(ExpectedConditions.elementToBeClickable(CollectionsLink));
			
			CollectionsLink.click();
			System.out.println("Collection link is opened");
			
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
			
			try 
			{
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void Collection() 
		{
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));	 
			 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(pageLoader)));
			 String add=driver.getWindowHandle();
		  	 System.out.println(add);
		  	
		  	 int size1=driver.getWindowHandles().size();
		  	 System.out.println("Size is:" +size1);
		  	 
		  	ArrayList<String> arr=new ArrayList<>(driver.getWindowHandles());
		    
		     driver.switchTo().window(add).getTitle();
		    
		  	 driver.switchTo().window(arr.get(1));
		  	 CallerFilter.click();
		  	 
		  	try 
		  	{
				Thread.sleep(1000);
			} 
		  	catch (InterruptedException e) 
		  	{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  	 System.out.println("Caller filter is clieked");
		  	 CallerCheckBox.click();
		  	try 
		  	{
					Thread.sleep(1000);
			} 
		  	catch (InterruptedException e) 
		  	{
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		  	
		  	 System.out.println("Sally checkbox is clicked");
		  	 CallerOkButton.click();
		  	 try 
		  	 {
					Thread.sleep(1000);
			} 
		  	 catch (InterruptedException e) 
		  	 {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		  	System.out.println("Caller OK Button is clicked");
		  	CliearCallerFilter.click();
		  	System.out.println("Caller filter is clicked");
		  	
		 }

         public void Toolbar() {
        	 
        	 Fullscreen.click();
        	 System.out.println("Full Screen is display");
        	 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        	 Normalscreen.click();
        	 System.out.println("Normal screen is display");
        	 driver.close();
 		  	 System.out.println("Current window is closed");
 		  	 
 		  	 
 		  	 //Quit current browser
 		  	 driver.quit();
         }

	
}
