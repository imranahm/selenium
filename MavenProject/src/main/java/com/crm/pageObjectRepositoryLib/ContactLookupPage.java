package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactLookupPage {
	@FindBy(name="fldValue")
	private WebElement searchWb;
	
	@FindBy(name="Submit")
	private WebElement gobuttonWb;
	
	@FindBy(linkText="Tom Cody")
	private WebElement selectcontactnWb;
	
	public void selectContact(String contactname)
	{
		searchWb.sendKeys(contactname);
		gobuttonWb.click();
		selectcontactnWb.click();
	}
}
