package testrunner;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination1;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions1"}
        )

public class testrunner1 extends stepdefination1 {

}
