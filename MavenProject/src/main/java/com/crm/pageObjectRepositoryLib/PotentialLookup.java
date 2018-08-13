package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PotentialLookup {

	@FindBy(xpath="//input[@value='New Potential']")
	private WebElement newpotentialWb;
	@FindBy(name="property(Potential Name)")
	private WebElement potentialnameWb;
	@FindBy(id="Account Name")
	private WebElement accountnameWb;
	@FindBy(id="Stage")
	private WebElement stageWb;
	@FindBy(xpath="//input[@name='property(Closing Date)']/following-sibling::img")
	private WebElement calendarlookupWb;
	public WebElement getNewpotentialWb() {
		return newpotentialWb;
	}

	public WebElement getPotentialnameWb() {
		return potentialnameWb;
	}

	public WebElement getAccountnameWb() {
		return accountnameWb;
	}

	public WebElement getStageWb() {
		return stageWb;
	}

	public WebElement getCalendarlookupWb() {
		return calendarlookupWb;
	}

	public WebElement getSavebuttonWb() {
		return savebuttonWb;
	}

	public WebElement getSelectpotentialWb() {
		return selectpotentialWb;
	}

	@FindBy(xpath="//input[@value='Save']")
	private WebElement savebuttonWb;
	@FindBy(linkText="Shreya")
	private WebElement selectpotentialWb;
	
	public void createpotential(String potentialname,String accountname,String stage)
	{
		newpotentialWb.click();
		potentialnameWb.sendKeys(potentialname);
		accountnameWb.sendKeys(accountname);
		stageWb.sendKeys(stage);
		calendarlookupWb.click();
	}
}
