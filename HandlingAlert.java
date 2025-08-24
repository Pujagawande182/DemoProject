package com.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HandlingAlert extends BaseClass {

	@Test
	
	public void alert() throws InterruptedException
	{
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(2000);
		
		// for click on ok button
		//driver.switchTo().alert().accept();
		
		System.out.println(driver.switchTo().alert().getText());
	    
		driver.switchTo().alert().dismiss();
		
		driver.close();
		
		
	}
}
