package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Class_Base;
import com.interfaceelements.Checkout_Interface_Elements;

public class Checkout_Class extends Class_Base implements Checkout_Interface_Elements {
	@FindBy(id = cart_id)
	private WebElement cart;

	@FindBy(xpath = placeorder_xpath)
	private WebElement placeOrder;

	public Checkout_Class() {
        PageFactory.initElements(driver, this);
    }

	public void cartCheckout() throws Exception {
		clickOnElement(cart);
		WaitToSee();
		takeScreenshot("Checkout cart");
		clickOnElement(placeOrder);
	}

}



















