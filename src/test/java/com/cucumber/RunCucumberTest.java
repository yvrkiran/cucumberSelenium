package com.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
plugin = { "pretty","html:target/cucumber-reports.html" },
glue = {"com.steps"})
public class RunCucumberTest {
}
