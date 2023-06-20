package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class Class1Pojo extends BaseClass{
	
	
public	Class1Pojo(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"bs-megamenu\"]/ul/li[2]/a/span[2]/span")
	private WebElement hotDealButton;

	public WebElement getHotDealButton() {
		return hotDealButton;
	
	}
	////*[@id="products"]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/h3/a
	
	@FindBy(xpath="//*[@id=\"products\"]/div/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/h3/a")
	private WebElement product1;

	public WebElement getProduct1() {
		return product1;
	}
	

}
