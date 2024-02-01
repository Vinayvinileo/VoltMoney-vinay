package TestRunner_package;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

//feature = "paste path of feature file which needs to be executed"
//glue = "paste StepDefinition package"

@CucumberOptions(features = "C://Users//vinay//IdeaProjects//VoltMoney//Features//Login.feature",
        glue = "StepDefinitions_package",
        dryRun = true)
public class TestRunner_Basic {
}
