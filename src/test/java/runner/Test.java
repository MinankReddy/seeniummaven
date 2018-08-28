package runner;


import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;



//@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"stepDefination"}) 
public class Test extends  AbstractTestNGCucumberTests

{
}

	
	