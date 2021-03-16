package testrunner;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination2;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions2"}
        )

public class testrunner2 extends stepdefination2 {

}
