package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.genericLibraries.WebDriverCommonLib;

public class CreateAccount {
	
	WebDriverCommonLib wcl=new WebDriverCommonLib();
	
	@FindBy(name="property(Account Name)")
    private WebElement accountnameWb;
	
	@FindBy(name="property(Rating)")
	private WebElement ratingWb;
	
	@FindBy(name="property(Phone)") 
	private WebElement phoneWb;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	private WebElement saveWb;
	
	public void createAccount(String accountname, String rating, String phone)
	{
		accountnameWb.sendKeys(accountname);
		wcl.select(ratingWb, rating);
		phoneWb.sendKeys(phone);
		saveWb.click();		
		
	}
}
