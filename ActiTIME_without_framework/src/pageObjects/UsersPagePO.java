package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPagePO {
	WebDriverWait wait;
	
	public UsersPagePO(WebDriver driver){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/rsalimath/administration/userlist.do']")));
	}
	
	@FindBy(xpath="//a[@href='/rsalimath/administration/userlist.do']")
	private WebElement selectUsers;
	
	@FindBy(xpath="//div[@id='createUserDiv']//div[text()='Add Users']")
	private WebElement AddUsers;
	
	@FindBy(xpath="//body[@id='usersManagementBodyTagId']//div[text()='Configure new user profile']")
	private WebElement selectConfigNewUserProfile;
	
	@FindBy(xpath="//body[@id='usersManagementBodyTagId']//div[text()='Invite several users at once']")
	private WebElement selectInviteSeveralUsers;
	
	public void viewConfigNewUserProfile(WebDriver driver){
		selectUsers.click();
	//	AddUsers.click();
	//	selectConfigNewUserProfile.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+AddUsers.getLocation().getY()+")");
		AddUsers.click();
		
		RemoteWebDriver r1 = (RemoteWebDriver) driver;
		r1.executeScript("window.scrollTo(0,"+selectConfigNewUserProfile.getLocation().getY()+")");
		selectConfigNewUserProfile.click();
	}
	
	public void viewInviteSeveralUsersAtOnce(WebDriver driver){
		selectUsers.click();
	//	AddUsers.click();
	//	selectInviteSeveralUsers.click();
		
		RemoteWebDriver r = (RemoteWebDriver) driver;
		r.executeScript("window.scrollTo(0,"+AddUsers.getLocation().getY()+")");
		AddUsers.click();
		
		RemoteWebDriver r1 = (RemoteWebDriver) driver;
		r1.executeScript("window.scrollTo(0,"+selectInviteSeveralUsers.getLocation().getY()+")");
		selectInviteSeveralUsers.click();
	}
}
