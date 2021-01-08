package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooksStepDefinition {

	@Before
	public void setUp() {
		System.out.println("Launch browser and Launch Free crm app");
	}
	@After
	public void tearDown() {
		System.out.println("Close the browser");
	}
	
	@Given("User is on deal page")
	public void user_is_on_deal_page() {
	    System.out.println("User is on deal page");
	}

	@When("user fill the deals form")
	public void user_fill_the_deals_form() {
		System.out.println("user fill the deals form");
	}

	@Then("deal is created")
	public void deal_is_created() {
		System.out.println("deal is created");
	}
}
