package Window_Handles;

import java.util.List;
import java.util.Set;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles_Example {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		String parnt_tittle = driver.getTitle();
		System.out.println("----parnt_tittle--" + parnt_tittle);

		String prnt_d = driver.getWindowHandle();// CDwindow-BF55DD8BA076C7F8C458DE05615B23B6

		System.out.println("---prnt_d---" + prnt_d);

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();

		Thread.sleep(2000);

		Set<String> all_window_ids = driver.getWindowHandles();

		int count_window = all_window_ids.size();//2

		System.out.println("count_window: " + count_window);
		
		
java.util.Iterator<String>it=all_window_ids.iterator();
		
String parnt_window=it.next();
String Child_window=it.next();
		
driver.switchTo().window(Child_window);


String child_window_title=driver.getTitle();
System.out.println("child_window_title--" +child_window_title);

driver.switchTo().window(parnt_window);

String Parnt_window_tittle_2=driver.getTitle();
System.out.println("Parnt_window_tittle_2--" +Parnt_window_tittle_2);

	driver.quit();
	}

}
