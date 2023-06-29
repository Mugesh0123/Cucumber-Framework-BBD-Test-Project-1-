package test.stepdefinition;

import io.cucumber.java.en.When;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.Pugal2;

public class Pugal extends Pugal2 {

		@When("click the tab{string}")
		public void click_the_tab(String string) {
			buttonClick(PageObjectManager.getInstancePugal().getComputer1());
			
		}

		@When("click the {string}")
		public void click_the(String string) {
			buttonClick(PageObjectManager.getInstancePugal().getBuildYourOwnCheapComputer());
		    
		}



}
