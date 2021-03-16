package testrunner;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination7;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions7"}
        )

public class testrunner7 extends stepdefination7 {

}
