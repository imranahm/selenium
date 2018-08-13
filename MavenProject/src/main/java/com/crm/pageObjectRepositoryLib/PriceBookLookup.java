package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PriceBookLookup {
	
	@FindBy(linkText="Maruti")
	private WebElement selectpriceWb;

	public WebElement getSelectpriceWb() {
		return selectpriceWb;
	}

}
