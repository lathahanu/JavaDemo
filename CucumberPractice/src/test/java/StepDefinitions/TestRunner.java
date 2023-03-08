package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
/*	@CucumberOptions(features = {"C:\\Users\\Home\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\Features\\Login1.feature",
			"C:\\Users\\Home\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\Features\\Login2.feature"}
*/	
	
	@CucumberOptions(features = "C:/Users/Home/eclipse-workspace/CucumberPractice/src/test/resources/Features"
	,glue = {"StepDefinitions"}
	
	,monochrome = true)

public class TestRunner {

}
