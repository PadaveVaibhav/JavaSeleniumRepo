package com.swaglabs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.actiondriver.AllActions;
import com.swaglabs.base.BaseClass;

public class InventoryPage extends BaseClass {

	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement appLogo;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement shoppingCartLogo;

	@FindBy(id = "react-burger-menu-btn")
	WebElement burgerMenuButton;

	@FindBy(xpath = "//span[@class='title']")
	WebElement productTitle;

	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement productSortContainer;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	WebElement backPackTitle;

	@FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")
	WebElement backPackImage;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addToCartBackPack;

	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement RemoveBackPackTab;

	@FindBy(xpath = "//div[normalize-space()='$29.99']")
	WebElement BackPackPrice;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Bike Light']")
	WebElement bikeLightTitle;

	@FindBy(xpath = "//img[@alt='Sauce Labs Bike Light']")
	WebElement bikeLightImage;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement addToCartBikeLight;

	@FindBy(id = "remove-sauce-labs-bike-light")
	WebElement RemoveBikeLightTab;

	@FindBy(xpath = "//div[normalize-space()='$9.99']")
	WebElement bikeLightPrice;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
	WebElement boltTshirtTitle;

	@FindBy(xpath = "//img[@alt='Sauce Labs Bolt T-Shirt']")
	WebElement boltTshirtImage;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement addToCartBoltTshirt;

	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")
	WebElement RemoveBoltTshirtTab;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]")
	WebElement BoltTshirtPrice;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
	WebElement fleeceJacketTitle;

	@FindBy(xpath = "//img[@alt='Sauce Labs Fleece Jacket']")
	WebElement fleeceJacketImage;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement addToCartFleeceJacket;

	@FindBy(id = "remove-sauce-labs-fleece-jacket")
	WebElement RemoveFleeceJacketTab;

	@FindBy(xpath = "//div[normalize-space()='$49.99']")
	WebElement flleceJacketPrice;

	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Onesie']")
	WebElement SauceLabsOnesieTitle;

	@FindBy(xpath = "//img[@alt='Sauce Labs Onesie']")
	WebElement sauceLabOnesieImage;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	WebElement addToCartOnesie;

	@FindBy(id = "remove-sauce-labs-onesie")
	WebElement RemoveOnesieTab;

	@FindBy(xpath = "//div[normalize-space()='$7.99']")
	WebElement onesiePrice;

	@FindBy(xpath = "//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")
	WebElement redTshirtTitle;

	@FindBy(xpath = "//img[@alt='Test.allTheThings() T-Shirt (Red)']")
	WebElement redTshirtImage;

	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	WebElement addToCartRedTshirt;

	@FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
	WebElement RemoveRedTshirtTab;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[2]/div[2]/div[1]")
	WebElement redTshirtPrice;

	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}

	AllActions act = new AllActions();

	public void validateLogo() {
		act.isDisplayed(driver, appLogo);
	}

	public void validateProductsTitle() {
		act.isDisplayed(driver, productTitle);
	}

	public void clickOnNameAtoZ() {
		act.selectByValue(productSortContainer, "az");
	}

	public void clickOnNameZtoA() {
		act.selectByValue(productSortContainer, "za");
	}

	public void clickOnLowToHigh() {
		act.selectByValue(productSortContainer, "lohi");
	}

	public void clickOnHightoLow() {
		act.selectByValue(productSortContainer, "hilo");
	}

	public YourCartPage clickOnShoppingCartLogo() {
		act.click(driver, shoppingCartLogo);
		return new YourCartPage();
	}

	public ProductDisplayPage1 clickOnBackPack() {
		act.click(driver, backPackTitle);
		return new ProductDisplayPage1();
	}

	public YourCartPage clickOnBackPackImage() {
		act.click(driver, backPackImage);
		return new YourCartPage();
	}

	public void validateBackPAckPrice() {
		act.isDisplayed(driver, BackPackPrice);
	}

	public YourCartPage clickOnBackPackAddToCart() {
		act.click(driver, addToCartBackPack);
		return new YourCartPage();
	}

	public void clickOnBackPackRemoveTAb() {
		act.click(driver, RemoveBackPackTab);
	}

	public void clickOnBikeLight() {
		act.click(driver, bikeLightTitle);
	}

	public YourCartPage clickOnBikeLightImage() {
		act.click(driver, bikeLightImage);
		return new YourCartPage();
	}

	public void validatePriceBikeLight() {
		act.isDisplayed(driver, bikeLightPrice);
	}

	public YourCartPage clickOnBikeLightAddToCart() {
		act.click(driver, addToCartBikeLight);
		return new YourCartPage();

	}

	public void clickOnBikeLightRemoveTAb() {
		act.click(driver, RemoveBikeLightTab);
	}
	
	public void clickOnSauceLAbBoltTshirt() {
		act.click(driver, boltTshirtTitle);
	}

	public YourCartPage clickOnSauceLAbBoltTshirtimage() {
		act.click(driver, boltTshirtImage);
		return new YourCartPage();
	}

	public void validateBoltTshirtPrice() {
		act.isDisplayed(driver, BoltTshirtPrice);
	}

	public YourCartPage clickOnBoltTshirtAddToCart() {
		act.click(driver, addToCartBoltTshirt);
		return new YourCartPage();

	}
	
	public void clickOnBoltTshirtRemoveTAb() {
		act.click(driver, RemoveBoltTshirtTab);
	}

	public void clickOnFleeceJacket() {
		act.click(driver, fleeceJacketTitle);
	}

	public YourCartPage clickOnFleeceJacketImage() {
		act.click(driver, fleeceJacketImage);
		return new YourCartPage();
	}

	public void validateFleeceJacketPrice() {
		act.isDisplayed(driver, flleceJacketPrice);
	}

	public YourCartPage clickOnFeeceJacketAddToCart() {
		act.click(driver, addToCartFleeceJacket);
		return new YourCartPage();

	}
	
	public void clickOnFleeceJacketRemoveTAb() {
		act.click(driver, RemoveFleeceJacketTab);
	}

	public void clickOnSauceLabOnesie() {
		act.click(driver, SauceLabsOnesieTitle);
	}

	public YourCartPage clickOnOnesieImage() {
		act.click(driver, sauceLabOnesieImage);
		return new YourCartPage();
	}

	public void validatePriceSauceLabOnesie() {
		act.isDisplayed(driver, onesiePrice);
	}

	public YourCartPage clickOnOnesieAddToCart() {
		act.click(driver, addToCartOnesie);
		return new YourCartPage();
	}
	
	public void clickOnOnesieRemoveTAb() {
		act.click(driver, RemoveOnesieTab);
	}

	public void clickOnRedTshirt() {
		act.click(driver, redTshirtTitle);
	}

	public YourCartPage clickOnRedTshirtImage() {
		act.click(driver, redTshirtImage);
		return new YourCartPage();
	}

	public void validateRedTshirtPrice() {
		act.isDisplayed(driver, redTshirtPrice);
	}

	public YourCartPage clickOnRedTshirtAddToCart() {
		act.click(driver, addToCartRedTshirt);
		return new YourCartPage();
	}
	
	public void clickOnRedTshirtRemoveTAb() {
		act.click(driver, RemoveRedTshirtTab);
	}
	
}
