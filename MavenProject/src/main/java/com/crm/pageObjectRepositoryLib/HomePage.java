package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(id="nulltab")
	private WebElement homeWb;
	
	@FindBy(linkText="Leads")
	private WebElement leadWb;
	
	@FindBy(linkText="Accounts")
	private WebElement accountsWb;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsWb;
	
	@FindBy(id="Potentialstab")
	private WebElement potentialWb;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignWb;
	
	@FindBy(linkText="Quotes")
	private WebElement quotesWb;
	
	@FindBy(id="scrollright")
	private WebElement scrollWb;

	public WebElement getScrollWb() {
		return scrollWb;
	}

	public WebElement getHomeWb() {
		return homeWb;
	}

	public WebElement getLeadWb() {
		return leadWb;
	}

	public WebElement getAccountsWb() {
		return accountsWb;
	}

	public WebElement getContactsWb() {
		return contactsWb;
	}

	public WebElement getPotentialWb() {
		return potentialWb;
	}

	public WebElement getCampaignWb() {
		return campaignWb;
	}
	
	public WebElement getQuotesWb() {
		return quotesWb;
	}
	
	

}
