package KeyBoard_Mouse_Operations_ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Opertions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/advanced_search");

	driver.findElement(By.xpath("//input[@name='as_q']")).sendKeys("Testing_Keyboard_Operations");
		
	driver.findElement(By.xpath("//input[@name='as_q']")).sendKeys(Keys.CONTROL+"a");
	driver.findElement(By.xpath("//input[@name='as_q']")).sendKeys(Keys.CONTROL+"c");
	driver.findElement(By.xpath("//input[@name='as_q']")).sendKeys(Keys.TAB);
	
driver.findElement(By.xpath("//input[@name='as_epq']")).sendKeys(Keys.CONTROL+"v");
	
	
	Thread.sleep(2000);

		
		  
		driver.close() ;

	}

}
