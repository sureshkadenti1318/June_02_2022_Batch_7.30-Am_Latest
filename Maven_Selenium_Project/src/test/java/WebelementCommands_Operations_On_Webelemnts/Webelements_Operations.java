package WebelementCommands_Operations_On_Webelemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelements_Operations {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
driver.findElement(By.xpath("//a[contains(text(),'Link')]"));
	
driver.findElement(By.xpath("(//a[@href='https://selectorshub.com/'])[3]"));

driver.findElement(By.xpath("//a[normalize-space()='DownLoad Link']"));
driver.findElement(By.xpath("//a[text()='DownLoad Link']"));
















		
	}

}
