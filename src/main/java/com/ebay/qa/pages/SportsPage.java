package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsPage {

	@FindBy(xpath="//span[contains(text(),'Sporting Goods')]")
	WebElement sportinggood;
	
	public boolean verifysportlabel()
	{
		return sportinggood.isDisplayed();
	}
}

