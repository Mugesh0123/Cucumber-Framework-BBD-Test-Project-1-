package test.pageobjectmanager;

import test.pojoclass.HomePagepojo;
import test.pojoclass.LoginPojo;
import test.pojoclass.SearchProductElement;

public class PageObjectManager {

	private static LoginPojo login;
	private static SearchProductElement searchProduct;
	private static HomePagepojo bookspage;

	public static LoginPojo getInstanceLoginPojo() {

		return (login == null) ? login = new LoginPojo() : login;
	}

	public static SearchProductElement getInstanceSearchProduct() {
		return (searchProduct == null) ? searchProduct = new SearchProductElement() : searchProduct;
	}

	public static HomePagepojo getInstancebookspage() {
		return (bookspage == null) ? bookspage = new HomePagepojo() : bookspage;

	}

}
