package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_XpathFunctions_Example {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		

driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Test");

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@id='userId']")).clear();
Thread.sleep(3000);

String  attribut_value=driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("name"); //

System.out.println("----attribut_value---" +attribut_value);//Password
Thread.sleep(3000);

String text=driver.findElement(By.xpath("//a[normalize-space()='DownLoad Link']")).getText();

System.out.println("----text---" +text); // DownLoad Link


Thread.sleep(3000);
String tagname=driver.findElement(By.xpath("//a[normalize-space()='DownLoad Link']")).getTagName();

System.out.println("----tagname---" +tagname); // a

driver.findElement(By.xpath("//th[@class='checkbox-col']")).click();

String clorcode=driver.findElement(By.xpath("//th[@class='checkbox-col']")).getCssValue("color");

System.out.println("---clorcode----" +clorcode);//rgb

Thread.sleep(3000);

driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		














		
	}

}
