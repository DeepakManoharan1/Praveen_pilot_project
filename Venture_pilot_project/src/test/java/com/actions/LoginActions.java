package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.LoginLocators;
import com.utility.HelperClass;

public class LoginActions {
	LoginLocators logact;
	public LoginActions() {
		this.logact = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), logact);
	}
	public void setEmail(String username) {
		logact.username.sendKeys(username);
	}
	public void setPassword(String password) {
		logact.password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		logact.loginButton.click();
	}
	public String getVerifyText() {
		return logact.verifyText.getText();
	}
	public String getErrorText() {
		return logact.errorText.getText();
	}
	public void username(String username)
	{
		logact.username.sendKeys(username);
	}
	public void password(String password)
	{
		logact.password.sendKeys(password);
	}
	
	public void loginAccount(String username, String password) {
		setEmail(username);
		setPassword(password);
	}
}
