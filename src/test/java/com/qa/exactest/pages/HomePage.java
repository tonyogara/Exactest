package com.qa.exactest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.exactest.testbase.TestBase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends TestBase 
{

	@FindBy(xpath="//nav[@id='site-navigation']//a[contains(text(),'Automation')]")
	private WebElement automationLink;

	
	@FindBy(xpath="//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]")
	private WebElement consultancyLink;
	
	
	@FindBy(xpath="//ul[@class='inline']//a[contains(text(),'Contact us')]")
	private WebElement contactUsLink;
	

	
	
//	@FindBy(linkText="Contact us •")
//	private WebElement contactUsLink;
		
	public HomePage()
	{
		PageFactory.initElements(driver, this);		
	}
	
	
	public void selectConsultancyLink()
	{	
		consultancyLink.click();
	}
	
	
	public void selectAutomationLink()
	{
		automationLink.click();
	}
	
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public void selectContactLink()
	{
		String str = contactUsLink.getText();
		System.out.println(str);		
	}
	
	
	
	public void launchCountactUsUrl()
	{
		driver.get(prop.getProperty("contactUsUrl"));
	}
}
