package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateQuotes {
	
	@FindBy(xpath="//img[@title='Product Name Lookup']")
	private WebElement productnamelookupWb;
	
	@FindBy(xpath="//img[@title='PriceBook Name Lookup']")
	private WebElement pricebooklookupWb;
	
	@FindBy(id="txtQty1")
	private WebElement quatityWb;
	
	@FindBy(name="property(Subject)")
	private WebElement subjectWb;
	
	@FindBy(xpath="//img[@title='Account Name Lookup']")
	private WebElement accountnamelookupWb;
	
	@FindBy(xpath="//img[@title='Contact Name Lookup']")
	private WebElement contactnamelookupWb;
	
	@FindBy(xpath="//img[@title='Potential Name Lookup']")
	private WebElement potentiallookupWb;
	
	@FindBy(xpath="(//input[@value='Save'])[1]")
	private WebElement savebuttonWb; 
	

	public WebElement getSavebuttonWb() {
		return savebuttonWb;
	}

	public WebElement getPotentiallookupWb() {
		return potentiallookupWb;
	}

	public WebElement getContactnamelookupWb() {
		return contactnamelookupWb;
	}

	public WebElement getAccountnamelookupWb() {
		return accountnamelookupWb;
	}

	public WebElement getSubjectWb() {
		return subjectWb;
	}

	public WebElement getProductnamelookupWb() {
		return productnamelookupWb;
	}

	public WebElement getPricebooklookupWb() {
		return pricebooklookupWb;
	}

	public WebElement getQuatityWb() {
		return quatityWb;
	}
	
	
  	
}
