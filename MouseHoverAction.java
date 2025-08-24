package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverAction extends BaseClass {

	@Test
	
	public void mouseHover() throws InterruptedException
	{
		
		WebElement mouseHover=driver.findElement(By.id("mousehover"));
		
		//scroll down the page till find the element
	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",mouseHover);
		
         Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mouseHover).build().perform();
		
	}
	
}
