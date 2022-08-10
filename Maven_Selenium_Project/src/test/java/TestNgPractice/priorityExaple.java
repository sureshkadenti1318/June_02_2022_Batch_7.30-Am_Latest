package TestNgPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class priorityExaple {
	WebDriver driver;

	@BeforeClass // Precondition

	public void openBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test(priority = 1)

	public void zflipkartTittle() throws InterruptedException {

		driver.get("https://www.flipkart.com/");
		String flpkart_tittle = driver.getTitle();
		System.out.println("---flpkart_tittle---" + flpkart_tittle);

	}

	@Test(priority = 1)

	public void googleTittle() throws InterruptedException {

		driver.get("https://www.amazon.in/");
		String Amazon_tittle = driver.getTitle();
		System.out.println("---Amazon_tittle---" + Amazon_tittle);
		
		Assert.assertEquals(Amazon_tittle, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		
		
		
	}

	
	@AfterClass
	public void closingBrowser()
	{
		driver.close();
	}
	
	
}
