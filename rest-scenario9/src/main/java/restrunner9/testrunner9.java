package restrunner9;

import io.cucumber.testng.CucumberOptions;
import stepdefination.stepdefination9;

@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"stepdefinitions9"}
        )

public class testrunner9 extends stepdefination9{

}
