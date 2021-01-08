package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\loginFeatures.feature",
				 glue= {"stepDefinition"}, monochrome=true ,
				 plugin = {"pretty", "html:test-output"} ,
				 dryRun=true)
public class RunnerClass {

}
