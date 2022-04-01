package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.ManufacturingPageUI;

public class ManufacturingPageObject extends BasePage {
	WebDriver driver;

	public ManufacturingPageObject(WebDriver driver) {
		this.driver = driver;

	}

	public void clickToCreateButton() {
		waitForElementClickable(driver, ManufacturingPageUI.CREATE_BUTTON);
		clickToElement(driver, ManufacturingPageUI.CREATE_BUTTON);
	}

	public void selectValueAtProductDropdown(String product) {
		waitForElementClickable(driver, ManufacturingPageUI.PRODUCT_DROPDOWN);
		sendkeyToElement(driver, ManufacturingPageUI.PRODUCT_DROPDOWN, product);
		selectItemInCustomDropdown(driver, ManufacturingPageUI.PRODUCT_DROPDOWN, ManufacturingPageUI.ITEM_IN_PRODUCT_DROPDOWN, product);
	}

	public void clickToConfirmButton() {
		waitForElementClickable(driver, ManufacturingPageUI.CONFIRM_BUTTON);
		clickToElement(driver, ManufacturingPageUI.CONFIRM_BUTTON);
	}

	public void inputToQuantityTextbox(String quantity) {
		waitForElementVisible(driver, ManufacturingPageUI.QUANTITY_TEXTBOX);
		sendkeyToElement(driver, ManufacturingPageUI.QUANTITY_TEXTBOX, quantity);
	}

	public void clickToMaskAsDoneButton() {
		waitForElementClickable(driver, ManufacturingPageUI.MASK_AS_DONE_BUTTON);
		clickToElement(driver, ManufacturingPageUI.MASK_AS_DONE_BUTTON);
	}

	public void clickToOKbuttonAtConfirmPopup() {
		waitForElementClickable(driver, ManufacturingPageUI.CONFIRM_BUTTON_AT_CONFIRM_POPUP);
		clickToElement(driver, ManufacturingPageUI.CONFIRM_BUTTON_AT_CONFIRM_POPUP);
	}

	public String getProductValue() {
		waitForElementVisible(driver, ManufacturingPageUI.PRODUCT_VALUE);
		return getElementText(driver, ManufacturingPageUI.PRODUCT_VALUE);
	}

	public String getQuantityValue() {
		waitForElementVisible(driver, ManufacturingPageUI.QUANTITY_VALUE);
		return getElementText(driver, ManufacturingPageUI.QUANTITY_VALUE).replace(".00", "");
	}

}
