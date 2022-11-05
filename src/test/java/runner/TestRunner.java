package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features = { ".\\src\\test\\java\\features" },
		glue = "stepdefination",
		dryRun = false, 
		monochrome = true,

		plugin = { "pretty" }
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
