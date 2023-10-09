package com.luma.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.genericPage.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='header content']//a[@class='logo']")
	WebElement companyLogo;

	@FindBy(id = "search")
	WebElement txtSearch;

	@FindBy(xpath = "//ul[@role='listbox']//li[contains(@id,'qs-option')]")
	List<WebElement> allMensItem;

	@FindBy(xpath = "//div[@class='header content']//div[@class='minicart-wrapper']")
	WebElement imgCart;

	@FindBy(xpath = "//div[@class='footer content']//div[@class='links']//li[3]")
	WebElement lnkContactUs;

	public boolean validateCompanyLogo() {
		return companyLogo.isDisplayed();
	}

	public boolean validateCart() {
		return imgCart.isDisplayed();
	}

	public boolean validateContactUsLink() {
		return lnkContactUs.isDisplayed();
	}

	public boolean validateSearchBox() {
		return txtSearch.isEnabled();
	}

	public void enterValueInSearchBox(String text) throws InterruptedException {
		txtSearch.sendKeys(text);
		Thread.sleep(3000);
	}

	public void searchMensWatch(String expResult) {
		for (int i = 0; i < allMensItem.size(); i++) {
			if (allMensItem.get(i).getText().equalsIgnoreCase(expResult)) {
				allMensItem.get(i).click();
				break;
			}
		}
	}

	public boolean validateMensWatchPage() {
		return driver.getCurrentUrl().contains("men%27s+watch");
	}

}
