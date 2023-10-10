package com.luma.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class RegistrationPage extends BaseClass {

	public RegistrationPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'panel header')]//li[3]")
	WebElement lnkRegistration;

	@FindBy(id = "firstname")
	WebElement txtFirstName;

	@FindBy(id = "lastname")
	WebElement txtLastName;

	@FindBy(id = "email_address")
	WebElement txtEmail;

	@FindBy(id = "password")
	WebElement txtPassword;

	@FindBy(id = "password-confirmation")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//button[contains(@class,'action sub')]")
	WebElement btnSubmit;

	public void clickOnCreateAnAccount() {
		lnkRegistration.click();

	}

	public boolean validateRegistrationPage() {
		return driver.getCurrentUrl().contains("customer/account/create/");
	}

	public void enterFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	/*
	 * public void enterPassword(String pass) { txtPassword.sendKeys(pass); }
	 */

	/*
	 * public void enterConfirmPassword(String cpass) {
	 * txtConfirmPassword.sendKeys(cpass); }
	 */

	public boolean validatePasswordAndConfirmPassword(String pass, String cpass) throws InterruptedException {
		txtPassword.sendKeys(pass);
		Thread.sleep(3000);
		txtConfirmPassword.sendKeys(cpass);
		return pass.matches(cpass);

	}

	public void clickOnCreateAccountButton() {
		btnSubmit.click();
	}

}
