package com.qa.alpide.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.alpide.factory.DriverFactory;

public class LoginPage {
	
	private WebDriver driver;
	DriverFactory df= new DriverFactory();
	Properties prop = df.initProperties();
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By email = By.xpath("//input[@placeholder=\"Enter registered email\"]");
	private By password = By.xpath("//input[@placeholder=\"Enter password\"]");
	private By loginBtn = By.xpath("//button[@type=\"submit\"]");
	
	
	
	public DashboardPage userLogin()
	{
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(password).sendKeys(prop.getProperty("pass"));
		driver.findElement(loginBtn).click();
		return new DashboardPage(driver);
	}

}
