package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	public WebDriver driver;

	public OfferPage(WebDriver driver) {
		this.driver = driver;
	}

	By topDeals = By.xpath("//a[text()=\"Top Deals\"]");
	By search = By.xpath("//input[@id='search-field']");
	By productName = By.xpath("//tbody/tr[1]/td[1]");

	public void selectTopDealsPage() {
		driver.findElement(topDeals).click();
	}

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() {
		return driver.findElement(productName).getText();
	}

}
