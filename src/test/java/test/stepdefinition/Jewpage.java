package test.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.Jewl;


public class Jewpage extends Jewl {


@Given("user have click the jewelry")
public void user_have_click_the_jewelry() {
	buttonClick(PageObjectManager.getInJewl().getJewelry());
    
}

@Given("user have  click the Create Your Own Jewelry")
public void user_have_click_the_Create_Your_Own_Jewelry() {
	buttonClick(PageObjectManager.getInJewl().getYourOwnJewelry());
   
}
@Given("user  click the add to cart button")
public void user_click_the_add_to_cart_button() {
	buttonClick(PageObjectManager.getInJewl().getAddtocart());
    
}

@Then("user select shopping card button")
public void user_select_shopping_card_button() {
	buttonClick(PageObjectManager.getInJewl().getShopping());
}

@Then("user click the terms of shopping")
public void user_click_the_terms_of_shopping() {
	buttonClick(PageObjectManager.getInJewl().getTermsofshopping());
}

@Then("user click checkout button")
public void user_click_checkout_button() {
	buttonClick(PageObjectManager.getInJewl().getCheckout());
   
}

@Then("user click  billing continue")
public void user_click_billing_continue() {
	buttonClick(PageObjectManager.getInJewl().getBillingcontinue());
    
}

@Then("user have click  shipping continue")
public void user_have_click_shipping_continue() {
	buttonClick(PageObjectManager.getInJewl().getShippingcontinue());
}

@Then("user have click  ground button")
public void user_have_click_ground_button() {
	buttonClick(PageObjectManager.getInJewl().getGroundbutton());
}

@Then("user have click  method continue")
public void user_have_click_method_continue() {
	buttonClick(PageObjectManager.getInJewl().getMethodcontinue());
}

@Then("user have click  cash")
public void user_have_click_cash() {
	buttonClick(PageObjectManager.getInJewl().getCash());
}

@Then("user have click  delivery continue")
public void user_have_click_delivery_continue() {
	buttonClick(PageObjectManager.getInJewl().getDeliverycontinue());
}

@Then("user have click  userfinal")
public void user_have_click_userfinal() {
	buttonClick(PageObjectManager.getInJewl().getUserfinal());
}




}
