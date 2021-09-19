package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//body/div[@id='mainContent']/div[1]/ul[1]/li[7]/a[1]")
	WebElement sports;
	
	@FindBy(xpath="//a[contains(text(),'Daily Deals')]")
	WebElement DailyDeals;
	
	@FindBy(xpath="//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]")
	WebElement fashion;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String homepagetitle()
	{
		return driver.getTitle();
	}
	public SportsPage clickonSports()
	{
		sports.click();
		return new SportsPage();
	}
	public DailyDealsPage clickonDailyDeals()
	{
		DailyDeals.click();
		return new DailyDealsPage();
	}
	public void clickonFashion()
	{
		fashion.click();
	}
}
