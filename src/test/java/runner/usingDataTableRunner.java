package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\usingDatatables.feature" ,
				glue= {"stepDefinition"} ,
				monochrome=true)
public class usingDataTableRunner {

}
