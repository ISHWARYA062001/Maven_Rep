package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Excel;

public class Tester {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com");
        String searchText = Excel.getParticularRowData(5,0);
		driver.findElement(By.name("search_query")).sendKeys(searchText);
		driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
	}

}
