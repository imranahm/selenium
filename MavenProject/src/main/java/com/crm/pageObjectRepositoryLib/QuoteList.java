package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteList {
	
	@FindBy(xpath="//input[@value='New Quote']")
	private WebElement newqoteWb;

	public WebElement getNewqoteWb() {
		return newqoteWb;
	}

}
