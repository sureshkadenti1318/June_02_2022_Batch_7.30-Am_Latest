package Navigation_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_Commands_Examples {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
	
		driver.navigate().back();// google
		Thread.sleep(3000);
		
		driver.navigate().forward(); //fb
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.close();
	
		
	}

}
