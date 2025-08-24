package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A {
    
	@BeforeSuite
		public void beforesuite()
	{
		System.out.println("this code will execute before suite");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("this code will execute after suite");
	}
	
    @BeforeMethod
	public void beforemethod()
	{
		System.out.println(" this code will execute before every method");
	}
	
	@AfterMethod
		public void aftermethod()
	{
		System.out.println("this code will execute after every method");
	}
		
	@Test
	
	public void m1()
	{
		System.out.println("First Method");
	}
	
	 @Test
	 
	 public void m2()
	 {
		 System.out.println("Second Method");  
	 }
	 
	 @BeforeClass
	 	 public void beforeclass()
	 {
		 System.out.println(" this code will execute before class");
	 }
	 
	 @AfterClass
	 	 public void afterclass()
	 {
		 System.out.println("this code will execute after class");
	 }
	
}
