package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.java.en.*;
import page.Baseclas;
import page.ObjectRepo;

public class StepFile extends Baseclas {
	
	public WebDriver driver;
	
		//ObjectRepo obr=new ObjectRepo(driver);
		
	Baseclas ba=new Baseclas();
	
	
	@Given("^open chrome browser$")
	public void open_chrome_browser() throws Throwable {
		
		ba.intitialization();
		
	}

	@When("^user is in amazon home page he is able to see all the tabs$")
	public void user_is_in_amazon_home_page_he_is_able_to_see_all_the_tabs() throws Throwable {
		
		ba.callurl();
	}

	@Then("^He should click on yours amazon\\.com$")
	public void He_should_click_on_yours_amazon_com() throws Throwable {
		
		ba.youramazonidclicks();
	}

	@When("^user is in amazon page he has to search for products in searchbar and able to click$")
	public void user_is_in_amazon_page_he_has_to_search_for_products_in_searchbar_and_able_to_click() throws Throwable {
		ba.intitialization();	    
	}

	@When("^user able to see all buying options and he need to click$")
	public void user_able_to_see_all_buying_options_and_he_need_to_click() throws Throwable {
		ba.callurl();
	}

	@Then("^user able to added it to cart$")
	public void user_able_to_added_it_to_cart() throws Throwable {
		ba.searchbar();    
	}

	/*Scenario: Test login functionality
	Given open chrome browser
	When user is in amazon home page he is able to see all the tabs 
	And He should click on yours amazon.com
	And enter valid "minank.reddy2011@gmail.com" and valid "minank123"
	Then user able to login successfully  
*/
		
}