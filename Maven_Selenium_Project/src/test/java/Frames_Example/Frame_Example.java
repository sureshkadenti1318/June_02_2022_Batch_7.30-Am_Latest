package Frames_Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Example {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

	
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("login_page");
			
WebElement frame_xpath=	driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(frame_xpath);
		//driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		
		
driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
		
	Thread.sleep(2000);
	
	
	driver.quit();
	}


}
