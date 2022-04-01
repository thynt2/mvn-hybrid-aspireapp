package aspire.aspireapp.user;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.HomePageObject;
import pageObjects.InventoryPageObject;
import pageObjects.LoginPageObject;
import pageObjects.ManufacturingPageObject;
import pageObjects.ProductPageObject;

public class User_Login_Create_Manufacture extends BaseTest {
	WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		log.info("Pre-Condition: Open browser '" + browserName + "'and navigate to '" + appUrl + "'");
		driver = getBrowserDriver(browserName, appUrl);
		loginPage = PageGeneratorManager.getLoginPage(driver);

		emailAddress = "user@aspireapp.com";
		password = "@sp1r3app";
		productName = "Automation Test Product";
		unitOfMeasure = "mm";
		purchaseUoM = "cm";
		quantity = "15";
	}

	@Test
	public void User_Create_Product_Manufacture() {
		log.info("User_Create_Product_Manufacture -  Step 01: Input valid data into 'Email' textbox");
		loginPage.inputToEmailTextbox(emailAddress);

		log.info("User_Create_Product_Manufacture -  Step 02: Input valid data into 'Password' textbox");
		loginPage.inputToPasswordTextbox(password);

		log.info("User_Create_Product_Manufacture -  Step 03: Click to 'Login' button");
		loginPage.clickToLoginButton();
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("User_Create_Product_Manufacture -  Step 04: Click to 'Inventory' Feature");
		homePage.clickToInventoryFeature();
		inventoryPage = PageGeneratorManager.getInventoryPage(driver);

		log.info("User_Create_Product_Manufacture -  Step 05: Click to 'Products' at top menu");
		inventoryPage.clickToProductsAtTopmenu();
		productPage = PageGeneratorManager.getProductPage(driver);

		log.info("User_Create_Product_Manufacture -  Step 06: Click to 'Create' button");
		productPage.clickToCreateButton();

		log.info("User_Create_Product_Manufacture -  Step 07: Input valid data into 'Product Name' textbox");
		productPage.inputToProductNameTextbox(productName);

		log.info("User_Create_Product_Manufacture -  Step 08: Select value = " + unitOfMeasure + " at 'Unit of Measure' dropdown");
		productPage.selectValueAtUnitofMeasureDropdown(unitOfMeasure);

		log.info("User_Create_Product_Manufacture -  Step 09: Select value = " + purchaseUoM + " at 'Purchase UoM' dropdown");
		productPage.selectValueAtPurchaseUoMDropdown(purchaseUoM);

		log.info("User_Create_Product_Manufacture -  Step 10: Click to 'Save' button");
		productPage.clickToSaveButton();

		log.info("User_Create_Product_Manufacture -  Step 11: Click to 'Update Quantity' button");
		productPage.clickToUpdateQuantityButton();

		log.info("User_Create_Product_Manufacture -  Step 12: Click to 'Create' button");
		productPage.clickToCreateButton();

		log.info("User_Create_Product_Manufacture -  Step 13: Input data = " + quantity + " to 'Quantity' field");
		productPage.inputToCountQuantity(quantity);

		log.info("User_Create_Product_Manufacture -  Step 14: Click to 'Save' button");
		productPage.clickToSaveButton();

		log.info("User_Create_Product_Manufacture -  Step 15: Click to 'Application' icon");
		productPage.clickToApplicationIcon();
		homePage = PageGeneratorManager.getHomePage(driver);

		log.info("User_Create_Product_Manufacture -  Step 16: Click to 'Manufacturing' feature");
		homePage.clickToManufacturingFeature();
		manufucturingPage = PageGeneratorManager.getManufacturingPage(driver);

		log.info("User_Create_Product_Manufacture -  Step 17: Click to 'Create' button");
		manufucturingPage.clickToCreateButton();

		log.info("User_Create_Product_Manufacture -  Step 18: Select value = " + productName + "at 'Product' dropdown");
		manufucturingPage.selectValueAtProductDropdown(productName);

		log.info("User_Create_Product_Manufacture -  Step 19: Click to 'Confirm' button");
		manufucturingPage.clickToConfirmButton();

		log.info("User_Create_Product_Manufacture -  Step 20: Input data = " + quantity + " to 'Quantity' textbox ");
		manufucturingPage.inputToQuantityTextbox(quantity);

		log.info("User_Create_Product_Manufacture -  Step 21: Click to 'Mask As Done' button");
		manufucturingPage.clickToMaskAsDoneButton();

		log.info("User_Create_Product_Manufacture -  Step 22: Click to 'OK' button at Confirm popup");
		manufucturingPage.clickToOKbuttonAtConfirmPopup();

		log.info("User_Create_Product_Manufacture -  Step 23: Verify Product name is displayed correctly");
		verifyEquals(manufucturingPage.getProductValue(), productName);

		log.info("User_Create_Product_Manufacture -  Step 24: Verify Quantity is displayed correctly");
		verifyEquals(manufucturingPage.getQuantityValue(), quantity);

	}

	@Parameters({ "browser", "url" })
	@AfterClass(alwaysRun = true)
	public void afterClass(String browserName, String appUrl) {
		log.info("Post-Condition: Close browser " + browserName + "");
		cleanBrowserAndDriver();
	}

	LoginPageObject loginPage;
	HomePageObject homePage;
	InventoryPageObject inventoryPage;
	ProductPageObject productPage;
	ManufacturingPageObject manufucturingPage;
	String emailAddress, password, productName, unitOfMeasure, purchaseUoM, quantity;
}