package pageUIs;

public class ManufacturingPageUI {
	public static final String CREATE_BUTTON = "xpath=//div[@role='toolbar']//button[contains(text(),'Create')]";
	public static final String PRODUCT_DROPDOWN = "xpath=//label[text()='Product']//parent::td//following-sibling::td//input";
	public static final String ITEM_IN_PRODUCT_DROPDOWN = "xpath=//ul/li[@class='ui-menu-item']";
	public static final String CONFIRM_BUTTON = "xpath=//span[text()='Confirm']/parent::button";
	public static final String QUANTITY_TEXTBOX = "xpath=//label[text()='Quantity']/parent::td/following-sibling::td//input";
	public static final String MASK_AS_DONE_BUTTON = "xpath=//span[text()='Mark as Done']/parent::button[@class='btn btn-primary']";
	public static final String CONFIRM_BUTTON_AT_CONFIRM_POPUP = "xpath=//div[@class='modal-content']//span[text()='Ok']";
	public static final String PRODUCT_VALUE = "xpath=//a[@name='product_id']/span";
	public static final String QUANTITY_VALUE = "xpath=//label[text()='Quantity']/parent::td/following-sibling::td//span[@name='qty_producing']";
}
