package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductLookUp {
	
	@FindBy(linkText="Maruti")
	private WebElement selproductWb;

	public WebElement getSelproductWb() {
		return selproductWb;
	}
	
	
}
