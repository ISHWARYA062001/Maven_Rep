package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Class_Base;
import com.interfaceelements.Address_Interface_Elements;

public class Address_Class extends Class_Base implements Address_Interface_Elements {
	@FindBy(id = name_id)
	private WebElement name;

	@FindBy(id = country_id)
	private WebElement country;

	@FindBy(id = city_id)
	private WebElement city;

	@FindBy(id = card_id)
	private WebElement card;

	@FindBy(id = month_id)
	private WebElement month;

	@FindBy(id = year_id)
	private WebElement year;

	@FindBy(xpath = purchase_xpath)
	private WebElement purchase;

	@FindBy(xpath = confirm_xpath)
	private WebElement confirm;

	public Address_Class() {
		PageFactory.initElements(driver, this);}
	public void placeOrder() throws Exception {
		passInput(name, "Ishwarya");
		passInput(country, "India");
		passInput(city, "Chennai");
		passInput(card, "123456789");
		passInput(month, "02");
		passInput(year, "2027");
		clickOnElement(purchase);
		getText(confirm);
		takeScreenshot("OrderSuccess");}
}


//@FindBy(xpath = logout_xpath)
	//private WebElement logout;
//String details = getText(confirm);
		//System.out.println(details);
//clickOnElement(logout);