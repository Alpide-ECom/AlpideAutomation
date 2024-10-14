package com.qa.alpide.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.alpide.factory.DriverFactory;

public class LoginPage {
	
	private WebDriver driver;
	DriverFactory df= new DriverFactory();
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By email = By.xpath("//input[@placeholder=\"Enter registered email\"]");
	private By password = By.xpath("//input[@placeholder=\"Enter password\"]");
	private By loginBtn = By.xpath("//button[@type=\"submit\"]");
	
	
	
	public DashboardPage userLogin(String userEmail, String pass)
	{
		driver.findElement(email).sendKeys(userEmail);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginBtn).click();
		return new DashboardPage(driver);
	}

}
