package test.stepdefinition;


import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pojoclass.HotdealsPojo;


public class Hotdeals extends HotdealsPojo{

	@And("User have to click the hotdeals button")
	public void user_have_to_click_the_hotdeals_Button() {
		buttonClick(getHotDeals());
		System.out.println("successfull click the hot deals button");
	}

	@And("It shows list of Special offers product {string}")
	public void it_shows_list_of_Special_offers_product(String string) {
		buttonClick(getRCACable());
		System.out.println("successfull product has been clicked");
	}

	@Then("User move into AddToCard")
	public void user_move_into_AddToCard() {
		buttonClick(getAddtocard());
		System.out.println("successfull runned add to cart");
	}

	
	@And("Click the cart")
	public void click_the_cart() {
		buttonClick(getViewCard());
		System.out.println("successfull runned click the cart");
	}

	@And("view the cart")
	public void view_the_cart() {
		buttonClick(getViewCartDetails());
		System.out.println("successfull runned view the cart");
	}

	
}
