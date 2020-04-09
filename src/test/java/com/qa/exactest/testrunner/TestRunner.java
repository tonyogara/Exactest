package com.qa.exactest.testrunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.Reporter;
import com.qa.exactest.util.ConfigFileReader;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/main/resource/Features/Launch.feature", "src/main/resource/Features/Contact_Us.feature"},
							glue="StepDefinitions",
							plugin = {"pretty", "html:target/cucumber",
									"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Exactest report.html"
							}
							,tags = {"@SmokeTest"}
							//,tags = {"@SystemTest"}
							)





public class TestRunner {
	
	public static void writeExtentReport()
	{
		ConfigFileReader cfr = new ConfigFileReader();
		String reportConfigurationPath = cfr.prop.getProperty("reportConfigPath");
		Reporter.loadXMLConfig(reportConfigurationPath);
		
	}
}
