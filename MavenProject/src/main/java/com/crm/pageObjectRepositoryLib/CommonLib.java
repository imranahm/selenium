package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonLib {
	@FindBy(partialLinkText="Logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
