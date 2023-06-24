package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class HomePagepojo extends BaseClass{
	public HomePagepojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	private WebElement books;
	public WebElement getBooks() {
		return books;
	}

}
