package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C://Users//aru70//git//DSAlgoProject/DSAlgoProject_Teamtech//src//test//resources//features",
		glue = {"stepdefination"}
		
		)
public class TestRunner {

}