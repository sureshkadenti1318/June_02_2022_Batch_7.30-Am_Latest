package TestNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_Browser {
	WebDriver driver;

		@BeforeClass
		public void browser()
		{

			WebDriverManager.chromedriver().setup();
			
			 driver= new ChromeDriver();
			
			driver.manage().window().maximize();
		
		}
		
		@Test
		public void urltest()
		{
			
			driver.get("https://www.google.com/");

				

		
		}
@AfterClass
public void closngbrwr()
{
	driver.close();// it will close only currently focused browsr window 
	
	//driver.quit();// close all browser windows ,which are opend by selenium webdrive
}




}
