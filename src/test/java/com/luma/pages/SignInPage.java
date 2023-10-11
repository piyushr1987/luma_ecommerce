package com.luma.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class SignInPage extends BaseClass {

	public SignInPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'panel header')]//li[2]")
	WebElement lnkSignIn;

	@FindBy(id = "email")
	WebElement txtEmail;

	@FindBy(id = "pass")
	WebElement txtPassword;

	@FindBy(id = "send2")
	WebElement btnSignIn;

	@FindBy(xpath = "//div[contains(@class,'panel header')]//li[@class='greet welcome']")
	WebElement lnkUserName;

	public void clickOnSignIn() {
		lnkSignIn.click();

	}

	public boolean validateSignInPage() {
		return driver.getCurrentUrl().contains("account/login/referer");
	}

	public void enterEmail(String uname) {
		txtEmail.sendKeys(uname);

	}

	public void enterPassword(String pass) {

		txtPassword.sendKeys(pass);

	}

	public void clickOnLoginButton() {

		btnSignIn.click();
	}

	public boolean validateUserName() {
		return lnkUserName.isDisplayed();
	}

}
