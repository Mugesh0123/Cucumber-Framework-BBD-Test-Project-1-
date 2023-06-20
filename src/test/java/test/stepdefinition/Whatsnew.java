package test.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import test.pojoclass.Whatsnewpojo;

public class Whatsnew extends Whatsnewpojo{
	@Then("user click Whatsnew button  in page")
	public void user_click_Whatsnew_button_in_page() {
		buttonClick(getWhatsnew());
	}

	
	@And("user have to select the product {string}")
	public void user_have_to_select_the_product(String string) {
		buttonClick(getToolKit());
	   
	}

	@And("user  have to click the select dropdown button")
	public void user_have_to_click_the_select_dropdown_button() {
		buttonClick(getSelectbutton());
		System.out.println("hello");
	    
	}

	@And("user have to click the select red")
	public void user_have_to_click_the_select_red() {
	    buttonClick(getDropbutton());
	    System.out.println("hello");
	}

	@And("user have to click the addtocart{int}")
	public void user_have_to_click_the_addtocart(Integer int1) {
	    buttonClick(getAddtoCart());
	}

}
