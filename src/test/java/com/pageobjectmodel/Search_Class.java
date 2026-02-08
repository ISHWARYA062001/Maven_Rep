package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Class_Base;
import com.interfaceelements.Search_Interface_Elements;

public class Search_Class extends Class_Base implements Search_Interface_Elements {

	@FindBy(xpath=laptop_xpath)
	private WebElement laptops;

	@FindBy(xpath=sony_xpath)
	private WebElement sony;

	@FindBy(xpath=addcart_xpath)
	private WebElement addCart;

	public Search_Class() {
		PageFactory.initElements(driver, this);
	}

	public void searchProduct() throws Exception {
		clickOnElement(laptops);
		clickOnElement(sony);
		clickOnElement(addCart);
		alertAcceptAndPrint();
	}
}














