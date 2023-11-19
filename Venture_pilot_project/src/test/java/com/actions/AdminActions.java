//package com.actions;
//
//import org.openqa.selenium.support.PageFactory;
//
//import com.locators.AdminLocators;
//import com.utility.HelperClass;
//
//public class AdminActions {
//	AdminLocators Adloc ;
//	public AdminActions() {
//		this.Adloc = new AdminLocators();
//		PageFactory.initElements(HelperClass.getDriver(), Adloc);
//	}
//	public void getJob() {
//		Adloc.Job.click();
//	}
//	public void getEmployeeStatus() {
//		Adloc.EmploymentStatus.click();
//	}
//	public void getAddButton() {
//		Adloc.AddButton.click();
//	}
//	public void setAddEmpDetails(String EmpDetails) {
//		Adloc.AddEmpDetails.sendKeys(EmpDetails);
//	}
//	public void getSaveButton() {
//		Adloc.SaveButton.click();
//	}
//	public String getAssertJob() {
//		return Adloc.AssertJob.getText();
//	}
//	
//}
