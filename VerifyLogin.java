package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		
		excelFileName ="Login";
		System.out.println("Verify1" + excelFileName);
	}
	
	@Test (dataProvider="fetch")
	public void runLogin(String username,String password) {
		
     LoginPage lp=new LoginPage();
     lp.typeUserName(username)
     .typePassword(password)
     .clickLogin()
     .homePageVerification();
    
 
    
	}

}
