package test.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pojoclass.LoginPojo;

public class StepFunction extends LoginPojo{
	@Given("user have to be in login page {string}")
	public void user_have_to_be_in_login_page(String string) {
		lanchBrowser();
		   url(string);
	}

	@When("user have to enter the username {string}")
	public void user_have_to_enter_the_username(String string) {
		LoginPojo my =new LoginPojo();
		 fillTheTextBox(my.getUserName(), string);
	}

	@And("user have to enter the password {string}")
	public void user_have_to_enter_the_password(String string) {
		LoginPojo my =new LoginPojo();
		 fillTheTextBox(my.getPassWord(), string);
		 buttonClick(my.getLogin());
	}

	@Then("user get in to  home page {string}")
	public void user_get_in_to_home_page(String string) {
		String text = driver.findElement(By.linkText("Logout")).getText();
		   Assert.assertEquals(text, string);
	}
}
