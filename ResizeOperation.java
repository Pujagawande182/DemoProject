package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeOperation {
	
@Test
	
	public void resizable() throws InterruptedException 
	{
		    // Initialize the browser
		    WebDriver driver = new ChromeDriver();
			
		    //launch the web page
			driver.get("https://jqueryui.com/resizable/");
			
			//maximize the window
			driver.manage().window().maximize();
			
			// take a pause
			Thread.sleep(2000);
			
			//SOP statement
			System.out.println("Chrome browser launch....");
			
			Thread.sleep(2000);
			
			// to enter into the frame
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			
			driver.switchTo().frame(frame);
			
			WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")); 
			
			Actions a = new Actions(driver);
            
			a.clickAndHold(resizable).moveByOffset(70, 70).release().build().perform(); 
			
			
}
}

