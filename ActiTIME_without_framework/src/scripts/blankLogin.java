package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePagePO;
import pageObjects.LoginPagePO;

public class blankLogin {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/rsalimath/login.do");
		
	//	String expected = "actiTIME - Enter Time-Track";
		try{
			String Title = "actiTIME - Login";
			LoginPagePO lp = new LoginPagePO(driver);
			lp.loginWithRememberMe(" ", " ");

			HomePagePO hp = new HomePagePO(driver);
			hp.logOut();
			lp.checkTitle(Title);

			System.out.println("valid login passed");
		}catch(Exception e){
			System.out.println("valid login failed");
		}
		
				
	}
}
