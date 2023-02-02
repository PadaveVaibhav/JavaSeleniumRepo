package com.swaglabs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.actiondriver.AllActions;
import com.swaglabs.base.BaseClass;

public class CheckoutCompletionPage extends BaseClass{
	
	@FindBy (xpath = "//span[@class='title']")
	WebElement completionTitle;
	
	@FindBy (xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
	WebElement Text;
	
	@FindBy (xpath = "//img[@alt='Pony Express']")
	WebElement Image;
	
	@FindBy (xpath = "//button[@id='back-to-products']")
	WebElement backHomeTab;
	
	public CheckoutCompletionPage() {
		PageFactory.initElements(driver, this);
	}
	
	AllActions act = new AllActions();
	
	
	public void validateTitle() {
		act.isDisplayed(driver, completionTitle);
	}
	
	public void validateText() {
		act.isDisplayed(driver, Text);
	}
	
	public void validateImage() {
		act.isDisplayed(driver, Image);
	}
	
	public InventoryPage clickOnBackHomeTab() {
		act.click(driver, backHomeTab);
		return new InventoryPage();
	}
}
