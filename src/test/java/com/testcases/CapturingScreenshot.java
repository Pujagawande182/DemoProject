package com.testcases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturingScreenshot {

	@Test
	
	public void screenshot() throws InterruptedException, IOException
	{
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Asus\\OneDrive\\Desktop\\New folder\\pic.png");
		
		FileUtils.copyFile(src, dest);
		
		System.out.println("captutring the screenshot succeefully");
		
	}
	
}
