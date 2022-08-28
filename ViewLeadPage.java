package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage verifycreateLead() {
		
		String expectedTitle = 	getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		String actualtitle = 	getDriver().getTitle();
		
		Assert.assertEquals(expectedTitle, actualtitle);
		
		return this;
	}

}
