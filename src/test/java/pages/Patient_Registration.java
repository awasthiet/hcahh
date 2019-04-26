package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class Patient_Registration extends PageBase {

	public Patient_Registration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*******************************************************************************************
	 * All WebElements are identified by @FindBy annotation
	 *******************************************************************************************/
	
	@FindBy(xpath= "//a[@class=\"btn btn-primary pull-right\"]")
	WebElement register;
	
	
	
}
