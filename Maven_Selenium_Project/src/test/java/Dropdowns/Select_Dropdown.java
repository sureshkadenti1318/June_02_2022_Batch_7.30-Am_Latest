package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

	
WebElement month_dropdown=driver.findElement(By.xpath("//select[contains(@name,'Month')]"));
		
		Select slct=new Select(month_dropdown);
		
		
		//slct.selectByIndex(2);
		//slct.selectByValue("04");
		slct.selectByVisibleText("DEC");
		
				
		  
		  
		  List<WebElement> all_dropdownoptions=slct.getOptions();
		  
		  int count=all_dropdownoptions.size();//203
		  
		  System.out.println("----count---" +count);
		  
		  for (int i=0;i<count;i++)
		  
		  { 
		 String country_code= all_dropdownoptions.get(i).getText();//------------
		  
		  System.out.println("----country code---" +country_code);//
		  
		 
		  
		  }
		  
		 
		//driver.close() ;

	}

}
