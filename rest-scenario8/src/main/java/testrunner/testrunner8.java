package testrunner;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination8;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions8"}
        )
public class testrunner8 extends stepdefination8 {
}
