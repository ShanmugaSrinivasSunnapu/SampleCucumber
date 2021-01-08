package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class usingDatatables {

	public WebDriver driver;
	
	@Given("User launch browser and open facebook website")
	public void user_launch_browser_and_open_facebook_website() {
	    System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    
	}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password(List<List<String>> dTable) {
		DataTable data = DataTable.create(dTable);
		int i = data.cells().size();
		
        driver.findElement(By.id("email")).sendKeys(data.cell(0, 0));
        driver.findElement(By.id("pass")).sendKeys(data.cell(0, 1));
	}

	@And("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		driver.findElement(By.id("u_0_b")).click();
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    String facebookTitle  = driver.getTitle();
	    System.out.println("Title is : "+facebookTitle);
	   // driver.quit();
	    
	}
}
