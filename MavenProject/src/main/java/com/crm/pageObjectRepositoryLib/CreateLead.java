package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLead {
	
	@FindBy(name="property(First Name)")
	private WebElement firstnameWb;
	
	@FindBy(name="property(Last Name)")
	private WebElement lastnameWb;
	
	@FindBy(name="property(Company)")
	private WebElement companyWb;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	private WebElement saveWb;
	
	public void createlead(String firstname,String lastname,String company)
	{
		firstnameWb.sendKeys(firstname);
		lastnameWb.sendKeys(lastname);
		companyWb.sendKeys(company);
		saveWb.click();
	} 
	public void createlead(String lastname,String company)
	{
		lastnameWb.sendKeys(lastname);
		companyWb.sendKeys(company);
		saveWb.click();
	}

}
