package com.testcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.firstcry.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl()); 
		
		driver.navigate().back();

		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
