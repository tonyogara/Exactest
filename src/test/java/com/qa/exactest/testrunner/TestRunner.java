package com.qa.exactest.testrunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import com.cucumber.listener.Reporter;
import com.qa.exactest.util.ConfigFileReader;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/resource/Features/Launch.feature"},
							glue="StepDefinitions",
							plugin = {"pretty", "html:target/cucumber",
									"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Exactest report.html"
							})





public class TestRunner {
	@AfterClass
	public static void writeExtentReport()
	{
		ConfigFileReader cfr = new ConfigFileReader();
		String reportConfigurationPath = cfr.prop.getProperty("reportConfigPath");
		Reporter.loadXMLConfig(reportConfigurationPath);
		
	}
}
