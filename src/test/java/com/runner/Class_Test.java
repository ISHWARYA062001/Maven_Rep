package com.runner;

import com.base.Class_Base;
import com.pageobjectmanager.PageObjectManager;

public class Class_Test extends Class_Base {
	public static void main(String[] args) throws Exception {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("browser"));
		launchURL(PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("url"));
		PageObjectManager.getPageObjectManager().getSearch().searchProduct();
		PageObjectManager.getPageObjectManager().getCheckout().cartCheckout();
		PageObjectManager.getPageObjectManager().getAddress().placeOrder();
		WaitToSee();
		browserTermination();

	}

}
























