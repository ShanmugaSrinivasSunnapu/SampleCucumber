package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class usingExamplesKeyword {
	public WebDriver driver;
	@Given("^User is Launch browser and facebook application$")
    public void user_is_launch_browser_and_facebook_application() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }

    @When("^User enters (.+) and (.+)$")
    public void user_enters_and(String Usernames, String Passwords ) throws Throwable {
    	driver.findElement(By.id("email")).sendKeys(Usernames);
    	driver.findElement(By.id("pass")).sendKeys(Passwords);
    }

    @And("^User click on login button to get home page$")
    public void user_click_on_login_button_to_get_home_page() throws Throwable {
    	driver.findElement(By.id("u_0_b")).click();
    }
    
    @Then("^User logged into Facebook homepage$")
    public void user_logged_into_facebook_homepage() throws Throwable {
       String title=  driver.getTitle();
       System.out.println("Title is "+title);
       driver.quit();
    }
}
