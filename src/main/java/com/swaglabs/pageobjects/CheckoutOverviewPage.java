package com.swaglabs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.actiondriver.AllActions;
import com.swaglabs.base.BaseClass;

public class CheckoutOverviewPage extends BaseClass{
	
	@FindBy(xpath ="//span[@class='title']")
	WebElement checkOutOverviewTitle;
	
	@FindBy(xpath ="//div[@class='cart_quantity_label']")
	WebElement qtyLabel;
	
	@FindBy(xpath ="//div[@class='cart_desc_label']")
	WebElement descriptionLabel;
	
	@FindBy(xpath ="//div[normalize-space()='Payment Information:']")
	WebElement paymentInfoLabel;
	
	@FindBy(xpath ="//div[normalize-space()='SauceCard #31337']")
	WebElement sauceCardsummary;
	
	@FindBy(xpath ="//div[normalize-space()='Shipping Information:']")
	WebElement shippingInfoLabel;
	
	@FindBy(xpath ="//div[normalize-space()='FREE PONY EXPRESS DELIVERY!']")
	WebElement deliverySummary;
	
	@FindBy(xpath ="//div[@class='summary_subtotal_label']")
	WebElement itemTOtal;
	
	@FindBy(xpath ="//div[@class='summary_tax_label']")
	WebElement tax;
	
	@FindBy(xpath ="//div[@class='summary_total_label']")
	WebElement totalAmount;

	@FindBy(id ="cancel")
	WebElement cancelTab;
	
	@FindBy(id ="finish")
	WebElement finishTab;
	
	public CheckoutOverviewPage() {
		 PageFactory.initElements(driver, this);
	}
	
	AllActions act = new AllActions();
	
	
	public void validateTitle() {
		act.isDisplayed(driver, checkOutOverviewTitle);
	}

	public void validateQtyLabel() {
		act.isDisplayed(driver, qtyLabel);
	}
	
	public void validateDescriptionLabel() {
		act.isDisplayed(driver, descriptionLabel);
	}
	
	public void validatePaymentInformationLabel() {
		act.isDisplayed(driver, paymentInfoLabel);
	}
	
	public void validateSaucecardSummary() {
		act.isDisplayed(driver, sauceCardsummary);
	}
	
	public void validateShippingInfoLAbel() {
		act.isDisplayed(driver, shippingInfoLabel);
	}
	
	public void validateDeliverySummary() {
		act.isDisplayed(driver, deliverySummary);
	}
	
	public void validateItemTotal() {
		act.isDisplayed(driver, itemTOtal);
	}
	
	public void validateTax() {
		act.isDisplayed(driver, tax);
	}
	
	public void validateTotalAmount() {
		act.isDisplayed(driver, totalAmount);
	}
	
	public void clickonCancel() {
		act.click(driver, cancelTab);
	}
	
	public CheckoutCompletionPage clickOnFinishTab() {
		act.click(driver, finishTab);
		return new CheckoutCompletionPage();
	}
	
	
}
