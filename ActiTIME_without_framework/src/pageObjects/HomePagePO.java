package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePO {
	WebDriverWait wait;
	
	public HomePagePO(WebDriver driver){
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public void logOut(){
		logoutLink.click();
	}
}
