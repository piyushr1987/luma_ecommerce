package com.luma.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class SalePage extends BaseClass {

	public SalePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='store.menu']//ul[@id='ui-id-2']/li[6]")
	WebElement lnkSale;

	@FindBy(xpath = "//div[contains(@class,'block-promo-wrapper block-promo-2')]/a[1]")
	WebElement mensBargain;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[@class='filter-options-title'][text()='Style']")
	WebElement style;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[4]//a[1]")
	WebElement workoutPants;

	@FindBy(xpath = "//div[@class='products wrapper grid products-grid']//li[2]")
	WebElement fitnessShort;

	@FindBy(xpath = "//div[@role='listbox']/div[@class='swatch-option text'][3]")
	WebElement fitnessShortSize;

	@FindBy(xpath = "//div[@role='listbox']/div[@class='swatch-option color'][3]")
	WebElement fitnessShortColor;

	@FindBy(id = "qty")
	WebElement txtQuantity;

	@FindBy(id = "product-addtocart-button")
	WebElement btnAddToCart;

	@FindBy(xpath = "//div[@role='alert']/div[@data-ui-id='message-success']")
	WebElement AddToCartsucessMessage;

	@FindBy(xpath = "//div[@class='minicart-wrapper']/a")
	WebElement lnkShoppingCart;

	@FindBy(xpath = "//button[@id='btn-minicart-close']")
	WebElement lnkShoppingCartClose;

	public void clickOnSale() {
		lnkSale.click();
	}

	public boolean validateSalePage() {
		return driver.getCurrentUrl().contains("sale.html");
	}

	public void clickOnMenBargains() {
		mensBargain.click();
	}

	public boolean validateMenBargainsSalePage() {
		return driver.getCurrentUrl().contains("promotions/men-sale.html");
	}

	public void clickOnStyle() {
		style.click();
	}

	public void clickOnWorkoutPant() {
		workoutPants.click();
	}

	public boolean validateMenWorkoutPantPage() {
		return driver.getCurrentUrl().contains("men-sale.html?style_bottom=115");
	}

	public void clickOnMenFitnessShort() {
		fitnessShort.click();
	}

	public boolean validateMenFitnessShortPage() {
		return driver.getCurrentUrl().contains("orestes-fitness-short.html");
	}

	public void clickOnMenFitnessShortSize() {
		fitnessShortSize.click();
	}

	public void clickOnMenFitnessShortColor() {
		fitnessShortColor.click();
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

	public void clickOnShoppingCart() {
		lnkShoppingCart.click();

	}

	public void clickOnShoppingCartCloseButton() {
		String childWindow = driver.getWindowHandle();
		driver.switchTo().window(childWindow);
		lnkShoppingCartClose.click();

	}

}
