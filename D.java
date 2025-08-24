package practice;

import org.testng.annotations.Test;

public class D {

@Test()
	
	public void lauchBrowser()
	{
		System.out.println("Browser get launched...");
	}
	
    @Test()
	
	public void enterurl()
	{
		System.out.println("Webpage is displayed....");
	}

      @Test(groups = "smoke")

       public void verifyLogin()
     {
	     System.out.println("login successful...");
    }
	
}
