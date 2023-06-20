package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class HotdealsPojo extends BaseClass {
	public HotdealsPojo () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"bs-megamenu\"]/ul/li[2]/a/span[2]/span")
	private WebElement HotDeals;
	
	@FindBy(xpath="//*[@id=\"products\"]/div/div[1]/div[1]/div/div[1]/a[1]/img")
	private WebElement RCACable ;
	
	@FindBy(xpath ="//*[@id=\"button-cart\"]/span")
	private WebElement addtocard;
	
	@FindBy(xpath ="//*[@id=\"cart\"]/div/div")
	private WebElement viewCard;
	
	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")
	private WebElement viewCartDetails;

	public WebElement getHotDeals() {
		return HotDeals;
	}

	public WebElement getRCACable() {
		return RCACable;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}

	public WebElement getViewCard() {
		return viewCard;
	}

	public WebElement getViewCartDetails() {
		return viewCartDetails;
	}


	
}
