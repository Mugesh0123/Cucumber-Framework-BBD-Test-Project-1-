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

			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@When("user  enter username {string}")
	public void user_enter_username(String string) {
		LoginPojo my =new LoginPojo();
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 fillTheTextBox(my.getUserName(), string);
	}

	@And("user  enter password {string}")
	public void user_enter_password(String string) {

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPojo my =new LoginPojo();
		 fillTheTextBox(my.getPassWord(), string);
		 buttonClick(my.getLogin());
			System.out.println("hi");

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
		System.out.println("hi");
		
	}

}
