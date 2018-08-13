package com.crm.genericLibraries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverCommonLib {
	public static HashMap<String, String> map = new HashMap<String, String>();
	
	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void waitForElemetPresent(WebElement wb){
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 10);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void select(WebElement selwb, String data){
		Select sel = new Select(selwb);
		sel.selectByVisibleText(data);
	}
	
	public void select(WebElement selwb, int index){
		Select sel = new Select(selwb);
		sel.selectByIndex(index);
	}
	
	public void acceptAlert(){
		Alert alt = BaseClass.driver.switchTo().alert();
		alt.accept();
	}
	public void cancelAlert(){
		Alert alt = BaseClass.driver.switchTo().alert();
		alt.dismiss();
	}
    
	public void moveMouseCursor(WebElement wb){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(wb).perform();
	}
	
	public HashMap<String, String> windowHandle(){
		Set<String> set  = BaseClass.driver.getWindowHandles();
		Iterator<String> it = set.iterator();
	
		map.put("parentWinID", it.next());
		map.put("childWinID", it.next());
		return map;
	}
	
	public String windowHandles()
	{
	  Set<String> set=BaseClass.driver.getWindowHandles();
	  Iterator<String> it=set.iterator();
	  String parentWinID=it.next();
	  String childWinID=it.next();
	  BaseClass.driver.switchTo().window(childWinID);
	  return parentWinID;
	}
	
	/**
	 * Get window ids 
	 */
	public String getWindowIDs(){
	String winIds=null;
	Set <String> set=BaseClass.driver.getWindowHandles();
	Iterator <String> it=set.iterator();
	if(set.size()==2)
		{
		
		String parentWinid=it.next();
		String childWinid=it.next();
		
		winIds = parentWinid+";"+childWinid;
		
		}
	else if(set.size()==3)
	{
		String parentWinid=it.next();
		String childWinid=it.next();
		String subChildwinid=it.next();
		
		winIds = parentWinid+";"+childWinid+";"+subChildwinid;
	
	}
	return winIds;
	}
		
	public void swithToWindow(String winId){
		BaseClass.driver.switchTo().window(winId);
	}
		
}
