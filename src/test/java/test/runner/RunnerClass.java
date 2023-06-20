package test.runner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import test.baseclass.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\subab\\Downloads\\selenium-java-4.9.1\\lib\\git\\Cucumber-Framework-BBD-Test-Project-1-\\src\\test\\resources\\featureFile\\Hotdeals.feature",
           glue = {"test.stepdefinition"},
          // dryRun = true,
           monochrome = true,
          strict=true,
           tags = "@HotDeals"
//           plugin = {
//           "html:C:\\Users\\subab\\Downloads\\selenium-java-4.9.1\\lib\\git\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\html-report\\reports",
//      	  "json:C:\\Users\\subab\\Downloads\\selenium-java-4.9.1\\lib\\git\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json",
//    	   "junit:C:\\Users\\subab\\Downloads\\selenium-java-4.9.1\\lib\\git\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\junit-report\\reports2.xml",
//    	   "rerun:C:\\Users\\subab\\Downloads\\selenium-java-4.9.1\\lib\\git\\Cucumber-Framework-BBD-Test-Project-1-\\src\\test\\resources\\rerun"     	   
//           } 
          
		)
public class RunnerClass extends BaseClass {	
//	@AfterClass
//   public static void jvmReportGeneration() {
//	   JVMReport.jvmreport("C:\\Users\\subab\\Downloads\\selenium-java-4.9.1\\lib\\git\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json");
//    }	
}
