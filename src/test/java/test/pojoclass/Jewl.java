package test.pojoclass;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import test.baseclass.BaseClass;


public class Jewl extends BaseClass {
	static public Logger log = Logger.getLogger(Jewl.class);
	public static void jewelry() {
	log.info("jewelry");}
	
	public Jewl(){
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	private WebElement jewelry;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[1]/a/img")
	private WebElement YourOwnJewelry;
	
	
	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getYourOwnJewelry() {
		return YourOwnJewelry;
	}
	// addtocart button
		@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[7]/div/input[2]")
		private WebElement addtocart;
		@FindBy(xpath="//span[text()='Shopping cart']")
		private WebElement shopping;
		
		@FindBy(xpath ="//input[contains(@id,'termsofservice')]")
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

		public WebElement getUserfinal() {
			
			return userfinal;
		}
	
	}
