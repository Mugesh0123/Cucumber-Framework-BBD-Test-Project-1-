package test.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.baseclass.BaseClass;

public class Pugal2 extends BaseClass{
	public Pugal2(){
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	private WebElement computer1;

	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	private WebElement buildYourOwnCheapComputer;
	public WebElement getComputer1() {
		return computer1;
	}
	public WebElement getBuildYourOwnCheapComputer() {
		return buildYourOwnCheapComputer;
	}
	
}
