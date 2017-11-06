package com.normal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titles {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://online.actitime.com/rsalimath/login.do");
		
		driver.findElement(By.id("username")).sendKeys("rajesh.salimat1");	
		driver.findElement(By.name("pwd")).sendKeys("mybeHUzY");
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
