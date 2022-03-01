package com.runner_Class;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature",
		glue = "com.stepdefinition",
		monochrome = true,
		dryRun = false,
		tags = {"@opengoogle,@datadriven"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Report.html"}
		
		)

public class Runner_Class {

	
	
}
