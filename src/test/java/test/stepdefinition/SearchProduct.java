package test.stepdefinition;

import io.cucumber.java.en.When;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.SearchProductElement;

public class SearchProduct extends SearchProductElement {
	

@When("enter the search box {string}")
public void enter_the_search_box(String string) {
	fillTheTextBox(PageObjectManager.getInstanceSearchProduct().getSearchBox(), string);
	
	
}

@When("click search button")
public void click_search_button() {
	buttonClick(PageObjectManager.getInstanceSearchProduct().getSearchButton());
	
	
}

}
