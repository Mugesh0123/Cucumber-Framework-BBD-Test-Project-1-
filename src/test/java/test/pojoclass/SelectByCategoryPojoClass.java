package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class SelectByCategoryPojoClass extends BaseClass {
	public SelectByCategoryPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement userName;
	
	@FindBy(xpath ="//input[@id='input-password']")
	private WebElement passWord;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath ="//*[contains(text(),'Shop By Categories')]")
	private WebElement shopByCategory;
	
	@FindBy(xpath ="(//*[contains(text(),'Home & Lifestyle')])[2]")
	private WebElement HomeAndLifestyle;
	
	@FindBy(xpath ="(//*[contains(text(),'Home Decor')])[2]")
	private WebElement HomeDecor;
	
	@FindBy(xpath ="//*[@id='products']/div/div/div[1]/div/div[1]/a[1]/img")
	private WebElement AwardWinningWallGearClock;
	
	@FindBy(xpath ="((//*[contains(@class,'btn btn-outline') and contains(@type,'button')])[12]")
	private WebElement AddToCard;
	
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

	public WebElement getShopByCategory() {
		return shopByCategory;
	}

	public WebElement getHomeAndLifestyle() {
		return HomeAndLifestyle;
	}

	public WebElement getHomeDecor() {
		return HomeDecor;
	}

	public WebElement getAwardWinningWallGearClock() {
		return AwardWinningWallGearClock;
	}

	public WebElement getAddToCard() {
		return AddToCard;
	}

	public WebElement getViewCard() {
		return viewCard;
	}

	public WebElement getViewCartDetails() {
		return viewCartDetails;
	}
}
