package ExcelData_Reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Data_From_Excel {

	
	@Test
	public void reddata() throws InterruptedException, IOException
	{

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		FileInputStream f= new FileInputStream("D:\\Trainings\\Training_Batches_KrishSoft\\June_02_2022_Batch_7.30 AM\\Java_Selenium_Workspace\\Maven_Selenium_Project\\Excel\\TestData.xlsx");
		
				
		
		XSSFWorkbook wb= new XSSFWorkbook(f);
		
	XSSFSheet sheet=wb.getSheet("Sheet1");
		
	String Un=sheet.getRow(2).getCell(0).getStringCellValue();
		
	String pwd=sheet.getRow(2).getCell(1).getStringCellValue();
	
	
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(Un);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
	
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
Thread.sleep(300);
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
