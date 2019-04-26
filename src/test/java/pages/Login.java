package pages;

/*******************************************************************************************
 * Page Factory class Template
 * @author Shirish Kawatkar
 *******************************************************************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;


public class Login extends PageBase {
	
	static public String username;
	static public String password;
	

	public Login(WebDriver driver) {
		super(driver);
	}

	/*******************************************************************************************
	 * All WebElements are identified by @FindBy annotation
	 *******************************************************************************************/

	
	
	@FindBy(xpath= "//input[@id=\"username\"]")
	WebElement username1;
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement password1;

	@FindBy(xpath= "//input[@class=\"btn btn-primary\"]")
	WebElement submit;
	
	@FindBy(xpath= "//a[@class=\"btn btn-primary pull-right\"]")
	WebElement register;
	
	/*******************************************************************************************
	 * All Methods for performing actions
	 * @return 
	 *******************************************************************************************/

	
	public void enter_text(String Search_text){
		
		log.info("Enter text in Username Field: "+Search_text);
		username1.sendKeys(Search_text);
		
	}
public void enter_text_password(String Search_text){
		
		log.info("Enter text in password Field: "+Search_text);
		password1.sendKeys(Search_text);
		
	}

	public void submit() {
		log.info("Press sign in button");
		submit.click();
		
	}
	
	/*******************************************************************************************
	 * This POM method will be exposed in test case
	 * @param 
	 *******************************************************************************************/


	
	public void inputusername(String text_to_search) {

		this.enter_text(text_to_search);
		
	}
	
	public void inputpassword(String text_to_search) {

		this.enter_text_password(text_to_search);
		
	}
	
	
}
