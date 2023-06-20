package test.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.pojoclass.TestFilepojo;

public class TestFile extends TestFilepojo{
	@Then("user click hot deal button  in page")
	public void user_click_hot_deal_button_in_page() {
		buttonClick(getHotDealbutton());
		}
	@And("user have to select the product{string}")
	public void user_have_to_select_the_product(String string) {
		buttonClick(getCarLighter());
	}
	
	@And("user  have to click the select drop button")
	public void user_have_to_click_the_select_drop_button() {
		buttonClick(getSelectbutton());
	}
	@And("user have to click the select black")
	public void user_have_to_click_the_select_black() {
		buttonClick(getDropbutton());
	    
	}
	@And("user have to click the addtocart")
	public void user_have_to_click_the_addtocart() {
		buttonClick(getAddtoCart());
		System.out.println("hello");

	
	}

	}

