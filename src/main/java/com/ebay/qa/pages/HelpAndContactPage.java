package com.ebay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.qa.base.TestBase;

public class HelpAndContactPage extends TestBase{


	// Page factory
	@FindBy(xpath="//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
	WebElement helpandContact;
	
	@FindBy(xpath="//span[contains(text(),'Buying')]")
	WebElement Buying;
	
	@FindBy(xpath="//td[@id=\"gh-title\"]")
	WebElement customerservice;
	
	@FindBy(xpath="//span[contains(text(),'Account')]")
	WebElement account;
	
	@FindBy(xpath="//div[contains(text(),'Signing up for an eBay account')]")
	WebElement Signup;
	
	@FindBy(css="body.no-touch:nth-child(2) div.grid-cntr:nth-child(3) div.cusr-serv:nth-child(1) div.articleWithAnchor div.all_content.yellowTheme div.white_background:nth-child(3) div.article_body div.article_main_container div:nth-child(1) div:nth-child(1) div.article_main > a.icon_action_btn:nth-child(4)")
	WebElement signupicon;
	
	@FindBy(name="//input[@name='firstname']")
	WebElement username;
	
	@FindBy(id="//input[@id='lastname']")
	WebElement lastname;
	
	@FindBy(id="//input[@id='Email']")
	WebElement email1;
	
	@FindBy(id="//button[@id='EMAIL_REG_FORM_SUBMIT']")
	WebElement submitbtn;
	
	@FindBy(id="//input[@id='password']")
	WebElement pwd;
	
	public HelpAndContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonHelp()
	{
		 helpandContact.click();
		
	}
	public void clickonbuying()
	{
		helpandContact.click();
		Buying.click();
	}
	
	public boolean verifycustomertext()
	{
		helpandContact.click();
		Buying.click();
		return customerservice.isDisplayed();
		
	}
	
	
	public void clickonsignupaccount(String un, String last, String email, String pass)
	{
		helpandContact.click();
		account.click();
		Signup.click();
		signupicon.click();
		username.sendKeys(un);
		lastname.sendKeys(last);
		email1.sendKeys(email);
		pwd.sendKeys(pass);
		submitbtn.click();
		
		
	}
}
