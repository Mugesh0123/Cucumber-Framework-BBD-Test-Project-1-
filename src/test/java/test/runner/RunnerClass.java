package test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import test.baseclass.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\src\\test\\resources\\featureFile\\LoginGeekyMart.feature",
           glue = {"test.stepdefinition"},
           //dryRun = true,
           monochrome = true,
          strict=true,
//           tags = "@regression",
           plugin = {
           "html:C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\html-report\\reports",
      	  "json:C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json",
    	   "junit:C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\junit-report\\reports2.xml"
    	   	   
           } 
          
		)
public class RunnerClass extends BaseClass {	
	@AfterClass
   public static void jvmReportGeneration() {
	   JVMReport.jvmreport("C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json");
    }	
}
