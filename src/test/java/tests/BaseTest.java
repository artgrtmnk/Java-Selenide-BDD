package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/java/features",
        glue="stepDefinitions"
)
public class BaseTest extends AbstractTestNGCucumberTests {
}