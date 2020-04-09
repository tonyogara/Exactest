package StepDefinitions;


import cucumber.api.java.en.Given;
import static org.junit.Assert.assertEquals;
import com.qa.exactest.pages.ContactPage;
import com.qa.exactest.pages.HomePage;
import com.qa.exactest.testbase.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Contact_Us extends TestBase{


	
	HomePage hmp;
	ContactPage cpg;
	
	@Given("^I am on the contact page$")
	public void i_am_on_the_contact_page() throws Throwable {
	    initialization();
	    hmp = new HomePage();
	    hmp.launchCountactUsUrl();
	}

	@When("^I enter valid full name \"([^\"]*)\" and invalid phone entry \"([^\"]*)\" and email \"([^\"]*)\" and message \"([^\"]*)\"$")
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
		String phoneErrorTxt = cpg.phoneErrorMsg();
		assertEquals(expectedPhoneErrorMsg, phoneErrorTxt);
		driver.quit();		
	}
}
