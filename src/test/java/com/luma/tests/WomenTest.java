package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.WomenPage;

public class WomenTest extends BaseClass {

	WomenPage women;

	public WomenTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		women = new WomenPage();

	}

	@Test(priority = 1)
	public void testWomen() throws Exception {
		Logger.info("go to women and then tops and then click on jackets");
		try {
			women.goToWomen();
		} catch (Exception e) {
			captureScreen(driver, "women");

		}
	}

	@Test(priority = 2)
	public void testWomenjacketPage() throws Exception {
		if (women.validateWomenJacketPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to women jacket page");
		} else {
			captureScreen(driver, "women jacket");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testWomenStyle() throws Exception {
		Logger.info("click on style");
		try {
			women.clickOnStyle();
		} catch (Exception e) {
			captureScreen(driver, "style");

		}
	}

	@Test(priority = 4)
	public void testWomenLightWeightStyle() throws Exception {
		Logger.info("click on lightweight style");
		try {
			women.clickOnLightWeightStyle();
		} catch (Exception e) {
			captureScreen(driver, "lightweight style");

		}
	}

	@Test(priority = 5)
	public void testWomenjacketLightweightStylePage() throws Exception {
		if (women.validateWomenJacketLightweightPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to women lightweight jacket style page");
		} else {
			captureScreen(driver, "women jacket");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testWomenPrice() throws Exception {
		Logger.info("click on price");
		try {
			women.clickOnPrice();
		} catch (Exception e) {
			captureScreen(driver, "price");

		}
	}

	@Test(priority = 7)
	public void testWomenHighPrice() throws Exception {
		Logger.info("click on high price");
		try {
			women.clickOnHighPrice();
		} catch (Exception e) {
			captureScreen(driver, "high price");

		}
	}

	@Test(priority = 8)
	public void testWomenjacketHighPricePage() throws Exception {
		if (women.validateWomenJacketPricePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to womem jacket high price page");
		} else {
			captureScreen(driver, "women jacket");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testWomenJacketClimate() throws Exception {
		Logger.info("click on climate");
		try {
			women.clickOnClimate();
		} catch (Exception e) {
			captureScreen(driver, "climate");

		}
	}

	@Test(priority = 10)
	public void testWomenJacketSpringClimate() throws Exception {
		Logger.info("click on spring climate");
		try {
			women.clickOnSpringClimate();
		} catch (Exception e) {
			captureScreen(driver, "spring climate");

		}
	}

	@Test(priority = 11)
	public void testWomenJacketSpringClimatePage() throws Exception {
		if (women.validateWomenJacketClimatePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to womem jacket climate page");
		} else {
			captureScreen(driver, "women jacket");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testWomenTrekJacket() throws Exception {
		Logger.info("click on trek jacket");
		try {
			women.clickOnTrekJacket();
		} catch (Exception e) {
			captureScreen(driver, "trek jacket");

		}
	}

	@Test(priority = 13)
	public void testWomenTrekJacketPage() throws Exception {
		if (women.validateWomenTrekJacketPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to womem trek jacket page");
		} else {
			captureScreen(driver, "women trek jacket");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 14)
	public void testWomenTrekJacketSize() throws Exception {
		Logger.info("click on trek jacket size");
		try {
			women.clickOnTrekJacketSize();
		} catch (Exception e) {
			captureScreen(driver, "trek jacket size");

		}
	}

	@Test(priority = 15)
	public void testWomenTrekJacketColor() throws Exception {
		Logger.info("click on trek jacket color");
		try {
			women.clickOnTrekJacketColor();
		} catch (Exception e) {
			captureScreen(driver, "trek jacket color");

		}
	}

	@Test(priority = 16)
	public void testQuantity() throws Exception {
		Logger.info("enter the quantity");
		try {
			women.enterQuantity(prop.getProperty("quantity"));
		} catch (Exception e) {
			captureScreen(driver, "quantity");

		}
	}

	@Test(priority = 17)
	public void testAddToCat() throws Exception {
		Logger.info("click on add to cart");
		try {
			women.clickOnAddToCart();
		} catch (Exception e) {
			captureScreen(driver, "add to cart");

		}
	}

	@Test(priority = 18)
	public void testAddToCartSucessMessage() throws Exception {
		if (women.validateAddToCartMessage(prop.getProperty("AddToCartMessage"))) {
			Assert.assertTrue(true);
			Logger.info("sucessfully displayed the add to cart message");
		} else {
			captureScreen(driver, "add to cart message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 19)
	public void testShoppingCart() throws Exception {
		Logger.info("click on shopping cart");
		try {
			women.clickOnShoppingCart();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart");

		}
	}

	@Test(priority = 20)
	public void testShoppingCartCloseButton() throws Exception {
		Logger.info("click on shopping cart close button");
		try {
			women.clickOnShoppingCartCloseButton();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart close");

		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
