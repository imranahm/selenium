package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactDetails {
	@FindBy(xpath="//td[@id='Last Name']/following-sibling::td")
	private WebElement contactName;
	
	@FindBy(id="mouseArea__Lead Source")
	private WebElement leadSource;

	public WebElement getContactName() {
		return contactName;
	}

	public WebElement getLeadSource() {
		return leadSource;
	}
	
}
