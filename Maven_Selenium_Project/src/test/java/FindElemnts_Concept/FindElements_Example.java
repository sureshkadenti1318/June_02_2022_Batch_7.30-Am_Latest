package FindElemnts_Concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements_Example {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
List<WebElement> all_links=driver.findElements(By.tagName("a")); //81

int count=all_links.size();

System.out.println("----count---" +count);

for (int i=0;i<=count;i++) 

{
String linkTxt=	all_links.get(i).getText();//------------

System.out.println("----linkTxt---" +linkTxt);// 
}


driver.close();





		
	}

}
