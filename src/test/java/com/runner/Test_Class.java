package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v143.browser.Browser;

import com.base.Base_Class;

public class Test_Class extends Base_Class{
	
	public static void main(String[] args) {
    launchBrowser("chrome");
    launchURL("https://leetcode.com/");
    get("https://testautomationpractice.blogspot.com/");
    getTitle();
    getCurrentURL();
   navigationMethods("to","https://www.google.com");
   navigationMethods("to", "https://www.icai.org/category/announcements");
   navigationMethods("back", null);
   navigationMethods("forward", null);
   navigationMethods("refresh", null);
   navigationMethods("to","https://letcode.in/alert");
   driver.findElement(By.id("accept")).click();
   alertExecution("accept", null);
   driver.findElement(By.id("confirm")).click();
   alertExecution("dismiss", null);
   driver.findElement(By.id("prompt")).click();
   alertExecution("sendkeys", "Ishwarya");
   alertExecution("accept", null);
   launchURL("https://letcode.in/frame");
   frameByIndex(0);
   WebElement firstName = driver.findElement(By.name("fname"));
   firstName.sendKeys("Ishwarya");
   frameByNameOrId("firstFr");
   WebElement lastName = driver.findElement(By.name("lname"));
   lastName.sendKeys("S");
   defaultContent();
   navigationMethods("to","https://demoqa.com/buttons");
   actionsMethods(driver.findElement(By.id("doubleClickBtn")),"doubleclick");
   actionsMethods(driver.findElement(By.name("rightClickBtn")),"contextclick");
   browserClose(); 
   browserTermination();
	}
    }