package com.qa.alpide.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.alpide.utils.ElementUtils;

public class DashboardPage {
	
	private WebDriver driver ;
	private ElementUtils eUtils;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver =driver;
		eUtils  = new ElementUtils(driver);
		
	}
	
	private By pageHeading = By.xpath("//div[contains(text(),\"Good Evening\" )]");
	
	
	
	public boolean weclomeMsg()
	{
		eUtils.waitForElementVisible(pageHeading,2);
		return driver.findElement(pageHeading).isDisplayed();
	}
	
	
	
	
	
	
	
	

}
