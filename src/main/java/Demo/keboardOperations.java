package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class keboardOperations 
{
    
	WebDriver driver;
	
	@BeforeMethod
	public void m2() throws InterruptedException
	{
		 driver = new ChromeDriver();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 driver.manage().window().maximize();
		 
		 Thread.sleep(4000);
		
	}
	
	@Test

    public void m1() throws InterruptedException
    {
	
	     WebElement UN= driver.findElement(By.xpath("//input[@name='username']")); 	
	 
	      UN.sendKeys("Admin");
	      
	 	 Thread.sleep(4000);
	 	 
	      WebElement PWD=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	      
	      // to select the all content
	      UN.sendKeys(Keys.CONTROL+"a");
	      
	      // to select the copy content
	      UN.sendKeys(Keys.CONTROL+"c");
	      
	      // to copy the content
	      PWD.sendKeys(Keys.CONTROL+"v");
	      
	      PWD.sendKeys(Keys.ARROW_LEFT);
	      PWD.sendKeys(Keys.ARROW_LEFT);
	      PWD.sendKeys(Keys.ARROW_LEFT);
	      PWD.sendKeys(Keys.ARROW_LEFT);
	      
	      Thread.sleep(4000);
	
	      PWD.sendKeys(Keys.BACK_SPACE);
	      
	      PWD.sendKeys(Keys.CONTROL+"c");

	      PWD.sendKeys("admin123");

	      
	      Thread.sleep(4000);
	      
    }
    
	@AfterMethod
	public void m3()
	{
		driver.close();
	}
	
}
