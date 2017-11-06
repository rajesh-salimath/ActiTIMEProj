package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportsPO {
	WebDriverWait wait;
	
	public ReportsPO(WebDriver driver){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/rsalimath/tasks/tasklist.do']")));
	}
	
	@FindBy(xpath="//a[@href='/rsalimath/reports/reports.do']")
	private WebElement selectReports;
	
	@FindBy(xpath="//table[@id='reportConfig_42']//div[text()='Monthly Team Performance']")
	private WebElement selectMonthlyTeamPerformance;
	
	@FindBy(xpath="//table[@id='reportConfig_47']//div[text()='Team Hours & Overtime']")
	private WebElement selectHoursOvertime;
	
	@FindBy(xpath="//table[@id='reportConfig_77']//div[text()='Team Leaves by months']")
	private WebElement selectTeamLeavesByMonth;
	
	@FindBy(xpath="//td[@onclick='print()']")
	private WebElement selectPrintOption;
	
	@FindBy(xpath="//div[@id='ext-comp-1022']/span[text()='Create Chart']")
	private WebElement selectCreateChart;
	
	public void viewCreateChart(WebDriver driver){
		selectReports.click();
	//	selectCreateChart.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+selectCreateChart.getLocation().getY()+")");
		selectCreateChart.click();
	}
	
	public void viewMonthlyTeamPerformance(WebDriver driver){
		selectReports.click();
	//	selectMonthlyTeamPerformance.click();
	//	selectPrintOption.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+selectMonthlyTeamPerformance.getLocation().getY()+")");
		selectMonthlyTeamPerformance.click();
		
		RemoteWebDriver r1 = (RemoteWebDriver) driver;
		r1.executeScript("window.scrollTo(0,"+selectPrintOption.getLocation().getY()+")");
		selectPrintOption.click();
	}
	
	public void viewHoursandOverTime(WebDriver driver){
		selectReports.click();
	//	selectHoursOvertime.click();
	//	selectPrintOption.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+selectHoursOvertime.getLocation().getY()+")");
		selectHoursOvertime.click();
		
		RemoteWebDriver r1 = (RemoteWebDriver) driver;
		r1.executeScript("window.scrollTo(0,"+selectPrintOption.getLocation().getY()+")");
		selectPrintOption.click();
	}
	
	public void viewTeamLeaves(WebDriver driver){
		selectReports.click();
	//	selectTeamLeavesByMonth.click();
	//	selectPrintOption.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+selectTeamLeavesByMonth.getLocation().getY()+")");
		selectTeamLeavesByMonth.click();
		
		RemoteWebDriver r1 = (RemoteWebDriver) driver;
		r1.executeScript("window.scrollTo(0,"+selectPrintOption.getLocation().getY()+")");
		selectPrintOption.click();
	}
}
