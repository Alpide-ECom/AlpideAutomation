package com.qa.alpide.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.alpide.base.BaseTest;
import com.qa.alpide.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	
	
	@Test
	public void  userloginWithValidDetailsTest()
	{
		loginPage.userLogin();
		Assert.assertTrue(dashboardPage.weclomeMsg(), "User lended some other page");
	
	}
	
	

}
