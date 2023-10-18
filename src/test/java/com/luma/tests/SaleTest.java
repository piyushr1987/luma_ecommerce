package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.SalePage;

public class SaleTest extends BaseClass {

	SalePage sale;

	public SaleTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		sale = new SalePage();

	}

	@Test(priority = 1)
	public void testSale() throws Exception {
		Logger.info("click on sale");
		try {
			sale.clickOnSale();
		} catch (Exception e) {
			captureScreen(driver, "sale");

		}
	}

	@Test(priority = 2)
	public void testSalePage() throws Exception {
		if (sale.validateSalePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to sale page");
		} else {
			captureScreen(driver, "sale page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testMenBargain() throws Exception {
		Logger.info("click on men bargain");
		try {
			sale.clickOnMenBargains();
		} catch (Exception e) {
			captureScreen(driver, "men bargain");

		}
	}

	@Test(priority = 4)
	public void testMenBargainPage() throws Exception {
		if (sale.validateMenBargainsSalePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to men bargain sale page");
		} else {
			captureScreen(driver, "men bargain sale page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testStyle() throws Exception {
		Logger.info("click on style");
		try {
			sale.clickOnStyle();
		} catch (Exception e) {
			captureScreen(driver, "style");

		}
	}

	@Test(priority = 6)
	public void testWorkOut() throws Exception {
		Logger.info("click on workout pant");
		try {
			sale.clickOnWorkoutPant();
		} catch (Exception e) {
			captureScreen(driver, "work out pant");

		}
	}

	@Test(priority = 7)
	public void testMenWorkoutPantPage() throws Exception {
		if (sale.validateMenWorkoutPantPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to men workout pant page");
		} else {
			captureScreen(driver, "work out pant page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 8)
	public void testMenFitnessShort() throws Exception {
		Logger.info("click on fitness short");
		try {
			sale.clickOnMenFitnessShort();
		} catch (Exception e) {
			captureScreen(driver, "fitness short");

		}
	}

	@Test(priority = 9)
	public void testMenFitnessShortPage() throws Exception {
		if (sale.validateMenFitnessShortPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to men fitness short page");
		} else {
			captureScreen(driver, "fitness short page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testMenFitnessShortSize() throws Exception {
		Logger.info("click on fitness short size");
		try {
			sale.clickOnMenFitnessShortSize();
		} catch (Exception e) {
			captureScreen(driver, "fitness short size");

		}
	}

	@Test(priority = 11)
	public void testMenFitnessShortColor() throws Exception {
		Logger.info("click on fitness short color");
		try {
			sale.clickOnMenFitnessShortColor();
		} catch (Exception e) {
			captureScreen(driver, "fitness short color");

		}
	}

	@Test(priority = 12)
	public void testQuantity() throws Exception {
		Logger.info("enter the quantity");
		try {
			sale.enterQuantity(prop.getProperty("quantity"));
		} catch (Exception e) {
			captureScreen(driver, "quantity");

		}
	}

	@Test(priority = 13)
	public void testAddToCart() throws Exception {
		Logger.info("click on add to cart");
		try {
			sale.clickOnAddToCart();
		} catch (Exception e) {
			captureScreen(driver, "add to cart");

		}
	}

	@Test(priority = 14)
	public void testAddToCartSucessMessage() throws Exception {
		if (sale.validateAddToCartMessage(prop.getProperty("AddToCartMessage"))) {
			Assert.assertTrue(true);
			Logger.info("sucessfully displayed the add to cart message");
		} else {
			captureScreen(driver, "add to cart message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 15)
	public void testShoppingCart() throws Exception {
		Logger.info("click on shopping cart");
		try {
			sale.clickOnShoppingCart();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart");

		}
	}

	@Test(priority = 16)
	public void testShoppingCartCloseButton() throws Exception {
		Logger.info("click on shopping cart close button");
		try {
			sale.clickOnShoppingCartCloseButton();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart close");

		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
