package test.stepdefinition;

import io.cucumber.java.en.And;
import test.pojoclass.Class1Pojo;

public class Class11 extends Class1Pojo{
	
	@And("click hot deal button in page")
	public void click_hot_deal_button_in_page() {		
		buttonClick(getHotDealButton());		
	}
    
	@And("click product{int} button in page")
	public void click_product_button_in_page(Integer int1) {
	   
		
		buttonClick(getProduct1());
		
		
		
		
	}

}
