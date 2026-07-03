package test.stepdefinition;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.baseclass.BaseClass;
import test.pageobjectmanager.PageObjectManager;
import test.pojoclass.LoginPojo;

public class Shop extends  LoginPojo{
	//static public Logger log = Logger.getLogger(Shop.class);
@When("user have to enter {string}")
public void user_have_to_enter(String string) {
	fillTheTextBox(PageObjectManager.getInstanceLoginPojo().getUserName(), string);
}

@When("user have to enters {string}")
public void user_have_to_enters(String string) {
	fillTheTextBox(PageObjectManager.getInstanceLoginPojo().getPassWord(), string);
}


@Then("user should be in homepage {string}")
public void user_should_be_in_homepage(String string) {
	if(string.equals("Log out")) {
		String text = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
		Assert.assertEquals(text, string);
		//log.info(text +"="+ string);
		}else {
			String text1 = driver.findElement(By.xpath("//li[text()='No customer account found']")).getText();
		Assert.assertEquals(text1, string);
		//log.info(text1 +"="+ string);
		}
//	 SoftAssert softAssert = new SoftAssert();
//	 driver.findElement(By.xpath("//a[text()='Log out']")).getText();
//	 softAssert.assertEquals(softAssert,string,"log out");
//	 log.info(softAssert+"="+ string);
//	 driver.findElement(By.xpath("//a[text()='Log out']")).getText();
//	 softAssert.assertEquals(softAssert,string,"No customer account found");
//	 log.info(softAssert+"="+ string);
//	 softAssert.assertAll();
}



@When("user Should be in logout")
public void user_Should_be_in_logout() {
    driver.findElement(By.xpath("//a[text()='Log out']")).click();
}
}
