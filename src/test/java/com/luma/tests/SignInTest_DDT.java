package com.luma.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.luma.genericPage.BaseClass;
import com.luma.pages.SignInPage;
import com.luma.utilities.XLUtils;

public class SignInTest_DDT extends BaseClass {

	SignInPage sign;

	public SignInTest_DDT() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		sign = new SignInPage();

	}

	@Test(dataProvider = "LoginData")
	public void testLoginDetails(String user, String pass) throws Exception {

		Logger.info("sucessfully navigate to luma home page and click on sign in");
		sign.clickOnSignIn();
		Logger.info("enter email address");
		sign.enterEmail(user);
		Logger.info("enter password");
		sign.enterPassword(pass);
		Logger.info("click on login button");
		sign.clickOnLoginButton();
		if (sign.validateUserName()) {
			Assert.assertTrue(true);
			Logger.info("valid user name is sucessfully displayed on home page");
		} else {
			captureScreen(driver, "user");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws Exception {
		String path = System.getProperty("user.dir") + "/src/test/java/com/luma/testData/lumaLoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][] = new String[rownum][colcount];
		for (int i = 1; i < rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
