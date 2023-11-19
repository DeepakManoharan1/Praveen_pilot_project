package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganisationLocators {
	 @FindBy(xpath = "//span[text()='Admin']")
	    public WebElement Admin;

	    @FindBy(xpath = "//span[text()='Organization ']")
	    public WebElement Organization;
	    @FindBy(xpath = "//a[text()='Structure']")
	    public WebElement Structure;
	    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
	    public WebElement Edit;
	    @FindBy(xpath = "//p[text()='OrangeHRM']/following-sibling::button")
	    public WebElement AddStructure;
	    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	    public WebElement UnitId;
	    @FindBy(xpath = "//div[@class='oxd-form-row'][2]//child::div[2]//child::input[@class='oxd-input oxd-input--active']")
	    public WebElement Name1;
	    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
	    public WebElement Description1;
	    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	    public WebElement Save;
	    @FindBy(xpath = "//div[text()='101: IT']")
	    public WebElement StructureAdded;
	    @FindBy(xpath = "//span[text()='Organization unit name should be unique']")
	    public WebElement Structureexit;
}
