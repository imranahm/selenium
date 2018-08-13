package com.crm.pageObjectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.crm.genericLibraries.Constants;

public class LoginPage {
	@FindBy(id="userName")
	private WebElement userEdit;
	
	@FindBy(id="passWord")
	private WebElement passwordEdit;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement loginBtn;
	
	public void login(String username,String password)
	{
		userEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		loginBtn.click();
	}
	public void login()
	{
		userEdit.sendKeys(Constants.username);
		passwordEdit.sendKeys(Constants.password);
		loginBtn.click();
	}

}
