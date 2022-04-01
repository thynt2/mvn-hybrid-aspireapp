package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.ProductPageUI;

public class ProductPageObject extends BasePage {
	WebDriver driver;

	public ProductPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToCreateButton() {
		waitForElementClickable(driver, ProductPageUI.CREATE_BUTTON);
		clickToElement(driver, ProductPageUI.CREATE_BUTTON);
	}

	public void inputToProductNameTextbox(String productName) {
		waitForElementVisible(driver, ProductPageUI.PRODUCT_NAME_TEXTBOX);
		sendkeyToElement(driver, ProductPageUI.PRODUCT_NAME_TEXTBOX, productName);
	}

	public void selectValueAtUnitofMeasureDropdown(String unitOfMeasure) {
		waitForElementClickable(driver, ProductPageUI.UNIT_OF_MEASURE_DROPDOWN);
		selectItemInCustomDropdown(driver, ProductPageUI.UNIT_OF_MEASURE_DROPDOWN, ProductPageUI.ITEM_IN_UNIT_OF_MEASURE_DROPDOWN, unitOfMeasure);
	}

	public void selectValueAtPurchaseUoMDropdown(String purchaseUoM) {
		waitForElementClickable(driver, ProductPageUI.PURCHASE_UOM_DROPDOWN);
		selectItemInCustomDropdown(driver, ProductPageUI.PURCHASE_UOM_DROPDOWN, ProductPageUI.ITEM_IN_PURCHASE_UOM_DROPDOWN, purchaseUoM);
	}

	public void clickToSaveButton() {
		waitForElementClickable(driver, ProductPageUI.SAVE_BUTTON);
		clickToElement(driver, ProductPageUI.SAVE_BUTTON);
	}

	public void clickToUpdateQuantityButton() {
		waitForElementClickable(driver, ProductPageUI.UPDATE_QUANTITY_BUTTON);
		clickToElement(driver, ProductPageUI.UPDATE_QUANTITY_BUTTON);
	}

	public void inputToCountQuantity(String quantity) {
		waitForElementVisible(driver, ProductPageUI.COUNT_QUANTITY_FIELD);
		sendkeyToElement(driver, ProductPageUI.COUNT_QUANTITY_FIELD, quantity);
	}

	public void clickToApplicationIcon() {
		waitForElementClickable(driver, ProductPageUI.APPLICATION_ICON);
		clickToElement(driver, ProductPageUI.APPLICATION_ICON);
	}

}
