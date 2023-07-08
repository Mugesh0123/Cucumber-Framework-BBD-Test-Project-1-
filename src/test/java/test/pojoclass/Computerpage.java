package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class Computerpage extends BaseClass {

	public Computerpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	private WebElement computer;
	public WebElement getComputer() {
		return computer;
	}
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img")
	private WebElement Notebook;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input")
	private WebElement laptop;
	// addtocart button
	@FindBy(xpath="//input[contains(@id,'add-to-cart')]")
	private WebElement addtocart;
	@FindBy(xpath="(//*[text()='Shopping cart'])[1]")
	private WebElement shopping;
	
	@FindBy(xpath ="//*[@id=\"termsofservice\"]")
	private WebElement termsofshopping;
	
		
	@FindBy(xpath = "//*[@id='checkout']")
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

	public WebElement getNotebook() {
		return Notebook;
	}
	
	public WebElement getUserfinal() {
		return userfinal;
	}

	public WebElement getLaptop() {
		return laptop;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getShopping() {
		return shopping;
	}
	public WebElement getTermsofshopping() {
		return termsofshopping;
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
	
	public WebElement getMethodcontinue() {
		return methodcontinue;
	}
	public WebElement getGroundbutton() {
		return groundbutton;
	}
	public WebElement getCash() {
		return cash;
	}

	public WebElement getDeliverycontinue() {
		return deliverycontinue;
				
	}
	
}
