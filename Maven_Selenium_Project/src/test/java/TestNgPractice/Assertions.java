package TestNgPractice;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;

//@Test(priority = 1)
	public void hardAssert() {

		int a = 5;
		int b = 10;
		Assert.assertEquals(a, b);

		System.out.println("----done--");

	}

	@Test(priority = 2)
	public void SoftAssert() {
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();

		int a = 10;
		int b = 11;
		soft.assertEquals(a, b);
		System.out.println("----done--");
		soft.assertAll();
	}

}
