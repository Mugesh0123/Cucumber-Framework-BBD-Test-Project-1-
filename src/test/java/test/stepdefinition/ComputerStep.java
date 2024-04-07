package test.stepdefinition;

//import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.Computerpage;

public class ComputerStep extends Computerpage {

@Given("user have click the computer")
public void user_have_click_the_computer() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getComputer());
}



@And("user have  click the notebooks")
public void user_have_click_the_notebooks() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getNotebook());
}

@And("user have click the  Laptop")
public void user_have_click_the_Laptop() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getLaptop());
    
}

@And("user have to click the add to cart button")
public void user_have_to_click_the_add_to_cart_button() 
{
	buttonClick(PageObjectManager.getInstanceComputerpage().getAddtocart());
   
}

@And("user select  the shopping card button")
public void user_select_the_shopping_card_button() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getShopping());
}



@And("user have click the terms of shopping")
public void user_have_click_the_terms_of_shopping() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getTermsofshopping());
   
}

@And("user click the checkout button")
public void user_click_the_checkout_button() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getCheckout());
    
}



@And("user click the billing continue")
public void user_click_the_billing_continue() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getBillingcontinue());
}

@And("user have click the shipping continue")
public void user_have_click_the_shipping_continue() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getShippingcontinue());
    
}

@Then("user have click the ground button")
public void user_have_click_the_ground_button() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getGroundbutton());
    
}

@And("user have click the method continue")
public void user_have_click_the_method_continue() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getMethodcontinue());
	   
}

@Then("user have click the cash")
public void user_have_click_the_cash() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getCash());
   
}

@And("user have click the delivery continue")
public void user_have_click_the_delivery_continue() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getDeliverycontinue());
    
}



@Then("user have click the userfinal")
public void user_have_click_the_userfinal() {
	buttonClick(PageObjectManager.getInstanceComputerpage().getUserfinal());
	System.out.println("Your order has been successfully proceed");
}


}
