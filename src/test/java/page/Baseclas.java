package page;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class Baseclas{
	
	public  WebDriver driver;
	public  Properties prop;
	
	public Baseclas() // adding the property file 
	{
		try {
			prop =new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\mavenselenium\\src\\test\\java\\page\\config.properties");
			prop.load(fis);
			} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace(); 
		}
			catch(IOException e) 
				{
					e.printStackTrace();
				}
	}
	
	
	public void intitialization() {  //init the browser 
		
		String Browname=prop.getProperty("browser");
		
		if(Browname.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(Browname.equals("firefox")) {
			driver =new FirefoxDriver();			
		}
		else if(Browname.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\IE driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	}
	
	public  void callurl()	{
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
	}	
	
	public  void youramazonidclicks()
	{
		driver.findElement(By.id("nav-your-amazon")).click();
	}
	
	public void searchbar()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(prop.getProperty("searchitemname"));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.className("a-size-base s-inline  s-access-title  a-text-normal")).click();
	}
		
}