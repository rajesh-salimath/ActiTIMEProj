package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskListPagePO {
	WebDriverWait wait;
	
	public TaskListPagePO(WebDriver driver){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/rsalimath/tasks/tasklist.do']")));
	}
	
	@FindBy(xpath="//a[@href='/rsalimath/tasks/tasklist.do']")
	private WebElement selectTaskList;
	
	@FindBy(xpath="//div[@id='taskListBlock']/div[@class='tasksTable']//div[@class='taskRowsTableContainer']//table[@class='taskRowsTable']//tr[1]//td[3]//div[@class='open']")
	private WebElement accountingStatus;
	
	@FindBy(xpath="//div[@id='cpTreeBlock']//div[text()='Add New']")
	private WebElement AddNew;
	
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement NewProject;
	
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement AddNewTask;
	
	@FindBy(xpath="//div[@class='item createNewTask ellipsis']")
	private WebElement CreatNewTask;
	
	@FindBy(xpath="//div[@id='cpTreeBlock']//div[contains(text(),'Architects Bureau')]")
	private WebElement selectArchitectureBureau;
	
	@FindBy(xpath="//div[@id='cpTreeBlock']//div[contains(text(),'Boston Chocolate')]")
	private WebElement selectBostonChocolate;
	
	public void viewBostonChocolate(){
		selectTaskList.click();
		selectBostonChocolate.click();
	}
	
	public void viewArchitecture(){
		selectTaskList.click();
		selectArchitectureBureau.click();
	}
	
	public void viewTaskListAddNew(WebDriver driver){
		selectTaskList.click();
		AddNew.click();
	//	NewProject.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+NewProject.getLocation().getY()+")");
		NewProject.click();
	}
	
	public void viewTaskListAddNewTask1(WebDriver driver){
		selectTaskList.click();
		AddNewTask.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+CreatNewTask.getLocation().getY()+")");
		CreatNewTask.click();

	}
	
	public void statusCheck(){
		selectTaskList.click();
		accountingStatus.click();
	}
	
}
