package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePagePO;
import pageObjects.LoginPagePO;
import pageObjects.TaskListPagePO;

public class TaskListArchitecture {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/rsalimath/login.do");
		
	//	String expected = "actiTIME - Enter Time-Track";
		try{
			String Title = "actiTIME - Login";
			LoginPagePO lp = new LoginPagePO(driver);
			lp.loginWithRememberMe("rajesh.salimat1", "mybeHUzY");

			TaskListPagePO tp = new TaskListPagePO(driver);
			tp.viewArchitecture();
				
			HomePagePO hp = new HomePagePO(driver);
			hp.logOut();
			lp.checkTitle(Title);

			System.out.println("task passed");
		}catch(Exception e){
			System.out.println("task failed");
		}
		
				
	}
}
