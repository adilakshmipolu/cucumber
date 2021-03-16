package testrunner;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination6;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions6"}
        )

public class testrunner6 extends stepdefination6{

}
