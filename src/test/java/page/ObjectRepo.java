package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepo extends Baseclas  {

	
public WebDriver driver;
	
	By Youramazonid= By.id("nav-your-amazon");
	
	public void youramazonidclick()
	{
		 driver.findElement(Youramazonid).click();
		
	}

	
	/*By Searchid=By.id("twotabsearchtextbox");
	
		public WebElement searchid()
		{
		return driver.findElement(Searchid);
		}
		
		
	By Xpathid=By.xpath("//ul/li[1]/div/div/div/div[2]/div[1]/div[1]/a/h2");
		
		public WebElement xpathid()
		{
		return driver.findElement(Xpathid);
		}
	
	By Clickid=By.id("add-to-cart-button");
		
		public WebElement clickid()
		{
			return driver.findElement(Clickid);
		}*/		
	
}
