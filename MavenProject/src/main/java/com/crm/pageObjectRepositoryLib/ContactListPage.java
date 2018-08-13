package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactListPage {
	@FindBy(xpath="//input[@value='New Contact']")
	private WebElement newContactBtn;

	public WebElement getNewContactBtn() {
		return newContactBtn;
	}
	

}
