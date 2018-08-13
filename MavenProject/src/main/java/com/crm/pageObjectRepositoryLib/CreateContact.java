package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.genericLibraries.WebDriverCommonLib;

public class CreateContact {

	@FindBy(name="property(First Name)")
	private WebElement firstNameWb;
	
	@FindBy(name="property(Last Name)")
	private WebElement lastNameWb;
	
	@FindBy(name="property(Lead Source)")
	private WebElement leadSourceWb;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	private WebElement saveBtn;
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	public void createContact(String firstName,String lastName, String leadSource)
	{
		firstNameWb.sendKeys(firstName);
		lastNameWb.sendKeys(lastName);
		wlib.select(leadSourceWb, leadSource);
		saveBtn.click();
		
	}


}
