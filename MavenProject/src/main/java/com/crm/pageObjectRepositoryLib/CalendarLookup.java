package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarLookup {
	@FindBy(xpath="//a[text()='7']")
	private WebElement selectdateWb;

	public WebElement getSelectdateWb() {
		return selectdateWb;
	}
	

}
