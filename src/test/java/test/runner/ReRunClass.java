package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@rerun:rerun/rerun.txt", 
glue = {"test.stepdefinition", "test.hooks" },
//   dryRun = true,
		strict = true,

//	monochrome = true, tags = "@file1",
		plugin = {
				"html:C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\html-report",
				"json:C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json",
				"junit:C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\junit-report\\reports2.xml",
				"rerun:C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\src\\test\\resources\\rerun\\rerun.txt" }

)
public class ReRunClass {
	@AfterClass
	public static void jvmReportGeneration() {
		JVMReport.jvmreport(
				"C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json");
	}

}
