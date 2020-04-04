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

public class HomePage extends TestBase {

	
	//--@FindBy(linkText = "Consultancy")
	//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]
	//*[@id="primary-menu"]/ul/li[1]/a
//	<a href="index.html" aria-current="page">Consultancy</a>
//	#primary-menu > ul > li.page_item.page-item-12.current_page_item.is-active > a
//	/html/body/div[1]/header/div[1]/div/div/div[3]/nav/div/ul/li[1]/a
				   //nav[@id='site-navigation']//a[contains(text(),'Consultancy')]
	@FindBy(xpath="//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]")
	WebElement consultancyLink;
	
	//WebElement consultancyLink = driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]"));
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);		
	}
	
	
	
	//public ConsultancyPage selectConsutancyLink()
	public void selectConsultancyLink()
	{
		System.out.println("before selecting the Consultancy link");
		
		driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]")).click();//driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]")).click();
		//consultancyLink.click();
		System.out.println("after selecting the Consultancy link");
	}
	
	
}
