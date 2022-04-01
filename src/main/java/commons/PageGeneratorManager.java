package commons;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePageObject;
import pageObjects.InventoryPageObject;
import pageObjects.LoginPageObject;
import pageObjects.ManufacturingPageObject;
import pageObjects.ProductPageObject;

public class PageGeneratorManager {

	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static InventoryPageObject getInventoryPage(WebDriver driver) {
		return new InventoryPageObject(driver);
	}

	public static ManufacturingPageObject getManufacturingPage(WebDriver driver) {
		return new ManufacturingPageObject(driver);
	}

	public static ProductPageObject getProductPage(WebDriver driver) {
		return new ProductPageObject(driver);
	}

}
