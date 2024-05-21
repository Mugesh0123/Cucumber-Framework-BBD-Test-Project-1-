package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class Emailpage extends BaseClass {

	
	public WebElement getLoginButton() {
		return loginButton;
	}


	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}


	public WebElement getUserName() {
		return userName;
	}


	public void setUserName(WebElement userName) {
		this.userName = userName;
	}


	public WebElement getPassWord() {
		return passWord;
	}


	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}


	public WebElement getLogin() {
		return login;
	}


	public void setLogin(WebElement login) {
		this.login = login;
	}


	public WebElement getLogOutButton() {
		return logOutButton;
	}


	public void setLogOutButton(WebElement logOutButton) {
		this.logOutButton = logOutButton;
	}


	public Emailpage() {
		PageFactory.initElements(driver, this);
	}
	 // login option
	@FindBy(className = "ico-login")
	private WebElement loginButton;
	
	// username field
	@FindBy(id = "Email")
	private WebElement userName;
	
	// password field
	@FindBy(xpath ="//*[@id='Password']")
	private WebElement passWord;
	
	// login submit button
	@FindBy(xpath ="//*[@class='button-1 login-button']")
	private WebElement login;

	
	// logout button
	@FindBy(xpath="//*[text()='Log out']")
	private WebElement logOutButton;
}
