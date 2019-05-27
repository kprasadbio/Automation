package hp.hpe.entco.microfocus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sorting 
{
	static WebDriver driver;
	
	 
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
	@BeforeClass
	public static void setup()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/lvpkanch/Downloads/geckodriver/geckodriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver=new FirefoxDriver();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public static void Sorting2()
	{
		driver.get("https://www.javatpoint.com/wrapper-class-in-java");
		
		
		List<WebElement> lst=driver.findElements(By.xpath("//td/a"));
		System.out.println("List size: "+lst.size());
		
		ArrayList options = new ArrayList();
		
		for (WebElement element : lst) 
		{
			options.add(element.getText());
		}
		System.out.println("Jmbled Sorting: "+options);
		
		
		ArrayList templist=new ArrayList<WebElement>(options);
		Collections.sort(templist);
		System.out.println("Default Ascending Sort: "+templist);
		
		ArrayList reverseorder=templist;
		Collections.reverse(reverseorder);
		System.out.println("Resverse the Order: "+reverseorder);
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void Sorting1() 
	{ 
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		
		
		driver.get("https://www.javatpoint.com/wrapper-class-in-java");
		
				
		List<WebElement> lst=driver.findElements(By.xpath("//td/a"));
		System.out.println(lst.size());
		
		List options = new ArrayList();
		
		for (WebElement element : lst) 
		{
			options.add(element.getText());
		}
		System.out.println(options);
		
		
		List templist=new ArrayList<WebElement>(options);
		Collections.sort(templist);
		System.out.println(templist);
	}
	 
}























