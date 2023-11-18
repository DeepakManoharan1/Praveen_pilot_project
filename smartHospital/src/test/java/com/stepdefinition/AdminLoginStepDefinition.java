package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.actions.FrontOfficeAction;
import com.actions.InfoActions;
import com.actions.LoginActions;
import com.actions.TimeActions;
import com.locators.Login1Locators;
import com.utility.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdminLoginStepDefinition  {
	Login1Locators bill;
	LoginActions logAct = new LoginActions(); 
	FrontOfficeAction frontAction = new FrontOfficeAction();
	TimeActions TimeAct = new TimeActions();
	InfoActions InAct = new InfoActions();

	public AdminLoginStepDefinition() {
		super();
		bill = new Login1Locators();
		PageFactory.initElements(HelperClass.getDriver(), bill);
		
	}
	public String url = "https://demo.smart-hospital.in/site/login";

	@Given("user enters into the Admin portal")
	public void user_enters_into_the_admin_portal() {
		
		System.out.println("0");
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		HelperClass.driver.get(url);
		
		
	}

	@Given("user enters username and password")
	public void user_enters_into_opd() throws InterruptedException {
		System.out.println("1");
//		HelperClass.driver.findElement(By.xpath("(//label[text()='Username']/following::input)[1]")).sendKeys("Admin");
		logAct.loginAccount("Admin", "admin123");
		
		
	}

	@Given("user clicks the login button")
	public void added_the_patient_details() throws InterruptedException {
		System.out.println("2");
		logAct.clickLoginButton();
		System.out.println("Login Success");
	}

	@Then("Check the login success")
	public void check_the_patient_added() {
		System.out.println("3");
		Assert.assertTrue(logAct.getVerifyText().contains("Dashboard"));

	}

	@Given("user enters Invalid username and password")
	public void user_enter_into_the_front_office() {
		System.out.println("4");
		logAct.loginAccount("Admin23", "a9dmin123");
		
	}

	@Given("user clicks enter login button")
	public void added_the_visitors() {
		System.out.println("5");

		logAct.clickLoginButton();
		
	}

	@Then("Check the error message")
	public void check_the_visitors_added() {
		Assert.assertTrue(logAct.getErrorText().contains("Invalid credentials"));

		System.out.println("6");
		
		
	}
/////////////////////////////////
	@Given("user enter time module")
	public void user_enter_into_the_opd_out_patient() throws InterruptedException {
		logAct.loginAccount("Admin", "admin123");
		logAct.clickLoginButton();
		TimeAct.clickTimeButton();
		TimeAct.clickProjectInfo();
		TimeAct.selectCustomer();
		TimeAct.clickaddbutton();
		TimeAct.AddEmployee("AAAAPraveen", "welcome to my world");
		TimeAct.savebutton();
		
		System.out.println("7");
		
	}
	@Given("user enters data to the time project module")
	public void added_the_op_patient_details() throws InterruptedException {
		System.out.println("8");
		
	}

	@Then("Check the customers time module")
	public void check_the_op_patient_added() {
		System.out.println("9");
		Assert.assertTrue(TimeAct.getVerifydiscription().contains("welcome to my world"));
//		  HelperClass.log.info("Error Message occured");
//		  Assert.assertTrue(TimeAct.getverifyerror().contains("Already exists"));
//		  HelperClass.log.info("Error Message occured");
		
	}

	@Given("user enters into the my Info module")
	public void user_enter_into_the_ipd_in_patient() {
		logAct.loginAccount("Admin", "admin123");
		logAct.clickLoginButton();
		InAct.getmyinfo();
		InAct.myinfoname("Praveen","Manoharan", "pm");
		InAct.mydetails("Es6504", "007", "D100","2023-11-17", "344534554", "54535343");
		InAct.getmysave();
		
		System.out.println("10");
		
		
	}

	@Given("user enters data to the my Info module")
	public void added_the_in_patient_details() {
		System.out.println("11");
		
	}

	@Then("Check the myInfo")
	public void check_the_in_patient_added() {
		System.out.println("12");
	}
}
