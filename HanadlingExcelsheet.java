package com.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HanadlingExcelsheet {
	@Test
	
	public void handlingsheet() throws IOException, InterruptedException{
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\Book1.xlsx"); 
		
		XSSFWorkbook worksheet = new XSSFWorkbook(fs);
		
		// to enter into a specific sheet
		XSSFSheet sheet = worksheet.getSheetAt(0);
		
		// to enter into a specific row
		XSSFRow row = sheet.getRow(1);
		
		// to enter into a specific column
		XSSFCell cell = row.getCell(0);	
		
		 //convert into string
		String username=cell.toString();
		
		System.out.println(cell);
		
		XSSFCell cell1= row.getCell(1);
		
		String password=cell1.toString();
		
		System.out.println(cell1);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement un=driver.findElement(By.id("username"));
		
		WebElement pwd=driver.findElement(By.id("password"));
		
		un.sendKeys(username);
		
		Thread.sleep(3000);
		
		pwd.sendKeys(password);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
