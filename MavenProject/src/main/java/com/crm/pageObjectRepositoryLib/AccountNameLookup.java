package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountNameLookup {
	
	@FindBy(name="fldValue")
	private WebElement searchWb;
	
	@FindBy(name="Submit")
	private WebElement gobtnWb;
	
	@FindBy(linkText="Imran")
	private WebElement selectaccountWb;
	
	public void selectaccount(String accountname)
	{searchWb.clear();
		searchWb.sendKeys(accountname);	
		gobtnWb.click();
		selectaccountWb.click();
		
	}
	

}
