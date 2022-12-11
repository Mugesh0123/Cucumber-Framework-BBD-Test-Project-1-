package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class EndToEndTestPojo extends BaseClass{
	public EndToEndTestPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement userName;
	
	@FindBy(xpath ="//input[@id='input-password']")
	private WebElement passWord;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath = "//select[@name='category_id']")
	private WebElement category;
	
	@FindBy(xpath="//input[@name='search' and @class='form-control input-lg input-search' ]")
	private WebElement searchBox;
	
	@FindBy(xpath ="/html/body/div[3]/div[1]/div[2]/div/div/section/div/div[1]/div/div[2]/div[4]/div/div[2]/div[1]/button")
	private WebElement addtocard;
	
	@FindBy(xpath ="//span[@id='cart-total']")
	private WebElement viewCard;
	
	@FindBy(xpath = "//*[@id='cart']/ul/li[2]/div/p/a[1]")
	private WebElement viewCartDetails;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getSearchBox() {
		return searchBox;
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
