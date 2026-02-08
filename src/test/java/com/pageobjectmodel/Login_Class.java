package com.pageobjectmodel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Class_Base;
import com.interfaceelements.Login_Interface_Elements;
import com.pageobjectmanager.PageObjectManager;

public class Login_Class extends Class_Base implements Login_Interface_Elements {
	@FindBy(id = login_id)
	private WebElement login;

	@FindBy(id = username_id)
	private WebElement username;

	@FindBy(id = password_id)
	private WebElement password;

	@FindBy(xpath = signin_xpath)
	private WebElement signin;

	@FindBy(id = title_id)
	private WebElement title;

	public Login_Class() {
		PageFactory.initElements(driver, this);

	}

	public void validLogin() throws IOException, InterruptedException {
		clickOnElement(login);
		passInput(username, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("username"));
		passInput(password, PageObjectManager.getPageObjectManager().getFileReader().getDataProperty("password"));
		clickOnElement(signin);
		getText(title);
		WaitToSee();
        takeScreenshot("login");
	}
}