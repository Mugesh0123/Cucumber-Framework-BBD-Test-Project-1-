package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class TestFilepojo extends BaseClass{
	
	public TestFilepojo(){
		PageFactory.initElements(driver,this);
		
	}
@FindBy(xpath="//*[@id=\"bs-megamenu\"]/ul/li[2]/a/span[2]/span")
private WebElement hotDealbutton;
public WebElement getHotDealbutton() {
	return hotDealbutton;
	}


@FindBy(xpath="//*[@id=\"products\"]/div/div[3]/div[2]/div/div[2]/div/div[1]/div[1]/h3")
private  WebElement CarLighter;
public WebElement getCarLighter() {
	return CarLighter;
}


@FindBy(xpath="//*[@id=\"input-option239\"]")
private WebElement selectbutton;
public WebElement getSelectbutton() {
	return selectbutton;
}
@FindBy(xpath="//*[@id=\"input-option239\"]/option[2]")
private WebElement dropbutton;
public WebElement getDropbutton() {
	return dropbutton;
}
@FindBy(xpath="//*[@id=\"button-cart\"]")
private WebElement AddtoCart;
public WebElement getAddtoCart() {
	return AddtoCart;
}
}
