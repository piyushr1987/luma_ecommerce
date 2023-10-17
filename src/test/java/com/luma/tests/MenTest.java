package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.MenPage;

public class MenTest extends BaseClass {
	MenPage men;

	public MenTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		men = new MenPage();

	}

	@Test(priority = 1)
	public void testMen() throws Exception {
		Logger.info("go to men and then bottom and then click on pants");
		try {
			men.goToMen();
		} catch (Exception e) {
			captureScreen(driver, "women");

		}
	}

	@Test(priority = 2)
	public void testMenPantPage() throws Exception {
		if (men.validateMenBottomPantPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to men pant page");
		} else {
			captureScreen(driver, "men pant");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testManMaterial() throws Exception {
		Logger.info("click on material");
		try {
			men.clickOnMaterial();
		} catch (Exception e) {
			captureScreen(driver, "material");

		}
	}

	@Test(priority = 4)
	public void testManPolysterMaterial() throws Exception {
		Logger.info("click on polyster material");
		try {
			men.clickOnPolysterMaterial();
		} catch (Exception e) {
			captureScreen(driver, "polyster material");

		}
	}

	@Test(priority = 5)
	public void testPolysterMaterialPage() throws Exception {
		if (men.validateMenBottomPantMaterialPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to men pant material page");
		} else {
			captureScreen(driver, "men pant material");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 6)
	public void testNew() throws Exception {
		Logger.info("click on new");
		try {
			men.clickOnNew();
		} catch (Exception e) {
			captureScreen(driver, "new");

		}
	}

	@Test(priority = 7)
	public void testNewArrival() throws Exception {
		Logger.info("click on yes");
		try {
			men.clickOnNewArrival();
		} catch (Exception e) {
			captureScreen(driver, "yes");

		}
	}

	@Test(priority = 8)
	public void testNewArrivalPage() throws Exception {
		if (men.validateMenBottomPantNewArrivalPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to men pant material page");
		} else {
			captureScreen(driver, "men pant material");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testSortByProductName() throws Exception {
		try {
			men.selectPantByPrice(prop.getProperty("sorting"));
		} catch (Exception e) {
			captureScreen(driver, "price");
		}
	}

	@Test(priority = 10)
	public void testNewArrivalByPricePage() throws Exception {
		if (men.validateMenBottomPantNewArrivalByPricePage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to men pant sort by price page");
		} else {
			captureScreen(driver, "sort by price");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 11)
	public void testGymPant() throws Exception {
		Logger.info("click on kratos gym pant");
		try {
			men.clickOnGymPant();
		} catch (Exception e) {
			captureScreen(driver, "gym pant");

		}
	}

	@Test(priority = 12)
	public void testKratosGymPantPage() throws Exception {
		if (men.validateMenGymPantPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to kratos gym pant page");
		} else {
			captureScreen(driver, "kratos page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 13)
	public void testNextButton() throws Exception {
		Logger.info("click on next button");
		try {
			men.clickOnNextButton();
		} catch (Exception e) {
			captureScreen(driver, "next button");

		}
	}

	@Test(priority = 14)
	public void testKratosGymPantSize() throws Exception {
		Logger.info("click on kratos gym pant size");
		try {
			men.clickOnKratosGymPantSize();
		} catch (Exception e) {
			captureScreen(driver, "gym pant size");

		}
	}

	@Test(priority = 15)
	public void testKratosGymPantColor() throws Exception {
		Logger.info("click on kratos gym pant color");
		try {
			men.clickOnKratosGymPantColor();
		} catch (Exception e) {
			captureScreen(driver, "gym pant color");

		}
	}

	@Test(priority = 16)
	public void testQuantity() throws Exception {
		Logger.info("enter the quantity");
		try {
			men.enterQuantity(prop.getProperty("quantity"));
		} catch (Exception e) {
			captureScreen(driver, "quantity");

		}
	}

	@Test(priority = 17)
	public void testAddToCat() throws Exception {
		Logger.info("click on add to cart");
		try {
			men.clickOnAddToCart();
		} catch (Exception e) {
			captureScreen(driver, "add to cart");

		}
	}

	@Test(priority = 18)
	public void testAddToCartSucessMessage() throws Exception {
		if (men.validateAddToCartMessage(prop.getProperty("AddToCartMessage"))) {
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
			men.clickOnShoppingCart();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart");

		}
	}

	@Test(priority = 20)
	public void testShoppingCartCloseButton() throws Exception {
		Logger.info("click on shopping cart close button");
		try {
			men.clickOnShoppingCartCloseButton();
		} catch (Exception e) {
			captureScreen(driver, "shopping cart close");

		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
