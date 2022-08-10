package TestNgPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations_Usage {
	WebDriver driver;

	@BeforeClass // Precondition

	public void openBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	@Test // Testing

	public void ordeofannotation() throws InterruptedException {
		driver.get("https://selectorshub.com/xpath-practice-page/");

		String url = driver.getCurrentUrl(); // To get current open url
		System.out.println("----url---" + url);// https://www.google.com/
		Thread.sleep(3000);

		List<WebElement> all_links = driver.findElements(By.tagName("a")); // 81

		int count = all_links.size();

		System.out.println("----count---" + count);

		for (int i = 0; i < count; i++)

		{
			String linkTxt = all_links.get(i).getText();// ------------

			System.out.println("----linkTxt---" + linkTxt);//

		}

		
	}


	@AfterClass // Precondition

	public void closebrowaer() {
	
	driver.close();
	
	
}






}
