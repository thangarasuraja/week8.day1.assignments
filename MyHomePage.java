package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage myHomePageVerification() {
		String expectedTitle="My Home | opentaps CRM";
		String actualtitle = getDriver().getTitle();
		
		Assert.assertEquals(expectedTitle, actualtitle);
		
		return this;
	}
	
	public MyLeadPage clickLeads() {
		
		//click the Leads tab
		getDriver().findElement(By.linkText("Leads")).click();
		
		return new MyLeadPage();
		
	}
}
