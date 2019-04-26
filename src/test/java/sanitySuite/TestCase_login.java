package sanitySuite;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import base.PageBase;
import pages.Login;



public class TestCase_login extends TestBase{

	Login obj_google_search;
    
  PageBase objbaser = new PageBase(driver);
	@Test (priority=1, description = "Open HCAH admin URL")	
	public void Open_Url() {

		log.info("Open HCAH admin URL.");
		driver.get(data.getProperty("base.url"));
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
    @Test(priority=2, description = "Authenticate for Valid User")
    public void User_authentication()
    {
        log.info("Authenticate for the Valid user");
		log.info("Get input crendentials from properties file and put it into the username and password field.");
		obj_google_search = new Login (driver);
		//obj_google_search.search_by_first_option(data.getProperty("TestCase_1.searchString_1"));
		obj_google_search.inputusername(data.getProperty("username"));
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		obj_google_search.inputpassword(data.getProperty("password"));
		
	//	log.info("Assert actual searched string with expected string from properties file.");

		//	  Assert.assertTrue(obj_google_search.get_first_option().equals(getPropertyValue("TestCase_1.assertString_1")));

	}

	@Test (priority=3, description = "Verify the Current page title")	
	public void VerifyPageTitlee() {
        log.info("Verify for the page title");
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		String s=driver.getTitle();
		log.info("Your cureent page title is:"+s);
       
	}

}
