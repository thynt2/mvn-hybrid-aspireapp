package pageUIs;

public class ProductPageUI {
	public static final String CREATE_BUTTON = "xpath=//div[@role='toolbar']//button[contains(text(),'Create')]";
	public static final String PRODUCT_NAME_TEXTBOX = "xpath=//input[@name='name']";
	public static final String UNIT_OF_MEASURE_DROPDOWN = "xpath=//label[text()='Unit of Measure']//parent::td//following-sibling::td//input";
	public static final String PURCHASE_UOM_DROPDOWN = "xpath=//label[text()='Purchase UoM']//parent::td//following-sibling::td//input";
	public static final String ITEM_IN_UNIT_OF_MEASURE_DROPDOWN = "xpath=//ul/li[@class='ui-menu-item']";
	public static final String ITEM_IN_PURCHASE_UOM_DROPDOWN = "xpath=//ul/li[@class='ui-menu-item']";
	public static final String SAVE_BUTTON = "xpath=//button[contains(text(),'Save')]";
	public static final String UPDATE_QUANTITY_BUTTON = "xpath=//span[text()='Update Quantity']/parent::button";
	public static final String COUNT_QUANTITY_FIELD = "xpath=//input[@name='inventory_quantity']";
	public static final String APPLICATION_ICON = "xpath=//header//a[@title='Home menu']";

}
