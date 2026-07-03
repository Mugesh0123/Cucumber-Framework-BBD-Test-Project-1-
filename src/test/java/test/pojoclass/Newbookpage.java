package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class Newbookpage extends BaseClass{
	public Newbookpage(){
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[contains(text(),'Books')]")
		private WebElement books;
		
		@FindBy(xpath="//a[text()='Health Book']")
		private WebElement HealthBook;

		public WebElement getBooks() {
			return books;
		}

		public WebElement getHealthBook() {
			return HealthBook;
		}
		

			
		
		
}
