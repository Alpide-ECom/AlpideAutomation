package com.qa.alpide.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.alpide.factory.DriverFactory;
import com.qa.alpide.pages.DashboardPage;
import com.qa.alpide.pages.LoginPage;

public class BaseTest {
	
	
	WebDriver driver;
	DriverFactory df;
	DashboardPage dashboardPage;
	LoginPage loginPage;

	LoginPage lpage = new LoginPage(driver);
	
	@BeforeMethod
	public void setUp()
	{
		df = new DriverFactory();
		driver = df.initDriver();
		dashboardPage = new DashboardPage(driver);
		loginPage = new LoginPage(driver);
		lpage = new LoginPage(driver);
		
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.close();
		driver.quit();
		
	}
	
	
	

}
