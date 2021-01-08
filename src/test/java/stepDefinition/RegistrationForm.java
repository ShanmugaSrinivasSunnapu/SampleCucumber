package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationForm {
	WebDriver driver;
	@Given("^Launch browser and facebook registration page$")
    public void launch_browser_and_facebook_registration_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       
        System.out.println("1");
        
        
    }

    @When("^Fill the valid information$")
    public void fill_the_valid_information() throws Throwable {
    	 driver.findElement(By.name("firstname")).sendKeys("Srinivas");
         driver.findElement(By.name("lastname")).sendKeys("SS");
         driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
         driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
         driver.findElement(By.name("reg_passwd__")).sendKeys("1234567890");
         Select dropdownD = new Select(driver.findElement(By.name("birthday_day")));
         dropdownD.selectByValue("25");
         
         Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
         dropdownM.selectByVisibleText("Jul");
         
         Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
         dropdownY.selectByValue("1993");
         System.out.println("2");
         driver.findElement(By.id("u_1_3")).click();
    }

    @And("^Click on Sign Up button$")
    public void click_on_sign_up_button() throws Throwable {
    	driver.findElement(By.name("websubmit")).click();
    	System.out.println("3");
    }
    
    @Then("^User registration should be successful$")
    public void user_registration_should_be_successful() throws Throwable {
        System.out.println("Registration Failed");
        System.out.println("4");
    }
}
