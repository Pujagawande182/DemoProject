package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion  {

	@Test
	
	public void m1()
	{
		String name="Puja";
		String name1="Puja";
		Assert.assertEquals(name, name1);
		System.out.println("This is m1");
		
	}
	
	@Test
	
	public void m2()
	{
		String name="Pizza";
		String name1="Pizz";
		Assert.assertNotEquals(name, name1);
		System.out.println("This is m2");

	}
	
	
	@Test
	
	public void m3()
	{
		Assert.assertTrue(true);
		System.out.println("This is m3");

	}
	
	@Test

      public void m4()
      {
		Assert.assertFalse(false);
		System.out.println("This is m4");

      }

	@Test

    public void m5()
    {
		String name="";
		Assert.assertNotNull(name);
		System.out.println("This is m5");

    }
	
	@Test

    public void m6()
    {
		String name="puja";
		Assert.assertNotNull(name);
		System.out.println("This is m6");

    }
	
	
	
}
