package com.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlingFrames extends BaseClass {
	
	@Test
	
	public void frames() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//a[@href='lifetime-access'])[2]")).click();
		
	}
	

}
