package practice;

import org.testng.annotations.Test;

public class C {

	@Test(groups = "smoke")
	
	public void enterDetails()
	{
		System.out.println("Enter the valis UN and PWD");
	}
	
	@Test
	
	public void verifyLoginButton()
	{
		System.out.println(" Code to verify succeeful login"); 
	}
	
}
