package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider_Example {
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
			
			driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(UN);
			
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Pwd);
		
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
Thread.sleep(300);
			
//			driver.findElement(By.xpath("//input[@id='userId']")).clear();
//			
//			driver.findElement(By.xpath("//input[@id='pass']")).clear();
//			
//			driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("UserName_2");
//			
//			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("PWD_2");
//		
//			driver.findElement(By.xpath("//input[@value='Submit']")).click();
				

		
		}
		
		
		@DataProvider()
		
		public Object[][] testdata()
		{
			Object[][] data=new Object[3][2];//rows &columns
			
			data[0][0]="UserName_1";
			data[0][1]="Password_1";
			
			data[1][0]="UserName_2";
			data[1][1]="Password_2";
			
			data[2][0]="UserName_2";
			data[2][1]="Password_2";
			return data;
			
		}
		
		
		
		
		
		
@AfterClass
public void ClosingBrowser()
{
	driver.close();
}




}
