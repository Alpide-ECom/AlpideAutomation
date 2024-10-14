package com.qa.alpide.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public WebDriver driver;
	
	public Properties prop;
	
	public String baseLocation = System.getProperty("user.dir");
	
	
	
	public WebDriver initDriver()
	{
		String browserName = prop.getProperty("browser");
		
		if (browserName.trim().equalsIgnoreCase("chrome"))
		{
			driver = new  ChromeDriver();
		}
		else if(browserName.trim().equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please check the config file and set the browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("url");
		return driver;
	}
	
	
	
	public Properties initProperties()
	{
		
		prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(baseLocation + "\\src\\test\\resources\\config\\config.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		return prop;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
