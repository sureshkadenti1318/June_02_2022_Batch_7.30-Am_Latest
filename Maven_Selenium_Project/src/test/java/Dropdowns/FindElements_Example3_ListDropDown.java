package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_Example3_ListDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		driver.findElement(By.xpath("//div[@onclick='javascript: openDiv(event);']")).click();
		Thread.sleep(2000);

			
		
		  List<WebElement> all_dropdownoptions=driver.findElements(By.xpath("//li[contains(@onclick,'javascript:')]"));
		  
		  int count=all_dropdownoptions.size();//203
		  
		  System.out.println("----count---" +count);
		  
		  for (int i=0;i<count;i++)
		  
		  { 
			  String country_code= all_dropdownoptions.get(i).getText();//------------
		  
		   System.out.println("----country code---" +country_code);// 
		   
		   if(country_code.contains("Algeria (+213)"))//10----India (+91)=(+964)
		   {
			   all_dropdownoptions.get(i).click();
			   break;
		   }
		   
		  }
		  
		  
		driver.close() ;

	}

}
