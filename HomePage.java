package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage homePageVerification() {
		String expectedTitle="Leaftaps - TestLeaf Automation Platform";
		String actualtitle = 	getDriver().getTitle();
		
		Assert.assertEquals(expectedTitle, actualtitle);
		
		return this;
	}
	
	public MyHomePage clickCRM() {
		
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		
		return new MyHomePage();
		
	
	}

}
