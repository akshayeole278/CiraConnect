package ciraconnect.pages;

import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ciraconnect.utilities.LoggerManager;

public class PropertyConveyanceWorkQueuePage {
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js ;
	private WebDriver driver;

	// Initializing the Page Objects:
	public PropertyConveyanceWorkQueuePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor)driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");

	}
	
	
	
	String strPropertyConveyanceURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/property-conveyance";
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-content']";
	String loaderOfPage = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";
	String loaderTxt = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-message'][normalize-space()='Loading...']";
	
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//*[@id='dx-col-1656']")
	WebElement communityColumn;
	
	//xpath for Edit Community Cancel
		@FindBy(xpath="(//div[@aria-label='Action'])[1]")
		WebElement actionButtonOfFirstRow;
	
		@FindBy(xpath = "(//span[text()='Action'])[3]") //"(//span[@class='dx-button-text'])[4]")
		WebElement actionButton;
		
		@FindBy(xpath ="(//div[@ng-reflect-klass='menu-text'])[2]")
		WebElement editCommunity;
		
		@FindBy(xpath ="(//div//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[3]")
		WebElement editCommunityCancel;
		
		//xpath for Edit Community Update
		
		@FindBy(xpath ="(//input[@type='text'])[16]")
		WebElement communityDrpDown;
		
		@FindBy(xpath ="//td[text()='1100 Trinity Mills Condos']")
		WebElement communityValueDrpDown;
		
		@FindBy(xpath ="(//span[@class='dx-button-text'])[54]")
		WebElement editCoummunityUpdate;
		
		//xpath for clear community
		@FindBy(xpath ="(//div[@aria-label='Action'])[3]")
		WebElement actionClearCoummunity;
		
		
		@FindBy(xpath ="//div[@class='menu-text'][contains(.,'Clear Community')]")
		WebElement clearCoummunity;
		
	// For column Chooser
		@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
		WebElement columnChooser;
		
		@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
		WebElement resetLayout;
		
		@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
		WebElement closeColChooser;
		
		// For selecting menu Process Property Conveyance on Action button
		@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
		WebElement processPropertyConveyanceMenu;
		
		@FindBy(xpath = "//div[@class='dx-switch-off']")
		WebElement compactModeOff;
		
		@FindBy(xpath = "//div[@class='dx-switch-on']")
		WebElement compactModeOn;
		
		@FindBy(xpath = "(//div[@role='tab'])[2]") //"//div[@class='dx-item dx-tab dx-tab-selected']")
		WebElement completedTab;
		
		@FindBy(xpath ="(//div[@role='tab'])[1]") //"//div[@class='dx-item dx-tab dx-tab-selected dx-state-hover']")
		WebElement openTab;
		
		@FindBy(xpath="(//input[contains(@class,'dx-texteditor-input')])[2]")
		WebElement fromDate;
		
		@FindBy(xpath="(//input[contains(@class,'dx-texteditor-input')])[3]")
		WebElement toDate;
		
		
		
		//xpath for delete action

		@FindBy(xpath ="(//div[@class='menu-text'])[3]")
			WebElement deleteCoummunity;

		//xpath for refreshbutton

		   @FindBy(xpath = "//dx-button[@hint='Refresh'][contains(.,'Refresh')]") // "(//div[contains(@class,'dx-button-content')])[16]")
			public WebElement refreshButton;
			
			@FindBy(xpath = "(//div[@class='dx-button-content'])[13]")
			public WebElement showSearch;
			
		
			//xpath for process property
			@FindBy(xpath = "(//div[@aria-label='Action'])[2]")
			public WebElement actionProcess;
			
			
			@FindBy(xpath = "(//div[@ng-reflect-klass='menu-text'])[1]")
			public WebElement processProperty;
			
			
			@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
			public WebElement selectCommunity;
			
			
			@FindBy(xpath = "//td[normalize-space()='161 Gilbert Street']")
			public WebElement communityDropdown;
			
			@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[22]")
			public WebElement propertyAdress;
			
			
			@FindBy(xpath = "//span[normalize-space()='Search']")
			public WebElement search;
			
			
			@FindBy(xpath = "(//td[normalize-space()='161 Gilbert Street'])[2]")
			public WebElement communityValue;
			
			@FindBy(xpath = "//div[@class='dx-item dx-toolbar-item dx-toolbar-button']//span//span[1]")
			public WebElement nextbutton;	
			
			@FindBy(xpath = "//div[@title='Next']//span//span[1]")
			public WebElement nextbutton2;
			
			@FindBy(xpath = "(//input[contains(@class,'dx-texteditor-input')])[29]")
			public WebElement owner;
			
			
			@FindBy(xpath = "(//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[4]")
		    public WebElement ownerSearch;
			
			@FindBy(xpath = "(//td[text()='Romich'])[1]")
			public WebElement ownerValue;
			
			
			@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
			public WebElement close;
			
			//xpath for expandoptionclick 
			
			@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-minus-square']")
			public WebElement iSquare;
			
			
			@FindBy(xpath = "//i[@class='dx-icon cc-icon far fa-plus-square']")
			public WebElement iSquarePlus;
			
			@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-ban fa-flip-horizontal']")
			public WebElement reset;
			
			@FindBy(xpath = "//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-success dx-button-has-text']")
			public WebElement closeButton;
			
			
			@FindBy(xpath = "(//div[@class='dx-widget dx-button dx-button-mode-text dx-button-normal dx-button-has-icon dx-closebutton'])[2]")
			public WebElement closeButtonToggle;
			
			
			
	public void PropertyConveyanceWorkQueuePageLanding() {
		driver.navigate().to(strPropertyConveyanceURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("======== Navigating to Work Orders ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page URL is : " + driver.getCurrentUrl());
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, strPropertyConveyanceURL);
	}
	
	public void ToolBarFullScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		js.executeScript("arguments[0].click();", fullScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		if(normalScreenIcon.isDisplayed())
		{
			System.out.println("FullScreen Menu button clicked");
		}
		else
		{
			System.out.println("FullScreen Menu button not clicked");
		}

	}
	
	public void ToolBarNormalScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		js.executeScript("arguments[0].click();", normalScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		if(fullScreenIcon.isDisplayed())
		{
			System.out.println("NormalScreen Menu button clicked");
		}
		else
		{
			System.out.println("NormalScreen Menu button not clicked");
		}
	}
	
	public void actionEditCommunityCancel() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		actionButton.click();
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-icon']")));
		
		System.out.println("Clicked On Action Button for Edit community and Cancel");
		
		editCommunity.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-icon']")));
		System.out.println("Clicked On Edit Community Button");
		
		editCommunityCancel.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
		System.out.println("Clicked On Edit Community cancel Button");
		
	}
	
	public void actionEditCommunityUpdate() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));

		actionButton.click();
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
		System.out.println("Clicked On Action Button for Community update");
		
		editCommunity.click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-icon']")));
		System.out.println("Clicked On Edit Community Button");
		
		communityDrpDown.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-icon']")));
		System.out.println("Clicked On Community DropDown");
		
		communityValueDrpDown.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
		System.out.println("Dropdown value selected");
		
		editCoummunityUpdate.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
		System.out.println("Clicked on Update Button");
	}
	
	public void actionClearCommunity() 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		
		actionButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
		System.out.println("Clicked on action Button for Clear Community");
		
		clearCoummunity.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderTxt)));
		System.out.println("Community cleared successfully.");
		
	}
	
	
	public boolean columnChooserClick() {
		
		String columnChooserList = "div[class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable'] ul[role='group'] li";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(resetLayout));
		System.out.println("++++++In select Coloumn Chooser+++++++");
		wait.until(ExpectedConditions.elementToBeClickable(columnChooser));
		js.executeScript("arguments[0].click();", columnChooser);

		System.out.println("Clicked Column Chooser");

		List<WebElement> workOrdersColumnChooser = driver.findElements(By.cssSelector(columnChooserList));
		System.out.println("List size is: " + workOrdersColumnChooser.size());

		wait.until(ExpectedConditions.elementToBeClickable(closeColChooser));

		closeColChooser.click();

		System.out.println("Column Chooser closed");
		return true;
	}
	
	public void compactModeToggleOnPropertyConveyancePopup() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String loaderOfPage = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderOfPage)));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		js.executeScript("arguments[0].click();", actionProcess);
		
		processProperty.click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderOfPage)));
		
		String managePopup = driver.getWindowHandle();
		driver.switchTo().window(managePopup);
		System.out.println("Inside Create Property Coveyance PopUp");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(closeButton.isDisplayed())
	    {
			System.out.println("Close button is seen and clicked.");
	    	 closeButton.click();	
	    }
		
		js.executeScript("arguments[0].click();", compactModeOff);
		System.out.println("Compact Mode Off clicked");
		wait.until(ExpectedConditions.elementToBeClickable(compactModeOn));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		js.executeScript("arguments[0].click();", compactModeOn);
		System.out.println("Compact Mode ON is clicked");
		
		//escapeCode();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		closeButtonToggle.click();
		System.out.println("Closed Button Clicked sucessfully");
	}

	
	public void searchWorkQueueButtonClick() 
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		completedTab();
		
		
		fromDate.clear();
		fromDate.sendKeys("01/01/2020");
		
		driver.findElement(By.xpath("(//input[contains(@class,'dx-texteditor-input')])[4]")).sendKeys("1100");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String searchWorkQueue = "(//div//dx-button[@class='dx-widget dx-button dx-button-mode-contained dx-button-default dx-button-has-text dx-button-has-icon'])[2]";
		
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath(searchWorkQueue)));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderTxt)));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='cc-page-info dx-template-wrapper dx-item-content dx-toolbar-item-content']")).getText());
		js.executeScript("arguments[0].click();", openTab);
		//openTab.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Clicked on Open Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderOfPage)));
	}
	
	public void toggleCompletedOpenTabClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		completedTab();
		
		if (fromDate.isDisplayed()) {
			assertTrue(fromDate.isDisplayed(),"Completed Tab is not clicked");
		}
		
		js.executeScript("arguments[0].click();", openTab);
		//openTab.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderOfPage)));
	}
	
	public void completedTab() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderOfPage)));
		
		js.executeScript("arguments[0].click();", completedTab);
		
		
		String completedLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadindicator-segment dx-loadindicator-segment2']";
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(completedLoader)));
	}
	

	public void verifyActionDelete()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		actionButton.click();
		
		System.out.println("Clicked on action Button for Delete");
		
		deleteCoummunity.click();
		
		System.out.println("Clicked on delete Button");
	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		escapeCode();
		
		System.out.println("Escaped the Confirmation Popup");
		
	}
	
	public void escapeCode() {
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
	}
	
	public void verifyRefreshButton() 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable(refreshbuttonclick));
		
		js.executeScript("arguments[0].click();", refreshButton);
		//refreshbuttonclick.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderOfPage)));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='dx-loadindicator-icon'])[1]")));
		System.out.println("Verify Refresh");
		
		
	}
	
	
	public void expandOptionClick() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
		
		WebElement communityColumn = driver.findElement(By.xpath("//td[@aria-label='Column Community']")); 
		WebElement toGroupPanel = driver.findElement(By.xpath("//div[@class='dx-group-panel-message']"));
	
		Actions act=new Actions(driver);
		
		act.dragAndDrop(communityColumn, toGroupPanel).build().perform();
		
		System.out.println("Performed Drag an Drop Operation");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		iSquare.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
        
		iSquarePlus.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));
        
		reset.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(sLoader)));

	}
	
	public void verifyActionProcessPropertyConveyance() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(loaderOfPage)));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		js.executeScript("arguments[0].click();", actionProcess);
		//actionProcess.click();
		System.err.println("Clicked on Process Property Action Button");
		
		
		processProperty.click();
		System.out.println("Clicked on Process Property  Button");
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

	    if(closeButton.isDisplayed())
	    {
	    	 closeButton.click();
	    	
	    }
	    
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		selectCommunity.click();
		System.out.println("Clicked on select community Button");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		communityDropdown.click();
		System.out.println("Clicked on  community dropdown Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		propertyAdress.sendKeys("161");
		System.out.println("Clicked on  Property address Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		search.click();
		System.out.println("Clicked on Search Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		communityValue.click();
		System.out.println("Clicked on Community Value Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		nextbutton.click();
		System.out.println("Clicked on Next Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		nextbutton2.click();
		System.out.println("Clicked on second Next Button");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
	//	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
	//	wait2.until(ExpectedConditions.visibilityOf(owner)); 
	//	wait2.until(ExpectedConditions.elementToBeClickable(owner));
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", owner);
		owner.click();
		owner.sendKeys("romich");
		System.out.println("Clicked on owner Button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		ownerSearch.click();
		System.out.println("Clicked on ownerSearch Button");
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
       
	    ownerValue.click();
		System.out.println("Clicked on ownervalue Button");
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

	    nextbutton2.click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
	    nextbutton2.click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		

	    nextbutton2.click();
	    System.out.println("Clicked on Final Next Button");
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

	  //  close.click();
	   escapeCode();	    
	}
}
