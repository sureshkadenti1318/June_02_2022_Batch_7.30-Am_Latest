package Alerts_Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_with_Ok_Button {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);

	Alert alt=	driver.switchTo().alert();
String alrttxt=	alt.getText();

System.out.println("---alrttxt---"+ alrttxt);
alt.accept();// click on OK button

String result_txt=	driver.findElement(By.xpath("//p[@id='result']")).getText();
	  System.out.println("result_txt---" +result_txt);
		  
		//driver.close() ;

	}

}
