package test.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.Jewelrypojo;

public class Jewelrystep extends Jewelrypojo{

	

@Given("User click the jewelry option")
public void user_click_the_jewelry_option() {
	buttonClick(PageObjectManager.getInstanceJewelrypojo().getJewelry());
    
}

@Then("user select the Block and White Diamond Heart")
public void user_select_the_block_and_white_diamond_heart() {
	buttonClick(PageObjectManager.getInstanceJewelrypojo().getBwHeart());
    
}

@Then("user click to the add to cart option")
public void user_click_to_the_add_to_cart_option() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getAddtocart());
}

@Then("click to the shopping cart button")
public void click_to_the_shopping_cart_button() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getShoppingcart());
}

@Then("user  click the terms and condition of shopping")
public void user_click_the_terms_and_condition_of_shopping() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getTermsofservice());
}

@Then("user click to checkout button")
public void user_click_to_checkout_button() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getCheckout());
}

@Then("user click  billing continue option")
public void user_click_billing_continue_option() {
   buttonClick(PageObjectManager.getInstanceJewelrypojo().getBillingcontinue());
}

@Then("user  click to the shipping continue")
public void user_click_to_the_shipping_continue() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getShippingcontinue());
}

@Then("user click the ground button option")
public void user_click_the_ground_button_option() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getGroundbutton());
}

@Then("user click the method continue button")
public void user_click_the_method_continue_button() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getMethodcontinue());
}

@Then("user click the delivery continue")
public void user_click_the_delivery_continue() {
   buttonClick(PageObjectManager.getInstanceJewelrypojo().getDeliverycontinue());
}

@Then("user click the userfinal option")
public void user_to_click_the_userfinal_option() {
    buttonClick(PageObjectManager.getInstanceJewelrypojo().getUserfinal());
}
}
