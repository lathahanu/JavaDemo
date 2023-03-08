package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1 {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	   
		String userDir = System.getProperty("user.dir");
		
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\Drivers\\chromedriver.exe");
 	System.setProperty("webdriver.chrome.driver",userDir + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	    
		driver.navigate().to("https://www.google.com");
	}

	@When("user enters a text in searchbox")
	public void user_enters_a_text_in_searchbox() {
	    
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
	   
		driver.getPageSource().contains("Selenium");
		driver.close();
	}
	
}
