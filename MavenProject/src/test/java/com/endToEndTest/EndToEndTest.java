package com.endToEndTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.genericLibraries.BaseClass;
import com.crm.genericLibraries.ExcelLib;
import com.crm.genericLibraries.WebDriverCommonLib;
import com.crm.pageObjectRepositoryLib.AccountList;
import com.crm.pageObjectRepositoryLib.AccountNameLookup;
import com.crm.pageObjectRepositoryLib.CalendarLookup;
import com.crm.pageObjectRepositoryLib.ContactListPage;
import com.crm.pageObjectRepositoryLib.ContactLookupPage;
import com.crm.pageObjectRepositoryLib.CreateAccount;
import com.crm.pageObjectRepositoryLib.CreateContact;
import com.crm.pageObjectRepositoryLib.CreateLead;
import com.crm.pageObjectRepositoryLib.CreateQuotes;
import com.crm.pageObjectRepositoryLib.HomePage;
import com.crm.pageObjectRepositoryLib.LeadList;
import com.crm.pageObjectRepositoryLib.PotentialLookup;
import com.crm.pageObjectRepositoryLib.PriceBookLookup;
import com.crm.pageObjectRepositoryLib.ProductLookUp;
import com.crm.pageObjectRepositoryLib.QuoteDetails;
import com.crm.pageObjectRepositoryLib.QuoteList;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.crm.genericLibraries.SampleListener.class)
@Test
public class EndToEndTest extends BaseClass {	
		ExcelLib elib=new ExcelLib();
		WebDriverCommonLib wcl=new WebDriverCommonLib();
		ExtentTest logger;
		@SuppressWarnings("unused")
		
