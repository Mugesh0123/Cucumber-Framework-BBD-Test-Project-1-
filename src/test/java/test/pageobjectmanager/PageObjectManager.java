package test.pageobjectmanager;

import test.pojoclass.Computerpage;
import test.pojoclass.Bookpojo;
import test.pojoclass.LoginPojo;
import test.pojoclass.Pugal2;
import test.pojoclass.SearchProductElement;


public class PageObjectManager {

	private static LoginPojo login;
	private static SearchProductElement searchProduct;
	private static Bookpojo bookspage;
	private static Computerpage computer; 
	private static Pugal2 pugal;
	

	public static LoginPojo getInstanceLoginPojo() {

		return (login == null) ? login = new LoginPojo() : login;
	}

	public static SearchProductElement getInstanceSearchProduct() {
		return (searchProduct == null) ? searchProduct = new SearchProductElement() : searchProduct;
	}

	public static Bookpojo getInstancebookspage() {
		return (bookspage == null) ? bookspage = new Bookpojo() : bookspage;

	}
	public static Computerpage getInstanceComputerpage() {
		return (computer == null) ? computer = new Computerpage() : computer;
	}
	public static Pugal2 getInstancePugal() {
		return (pugal == null) ? pugal = new Pugal2() : pugal;
	}
	
	
	

}
