package StepDefinitions;

import cucumber.api.java.en.Given;

import org.junit.Assert;
import com.qa.exactest.pages.HomePage;
import com.qa.exactest.testbase.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Launch extends TestBase{

	HomePage hp; 
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		this.initialization();
		driver.get(prop.getProperty("launchUrl"));
	}

	@When("^I select the Consultancy link$")
	public void i_select_the_Consultancy_link() throws Throwable {
		hp = new HomePage();
		hp.selectConsultancyLink();
	}

	@Then("^I will be on the Consultancy page$")
	public void i_will_be_on_the_Consultancy_page() throws Throwable {
		String expectedTitle = "Consultancy | Exactest - Improve the Quality of your Software";
		String actualPageTitle = hp.getPageTitle();
		Assert.assertEquals(expectedTitle, actualPageTitle);	
		driver.quit();
	}

}
