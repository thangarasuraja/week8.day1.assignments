package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreteLeadTestcase extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		
		excelFileName ="CreateLead";
		System.out.println("VerifycreateLeadfile" + excelFileName);
	}

	@Test (dataProvider="fetch")
	public void runCreateLead(String uName,String pWord,String fName,String lName,String cName) {
		
     LoginPage lp=new LoginPage();
     lp.typeUserName(uName)
     .typePassword(pWord)
     .clickLogin()
     .clickCRM()
     .clickLeads()
     .clickCreateLead()
     .typeCompanyName(cName)
     .typeFirstName(fName)
     .typeLastName(lName)
     .clickcreateLeadButton();
    
 
    
	}
}
