package test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\muges\\eclipse-workspace\\test\\src\\test\\resources\\featureFile\\EndToEndTest.feature",
           glue = "test.stepdefinition",
           dryRun = false,
           monochrome = true,
           strict=true           	
		)

public class RunnerClass {

}
