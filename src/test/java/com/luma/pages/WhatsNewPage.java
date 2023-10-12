package com.luma.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class WhatsNewPage extends BaseClass {

	public WhatsNewPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='store.menu']//ul[@id='ui-id-2']/li[1]")
	WebElement lnkwhatsNew;

	@FindBy(xpath = "//main[@id='maincontent']//ul[1]//li[1]//a[1]")
	WebElement lnkWomensHoodies;

	@FindBy(xpath = "//div[contains(@class,'products w')]//li[2]")
	WebElement lnkNeckHoodies;

	@FindBy(xpath = "//div[@class='swatch-attribute size']//div[4]")
	WebElement txtHoodiesSize;

	@FindBy(xpath = "//div[@id='option-label-color-93-item-53']")
	WebElement txtHoodiesColor;

	@FindBy(id = "qty")
	WebElement txtQuantity;

	@FindBy(id = "product-addtocart-button")
	WebElement btnAddToCart;

	@FindBy(xpath = "//div[@role='alert']/div[@data-ui-id='message-success']")
	WebElement AddToCartsucessMessage;

	@FindBy(xpath = "//div[@class='product-social-links']/div/a[2]")
	WebElement btnAddToCompare;

	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement ProductComparesucessMessage;

	@FindBy(xpath = "//div[@class='minicart-wrapper']/a")
	WebElement lnkShoppingCart;

	@FindBy(xpath = "//button[@id='btn-minicart-close']")
	WebElement lnkShoppingCartClose;

	public void clickOnWhatsNew() {
		lnkwhatsNew.click();

	}

	public boolean validateWhatsNewPage() {
		return driver.getCurrentUrl().contains("what-is-new.html");
	}

	public void clickOnWomensHoodies() {
		lnkWomensHoodies.click();

	}

	public boolean validateWomensHoodiesPage() {
		return driver.getCurrentUrl().contains("hoodies-and-sweatshirts-women.html");
	}

	public void clickOnWomenVNeckHoodies() {
		lnkNeckHoodies.click();

	}

	public boolean validateWomenVNeckHoodiePage() {
		return driver.getCurrentUrl().contains("eos-v-neck-hoodie.html");
	}

	public void clickOnWomenVNeckHoodiesSize() {
		txtHoodiesSize.click();

	}

	public void clickOnWomenVNeckHoodiesColor() {
		txtHoodiesColor.click();

	}

	public void enterQuantity(String quant) {
		txtQuantity.clear();
		txtQuantity.sendKeys(quant);
	}

	public void clickOnAddToCart() {
		btnAddToCart.click();

	}

	public boolean validateAddToCartMessage(String expMessage) {

		String actMessage = AddToCartsucessMessage.getText();
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnAddToCompare() {
		btnAddToCompare.click();

	}

	public boolean validateAddToCompareMessage(String expMessage) {

		String actMessage = ProductComparesucessMessage.getText();
		if (actMessage.equalsIgnoreCase(expMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public void clickOnShoppingCart() {
		lnkShoppingCart.click();

	}

	public void clickOnShoppingCartCloseButton() {
		String childWindow = driver.getWindowHandle();
		driver.switchTo().window(childWindow);
		lnkShoppingCartClose.click();

	}
}
