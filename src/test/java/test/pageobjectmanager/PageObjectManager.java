package test.pageobjectmanager;

import test.pojoclass.LoginPojo;
import test.pojoclass.SearchProductElement;

public class PageObjectManager {
	
	static LoginPojo login;
	static SearchProductElement searchProduct;
	
	public static LoginPojo getInstanceLoginPojo() {
		 
		return  (login == null) ? login = new LoginPojo() : login;
	}
	
	public static SearchProductElement getInstanceSearchProduct() {
		return (searchProduct == null) ? searchProduct = new SearchProductElement() : searchProduct;
	}

}
