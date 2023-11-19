package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags="@ValidCredentials",features="src/test/resources/Features/orangeHRM.feature",
glue ="com.stepdefinition",
plugin= {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"pretty", "html:target/cucumber/cucumber-reports.html",
		"json:target/cucumber/cucumber-reports.json"
},dryRun=false)
public class Runner {
}
