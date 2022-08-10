package Browser_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands_Example {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
	

		driver.get("https://www.google.com/");

		String url = driver.getCurrentUrl(); // To get current open url
		System.out.println("----url---" + url);// https://www.google.com/
		Thread.sleep(3000);

		String tittle = driver.getTitle();// gives title of the page
		System.out.println("----tittle---" + tittle);
		driver.close();

	}

}
