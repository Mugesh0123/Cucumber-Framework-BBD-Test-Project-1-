package test.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.HomePagepojo;

public class HomePageStep extends HomePagepojo {
	@When("click the books")
	public void click_the_books() {
		
		buttonClick(PageObjectManager.getInstancebookspage().getBooks());
		

	}

	@Then("validated page title {string}")
	public void validated_page_title(String string) {
		String title = driver.getTitle();
		if (title.equalsIgnoreCase(string)) {
			System.out.println("Test case done");
		}

		else {
			System.out.println("test case fail");
		}
	}

}
