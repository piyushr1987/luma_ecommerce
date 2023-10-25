package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseClass {

	ForgotPasswordPage forgot;

	public ForgotPasswordTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		forgot = new ForgotPasswordPage();

	}

	@Test(priority = 1)
	public void testSignIn() throws Exception {
		Logger.info("click on sign in link");
		try {
			forgot.clickOnSignIn();
		} catch (Exception e) {
			captureScreen(driver, "sign in link");

		}
	}

	@Test(priority = 2)
	public void testForgotPasswordLink() throws Exception {
		if (forgot.validateForgotPasswordLink()) {
			Assert.assertTrue(true);
			Logger.info("forgort password link is displayed on sign in page");
		} else {
			captureScreen(driver, "forgot password");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testForgotPassword() throws Exception {
		Logger.info("click on forgot password link");
		try {
			forgot.clickOnForgotPassword();
		} catch (Exception e) {
			captureScreen(driver, "forgot password link");

		}
	}

	@Test(priority = 4)
	public void testForgotPasswordPage() throws Exception {
		if (forgot.validateForgotPasswordPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to forgot password page");
		} else {
			captureScreen(driver, "forgot password page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testEmail() throws Exception {
		Logger.info("enter the email");
		try {
			forgot.enterEmail(prop.getProperty("validEmail"));
		} catch (Exception e) {
			captureScreen(driver, "email");

		}
	}

	@Test(priority = 6)
	public void testResetPassword() throws Exception {
		Logger.info("click on reset password");
		try {
			forgot.clickOnResetPassword();
		} catch (Exception e) {
			captureScreen(driver, "reset password");

		}
	}

	@Test(priority = 7)
	public void testResetPasswordMessage() throws Exception {
		if (forgot.validateForgotPasswordMessage(prop.getProperty("resetPasswordMessage"))) {
			Assert.assertTrue(true);
			Logger.info("sucessfully displayed the reset password message");
		} else {
			captureScreen(driver, "reset password message");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
