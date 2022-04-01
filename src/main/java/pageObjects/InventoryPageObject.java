package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.InventoryPageUI;

public class InventoryPageObject extends BasePage {
	WebDriver driver;

	public InventoryPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToProductsAtTopmenu() {
		waitForElementClickable(driver, InventoryPageUI.PRODUCT_DROPDOWN_TOGGLE);
		clickToElement(driver, InventoryPageUI.PRODUCT_DROPDOWN_TOGGLE);

		clickToElement(driver, InventoryPageUI.PRODUCTS_ITEM_IN_DROPDOWN);
	}
}
