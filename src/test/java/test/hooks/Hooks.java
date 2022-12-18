package test.hooks;

import org.junit.After;
import org.junit.Before;

import test.baseclass.BaseClass;
import test.runner.RunnerClass;

public class Hooks extends RunnerClass {
	@Before
	public void setUp() {
	System.out.println("---hi----");
	}
	
	@After
	public void setDown() {
		jvmReportGeneration();
		driver.close();
	}

}
