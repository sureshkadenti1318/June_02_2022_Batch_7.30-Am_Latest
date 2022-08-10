package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1_BrowserCommands_Part_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		String pageSoure = driver.getPageSource();
		System.out.println("----pageSoure---" + pageSoure);// https://www.google.com/
		Thread.sleep(3000);

		
		driver.close();

	}

}
