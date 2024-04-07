package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import test.baseclass.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\P R MEGAVARSHINI\\git\\Cucumber-Framework-BBD-Test-Project-1-\\src\\test\\resources\\featureFile", 
glue = {"test.stepdefinition", "test.hooks" },
//dryRun = true,
//strict = true,

//monochrome = true,
tags = "@elec",
plugin = {
				"json:C:\\Users\\P R MEGAVARSHINI\\git\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json",
				"junit:C:\\Users\\P R MEGAVARSHINI\\git\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\junit-report\\reports2.xml"
}

		)
public class RunnerClass extends BaseClass {
	@AfterClass
	public static void jvmReportGeneration() {
		JVMReport.jvmreport(
		"C:\\Users\\P R MEGAVARSHINI\\git\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\json-report\\reports1.json");


	}
}
