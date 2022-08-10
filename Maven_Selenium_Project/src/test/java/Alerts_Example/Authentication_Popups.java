package Alerts_Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_Popups {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.get("http://the-internet.herokuapp.com/basic_auth");
//		Format : http://username:password@URL-------------------------------------->	http://andmin:admin@the-internet.herokuapp.com/basic_auth

		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		

		driver.close() ;

	}

}
