package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingSlider {
	
@Test
	
	public void slider() throws InterruptedException 
	{
		    // Initialize the browser
		    WebDriver driver = new ChromeDriver();
			
		    //launch the web page
			driver.get("https://jqueryui.com/slider/");
			
			//SOP statement
			System.out.println("Chrome browser launch....");
			
			Thread.sleep(2000);
			
			//maximize the window
			driver.manage().window().maximize();
			
			// take a pause
			Thread.sleep(2000);
			
			// into the frame
	     	driver.switchTo().frame(0);
	     	
	     	WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	     	
	     	// create object for action class
	     	
	     	Actions a = new Actions(driver);
	     	
	     	a.clickAndHold(slider).moveByOffset(150, 0).release().perform();	     	
	}
}

