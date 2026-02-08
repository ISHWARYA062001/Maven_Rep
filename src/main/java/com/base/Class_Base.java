package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Class_Base {

	public static WebDriver driver;

	public static void launchBrowser(String browser) {

		try {

			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else {
				Assert.fail("INVALID BROWSER NAME");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER LAUNCH");
		}
	}

	protected static void launchURL(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR : OCCURRED DURING URL LAUNCH");
		}
	}

	protected static void clickOnElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR : OCCURRED WHILE CLICKING THE ELEMENT");
		}
	}

	protected static void passInput(WebElement element, String value) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR : OCCURRED WHILE PASSING INPUT");
		}
	}

	protected static String getText(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			String text = element.getText();
			System.out.println(text);
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR : OCCURRED WHILE GET TEXT");
		}
		return null;
	}

	protected static void takeScreenshot(String fileName) {
	    try {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File("screenshots/" + fileName + ".png");
	        FileUtils.copyFile(src, dest);
	    } catch (Exception e) {
	        e.printStackTrace();
	        Assert.fail("ERROR OCCURRED DURING SCREENSHOT");
	    }
	}
	
	public static void alertAcceptAndPrint() {
		try {
			Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
			System.out.println(alert.getText());
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR : OCCURRED WHILE POPUP MESSAGE");
		}
	}
	protected static void WaitToSee() {
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}

	protected static void browserTermination() {
		try {
			
				driver.quit();
	

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("ERROR : OCCURRED DURING BROWSER CLOSE");
		}
	}
}

