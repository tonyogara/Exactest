package StepDefinitions;


import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.exactest.pages.ContactPage;
import com.qa.exactest.pages.HomePage;
import com.qa.exactest.testbase.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.matcher.ModifierMatcher.Mode;

public class Contact_Us extends TestBase{


	
	HomePage hmp;
	ContactPage cpg;
	ContactPage cpg1;
	
	@Given("^I am on the contact page$")
	public void i_am_on_the_contact_page() throws Throwable {
	    initialization();
	    hmp = new HomePage();
	    hmp.launchCountactUsUrl();
	}

	@When("^I enter valid full name \"([^\"]*)\" and invalid phone entry \"([^\"]*)\" and email \"([^\"]*)\" and message \"([^\"]*)\"$")
	//public void i_enter_valid_full_name_and_invalid_phone_entry_and_email_and_message(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	public void user_enters_contact_details(String name, String phone, String email, String message) throws Throwable {	
		cpg = new ContactPage();
		cpg.insertName(name);
		cpg.insertPhone(phone);
		cpg.insertEmail(email);
		cpg.insertMessage(message);
		cpg.selectCookieAcceptBtn();
		cpg.clickSendBtn();
		
	}

	@Then("^the correct \"([^\"]*)\" is displayed$")
	public void the_correct_is_displayed(String expectedPhoneErrorMsg) throws Throwable {
		cpg1 = new ContactPage();
		//String expectedPhoneErrorMsg = "The telephone number is invalid.";
		String phoneErrorTxt = cpg1.phoneErrorMsg();
		assertEquals(expectedPhoneErrorMsg, phoneErrorTxt);
		System.out.println("Success!");
		
		
	}
}
