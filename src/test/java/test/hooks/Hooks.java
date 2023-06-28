package test.hooks;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import test.baseclass.BaseClass;

public class Hooks extends BaseClass {
	@BeforeStep
	public void beforeScenario(Scenario scenario){
		if(driver==null) {
			lanchBrowser();
			url("https://demowebshop.tricentis.com/");
			waiting(CONSTANT_WAIT_TIME);
			driver.findElement(By.xpath("//*[text()='Log in']")).click();
			driver.findElement(By.id("Email")).sendKeys("mugesh1@gmail.com");
			driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Mugesh@1");
			driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
		}	
	}
	

	@AfterStep
	public void failureScreenshot(Scenario scenario) {
		if(scenario.isFailed())	{
			byte[] photo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(photo, "image/png","error_image");		
		}
		
		}


}