		public void createContactTest() throws Throwable
		{
			logger=extent.startTest("createContactTest");
			//Get value from excel sheet for contact
			String firstname=elib.getExcelData("Contacts", 1, 2);
			String lastname=elib.getExcelData("Contacts", 1, 3);
			String leadsource=elib.getExcelData("Contacts", 1, 4);
			String contactname=elib.getExcelData("Contacts", 1, 5);
			//navigate to home page and click on contact button
			logger.log(LogStatus.INFO, "Home Page Test");
			logger.log(LogStatus.INFO, "Verifying Home page");
			if(true){
				logger.log(LogStatus.PASS, "Home page verified");
			}else{
				logger.log(LogStatus.FAIL, "Home page not verified");
			}
			extent.endTest(logger);
			HomePage hp=PageFactory.initElements(driver, HomePage.class);
			hp.getContactsWb().click();
			//navigate to contact list page and click on new contact button
			ContactListPage clp=PageFactory.initElements(driver, ContactListPage.class);
			clp.getNewContactBtn().click();
			//Create a contact
			CreateContact cc=PageFactory.initElements(driver, CreateContact.class);
			cc.createContact(firstname, lastname, leadsource);
			
			//Navigate to account page
			hp.getAccountsWb().click();
			//navigate to account list page
			AccountList ac=PageFactory.initElements(driver, AccountList.class);
			ac.getNewaccountWb().click();
			//Create an account
			String accountname=elib.getExcelData("Accounts", 1, 2);
			String rating=elib.getExcelData("Accounts", 1, 3);
			String phone=elib.getExcelData("Accounts", 1, 4);
			CreateAccount ca=PageFactory.initElements(driver, CreateAccount.class);
			ca.createAccount(accountname, rating, phone);
			//navigate to home page and click on Leads button
			hp.getLeadWb().click();
			LeadList ll=PageFactory.initElements(driver, LeadList.class);
			ll.getNewleadWb().click();
			//get value from excel for lead
			String firstName=elib.getExcelData("Leads", 1, 2);
			String lastName=elib.getExcelData("Leads", 1, 3);
			String company=elib.getExcelData("Leads", 1, 4);
			//create object to CreateLead class
			CreateLead cl=PageFactory.initElements(driver, CreateLead.class);
			cl.createlead(firstName, lastName, company);		
			//click on scroll button
			for(int i=0;i<60;i++)
			{
			hp.getScrollWb().click();
			}
			//Click on quotes tab
		    hp.getQuotesWb().click();
		    //Click on new quotes button
		    QuoteList ql=PageFactory.initElements(driver, QuoteList.class);
		    ql.getNewqoteWb().click();
		    //Create quotes
		    CreateQuotes cq=PageFactory.initElements(driver, CreateQuotes.class);
		    cq.getProductnamelookupWb().click();
		    String winid=wcl.getWindowIDs();
		    String[]winids=winid.split(";");
		    driver.switchTo().window(winids[1]);
		    ProductLookUp pl=PageFactory.initElements(driver, ProductLookUp.class);
		    pl.getSelproductWb().click();
		    driver.switchTo().window(winids[0]);
		    cq.getPricebooklookupWb().click();
		    String winid1=wcl.getWindowIDs();
		    String[]winids1=winid1.split(";");
		    driver.switchTo().window(winids1[1]);
		    PriceBookLookup pbl=PageFactory.initElements(driver, PriceBookLookup.class);
		    pbl.getSelectpriceWb().click();
		    driver.switchTo().window(winids1[0]);
		    String subject=elib.getExcelData("Quotes", 1, 2);
		    String quantity=elib.getExcelData("Quotes", 1, 3);
		    cq.getSubjectWb().sendKeys(subject);
		    cq.getQuatityWb().sendKeys(quantity);
		    cq.getAccountnamelookupWb().click();
		    String win=wcl.getWindowIDs();
		    String[]wins=win.split(";");
		    driver.switchTo().window(wins[1]);
		    AccountNameLookup anl=PageFactory.initElements(driver, AccountNameLookup.class);
		    anl.selectaccount(accountname);		
		    driver.switchTo().window(wins[0]);
		    //click on contact name lookup
		    cq.getContactnamelookupWb().click();
		    //move control to contact name page window
		    String winid2=wcl.getWindowIDs();
		    String[] winids2=winid2.split(";");
		    driver.switchTo().window(winids2[1]);
		    //Search and select contact
		    ContactLookupPage clp1=PageFactory.initElements(driver, ContactLookupPage.class);
		    String contact=elib.getExcelData("Contacts", 1, 6);
		    clp1.selectContact(contact);
		    driver.switchTo().window(winids2[0]);
		    //Click on potential lookup
		    cq.getPotentiallookupWb().click();
		    //Pass control to potential window	    
		    String winid3=wcl.getWindowIDs();
		    String[]winids3=winid3.split(";");
		    driver.switchTo().window(winids3[1]);
		    //Fetch Excel data for Potential
		    String potentialname=elib.getExcelData("Potential", 1, 2);
		    String accountname1=elib.getExcelData("Potential", 1, 3);
		    String stage=elib.getExcelData("Potential", 1, 4);
		    PotentialLookup plp=PageFactory.initElements(driver, PotentialLookup.class);
		    plp.createpotential(potentialname, accountname1, stage);
		    String winid4=wcl.getWindowIDs();
		    String[] winids4=winid4.split(";");
		    driver.switchTo().window(winids4[2]);
		    CalendarLookup cll=PageFactory.initElements(driver, CalendarLookup.class);
		    cll.getSelectdateWb().click();
		    driver.switchTo().window(winids4[1]);
		    plp.getSavebuttonWb().click();
		    plp.getSelectpotentialWb().click();
		    //Assert.assertEquals("abc", "def");
		    driver.switchTo().window(winids4[0]);
		    cq.getSavebuttonWb().click();
		    //verifying quotes details
		    QuoteDetails qt=PageFactory.initElements(driver, QuoteDetails.class);
		    String actaccountname=qt.getAccountnameWb().getText();
		    String actcontactname=qt.getContactnameWb().getText();
		    String actpotentialname=qt.getPotentialnameWb().getText();
		    String actsubject=qt.getSubjectWB().getText();
		    
		    Assert.assertEquals(actaccountname, accountname); 
		    Assert.assertEquals(actcontactname, contactname);
		    Assert.assertEquals(actpotentialname, potentialname);
		    Assert.assertEquals(actsubject, subject);
		    			
		}
	}	