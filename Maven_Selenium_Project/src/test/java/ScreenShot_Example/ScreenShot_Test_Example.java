package ScreenShot_Example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Test_Example {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


TakesScreenshot ts=(TakesScreenshot)(driver);
		
File src=ts.getScreenshotAs(OutputType.FILE);

File dst= new File ("D:\\Trainings\\Training_Batches_KrishSoft\\June_02_2022_Batch_7.30 AM\\redf.PNG");

FileUtils.copyFile(src, dst);

System.out.println("---Screenshot taken---");
		  
		driver.close() ;

	}

}
