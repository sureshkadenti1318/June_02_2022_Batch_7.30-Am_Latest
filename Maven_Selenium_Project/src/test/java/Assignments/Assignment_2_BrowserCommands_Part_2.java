package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_2_BrowserCommands_Part_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
