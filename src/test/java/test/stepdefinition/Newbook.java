package test.stepdefinition;
import io.cucumber.java.en.When;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.Newbookpage;

public class Newbook extends Newbookpage{
	@When("user have click the books")
	public void user_have_click_the_books() {
		buttonClick(PageObjectManager.getInstanceNewbookpage().getBooks());
	   
	}

	@When("user have  click the healthbook")
	public void user_have_click_the_healthbook() {
	    buttonClick(PageObjectManager.getInstanceNewbookpage().getHealthBook());
	   
	}
}
