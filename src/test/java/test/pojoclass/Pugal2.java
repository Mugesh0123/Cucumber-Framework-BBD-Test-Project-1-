package test.pojoclass;

import java.time.Duration;

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
	
	@FindBy(xpath="//img[@title='Show products in category Desktops']")
	private WebElement desktop;
	
	@FindBy(xpath="(//div[@class='item-box']/div[1]/div[1]/a[1]/img[1])[1]")
	private WebElement buildYourOwnCheapComputer;
	
	public WebElement getdesktop() {
		return desktop;
	}
	public WebElement getComputer1() {
		return computer1;
	}
	public WebElement getBuildYourOwnCheapComputer() {
		return buildYourOwnCheapComputer;
	}
	
	
}
