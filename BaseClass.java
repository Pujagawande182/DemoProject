package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	 static WebDriver driver;
		
		@BeforeMethod
		public void driverInitialze() throws InterruptedException
		{
	        driver = new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
			System.out.println("Chrome browser launch....");
			
			Thread.sleep(3000);
			
		}
		 
		
		  @AfterMethod
		  public void driverclose()
		  {
			  System.out.println("Close the browser");
			  
			  driver.quit();
			 
			  
		  }
		  
}


