package com.luma.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class GearPage extends BaseClass {

	public GearPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='store.menu']//ul[@id='ui-id-2']/li[4]")
	WebElement lnkGear;

	@FindBy(xpath = "//li[contains(@class,'level1 nav-4-2')]/parent::ul/child::li[2]")
	WebElement lnkFitnessEquipment;

	@FindBy(xpath = "//div[@class='column main']/div[2]/div[@class='modes']//a")
	WebElement lstView;

	@FindBy(xpath = "//div[@class='page-wrapper']//div[2]//div[4]//select[1]")
	List<WebElement> drpSortBy;

	@FindBy(xpath = "//div[@data-container='product-list']//div//strong//a[@href='https://magento.softwaretestingboard.com/go-get-r-pushup-grips.html']")
	WebElement pushupGrip;

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

	public void goToGear() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(lnkGear).build().perform();
		Thread.sleep(3000);
		act.moveToElement(lnkFitnessEquipment).build().perform();
		lnkFitnessEquipment.click();
	}

	public boolean validateFitnessEquipmentPage() {
		return driver.getCurrentUrl().contains("fitness-equipment");
	}

	public void clickOnListView() {
		lstView.click();
	}

	public boolean validateListViewPage() {
		return driver.getCurrentUrl().contains("product_list_mode=list");
	}

	public void sortProductByProductName(String name) {
		for (int i = 0; i < drpSortBy.size(); i++) {
			if (drpSortBy.get(i).getText().equalsIgnoreCase(name)) {
				drpSortBy.get(i).click();
			}
		}
	}

	public void clickOnPushupGrip() {
		pushupGrip.click();
	}

	public boolean validatePushupGripPage() {
		return driver.getCurrentUrl().contains("get-r-pushup-grips");
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
