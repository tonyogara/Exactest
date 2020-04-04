package com.qa.exactest.stepdefinitions;

import org.openqa.selenium.By;

import com.qa.exactest.pages.ConsultancyPage;
import com.qa.exactest.pages.HomePage;
import com.qa.exactest.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class Launch extends TestBase {

	HomePage hp = new HomePage();
	ConsultancyPage cp = new ConsultancyPage();
			
			
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
	    //HomePage hp = new HomePage();
	    hp.initialization();
	}

	@When("^I select the Consultancy link$")
	public void i_select_the_Consultancy_link() throws Throwable {
		HomePage hp1 = new HomePage();
		//driver.findElement(By.xpath("//nav[@id='site-navigation']//a[contains(text(),'Consultancy')]")).click();
		hp1.selectConsultancyLink();
	}

	@Then("^I will be on the Consultancy page$")
	public void i_will_be_on_the_Consultancy_page() throws Throwable {
	    System.out.println("Should be on the Consultancy page");
	}
	
}
