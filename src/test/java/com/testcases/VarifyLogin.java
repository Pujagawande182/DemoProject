package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VarifyLogin {
	// To Launch Browser

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// open url
		
		Thread.sleep(3000);
		// to take a pause
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		
		username.sendKeys("Admin");
		// to enter data in username
		
		Thread.sleep(3000);

		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys("admin123");
		// to enter the password
		
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.cssSelector("button[type='submit']"));
		
		login.click();
		// to click on login button
		
		Thread.sleep(3000);

		String Exceptedtital="OrangeHRM";
				
		String	Actualtital=driver.getTitle();	
		
		Assert.assertEquals(Exceptedtital, Actualtital);
		
		System.out.println("Pass.... "); 
		
	}

}
