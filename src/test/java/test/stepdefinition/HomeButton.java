package test.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pojoclass.LoginPojo;

public class HomeButton extends LoginPojo {
	@Given("user  login page {string}")
	public void user_login_page(String string) {
		lanchBrowser();
		   url(string);				
	}
	@When("user  enter username {string}")
	public void user_enter_username(String string) {
		LoginPojo my =new LoginPojo();
		 fillTheTextBox(my.getUserName(), string);
	}

	@And("user  enter password {string}")
	public void user_enter_password(String string) {
		LoginPojo my =new LoginPojo();
		 fillTheTextBox(my.getPassWord(), string);
		 buttonClick(my.getLogin());
	}

	@Then("user  in home page {string}")
	public void user_in_home_page(String string) {
		String text = driver.findElement(By.linkText("Logout")).getText();
		   Assert.assertEquals(text, string);
	}

	@And("user click home button")
	public void user_click_home_button() {
		LoginPojo myh =new LoginPojo();
		buttonClick(myh.getHomebutton());
		
		
	}

}
