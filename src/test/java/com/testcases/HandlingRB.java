package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRB {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		// use list interface
	    List<WebElement> e=driver.findElements(By.xpath("//input[@class='radioButton']"));  
		
	/**    //use for loop e is the list of name   // size start from 1 and index start from zero
		for(int i=0; i<e.size(); i++)
		{
			e.get(i).click();
			Thread.sleep(3000);
			
		}
		**/
	    // for each loop
	    for(WebElement k:e)
	    {
	    	k.click();
	    	Thread.sleep(3000);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		

	}

}
