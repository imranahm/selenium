package com.crm.genericLibraries;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.crm.pageObjectRepositoryLib.CommonLib;
import com.crm.pageObjectRepositoryLib.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;

public class BaseClass {
	public static ExtentReports extent;
	public static WebDriver driver;
	@BeforeSuite
	public void configBS()
	{
	extent=new ExtentReports("./test-output/advancedreport.html",true);
	extent.loadConfig(new File("./src/test/resources/extent-config.xml"));		
	}
	@BeforeClass
	public void configBeforeClass()
	{
		if(Constants.browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else if(Constants.browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(Constants.browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "./src/main/resources/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}
	@BeforeMethod
	public void configBeforeMethod()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.url);
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.login();
	}
	@AfterMethod
	public void configAfterMethod()
	{
		CommonLib cl=PageFactory.initElements(driver, CommonLib.class);
		cl.getLogout().click();
	}
	@AfterClass
	public void configAfterClass()
	{
		driver.quit();
	}
	@AfterSuite
	public void configAS(){
		extent.flush();
		extent.close();
		
	}

}
