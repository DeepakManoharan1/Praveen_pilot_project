package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.MyInfoLocators;
import com.utility.HelperClass;

public class InfoActions {
MyInfoLocators myloca ;
	
	public InfoActions() {
		this.myloca = new MyInfoLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), myloca);
	}
	public void getmyinfo() {
		myloca.myinfo.click();
	}
	
	
	public void setFirstName(String FirstName) {
		myloca.FirstName.sendKeys(FirstName);
	}
	public void setLastName(String LastName) {
		myloca.LasttName.sendKeys(LastName);
	}
	public void setnickName(String nickName) {
		myloca.nickName.sendKeys(nickName);
	}
	public void setemployeeid(String employeeid) {
		myloca.employeeid.sendKeys(employeeid);
	}
	public void setotherid(String otherid) {
		myloca.otherid.sendKeys(otherid);
	}
	public void setlicencenumber(String licencenumber) {
		myloca.Licencenumber.sendKeys(licencenumber);
	
	}
	public void setExpirydate(String Expirydate) {
		myloca.ExpiryDate.sendKeys(Expirydate);
	
	}
	public void setssnnumber(String ssnnumber) {
		myloca.ssnnumber.sendKeys(ssnnumber);
	
	}
	public void setsinnumber(String sinnumber) {
		myloca.sinnuber.sendKeys(sinnumber);
	
	}
	public void getmysave() {
		myloca.infosave.click();
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
}
