package testrunner;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination5;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions5"}
        )

public class testrunner5 extends stepdefination5{

}
