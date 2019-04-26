package sanitySuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.Login;
import sanitySuite.TestCase_login;


import base.TestBase;
import pages.Patient_Registration;

public class Test_Patient_Registration extends TestBase {
	private TestCase_login objlogin = new TestCase_login();

	Patient_Registration patient_register;
	
	@Test(priority =4 ,description = "Click on Register New PAtient")
	public void NewPatient()
	{
		objlogin.Open_Url();
		objlogin.User_authentication();
		objlogin.VerifyPageTitlee();
		driver.quit();
		
		
	}
}
