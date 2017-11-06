package com.normal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class blankLogin {
		
		public static WebDriver driver;
		public WebDriverWait wait;
		
		public static void main(String args[]){
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			blankLogin bl = new blankLogin();
			bl.wait = new WebDriverWait(driver, 20);
			
			driver.get("https://online.actitime.com/rsalimath/login.do");
			String loginTitle = "actiTIME - Login";
			
			String str = driver.getTitle();
				
			if(loginTitle.equals(str)){
				try{				
					driver.findElement(By.id("username")).sendKeys("");	
					driver.findElement(By.name("pwd")).sendKeys("");
					driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
				
			//		driver.findElement(By.id("logoutLink")).click();
				
					System.out.println("blank login passed, not logged into application");
				}catch(Exception e){
					System.out.println("blank login failed");
				}
				
			}
			else{
				System.out.println("Not login page");
			}
				
			
			//driver.quit();
		}
	}
