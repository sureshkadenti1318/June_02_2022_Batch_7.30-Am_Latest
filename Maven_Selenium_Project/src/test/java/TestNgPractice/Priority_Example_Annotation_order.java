package TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
 * ----@BeforeSuite----
--@BeforeTest----
--@BeforeClass----
--@BeforeMethod----
----@Test----
--@AfterMethod---
--@AfterClass----
--@AfterTest----
 */



public class Priority_Example_Annotation_order {

	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("----@BeforeSuite----");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("----@AfterSuite----");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("--@BeforeClass----");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("--@AfterClass----");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("--@BeforeTest----");
	}
	
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("--@AfterTest----");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("--@BeforeMethod----");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("--@AfterMethod---");
	}
	
	
	
	
	@Test(priority = 1)
	public void test()
	{
		System.out.println("----@Test----");
	}
	
	@Test(priority =2 )
	public void test2()
	{
		System.out.println("----@Test2----");
	}
	
	@Test(priority = 4)
	public void test3()
	{
		System.out.println("----@Test3----");
	}
	
	
	
	@Test(priority = 4 )
	public void test4()
	{
		System.out.println("----@test4----");
	}
	
	@Test(priority = 5)
	public void test5()
	{
		System.out.println("----@test5----");
	}
	
	

}
