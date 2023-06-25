package test.stepdefinition;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.HomePagepojo;

public class HomePageStep extends HomePagepojo {
	@When("click the books")
	public void click_the_Books() {

		buttonClick(PageObjectManager.getInstancebookspage().getBooks());
		System.out.println("successfully click the books module");

	}

	@Then("validated page title {string}")
	public void validated_page_title(String expectedTitle) {
		String homePageTitle = driver.getTitle();
		assertEquals(expectedTitle, homePageTitle);
		System.out.println(homePageTitle);
		driver.quit();

	}

}
