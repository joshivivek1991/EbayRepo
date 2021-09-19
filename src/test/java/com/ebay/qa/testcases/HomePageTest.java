package com.ebay.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebay.qa.base.TestBase;
import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.pages.SportsPage;

public class HomePageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	SportsPage sportpage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		sportpage=new SportsPage();
		homepage= new HomePage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		}
	
	@Test(priority=1)
	public void verifyhomepagetitletest()
	{
		String hometitle = homepage.homepagetitle();
		Assert.assertEquals(hometitle, "Security Measure");
	}
	@Test(priority=2)
	public void verifyclickonsportstest()
	{
		sportpage=homepage.clickonSports();
		boolean flag=sportpage.verifysportlabel();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
}
