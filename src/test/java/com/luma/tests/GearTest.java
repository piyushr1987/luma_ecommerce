package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.GearPage;

public class GearTest extends BaseClass {

	GearPage gear;

	public GearTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		gear = new GearPage();

	}

	@Test(priority = 1)
	public void testGear() throws Exception {
		Logger.info("go to gear and then click on fitness equipment");
		try {
			gear.goToGear();
		} catch (Exception e) {
			captureScreen(driver, "gear");

		}
	}

	@Test(priority = 2)
	public void testFitnessEquipmentPage() throws Exception {
		if (gear.validateFitnessEquipmentPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to fitness equipment page");
		} else {
			captureScreen(driver, "fitness equipment");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testListView() throws Exception {
		Logger.info("click on list view");
		try {
			gear.clickOnListView();
		} catch (Exception e) {
			captureScreen(driver, "list view");

		}
	}

	@Test(priority = 4)
	public void testListViewPage() throws Exception {
		if (gear.validateListViewPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to list view page");
		} else {
			captureScreen(driver, "list view page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testSortByProductName() throws Exception {
		Logger.info("sort the list by product name");
		try {
			gear.sortProductByProductName(prop.getProperty("sortBy"));
		} catch (Exception e) {
			captureScreen(driver, "product name");
		}
	}

	@Test(priority = 6)
	public void testPushupGrip() throws Exception {
		try {
			gear.clickOnPushupGrip();
		} catch (Exception e) {
			captureScreen(driver, "pushup grip");
		}
	}

	@Test(priority = 7)
	public void testPushupGripPage() throws Exception {
		if (gear.validatePushupGripPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to pushup grip page");
		} else {
			captureScreen(driver, "pushup grip page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testQuantity() throws Exception {
		Logger.info("enter the quantity");
		try {
			gear.enterQuantity(prop.getProperty("quantity"));
		} catch (Exception e) {
			captureScreen(driver, "quantity");

		}
	}

	@Test(priority = 9)
	public void testAddToCart() throws Exception {
		Logger.info("click on add to cart");
		try {
			gear.clickOnAddToCart();
		} catch (Exception e) {
			captureScreen(driver, "add to cart");

		}
	}

	@Test(priority = 10)
	public void testAddToCartSucessMessage() throws Exception {
		if (gear.validateAddToCartMessage(prop.getProperty("AddToCartMessage"))) {
			Assert.assertTrue(true);
			Logger.info("sucessfully displayed the add to cart message");
		} else {
			captureScreen(driver, "add to cart message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 11)
	public void testShoppingCart() throws Exception {
		Logger.info("click on shopping cart");
		try {
			gear.clickOnShoppingCart();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart");

		}
	}

	@Test(priority = 12)
	public void testShoppingCartCloseButton() throws Exception {
		Logger.info("click on shopping cart close button");
		try {
			gear.clickOnShoppingCartCloseButton();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart close");

		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
