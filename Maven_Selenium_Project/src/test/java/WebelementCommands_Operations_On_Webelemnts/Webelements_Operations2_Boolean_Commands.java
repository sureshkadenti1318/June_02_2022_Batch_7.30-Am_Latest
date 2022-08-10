package WebelementCommands_Operations_On_Webelemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelements_Operations2_Boolean_Commands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		

Thread.sleep(3000);
	

boolean  flag1=driver.findElement(By.xpath("//td[@class='f22']")).isDisplayed();

System.out.println("---flag1---" +flag1); // true

Thread.sleep(3000);

boolean  flag2=driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();

System.out.println("---flag2---" +flag2);//true

Thread.sleep(3000);

boolean flag3=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();

System.out.println("---flag3---" +flag3);//false

boolean flag4=driver.findElement(By.xpath("//input[@value='m']")).isSelected();

System.out.println("---flag4---male button--" +flag4);//true

boolean flag5=driver.findElement(By.xpath("//input[@value='f']")).isSelected();

System.out.println("---flag5-female--" +flag5);//false



//input[@value='f']







		
	}

}
