package com.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.locators.MyinfoLocators;
//import com.locators.BillingLocators;
import com.utility.HelperClass;

public class BillingActions {
	MyinfoLocators bill ;
	public BillingActions() {
		this.bill = new MyinfoLocators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
		
	}
	public void getmyinfo() {
		bill.myinfo.click();
	}
	public void setFirstName(String FirstName) {
		bill.FirstName.clear();
//		bill.FirstName.sendKeys(FirstName);
	}
	public void setLastName(String LastName) {
		bill.LasttName.clear();
		bill.LasttName.sendKeys(LastName);
	}
	public void setnickName(String nickName) {
		bill.nickName.clear();
//		bill.nickName.sendKeys(nickName);
	}
	public void setemployeeid(String employeeid) {
		bill.employeeid.clear();
//		bill.employeeid.sendKeys(employeeid);
	}
	public void setotherid(String otherid) {
		bill.otherid.clear();
		bill.otherid.sendKeys(otherid);
	}
	public void setlicencenumber(String licencenumber) {
		bill.Licencenumber.clear();
		bill.Licencenumber.sendKeys(licencenumber);
	
	}
	public void setExpirydate(String Expirydate) {
		bill.ExpiryDate.clear();
		bill.ExpiryDate.sendKeys(Expirydate);
	
	}
	public void setssnnumber(String ssnnumber) {
		bill.ssnnumber.sendKeys(ssnnumber);
	
	}
	public void setsinnumber(String sinnumber) {
		bill.sinnuber.sendKeys(sinnumber);
	
	}
	public void getmysave() throws InterruptedException {
		Thread.sleep(3000);
		bill.infosave.click();
	}
	public void myinfoname(String FirstName, String LastName, String nickName ) {
		setFirstName(FirstName);
		setLastName(LastName);
		setnickName(nickName);
}
	public void mydetails(String employeeid,String otherid,String licencenumber,String Expirydate,String ssnnumber,String sinnumber) {
		setemployeeid(employeeid);
		setotherid(otherid);
		setlicencenumber(licencenumber);
		setExpirydate(Expirydate);
		setssnnumber(ssnnumber);
		setsinnumber(sinnumber);
	}
	public void nationalitySelect() {
		Select s = new Select(bill.nationality);
		s.selectByVisibleText("India");
	}
	public String getsucessfull() {
		String Vtext =  bill.savedsucessfully.getText();
		return Vtext;
	}
}
