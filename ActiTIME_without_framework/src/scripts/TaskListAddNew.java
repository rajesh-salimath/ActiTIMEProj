package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPagePO;
import pageObjects.TaskListPagePO;

public class TaskListAddNew {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/rsalimath/login.do");
		
	//	String expected = "actiTIME - Enter Time-Track";
		try{
			LoginPagePO lp = new LoginPagePO(driver);
			lp.loginWithRememberMe("rajesh.salimat1", "mybeHUzY");

			TaskListPagePO tp = new TaskListPagePO(driver);
			tp.viewTaskListAddNew(driver);
				
			System.out.println("task passed");
		}catch(Exception e){
			System.out.println("task failed");
		}
		
				
	}
}
