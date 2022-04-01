package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToInventoryFeature() {
		waitForElementClickable(driver, HomePageUI.INVENTORY_FEATURE);
		clickToElement(driver, HomePageUI.INVENTORY_FEATURE);

	}

	public void clickToManufacturingFeature() {
		waitForElementClickable(driver, HomePageUI.MANUFACTURING_FEATURE);
		clickToElement(driver, HomePageUI.MANUFACTURING_FEATURE);

	}
}
