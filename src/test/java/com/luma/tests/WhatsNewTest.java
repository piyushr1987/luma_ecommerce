package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.WhatsNewPage;

public class WhatsNewTest extends BaseClass {

	WhatsNewPage whats;

	public WhatsNewTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		whats = new WhatsNewPage();

	}

	@Test(priority = 1)
	public void testWhatsNew() throws Exception {
		Logger.info("click on whatsnew link");
		try {
			whats.clickOnWhatsNew();
		} catch (Exception e) {
			captureScreen(driver, "whats new link");

		}
	}

	@Test(priority = 2)
	public void testWhatsNewPage() throws Exception {
		if (whats.validateWhatsNewPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to whats new page");
		} else {
			captureScreen(driver, "whats page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testWomensHoodies() throws Exception {
		Logger.info("click on womens hoodies");
		try {
			whats.clickOnWomensHoodies();
		} catch (Exception e) {
			captureScreen(driver, "women hoodie");

		}
	}

	@Test(priority = 4)
	public void testWomensHoodiesPage() throws Exception {
		if (whats.validateWomensHoodiesPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to womens hoodies page");
		} else {
			captureScreen(driver, "women hoodie page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testWomensVNeckHoodie() throws Exception {
		Logger.info("click on womens v neck hoodie");
		try {
			whats.clickOnWomenVNeckHoodies();
			;
		} catch (Exception e) {
			captureScreen(driver, "women v neck hoodie");

		}
	}

	@Test(priority = 6)
	public void testWomenVNeckPage() throws Exception {
		if (whats.validateWomenVNeckHoodiePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to women v neck hoodies page");
		} else {
			captureScreen(driver, "women v neck hoodie page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testWomensVNeckHoodieSize() throws Exception {
		Logger.info("click on womens v neck hoodie size");
		try {
			whats.clickOnWomenVNeckHoodiesSize();
		} catch (Exception e) {
			captureScreen(driver, "women v neck hoodie size");

		}
	}

	@Test(priority = 8)
	public void testWomensVNeckHoodieColor() throws Exception {
		Logger.info("click on womens v neck hoodie color");
		try {
			whats.clickOnWomenVNeckHoodiesColor();
		} catch (Exception e) {
			captureScreen(driver, "women v neck hoodie color");

		}
	}

	@Test(priority = 9)
	public void testQuantity() throws Exception {
		Logger.info("enter the quantity");
		try {
			whats.enterQuantity(prop.getProperty("quantity"));
		} catch (Exception e) {
			captureScreen(driver, "quantity");

		}
	}

	@Test(priority = 10)
	public void testAddToCat() throws Exception {
		Logger.info("click on add to cart");
		try {
			whats.clickOnAddToCart();
		} catch (Exception e) {
			captureScreen(driver, "add to cart");

		}
	}

	@Test(priority = 11)
	public void testAddToCartSucessMessage() throws Exception {
		if (whats.validateAddToCompareMessage(prop.getProperty("AddToCartMessage"))) {
			Assert.assertTrue(true);
			Logger.info("sucessfully displayed the add to cart message");
		} else {
			captureScreen(driver, "add to cart message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testAddToCompare() throws Exception {
		Logger.info("click on add to compare");
		try {
			whats.clickOnAddToCompare();
		} catch (Exception e) {
			captureScreen(driver, "add to compare");

		}
	}

	@Test(priority = 13)
	public void testAddToCompareSucessMessage() throws Exception {
		if (whats.validateAddToCompareMessage(prop.getProperty("AddToCompareMessage"))) {
			Assert.assertTrue(true);
			Logger.info("sucessfully displayed the add to compare message");
		} else {
			captureScreen(driver, "add to cart message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 14)
	public void testShoppingCart() throws Exception {
		Logger.info("click on shopping cart");
		try {
			whats.clickOnShoppingCart();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart");

		}
	}

	@Test(priority = 15)
	public void testShoppingCartCloseButton() throws Exception {
		Logger.info("click on shopping cart close button");
		try {
			whats.clickOnShoppingCartCloseButton();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart close");

		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
