package Ruuner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        glue={"StepDefinitions","Hooks"},
        tags = "@all",
        dryRun = true,
        publish = true,
        plugin = {"pretty",
                "html:target/CucumberReports/CucumberReport.html",
                "json:target/CucumberReports/CucumberReport.json",
                "junit:target/CucumberReports/CucumberReport.xml" } )

public class MyRunner extends AbstractTestNGCucumberTests {

}
