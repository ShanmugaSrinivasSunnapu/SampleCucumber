package stepDefinition;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginSteps {
		WebDriver driver;
	    @Given("^launch browser and facebook website$")
	    public void launch_browser_and_facebook_website() throws Throwable {
	       System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.get("https://www.facebook.com/");
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	       System.out.println("Given Step");
	  }

		
		/*
		 * @When("^i enter valid username and password$") public void
		 * i_enter_valid_username_and_password() throws Throwable {
		 * driver.findElement(By.id("email")).sendKeys("91604727");
		 * driver.findElement(By.id("pass")).sendKeys("Honeynu@1");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * System.out.println("When Step"); }
		 */
	    @When("^i enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void i_enter_valid_something_and_something(String username, String password) throws Throwable {
	       driver.findElement(By.id("email")).sendKeys(username);
	       driver.findElement(By.id("pass")).sendKeys(password);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       System.out.println("When Step");
	    }

	    @And("^click on login button$")
	    public void click_on_login_button() throws Throwable {
		       driver.findElement(By.id("u_0_b")).click();
		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       System.out.println("And Step");
	    }
	    
	    @Then("^verify facebook title and close$")
	    public void verify_facebook_title_and_close() throws Throwable {
	      String title =  driver.getTitle();
	      System.out.println("Then Step");
	      System.out.println("Title is "+title);
	      
	      driver.quit();
	    }

	    

	
}
