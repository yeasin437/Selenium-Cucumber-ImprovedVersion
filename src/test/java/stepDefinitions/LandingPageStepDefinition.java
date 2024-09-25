package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	// PageObjectManager pageObjectManager;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {

	}

	@When("user searched  with Shortnamme {string} and extracted actual name of product")
	public void user_searched_with_shortnamme_and_extracted_actual_name_of_product(String shorName) {

		LandingPage landinPage = testContextSetup.pageObjectManager.getLandingPage();
		landinPage.searchItem(shorName);
		testContextSetup.landingPageProductName = landinPage.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.landingPageProductName);

	}

}
