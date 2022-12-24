package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import test.baseclass.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\muges\\eclipse-workspace\\test\\src\\test\\resources\\featureFile\\homebuttonclick.feature",
           glue = {"test.stepdefinition","test.hooks"},
           dryRun = false,
           monochrome = true,
           strict=true,
           plugin = {
        		   "html:C:\\Users\\muges\\eclipse-workspace\\test\\AllTestReport\\html-report\\reports",
              	   "json:C:\\Users\\muges\\eclipse-workspace\\test\\AllTestReport\\json-report\\reports1.json",
            	   "junit:C:\\Users\\muges\\eclipse-workspace\\test\\AllTestReport\\junit-report\\reports2.xml",
            	   "rerun:C:\\Users\\muges\\eclipse-workspace\\test\\src\\test\\resources\\rerun\\rerun.txt"     	   
                   }
           )
public class ReRunnerClass extends BaseClass {
	  @AfterClass
	   public static void jvmReportGeneration() {
		   JVMReport.jvmreport("C:\\Users\\muges\\eclipse-workspace\\test\\AllTestReport\\json-report\\reports1.json");
	    }
}
