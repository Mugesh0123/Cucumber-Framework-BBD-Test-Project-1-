package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class Jewelrypojo extends BaseClass{
	
	public  Jewelrypojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//ul[@class='top-menu']//a[normalize-space()='Jewelry']")
	private WebElement Jewelry;
	
	@FindBy(xpath= "//h2[@class='product-title']//a[normalize-space()='Black & White Diamond Heart']")
	private WebElement BwHeart;
	
	@FindBy(xpath="//input[@id='add-to-cart-button-14']")
	private WebElement addtocart;
	
	@FindBy(xpath= "//li[@id='topcartlink']//a[@class='ico-cart']")
	private WebElement shoppingcart;
	
	@FindBy(xpath= "//input[@name='itemquantity4259127']")
	private WebElement quantity;
	
	@FindBy(xpath= "//input[@id='termsofservice']")
	private WebElement termsofservice;
	
	@FindBy(xpath= "//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath ="//*[@id=\"billing-buttons-container\"]/input")
	private WebElement billingcontinue;
	
	@FindBy(xpath="//*[@id=\"shipping-buttons-container\"]/input")
	private WebElement shippingcontinue;
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/input")
	private WebElement groundbutton;
	
	@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/input")
	private WebElement methodcontinue;
    
	@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/input")
	private WebElement cash;
	
	@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/input")
	private WebElement deliverycontinue;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	private WebElement userfinal ;

	public WebElement getJewelry() {
		return Jewelry;
	}

	public WebElement getBwHeart() {
		return BwHeart;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getTermsofservice() {
		return termsofservice;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getBillingcontinue() {
		return billingcontinue;
	}

	public WebElement getShippingcontinue() {
		return shippingcontinue;
	}

	public WebElement getGroundbutton() {
		return groundbutton;
	}

	public WebElement getMethodcontinue() {
		return methodcontinue;
	}

	public WebElement getCash() {
		return cash;
	}

	public WebElement getDeliverycontinue() {
		return deliverycontinue;
	}

	public WebElement getUserfinal() {
		return userfinal;
	}

}
