package KeyBoard_Mouse_Operations_ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Opertions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

	WebElement men_tab=	driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));
		Thread.sleep(2000);

		Actions act= new Actions(driver);
		
		act.moveToElement(men_tab).build().perform();
		
		
		act.contextClick(men_tab);// right click
		act.dragAndDrop(men_tab, men_tab).build().perform();
		act.doubleClick().build().perform();
		  
		//driver.close() ;

	}

}
