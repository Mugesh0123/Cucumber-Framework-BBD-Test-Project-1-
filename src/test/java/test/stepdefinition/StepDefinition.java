package test.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.baseclass.BaseClass;
import test.pojoclass.LoginPojo;

public class StepDefinition extends LoginPojo {
	
	
	@Given("user should be in login page {string}")
	public void user_should_be_in_login_page(String string) {
		lanchBrowser();
	   url(string);
	}

	@When("user have to enter username {string}")
	public void user_have_to_enter_username(String string) {
		LoginPojo my =new LoginPojo();
		 fillTheTextBox(my.getUserName(), string);
	}

	@And("user have to enter password {string}")
	public void user_have_to_enter_password(String string) {
		LoginPojo my =new LoginPojo();
		 fillTheTextBox(my.getPassWord(), string);
		 buttonClick(my.getLogin());
	}

	@Then("user should be in home page {string}")
	public void user_should_be_in_home_page(String string) {
		String text = driver.findElement(By.linkText("Logout")).getText();
	   Assert.assertEquals(text, string);
	}


}
