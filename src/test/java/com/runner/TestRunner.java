package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class TestRunner {

	//public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com");
		
		//String userName = ReadExcelData.getParticularRowData(1,0);
		
		//driver.findElement(By.name("email")).sendKeys(userName);
		
		//String password = ReadExcelData.getParticularRowData(1,1);
		
		//driver.findElement(By.name("pass")).sendKeys(password);

	//}

//}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	String search = ReadExcelData.getParticularRowData();
	
	driver.get("https://www.youtube.com/");
	
	driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.name("search_query")).sendKeys(search);
	
	
    driver.findElement(By.xpath("//button[@title='Search']")).click();
}
}