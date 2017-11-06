package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPagePO {
	WebDriverWait wait;
	LoginPagePO lp;
	
	public LoginPagePO(WebDriver driver){
		PageFactory.initElements(driver, this);
		wait  = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
	}
	
	@FindBy(id="username")
	private WebElement unTxtBx;
	
	@FindBy(name="pwd")
	private WebElement pwTxtBx;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	private WebElement loginBtn;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInChkbx;
	
	public void loginWithRememberMe(String un, String pw){
			unTxtBx.sendKeys(un);
			pwTxtBx.sendKeys(pw);
			keepLoggedInChkbx.click();
			loginBtn.click();
	}
	
	public void loginnew(String un, String pw){
			unTxtBx.sendKeys(un);
			pwTxtBx.sendKeys(pw);
			loginBtn.click();
	}
	
	public void checkTitle(String title){
		wait.until(ExpectedConditions.titleIs(title));
	}
}
