
package com.pageobjectmanager;

import com.pageobjectmodel.Address_Class;
import com.pageobjectmodel.Checkout_Class;
import com.pageobjectmodel.Login_Class;
import com.pageobjectmodel.Search_Class;
import com.utility.FileReaderManager;

public class PageObjectManager {
	private static PageObjectManager pageObjectManager;
	private FileReaderManager fileReader;
	private Login_Class login;
	private Search_Class search;
	private Checkout_Class checkout;
	private Address_Class address;

	public FileReaderManager getFileReader() {
		if (fileReader == null) {
			fileReader = new FileReaderManager();
		}
		return fileReader;
	}

	public static PageObjectManager getPageObjectManager() {
		if (pageObjectManager == null) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}

	public Login_Class getLogin() {
		if (login == null) {
			login = new Login_Class();
		}
		return login;
	}

	public Search_Class getSearch() {
		if (search == null) {
			search = new Search_Class();
		}
		return search;
	}

	public Checkout_Class getCheckout() {
		if (checkout == null) {
			checkout = new Checkout_Class();
		}
		return checkout;
	}

	public Address_Class getAddress() {
		if (address == null) {
			address = new Address_Class();
		}
		return address;
	}
}
