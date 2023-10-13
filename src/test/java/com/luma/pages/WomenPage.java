package com.luma.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class WomenPage extends BaseClass {

	public WomenPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='store.menu']//ul[@id='ui-id-2']/li[2]")
	WebElement lnkWomen;

	@FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
	WebElement lnkWomenTop;

	@FindBy(xpath = "//a[@id='ui-id-11']/span[text()='Jackets']")
	WebElement lnkWomenJacket;

	@FindBy(xpath = "//div[@id='narrow-by-list']/div[1]")
	WebElement WomenJacketStyle;

	@FindBy(xpath = "//div[@class='filter-options-content']/ol[@class='items']/li/a[contains(text(),'Lightweight')]")
	WebElement WomenJacketStyleLightweight;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[normalize-space()='Price']")
	WebElement WomenJacketPrice;

	@FindBy(xpath = "//div[@class='columns']//div[3]//div[2]//ol[1]//li[2]//a[1]")
	WebElement WomenJacketPriceHigh;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[normalize-space()='Climate']")
	WebElement WomenJacketClimate;

	@FindBy(xpath = "//div[12]//div[2]//ol[1]//li[7]//a[1]")
	WebElement WomenJacketClimateSpring;

	@FindBy(xpath = "//div[contains(@class,'products wra')]//li[1]")
	WebElement WomenTrekJacket;

	@FindBy(xpath = "//div[@role='listbox']/div[@class='swatch-option text'][3]")
	WebElement WomenTrekJacketSize;

	@FindBy(xpath = "//div[@role='listbox']/div[@class='swatch-option color'][3]")
	WebElement WomenTrekJacketColor;

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

	public void goToWomen() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkWomen).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkWomenTop).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkWomenJacket).build().perform();
		lnkWomenJacket.click();
	}

	public boolean validateWomenJacketPage() {
		return driver.getCurrentUrl().contains("women/jackets-women");
	}

	public void clickOnStyle() {
		WomenJacketStyle.click();
	}

	public void clickOnLightWeightStyle() {
		WomenJacketStyleLightweight.click();
	}

	public boolean validateWomenJacketLightweightPage() {
		return driver.getCurrentUrl().contains("women.html?style_general=119");
	}

	public void clickOnPrice() {
		WomenJacketPrice.click();
	}

	public void clickOnHighPrice() {
		WomenJacketPriceHigh.click();
	}

	public boolean validateWomenJacketPricePage() {
		return driver.getCurrentUrl().contains("price=50-60");
	}

	public void clickOnClimate() {
		WomenJacketClimate.click();
	}

	public void clickOnSpringClimate() {
		WomenJacketClimateSpring.click();
	}

	public boolean validateWomenJacketClimatePage() {
		return driver.getCurrentUrl().contains("climate=207");
	}

	public void clickOnTrekJacket() {
		WomenTrekJacket.click();
	}

	public boolean validateWomenTrekJacketPage() {
		return driver.getCurrentUrl().contains("adrienne-trek-jacket");
	}

	public void clickOnTrekJacketSize() {
		WomenTrekJacketSize.click();
	}

	public void clickOnTrekJacketColor() {
		WomenTrekJacketColor.click();
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
