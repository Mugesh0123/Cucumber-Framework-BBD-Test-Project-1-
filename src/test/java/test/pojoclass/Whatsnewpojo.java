package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class Whatsnewpojo extends BaseClass {
	public Whatsnewpojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"bs-megamenu\"]/ul/li[3]/a/span[2]/span")
	private WebElement whatsnew;

	

	@FindBy(xpath = "//*[@id=\"products\"]/div/div[3]/div[1]/div/div[2]/div/div[1]/div[1]/h3/a")
	private WebElement ToolKit;

	@FindBy(xpath = "//*[@id=\"product\"]/div[1]/div[1]/span")
	private WebElement selectbutton;

	@FindBy(xpath = "//*[@id='input-option283']/option[2]")
	private WebElement dropbutton;

	@FindBy(xpath = "//*[@id=\"button-cart\"]/span")
	private WebElement AddtoCart;
	
	public WebElement getWhatsnew() {
		return whatsnew;
	}

	public WebElement getToolKit() {
		return ToolKit;
	}

	public WebElement getSelectbutton() {
		return selectbutton;
	}

	public WebElement getDropbutton() {
		return dropbutton;
	}

	public WebElement getAddtoCart() {
		return AddtoCart;
	}

}
