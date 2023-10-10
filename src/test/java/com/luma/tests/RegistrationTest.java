package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.RegistrationPage;

public class RegistrationTest extends BaseClass {

	RegistrationPage register;

	public RegistrationTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		register = new RegistrationPage();

	}

	@Test(priority = 1)
	public void testRegister() throws Exception {
		Logger.info("click on create account link");
		try {
			register.clickOnCreateAnAccount();
		} catch (Exception e) {
			captureScreen(driver, "register link");

		}
	}

	@Test(priority = 2)
	public void testRegistrationPage() throws Exception {
		if (register.validateRegistrationPage()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to registration page");
		} else {
			captureScreen(driver, "register");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 3)
	public void testFirstName() throws Exception {
		Logger.info("Enter the first name");
		try {
			register.enterFirstName(prop.getProperty("firstName"));
		} catch (Exception e) {
			captureScreen(driver, "fname");
		}

	}

	@Test(priority = 4)
	public void testLastName() throws Exception {
		Logger.info("Enter the last name");
		try {
			register.enterLastName(prop.getProperty("lastName"));
		} catch (Exception e) {
			captureScreen(driver, "lname");
		}

	}

	@Test(priority = 5)
	public void testEmail() throws Exception {
		Logger.info("Enter valid email");
		try {
			register.enterEmail(prop.getProperty("validEmail"));
		} catch (Exception e) {
			captureScreen(driver, "email");
		}

	}

	@Test(priority = 6)
	public void testPasswordAndConfirmPassword() throws Exception {
		Logger.info("enter password and confirm password");
		if (register.validatePasswordAndConfirmPassword(prop.getProperty("validPassword"),
				prop.getProperty("confirmvalidPassword"))) {
			Assert.assertTrue(true);
			Logger.info("both password are matched");
		} else {
			captureScreen(driver, "password");
			Assert.assertTrue(false);
			Logger.warn("password are not matched");
		}
	}

	@Test(priority = 7)
	public void testSubmit() throws Exception {
		Logger.info("click on create an account button");
		try {
			register.clickOnCreateAccountButton();
		} catch (Exception e) {
			captureScreen(driver, "submit");
		}

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
