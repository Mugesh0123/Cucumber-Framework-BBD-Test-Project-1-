package test.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;




public class JVMReport {
	
	public static void jvmreport(String json) {
		File file = new File("C:\\Users\\amala\\eclipse\\Cucumber-Framework-BBD-Test-Project-1-\\AllTestReport\\jvm-report");
		Configuration config = new Configuration(file,"jvmreports");		
		config.addClassifications("name", "mugesh");
		config.addClassifications("project name", "webshop");
		List<String> list = new ArrayList<String>();
		list.add(json);
		ReportBuilder reportMaking = new ReportBuilder(list,config);
		reportMaking.generateReports();
		
		

	}



	

}
