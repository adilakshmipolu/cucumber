package testrunner;


import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination3;


@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions3"}
        )

public class testrunner3 extends stepdefination3 {

}
