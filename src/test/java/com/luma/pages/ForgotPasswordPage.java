package com.luma.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class ForgotPasswordPage extends BaseClass {

	public ForgotPasswordPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'panel header')]//li[2]")
	WebElement lnkSignIn;

	@FindBy(xpath = "//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]")
	WebElement lnkForgotPassword;

	@FindBy(id = "email_address")
	WebElement txtEmail;

	@FindBy(xpath = "//span[normalize-space()='Reset My Password']")
	WebElement btnReset;

	@FindBy(xpath = "//div[@role='alert']/div[@data-ui-id='message-success']")
	WebElement alertMessage;

	public void clickOnSignIn() {
		lnkSignIn.click();

	}

	public boolean validateForgotPasswordLink() {
		return lnkForgotPassword.isDisplayed();
	}

	public void clickOnForgotPassword() {
		lnkForgotPassword.click();

	}

	public boolean validateForgotPasswordPage() {
		return driver.getCurrentUrl().contains("forgotpassword");
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void clickOnResetPassword() {
		btnReset.click();

	}

	public boolean validateForgotPasswordMessage(String expMessage) {
		String actMessage = alertMessage.getText();
		System.out.println(actMessage);
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}
	}

}
