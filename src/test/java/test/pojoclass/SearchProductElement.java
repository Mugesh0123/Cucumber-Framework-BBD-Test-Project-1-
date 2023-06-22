package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class SearchProductElement extends BaseClass{
	
	public SearchProductElement() {
		PageFactory.initElements(driver, SearchProductElement.class);
	}
	
	@FindBy(xpath = "//*[@id=\"small-searchterms\"]")
	private WebElement searchBox;
	
	
	@FindBy(className = "button-1 search-box-button")
	private WebElement searchButton;


	public WebElement getSearchBox() {
		return searchBox;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}
}
