package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // feature dosyasinin path i yazilir
        glue = {"StepDefinitions"}  // step definitions klasorunun adi yazilir


)



public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
