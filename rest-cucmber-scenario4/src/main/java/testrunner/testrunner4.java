package testrunner;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination4;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions4"}
        )

public class testrunner4 extends stepdefination4 {
	
}


