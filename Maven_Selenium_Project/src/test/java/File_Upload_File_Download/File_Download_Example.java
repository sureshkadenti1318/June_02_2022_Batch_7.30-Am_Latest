package File_Upload_File_Download;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Download_Example {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/download");

		driver.findElement(By.xpath("//a[normalize-space()='sample.pdf']")).click();

		Thread.sleep(3000);

		System.out.println("---Done--");
		driver.close();

	}

}
