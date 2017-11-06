package com.normal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class taskList {
	public static WebDriver driver;
	public WebDriverWait wait;
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		taskList tl = new taskList();
		tl.wait = new WebDriverWait(driver, 20);
		
		driver.get("https://online.actitime.com/rsalimath/login.do");
		String loginTitle = "actiTIME - Login";
	
		String str = driver.getTitle();
		
		if(loginTitle.equals(str)){
			try{				
				driver.findElement(By.id("username")).sendKeys("rajesh.salimat1");	
				driver.findElement(By.name("pwd")).sendKeys("mybeHUzY");
				driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
				
				driver.findElement(By.xpath("//a[@href='/rsalimath/tasks/tasklist.do']")).click();
				driver.findElement(By.xpath("//div[@id='taskListBlock']/div[@class='tasksTable']//div[@class='taskRowsTableContainer']//table[@class='taskRowsTable']//tr[1]//td[3]//div[@class='open']")).click();
		
		//		driver.findElement(By.xpath("//div[@id='taskListBlock']/div[@class='tasksTable']//div[@class='taskRowsTableContainer']//table[@class='taskRowsTable']//tr[1]//td[3]//div[@class='completed']")).click();
				
	/*			RemoteWebDriver r = (RemoteWebDriver) driver;
				WebElement ele = driver.findElement(By.xpath("//div[@id='taskListBlock']/div[@class='tasksTable']//div[@class='taskRowsTableContainer']//table[@class='taskRowsTable']//tr[1]//td[3]//div[@class='completed']"));
				r.executeScript("window.scrollTo(0,"+ele.getLocation().getY()+")");
				ele.click(); */
				
	//			tl.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='taskListBlock']/div[@class='tasksTable']//div[@class='taskRowsTableContainer']//table[@class='taskRowsTable']//tr[1]//td[3]//div[@class='completed']"))).click();
				
		//		WebElement ele1 = driver.findElement(By.xpath("//div[@id='taskListBlock']/div[@class='tasksTable']//div[@class='taskRowsTableContainer']//table[@class='taskRowsTable']//tr[1]//td[3]//div[@class='completed']"));
		//		r.executeScript("window.scrollTo(0,"+ele.getLocation().getY()+")");
		//		ele1.click();
			}catch(Exception e){
				System.out.println("problem in the program");
			}
				
		}
		else{
			System.out.println("Not login page");
		}
	}
}