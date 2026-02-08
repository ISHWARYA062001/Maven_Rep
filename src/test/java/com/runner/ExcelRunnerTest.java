package com.runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ExcelRead;


public class ExcelRunnerTest {

	public static void main(String[] args) throws InterruptedException,IOException{
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		//driver.get("https://www.youtube.com/");
		
		//String search = ExcelRead.getData(5,0);
		
		//driver.findElement(By.name("search_query")).sendKeys(search);
		
		//driver.findElement(By.xpath("//button[@title='Search']")).sendKeys(Keys.ENTER);

		 String searchText = ExcelRead.getCellData(
	                "C:\\Users\\ishwa\\OneDrive\\Desktop\\JAVA SELINIUM NOTES\\sql\\DataDriven_IPT.xlsx",
	                "Sheet1",5,0 );

	        // Launch browser
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.youtube.com");

	        // Search using Excel value
	        driver.findElement(By.name("search_query")).sendKeys(searchText);
	        driver.findElement(By.id("search-icon-legacy")).click();
	}

}
