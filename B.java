package practice;

import org.testng.annotations.Test;

public class B {

	@Test(groups = "smoke")
	
	public void lauchBrowser()
	{
		System.out.println("Browser get launched...");
	}
	
    @Test(priority = 2)
	
	public void enterurl()
	{
		System.out.println("Webpage is displayed....");
	}

      @Test(priority = 3)

       public void verifyLogin()
     {
	     System.out.println("login successful...");
    }
      
     }
