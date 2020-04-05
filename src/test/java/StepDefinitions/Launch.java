package StepDefinitions;

import cucumber.api.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.exactest.pages.HomePage;
import com.qa.exactest.testbase.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.matcher.ModifierMatcher.Mode;


public class Launch extends TestBase{

	HomePage hp; 
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		this.initialization();
	}

	@When("^I select the Consultancy link$")
	public void i_select_the_Consultancy_link() throws Throwable {
		hp = new HomePage();
		hp.selectConsultancyLink();
	}

	@Then("^I will be on the Consultancy page$")
	public void i_will_be_on_the_Consultancy_page() throws Throwable {
		System.out.println("Then...");
	}
	
	
}
