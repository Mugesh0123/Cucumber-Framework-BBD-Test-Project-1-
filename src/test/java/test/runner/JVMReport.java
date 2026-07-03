package test.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;




public class JVMReport {
	
	public static void jvmreport(String json) {
		// Use project directory so reports are created in the project regardless of user
		File file = new File(System.getProperty("user.dir"), "AllTestReport" + File.separator + "jvm-report");
		if (!file.exists()) {
			file.mkdirs();
		}
		Configuration config = new Configuration(file, "jvmreports");        
		config.addClassifications("name", "mugesh");
		config.addClassifications("project name", "webshop");
		List<String> list = new ArrayList<String>();
		list.add(json);
		ReportBuilder reportMaking = new ReportBuilder(list,config);
		reportMaking.generateReports();
		
		

	}



	

}
