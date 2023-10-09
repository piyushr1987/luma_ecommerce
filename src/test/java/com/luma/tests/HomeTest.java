package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.HomePage;

public class HomeTest extends BaseClass {

	HomePage home;

	public HomeTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		home = new HomePage();

	}

	@Test(priority = 1)
	public void testCompanyLogo() throws Exception {
		if (home.validateCompanyLogo()) {
			Assert.assertTrue(true);
			Logger.info("company logo is displayed on home page");
		} else {
			captureScreen(driver, "company logo");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 2)
	public void testShoppingCart() throws Exception {
		if (home.validateCart()) {
			Assert.assertTrue(true);
			Logger.info("shopping cart is displayed on home page");
		} else {
			captureScreen(driver, "cart");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testContactUs() throws Exception {
		if (home.validateContactUsLink()) {
			Assert.assertTrue(true);
			Logger.info("contact us link is displayed on home page");
		} else {
			captureScreen(driver, "contact");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 4)
	public void testSearchBox() throws Exception {
		if (home.validateSearchBox()) {
			Assert.assertTrue(true);
			Logger.info("search box is enabled on home page");
		} else {
			captureScreen(driver, "search");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testSearchBoxValue() throws Exception {
		Logger.info("enter value in search box");
		try {
			home.enterValueInSearchBox(prop.getProperty("Text"));
		} catch (Exception e) {
			captureScreen(driver, "search value");
		}
	}

	@Test(priority = 6)
	public void testMensWatch() throws Exception {
		Logger.info("click on mens watch");
		home.searchMensWatch(prop.getProperty("menWatch"));
		captureScreen(driver, "watch");
	}

	@Test(priority = 7)
	public void testMensWatchPage() throws Exception {
		if (home.validateMensWatchPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to mens watch page");
		} else {
			captureScreen(driver, "watch page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
