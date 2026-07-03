package test.stepdefinition;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.LoginPojo;

public class Login extends LoginPojo{
	

@Given("user should be in login  page {string}")
public void user_should_be_in_login_page(String string) {
	lanchBrowser();
	url(string);

}
@When("user have to click login option")
public void user_have_to_click_login_option() {
	buttonClick(PageObjectManager.getInstanceLoginPojo().getLoginButton());
	
}
@When("user  enter username {string}")
public void user_enter_username(String string) {
	fillTheTextBox(PageObjectManager.getInstanceLoginPojo().getUserName(), string);
  
}
@When("user enter password {string}")
public void user_enter_password(String string) {
	fillTheTextBox(PageObjectManager.getInstanceLoginPojo().getPassWord(), string);
	
}
@When("user click login button")
public void user_click_login_button() {
	buttonClick(PageObjectManager.getInstanceLoginPojo().getLoginButton());
    
}
@Then("user should be in webshop home page {string}")
public void user_should_be_in_webshop_home_page(String string) {
	PageObjectManager.getInstanceLoginPojo().getLogOutButton().isDisplayed();
   
}



}
