package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        tags = "@SmokeTest or @Regression", // Verilen tag nameindeki  testleri calistir
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}


)

public class _05_TestRunnerMultipleTags extends AbstractTestNGCucumberTests {
}
