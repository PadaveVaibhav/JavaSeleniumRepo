package com.swaglabs.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabs.actiondriver.AllActions;
import com.swaglabs.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy (id = "user-name") 
	WebElement username;
	
	@FindBy (id = "password") 
	WebElement password;
	
	@FindBy (id = "login-button") 
	WebElement loginbtn;
  
	@FindBy(xpath = "//div[@class='login_logo']")
	WebElement logo;
	
	@FindBy(xpath = "//div[@class='bot_column']")
	WebElement image;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	AllActions act = new AllActions();
	
	public InventoryPage login(){
		act.type(username,prop.getProperty("username"));
		act.type(password, prop.getProperty("password"));
		act.click(driver, loginbtn);
		return new InventoryPage();
	}
	 
	public boolean validateLogo() {
		return act.isDisplayed(driver, logo);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean validateImage() {
		return act.isDisplayed(driver, image);
	}
	
	
	

}
