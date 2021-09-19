package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class LoginPage extends TestBase {

	//create page factory : Object Repo
	
	@FindBy(linkText="Sign in")
	WebElement Signin;
	
	@FindBy(id="userid")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="signin-continue-btn")
	WebElement signinforwardbtn;
	
	@FindBy(id="sgnBt")
	WebElement signinbtn;
	
	@FindBy(linkText="register")
	WebElement register;
	
	@FindBy(id="gh-logo")
	WebElement ebaylogo;
	
	
	//Initializing page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions:
	
	public String validatepagetitile()
	{
		return driver.getTitle();
	}
	
	public boolean validateebaylogo()
	{
		return ebaylogo.isDisplayed();
	}
	
	public HomePage login(String un , String pwd)
	{
		Signin.click();
		username.sendKeys(un);
		signinforwardbtn.click();
		password.sendKeys(pwd);
		signinbtn.click();
		return new HomePage();
		
	}
	
	
	
}
