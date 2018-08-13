package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadList {
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement newleadWb;

	public WebElement getNewleadWb() {
		return newleadWb;
	}
	
}
