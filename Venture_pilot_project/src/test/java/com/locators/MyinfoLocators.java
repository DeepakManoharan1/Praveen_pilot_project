package com.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyinfoLocators {
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")
	public WebElement myinfo;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
	public WebElement FirstName;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
	public WebElement LasttName;
	@FindBy(xpath="(//label[text()='Nickname']/following::input)[1]")
	public WebElement nickName;
	@FindBy(xpath=" (//label[text()='Employee Id']/following::input)[1]")
	public WebElement employeeid;
	@FindBy(xpath="(//label[text()='Other Id']/following::input)[1]")
	public WebElement otherid;
	@FindBy(xpath="//div[@class='oxd-main-menu-search']//input[1]")
	public WebElement Licencenumber;
	@FindBy(xpath="(//label[text()='License Expiry Date']/following::input)[1]")
	public WebElement ExpiryDate;
	@FindBy(xpath="(//label[text()='SSN Number']/following::input)[1]")
	public WebElement ssnnumber;
	@FindBy(xpath="(//label[text()='SIN Number']/following::input)[1]")
	public WebElement sinnuber;
	@FindBy(xpath="//p[text()=' * Required']/following-sibling::button")
	public WebElement infosave;
	@FindBy(xpath="(//div[@class='oxd-select-wrapper']//div)[1]")
	public WebElement nationality;
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']//h6[1]")
	public WebElement savedsucessfully;
	

}
