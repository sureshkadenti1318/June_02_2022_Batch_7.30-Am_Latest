package Selenium_Basics_Opening_Different_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_EdgeBrowser {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.edge.driver", "E:\\Training_Batches\\June_02_2022_Batch_7.30 Am\\Softwares\\edgedriver_win64\\msedgedriver.exe");
	
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		System.out.println("--browser open");
		
	}

}
