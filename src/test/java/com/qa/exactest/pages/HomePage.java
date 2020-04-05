package com.qa.exactest.pages;

import org.openqa.selenium.By;
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
	WebElement automationLink;

	
	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[3]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement consultancyLink;
	
		
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
	
	
}
