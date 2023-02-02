package com.swaglabs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.actiondriver.AllActions;
import com.swaglabs.base.BaseClass;

public class YourCartPage extends BaseClass {

	@FindBy(id = "checkout")
	WebElement checkoutTab;

	@FindBy(id = "continue-shopping")
	WebElement coninueShoppingTab;

	@FindBy(xpath = "//div[@class='cart_desc_label']")
	WebElement descriptionLabel;

	@FindBy(xpath = "//div[@class='cart_quantity_label']")
	WebElement qtyLabel;

	@FindBy(xpath = "//div[@class='cart_quantity']")
	WebElement inventoryItemQty;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement inventoryItemname;

	@FindBy(xpath = "//div[@class='inventory_item_desc']")
	WebElement inventoryItemDescription;

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	WebElement inventoryItemprice;

	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement removeTabOnYourCartPage;

	public YourCartPage() {
		PageFactory.initElements(driver, this);
	}

	AllActions act = new AllActions();

	public InventoryPage ClickOnContinueShoppingTab() {
		act.click(driver, coninueShoppingTab);
		return new InventoryPage();
	}

	public CheckoutYourInformationPage clickOnCheckoutTab() {
		act.click(driver, checkoutTab);
		return new CheckoutYourInformationPage();
	}
}
