package Selenium_Basics_Opening_Different_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maximize_ChromeBrowser {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "E:\\Training_Batches\\June_02_2022_Batch_7.30 Am\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
				
		
		WebDriver driver= new ChromeDriver(); // Webdriver: interface , driver---Reference Variable , new --Keyword ,Chromedriver()-Class
				
		driver.manage().window().maximize();
		
		
	}
	
	
}
