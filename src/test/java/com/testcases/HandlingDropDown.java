package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropDown {

	@Test  // use of test annotation is before any method
	public void verifyDropDown() throws InterruptedException // create one method
	{
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(1);
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Option3");
		
		
		
	}
	


}
