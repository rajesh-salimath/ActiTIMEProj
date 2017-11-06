package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeTrackPagePO {
	WebDriverWait wait;
	
	public TimeTrackPagePO(WebDriver driver){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
	}
	
	@FindBy(name="timeTrack[36].spentStr[0]")
	private WebElement enterTimeforEmailcheck;
	
	@FindBy(name="timeTrack[35].spentStr[0]")
	private WebElement enterTimeforPhoneCalls;
	
	@FindBy(name="timeTrack[46].spentStr[0]")
	private WebElement enterTimeforServerMonitoring;
	
	@FindBy(name="timeTrack[56].spentStr[0]")
	private WebElement enterTimeforInstallOneOption;
	
	@FindBy(name="timeTrack[57].spentStr[0]")
	private WebElement enterTimeforIntegrateWith;
	
	@FindBy(name="timeTrack[47].spentStr[0]")
	private WebElement enterTimeforSpamFiltering;
	
	@FindBy(name="timeTrack[37].spentStr[0]")
	private WebElement enterTimeforStatusMeeting;
	
	@FindBy(name="timeTrack[48].spentStr[0]")
	private WebElement enterTimeforTrafficMonitoring;
	
	@FindBy(xpath="//div[@id='FormModifiedDivButton']")
	private WebElement saveButton;
	
	public void TimeTrackEmailCheck(String tim0, String tim1, String tim2, String tim3, String tim4, String tim5, String tim6, String tim7){
		enterTimeforEmailcheck.sendKeys(tim0);
		enterTimeforPhoneCalls.sendKeys(tim1);
		enterTimeforServerMonitoring.sendKeys(tim2);
		enterTimeforInstallOneOption.sendKeys(tim3);
		enterTimeforIntegrateWith.sendKeys(tim4);
		enterTimeforSpamFiltering.sendKeys(tim5);
		enterTimeforStatusMeeting.sendKeys(tim6);
		enterTimeforTrafficMonitoring.sendKeys(tim7);
		saveButton.click();
	}
	
	@FindBy(xpath="//a[text()='Approve Time-Track']")
	private WebElement selectApproveTimeTracker;
	
	@FindBy(xpath="//a[text()='Gibson, Maurice']")
	private WebElement selectUser;
	
	@FindBy(xpath="//td[@id='addPreviousWeekAllTasksButton']")
	private WebElement selectALLPreviousWeek;
	
	public void viewApproveTimeTrack(){
		selectApproveTimeTracker.click();
		selectUser.click();
		selectALLPreviousWeek.click();
	}
	
	@FindBy(xpath="//a[text()='Lock Time-Track']")
	private WebElement selectLockTimeTracker;
	
	public void viewLockTimeTrack(){
		selectLockTimeTracker.click();
	}
	
	@FindBy(xpath="//a[@href='/rsalimath/user/view_tt.do']")
	private WebElement selectViewTimeTracker;
	
	@FindBy(xpath="//span[@id='ext-gen45']")
	private WebElement selectMonthWeekQuarter;
	
	@FindBy(xpath="//span[text()='Sep 04, Mon']")
	private WebElement TimeTrackDetails;
	
	public void viewTimeTrack(){
		selectViewTimeTracker.click();
		selectMonthWeekQuarter.click();
		TimeTrackDetails.click();
	}
}
