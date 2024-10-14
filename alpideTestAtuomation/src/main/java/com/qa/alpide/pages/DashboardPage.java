package com.qa.alpide.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	private WebDriver driver ;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver =driver;
		
	}
	
	private By pageHeading = By.className("dashboard-welcome-heading");
	
	
	
	public boolean weclomeMsg()
	{
		return driver.findElement(pageHeading).isDisplayed();
	}
	
	
	
	
	
	
	
	

}
