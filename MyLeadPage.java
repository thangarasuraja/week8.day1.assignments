package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {
	
	public CreateLead clickCreateLead() {
		
		//Click the Create Lead button
		getDriver().findElement(By.linkText("Create Lead")).click();
		
		return new CreateLead();
		
	}

}
