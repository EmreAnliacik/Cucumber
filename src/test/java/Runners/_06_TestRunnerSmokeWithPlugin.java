package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // Sadece smoke testleri calistir
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false, //true oldugunda testi calistirmaz sadece feature lara ait steplerin varligini kontrol eder.False oldugunda ise testi calistitrir.
        plugin = {"html:target/site/cucumber-pretty.html"}  // basit rapor olusturur

)


public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
