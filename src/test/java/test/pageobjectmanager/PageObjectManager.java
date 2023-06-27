package test.pageobjectmanager;

import test.pojoclass.Computerpage;
import test.pojoclass.HomePagepojo;
import test.pojoclass.LoginPojo;
import test.pojoclass.SearchProductElement;

public class PageObjectManager {
	
	private static LoginPojo login;
	private static SearchProductElement searchProduct;
	private static HomePagepojo bookspage;
	private static Computerpage computer; 
	
	

	public static LoginPojo getInstanceLoginPojo() {
		 
		return  (login == null) ? login = new LoginPojo() : login;
	}
	
	public static SearchProductElement getInstanceSearchProduct() {
		return (searchProduct == null) ? searchProduct = new SearchProductElement() : searchProduct;
	} 
	public static HomePagepojo getInstancebookspage() {
		return (bookspage == null) ? bookspage = new HomePagepojo() : bookspage;
		
	}
	public static Computerpage getInstanceComputerpage() {
		return (computer == null) ? computer = new Computerpage() : computer;
	}

}
