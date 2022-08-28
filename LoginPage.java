package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;


public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage typeUserName(String uName) {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;
		
	}
	
	public LoginPage typePassword(String pWord) {
		getDriver().findElement(By.id("password")).sendKeys(pWord);
		return this;
		
	}
	
	
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
