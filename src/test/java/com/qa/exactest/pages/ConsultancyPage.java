package com.qa.exactest.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.exactest.testbase.TestBase;

public class ConsultancyPage extends TestBase{

	
	public ConsultancyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
}
