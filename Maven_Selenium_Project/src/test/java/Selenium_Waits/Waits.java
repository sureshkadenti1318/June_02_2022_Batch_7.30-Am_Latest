package Selenium_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

driver.findElement(By.xpath("//a[contains(text(),'Link')]"));


WebDriverWait wait = new WebDriverWait(driver, 10);


WebElement wb = driver.findElement(By.xpath("//a[contains(text(),'Link')]"));

wait.until(ExpectedConditions.visibilityOf(wb));

driver.findElement(By.xpath("//a[contains(text(),'Link')]")).click();






		
	}

}
