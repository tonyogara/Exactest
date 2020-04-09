package com.qa.exactest.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.exactest.testbase.TestBase;

public class ContactPage extends TestBase {

	@FindBy(xpath="//input[@name='your-name']")
	WebElement nameTextBox;
	
	@FindBy(xpath="//input[@name='your-phone']")
	WebElement phoneTextBox;
	
	@FindBy(xpath="//input[@name='your-email']")
	WebElement emailTextBox;
	
	
	@FindBy(xpath="//textarea[@name='your-message']")
	WebElement messageTextBox;
	
	
	@FindBy(xpath="//input[@class='wpcf7-form-control wpcf7-submit button']")
	WebElement sendBtn;
	
	@FindBy(xpath="//*[@id=\"cookie-law-info-bar\"]")
	WebElement infoBar;
	
	@FindBy(id="Cookie-law-info-bar")
	WebElement cookieBar; 
	
	
	@FindBy(id="cookie_action_close_header")
	WebElement acceptCookieBtn;
	
	
	@FindBy(xpath="//*[@id=\"wpcf7-f206-p161-o1\"]/form/div[2]/div[4]/span/span")
	WebElement phoneError;
	
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);		
	}
	
	
	
	public void insertName(String input_name)
	{
		nameTextBox.sendKeys(input_name);
	}
	
	
	public void insertPhone(String input_phone)
	{
		phoneTextBox.sendKeys(input_phone);
	}
	
	
	public void insertEmail(String input_email)
	{
		emailTextBox.sendKeys(input_email);
	}
	
	public void insertMessage(String input_message)
	{
		messageTextBox.sendKeys(input_message);
	}
	
	
	public void clickSendBtn()
	{
		sendBtn.click();
	}
	
	
	public void selectCookieAcceptBtn()
	{
		acceptCookieBtn.click();
	}
	
	
	public String  phoneErrorMsg()
	{
		return phoneError.getText();		
	}
	
}
