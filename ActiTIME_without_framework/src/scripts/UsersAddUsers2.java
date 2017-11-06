package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPagePO;
import pageObjects.UsersPagePO;

public class UsersAddUsers2 {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/rsalimath/login.do");
		
		try {
			LoginPagePO lp = new LoginPagePO(driver);
			lp.loginnew("rajesh.salimat1", "mybeHUzY");
			
			UsersPagePO up = new UsersPagePO(driver);
			up.viewInviteSeveralUsersAtOnce(driver);
			
			System.out.println("task passed");
			
		} catch (Exception e) {
			System.out.println("task failed");
		}
	}
}
