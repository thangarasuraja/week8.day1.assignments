package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;


public class CreateLead extends ProjectSpecificMethods {
	
	public CreateLead typeCompanyName(String companyName) {
	//Enter the company name
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			return this;
			
	}
	public CreateLead typeFirstName(String firstName) {

			//Enter the First name
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			return this;
	}

	public CreateLead typeLastName(String lastName) {
			//Enter the Last name
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			return this;
	}
	
	public ViewLeadPage clickcreateLeadButton() {
		//click create lead button
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}


}
