package test.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class LoginPojo extends BaseClass{
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='input-email']")
	private WebElement userName;
	
	@FindBy(xpath ="//input[@id='input-password']")
	private WebElement passWord;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement login;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
