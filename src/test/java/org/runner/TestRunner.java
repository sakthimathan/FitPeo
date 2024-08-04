package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace_Sakthi\\FitPeoAssessment\\src\\test\\resources\\Features",
                dryRun = !true, glue = "org.stepDefenition", 
                plugin = {"pretty", "html:target/cucumber-testNGreports.html" },snippets = SnippetType.CAMELCASE)

public class TestRunner extends AbstractTestNGCucumberTests{

}
