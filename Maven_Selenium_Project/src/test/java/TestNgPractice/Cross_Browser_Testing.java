package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_Testing {
	WebDriver driver;

		@BeforeClass
		public void browser()
		{

			WebDriverManager.chromedriver().setup();
			
			 driver= new ChromeDriver();
			
			driver.manage().window().maximize();
		
		}
		
		@Test(dataProvider ="testdata" )
		public void urltest(String UN ,String Pwd) throws InterruptedException // UN=UserName_1,pwd=Password_1
		{
			
			driver.get("https://selectorshub.com/xpath-practice-page/");
			
		
			driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("UserName_2");
			
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("PWD_2");
		
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
				

		
		}
		
		
		
		
		
		
@AfterClass
public void ClosingBrowser()
{
	driver.close();
}




}
