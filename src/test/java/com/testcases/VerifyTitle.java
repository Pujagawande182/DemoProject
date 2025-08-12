package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		
		Thread.sleep(3000);
	
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()); 
		
		String excepted_tital="OrangeHRM";
		
		String actual_tital=driver.getTitle();
		
		Assert.assertEquals(excepted_tital, actual_tital);

		System.out.println("The tital is verified and correct....");
		
		System.out.println("Pass....");
		
		driver.close();
	}

}
