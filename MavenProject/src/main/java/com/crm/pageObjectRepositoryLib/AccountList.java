package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountList {
	
   @FindBy(xpath="//input[@value='New Account']")
   private WebElement newaccountWb;

public WebElement getNewaccountWb() {
	return newaccountWb;
}
   
   
}
