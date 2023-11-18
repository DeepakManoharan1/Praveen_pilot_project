package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.Login1Locators;
//import com.locators.BillingLocators;
import com.utility.HelperClass;

public class LoginActions {
Login1Locators logloc ;
	
	public LoginActions() {
		logloc = new Login1Locators();
		
		PageFactory.initElements(HelperClass.getDriver(), logloc);
	}
	
	public void setEmail(String username) {
		logloc.username.sendKeys(username);
	}
	public void setPassword(String password) {
		logloc.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		logloc.loginButton.click();
	}
	public String getVerifyText() {
		return logloc.verifyText.getText();
	}
	public String getErrorText() {
		return logloc.errorText.getText();
	}
	
	public void loginAccount(String username, String password) {
		setEmail(username);
		setPassword(password);
	}
	
}
