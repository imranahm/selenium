package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuoteDetails {
	
	@FindBy(id="mouseArea__Subject")
	private WebElement subjectWB;
	@FindBy(xpath="//td[@id='Potential Name']/following-sibling::td[1]")
	private WebElement potentialnameWb;
	@FindBy(xpath="//td[@id='Contact Name']/following-sibling::td[1]")
	private WebElement contactnameWb;
	@FindBy(xpath="//td[@id='Account Name']/following-sibling::td[1]")
	private WebElement accountnameWb;
	public WebElement getSubjectWB() {
		return subjectWB;
	}
	public WebElement getPotentialnameWb() {
		return potentialnameWb;
	}
	public WebElement getContactnameWb() {
		return contactnameWb;
	}
	public WebElement getAccountnameWb() {
		return accountnameWb;
	}
	

}
