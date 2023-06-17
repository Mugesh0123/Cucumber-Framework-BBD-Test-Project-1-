package test.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.baseclass.BaseClass;
import test.pojoclass.EndToEndTestPojo;

public class EndToEndTest extends BaseClass{
	@Given("user should be in login page{int} {string}")
	public void user_should_be_in_login_page(Integer int1, String string) {
		lanchBrowser();
		url(string);	    
	}

	@When("user have to enter username{int} {string}")
	public void user_have_to_enter_username(Integer int1, String string) {
		EndToEndTestPojo my = new EndToEndTestPojo();
		fillTheTextBox(my.getUserName(), string);	  
	}

	@When("user have to enter password{int} {string}")
	public void user_have_to_enter_password(Integer int1, String string) {
		EndToEndTestPojo my1 = new EndToEndTestPojo();
		fillTheTextBox(my1.getPassWord(), string); 
		buttonClick(my1.getLogin());
		System.out.println("hi");

	}
	@And("user have to click all category and choose the product")
	public void user_have_to_click_all_category_and_choose_the_product() {
		//select class
		EndToEndTestPojo my2 = new EndToEndTestPojo();
		Select s = new Select(my2.getCategory());
		s.selectByVisibleText("      USB Devices");
	   
	}
	@And("user have to search the product and click")
	public void user_have_to_search_the_product_and_click() {
		EndToEndTestPojo my3 = new EndToEndTestPojo();
		buttonClick(my3.getSearchBox());
	    waiting(30);
	    Actions act =new Actions(driver);
	    WebElement findElement = driver.findElement(By.xpath("//*[@id=\"search0\"]/ul/li[1]/a"));
	    act.moveToElement(findElement).click().build().perform();	 
	}

	@And("user have to add to card")
	public void user_have_to_add_to_card() {
		EndToEndTestPojo my4 = new EndToEndTestPojo();   
		scrollByElement(my4.getAddtocard());
		buttonClick(my4.getAddtocard());
		
	}

	@Then("user should be verify view to card {string}")
	public void user_should_be_verify_view_to_card(String string) {
		EndToEndTestPojo my5 = new EndToEndTestPojo();
		scrollByElement(my5.getViewCard());
		waiting(30);
		buttonClick(my5.getViewCard());
		buttonClick(my5.getViewCartDetails());
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains(string));	    
	}
}
