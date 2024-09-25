package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;

	}

	By search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By productName = By.xpath("//div[@class='products']/div[@class='product']/h4");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() {
		return driver.findElement(productName).getText();
	}
}
