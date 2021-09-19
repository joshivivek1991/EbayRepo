package com.ebay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	 LoginPage loginpage;
	 HomePage homepage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage = new LoginPage();	
	}
	
	@Test(priority=2)
	public void logoTest()
	{
		boolean flag= loginpage.validateebaylogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=1)
	public void titleTest()
	{
		String title=loginpage.validatepagetitile();
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");
	}
	
	@Test(priority=3)
	public void loginpageTest()
	{
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
