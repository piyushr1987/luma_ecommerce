package com.luma.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class MenPage extends BaseClass {

	public MenPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='store.menu']//ul[@id='ui-id-2']/li[3]")
	WebElement lnkMen;

	@FindBy(xpath = "//ul[contains(@class,'level0')]//a[@id='ui-id-18']")
	WebElement lnkMenBottom;

	@FindBy(xpath = "//ul[contains(@class,'level1')]//a[@id='ui-id-23']")
	WebElement lnkMenPants;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[text()='Material']")
	WebElement pantMaterial;

	@FindBy(xpath = "//div[5]//div[2]//ol[1]//li[7]//a[1]")
	WebElement pantPolyesterMaterial;

	@FindBy(xpath = "//div[@id='narrow-by-list']//div[normalize-space()='New']")
	WebElement pantNewArrival;

	@FindBy(xpath = "//div[8]//div[2]//ol[1]//li[1]//a[1]")
	WebElement pantNewArrivalYes;

	@FindBy(xpath = "//div[@class='page-wrapper']//div[2]//div[3]//select[1]/option")
	List<WebElement> drpSortBy;

	@FindBy(xpath = "//div[@class='products wrapper grid products-grid']//li[2]")
	WebElement kratosGymPant;

	@FindBy(xpath = "//div[@aria-label='Next']//div[@class='fotorama__arr__arr']")
	WebElement nextButton;

	@FindBy(xpath = "//div[@role='listbox']/div[@class='swatch-option text'][3]")
	WebElement menGymPantSize;

	@FindBy(xpath = "//div[@role='listbox']/div[@class='swatch-option color'][3]")
	WebElement menGymPantColor;

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

	public void goToMen() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkMen).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkMenBottom).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkMenPants).build().perform();
		lnkMenPants.click();
	}

	public boolean validateMenBottomPantPage() {
		return driver.getCurrentUrl().contains("bottoms-men/pants-men");
	}

	public void clickOnMaterial() {
		pantMaterial.click();
	}

	public void clickOnPolysterMaterial() {
		pantPolyesterMaterial.click();
	}

	public boolean validateMenBottomPantMaterialPage() {
		return driver.getCurrentUrl().contains("material=38");
	}

	public void clickOnNew() {
		pantNewArrival.click();
	}

	public void clickOnNewArrival() {
		pantNewArrivalYes.click();
	}

	public boolean validateMenBottomPantNewArrivalPage() {
		return driver.getCurrentUrl().contains("new=1");
	}

	public void selectPantByPrice(String price) {
		for (int i = 0; i < drpSortBy.size(); i++) {
			if (drpSortBy.get(i).getText().equalsIgnoreCase(price)) {
				drpSortBy.get(i).click();
				break;
			}
		}
	}

	public boolean validateMenBottomPantNewArrivalByPricePage() {
		return driver.getCurrentUrl().contains("product_list_order=price");
	}

	public void clickOnGymPant() {
		kratosGymPant.click();
	}

	public boolean validateMenGymPantPage() {
		return driver.getCurrentUrl().contains("kratos-gym-pant.");
	}

	public void clickOnNextButton() {
		nextButton.click();
	}

	public void clickOnKratosGymPantSize() {
		menGymPantSize.click();
	}

	public void clickOnKratosGymPantColor() {
		menGymPantColor.click();
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
