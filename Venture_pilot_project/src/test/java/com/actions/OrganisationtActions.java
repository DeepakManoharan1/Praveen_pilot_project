package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.OrganisationLocators;
import com.utility.HelperClass;

public class OrganisationtActions {
	OrganisationLocators Orglc;
	public OrganisationtActions() {
		this.Orglc = new OrganisationLocators();
		PageFactory.initElements(HelperClass.getDriver(), Orglc);
	}
	  public void getAdmin() {
	        Orglc.Admin.click();
	    }

	    public void getOrganization() {
	        Orglc.Organization.click();
	    }

	    public void getStructure() {
	        Orglc.Structure.click();
	    }

	    public void getEdit()  {
	        Orglc.Edit.click();
	    }

	    public void getAdd() {
	        Orglc.AddStructure.click();
	    }

	    public void setUnitId(String UnitId) {
	        Orglc.UnitId.sendKeys(UnitId);
	    }

	    public void setName1(String Name) {
	        Orglc.Name1.sendKeys(Name);
	    }

	    public void setDescription1(String Desc) {
	        Orglc.Description1.sendKeys(Desc);
	    }

	    public void getSave() {
	        Orglc.Save.click();
	    }

	    public String getAssertStructure() {
	        return Orglc.StructureAdded.getText();
	    }

	    public String getAssertStructureExit() {
	        return Orglc.Structureexit.getText();
	    }

	    public void StructureEnter(String UnitId, String Name, String Desc) {
	        setUnitId(UnitId);
	        setName1(Name);
	        setDescription1(Desc);
	    }

}
