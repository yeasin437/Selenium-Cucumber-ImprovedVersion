package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {

	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName)
			throws InterruptedException {

		OfferPage op = testContextSetup.pageObjectManager.getOffersPage();
		op.selectTopDealsPage();
		testContextSetup.genericUtils.SwitchWindowToChild();
		op.searchItem(shortName);
		offerPageProductName = op.getProductName();

	}

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);

	}

}
