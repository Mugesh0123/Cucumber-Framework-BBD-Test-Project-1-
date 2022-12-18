package test.stepdefinition;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.baseclass.BaseClass;
import test.pojoclass.EndToEndTestPojo;
import test.pojoclass.SelectByCategoryPojoClass;

public class SelectByCategoryTestCase extends SelectByCategoryPojoClass{
	 
	@Given("user should be in login pages geekymart {string}")
	public void user_should_be_in_login_pages_geekymart(String string) {
		lanchBrowser();
		url(string);
	}

	@When("user have to enter vaild usernames {string}")
	public void user_have_to_enter_vaild_usernames(String string) {
		SelectByCategoryPojoClass myObj =new SelectByCategoryPojoClass();
		fillTheTextBox(myObj.getUserName(), string);
	}

	@And("user have to enter vaild passwords {string}")
	public void user_have_to_enter_vaild_passwords(String string) {
		SelectByCategoryPojoClass myObj1 =new SelectByCategoryPojoClass();
		fillTheTextBox(myObj1.getPassWord(), string); 
		buttonClick(myObj1.getLogin());
	}

	@And("user have to hover Shop By Categories option")
	public void user_have_to_hover_Shop_By_Categories_option() {	
		
		waiting(30);
		SelectByCategoryPojoClass myObj2 =new SelectByCategoryPojoClass();
	    
		buttonClick(myObj2.getShopByCategory());
		
	    
	}

	@And("user have to hover Home & Lifestyle option")
	public void user_have_to_hover_Home_Lifestyle_option() {
		waiting(30);
		SelectByCategoryPojoClass myObj3 =new SelectByCategoryPojoClass();
		buttonClick(myObj3.getHomeAndLifestyle());
	

	}

	@And("user have to click Home Decor option")
	public void user_have_to_click_Home_Decor_option() {
		waiting(30);
		SelectByCategoryPojoClass myObj4 =new SelectByCategoryPojoClass();
		buttonClick(myObj4.getHomeDecor());
		
	}

	@And("user have to hover Award Winning Wall Gear Clock")
	public void user_have_to_hover_Award_Winning_Wall_Gear_Clock() {
		waiting(30);
		SelectByCategoryPojoClass myObj5 =new SelectByCategoryPojoClass();
		buttonClick(myObj5.getAwardWinningWallGearClock());
		}

	@And("user have to click addtocard option")
	public void user_have_to_click_addtocard_option() {
		SelectByCategoryPojoClass myObj6 =new SelectByCategoryPojoClass();
	    moveToElement(myObj6.getAddToCard());
	}
	@Then("user should be verify the view to card {string}")
	public void user_should_be_verify_the_view_to_card(String string) {
		SelectByCategoryPojoClass myObj7 =new SelectByCategoryPojoClass();
		scrollByElement(myObj7.getViewCard());
		waiting(30);
		buttonClick(myObj7.getViewCard());
		buttonClick(myObj7.getViewCartDetails());
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains(string));
	}

}