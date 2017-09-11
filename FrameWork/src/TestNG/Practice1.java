package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice1 {
	@BeforeTest
	public void Test0()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void Test5()
	{
		System.out.println("After Test");
	}
	@BeforeMethod
	public void Test4()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Hi 1");
		
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Hi 2");
		
	}

}
