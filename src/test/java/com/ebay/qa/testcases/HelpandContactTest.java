package com.ebay.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.HelpAndContactPage;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.SportsPage;

import junit.framework.Assert;

public class HelpandContactTest  extends TestBase{
	//LoginPage loginpage;
	//HomePage homepage;
	HelpAndContactPage helpcontact;

	public HelpandContactTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		//loginpage=new LoginPage();
		//homepage= new HomePage();
		//homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		helpcontact= new HelpAndContactPage();
		}
	
	@Test(priority=1)
	public void verifyclickonHelp()
	{
	helpcontact.clickonHelp();
			
	}
	@Test(priority=2)
	public void verifyclickonbuyingtest()
	{
		helpcontact.clickonbuying();
	}
	
	@Test(priority=3)
	public void verifyverifycustomertexttest()
	{
		Assert.assertTrue(helpcontact.verifycustomertext());
		driver.navigate().back();
		
}
	@Test(priority=4)
	public void verifysignupacc()
	{
		
		helpcontact.clickonsignupaccount("vivek1991", "joshi", "joshivivek6868@gmail.com", "Thor@1981");
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	
	}
}