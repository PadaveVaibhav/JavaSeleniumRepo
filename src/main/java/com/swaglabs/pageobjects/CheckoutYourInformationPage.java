package com.swaglabs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.actiondriver.AllActions;
import com.swaglabs.base.BaseClass;

public class CheckoutYourInformationPage extends BaseClass{

	@FindBy(xpath = "//span[@class='title']")
	WebElement checkoutInfoTitle;

	@FindBy(id = "first-name")
	WebElement firstName;
	
	@FindBy(id = "last-name")
	WebElement lastName;
	
	@FindBy(id = "postal-code")
	WebElement postalCode;
	
	@FindBy(id = "postal-code")
	WebElement cancelTab;
	
	@FindBy(id = "continue")
	WebElement continueTab;
	
	
	public CheckoutYourInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	AllActions act = new AllActions();
	
	
	public void enterFirstName(String firstName) {
		act.type(cancelTab, firstName);
	}
	
	public void enterLaststName(String lastName) {
		act.type(cancelTab, lastName);
	}

	public void enterPostalCode(String postalCode) {
		act.type(cancelTab, postalCode);
	}
	
	public void clickOnContinueTab() {
		act.click(driver, continueTab);
	}
	
	public void clickOnCancelTab() {
		act.click(driver, cancelTab);
	}
}
