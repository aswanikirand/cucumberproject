package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/E2E",glue= {"stepdefinitions"},tags = {"@Smoke"}
		)

public class TestRunner {
	

}
