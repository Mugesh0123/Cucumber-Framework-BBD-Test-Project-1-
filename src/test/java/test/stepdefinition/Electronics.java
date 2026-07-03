package test.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.Electronicspojo;

public class Electronics extends Electronicspojo {

	@Given("user click the electronics option")
	public void user_click_the_electronics_option() {
		buttonClick(PageObjectManager.getInstanceElectronicspojo().getElectronics());	    
	}
	@And("user have click the cellphone")
	public void user_have_click_the_cellphone() {
	    buttonClick(PageObjectManager.getInstanceElectronicspojo().getCellphone());
	}
	@Then("click the smartphone option")
	public void click_the_smartphone_option() {
	    buttonClick(PageObjectManager.getInstanceElectronicspojo().getSmartphone());
	}
	@Then("select  the shopping card button")
	public void select_the_shopping_card_button() {
	    buttonClick(PageObjectManager.getInstanceElectronicspojo().getShopping());
	}
	@Then("user  click the terms of shopping")
	public void user_click_the_terms_of_shopping() {
	   buttonClick(PageObjectManager.getInstanceElectronicspojo().getTermsofshopping());
	}
	@Then("user click  checkout button")
	public void user_click_checkout_button() {
	   buttonClick(PageObjectManager.getInstanceElectronicspojo().getCheckout());
	}
	@Then("user click  billing continue")
	public void user_click_billing_continue() {
	   buttonClick(PageObjectManager.getInstanceElectronicspojo().getBillingcontinue());
	}
	@Then("user  click the shipping continue")
	public void user_click_the_shipping_continue() {
	    buttonClick(PageObjectManager.getInstanceElectronicspojo().getShippingcontinue());
	}
	@Then("user click the ground button")
	public void user_click_the_ground_button() {
		buttonClick(PageObjectManager.getInstanceComputerpage().getGroundbutton());
	}
	@Then("user click the method continue")
	public void user_click_the_method_continue() {
		buttonClick(PageObjectManager.getInstanceComputerpage().getMethodcontinue());
	}
	@Then("user have click  cash")
	public void user_have_click_cash() {
		buttonClick(PageObjectManager.getInstanceComputerpage().getCash());
	}
	@Then("user have click  delivery continue")
	public void user_have_click_delivery_continue() {
		buttonClick(PageObjectManager.getInstanceComputerpage().getDeliverycontinue());
	}
	@Then("user click the userfinal")
	public void user_click_the_userfinal() {
		buttonClick(PageObjectManager.getInstanceComputerpage().getUserfinal());
		System.out.println("Your order has been successfully proceed");
	}


}
