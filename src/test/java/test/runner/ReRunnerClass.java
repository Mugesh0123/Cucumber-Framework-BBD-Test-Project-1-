package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import test.baseclass.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\muges\\eclipse-workspace\\test\\src\\test\\resources\\featureFile\\LoginGeekyMart.feature",
           glue = {"test.stepdefinition","test.hooks"},
           dryRun = false,
           monochrome = true,
           strict=true,
           plugin = {
             "html:C:\\Users\\muges\\eclipse-workspace\\test\\testResult\\html\\report",
      		 "json:C:\\Users\\muges\\eclipse-workspace\\test\\testResult\\json\\report1.json",
    		 "junit:C:\\Users\\muges\\eclipse-workspace\\test\\testResult\\junit\\report2.xml",
    		 "rerun:C:\\Users\\muges\\eclipse-workspace\\test\\src\\test\\resources\\rerun\\rerun.txt"     	   
           }
           )
public class ReRunnerClass extends BaseClass {
	  @AfterClass
	   public static void jvmReportGeneration() {
		   JVMReport.jvmreport("C:\\Users\\muges\\eclipse-workspace\\test\\testResult\\json\\report1.json");
	    }
}
