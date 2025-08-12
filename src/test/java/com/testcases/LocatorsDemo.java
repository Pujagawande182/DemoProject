package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://login.salesforce.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement username= driver.findElement(By.id("username"));
		
		username.click();
		
		username.sendKeys("pujagawande182@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id("password"));
		
		password.click();
		
		password.sendKeys("Puja@182");
		
		Thread.sleep(3000);
		
	    driver.close();
	    
	    
	    
		
	}

}
