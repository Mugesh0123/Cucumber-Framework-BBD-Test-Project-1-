package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import test.baseclass.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featureFile",
		glue = { "test.stepdefinition", "test.hooks" },
		dryRun = false,
		//strict = true,
		//monochrome = true,
		tags = "@login1",
		plugin = {
				"json:AllTestReport/json-report/reports1.json",
				"junit:AllTestReport/junit-report/reports2.xml"
		}
)
public class RunnerClass extends BaseClass {
	@AfterClass
	public static void jvmReportGeneration() {
		String reportPath = System.getProperty("user.dir") + "/AllTestReport/json-report/reports1.json";
		JVMReport.jvmreport(reportPath);
	}
}
 