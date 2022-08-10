package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Example {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
WebElement User_Email=driver.findElement(By.className("selectors-input jsSelector"));//User Email
	
User_Email.sendKeys("Test");

		
//driver.findElement(By.className("selectors-input jsSelector")).sendKeys("tt");


WebElement compnay=driver.findElement(By.className("form-control"));//4

compnay.sendKeys("Rao");


WebElement User_Email1=driver.findElement(By.id("userId"));//2

User_Email1.clear();
driver.findElement(By.name("email"));//3

driver.findElement(By.tagName("input"));//5

driver.findElement(By.linkText("DownLoad Link"));// only for links
driver.findElement(By.partialLinkText("DownLoad"));//only for links

driver.findElement(By.cssSelector(""));// dont use 


driver.findElement(By.xpath("//input[@id='inp_val']")); // 1






















		
	}

}
