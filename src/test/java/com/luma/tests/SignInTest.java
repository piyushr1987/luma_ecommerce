package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.SignInPage;

public class SignInTest extends BaseClass {

	SignInPage sign;

	public SignInTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		sign = new SignInPage();

	}

	@Test(priority = 1)
	public void testRegister() throws Exception {
		Logger.info("click on sign in link");
		try {
			sign.clickOnSignIn();
		} catch (Exception e) {
			captureScreen(driver, "sign in link");

		}
	}

	@Test(priority = 2)
	public void testSignInPage() throws Exception {
		if (sign.validateSignInPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to sign in page");
		} else {
			captureScreen(driver, "sign in");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testLoginDetails() throws Exception {

		Logger.info("enter email address");
		try {
			sign.enterEmail(prop.getProperty("validEmail"));
		} catch (Exception e) {
			captureScreen(driver, "email");
		}
		Logger.info("enter password");
		try {
			sign.enterPassword(prop.getProperty("validPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");
		}
		Logger.info("click on login button");
		try {
			sign.clickOnLoginButton();
		} catch (Exception e) {
			captureScreen(driver, "login button");
		}
	}

	@Test(priority = 4)
	public void testValidUser() throws Exception {
		if (sign.validateUserName()) {
			Assert.assertTrue(true);
			Logger.info("valid user name is sucessfully displayed on home page");
		} else {
			captureScreen(driver, "user");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
