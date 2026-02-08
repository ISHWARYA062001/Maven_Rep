package com.base;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;



public abstract class Base_Class {
	public static WebDriver driver;
	
	//Browser launch 
	
	protected static void launchBrowser(String browserName) {

		try {

		if (browserName. equalsIgnoreCase("chrome")) {
      	driver = new ChromeDriver();
		}
		else if (browserName. equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
        }
		} catch (Exception e) {
			Assert.fail("ERROR : OCCURED DURING BROWSER LAUNCH");
		}
			driver.manage().window().maximize();
        }
	
	//URL launch
	
	protected static void launchURL(String url) {
	    try {
	        driver.get(url);   
	    } catch (Exception e) {
	        Assert.fail("ERROR : OCCURRED DURING URL LAUNCH");
	    }
	}

	// get()
	
	protected static void get(String url) {
	    try {
	        driver.get(url);
	    } catch (Exception e) {
	        Assert.fail("ERROR : OCCURRED DURING GET METHOD");
	    }
	}
	
	//getTitle()
	
	protected static String getTitle() {
	    String title = null;
	    try {
	        title = driver.getTitle();
	        System.out.println("PAGE TITLE : " + title);
	    } catch (Exception e) {
	        Assert.fail("ERROR : OCCURRED DURING GET TITLE");
	    }
	    return title;
	}

	//getCurrentUrl()
	
	protected static String getCurrentURL() {
	    String url = null;
	    try {
	        url = driver.getCurrentUrl();
	        System.out.println("CURRENT URL : " + url);
	    } catch (Exception e) {
	        Assert.fail("ERROR : OCCURRED DURING GET CURRENT URL");
	    }
	    return url;
	}
	
	//Navigate to,Navigate forward,Navigate back,Navigate refresh
	
protected static void navigationMethods(String navigate, String url) {
    try {

        if (navigate.equalsIgnoreCase("launch")) {
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
        }
        else if (navigate.equalsIgnoreCase("to")) {
            driver.navigate().to(url);
        } 
        else if (navigate.equalsIgnoreCase("back")) {
            driver.navigate().back();
        } 
        else if (navigate.equalsIgnoreCase("forward")) {
            driver.navigate().forward();
        } 
        else if (navigate.equalsIgnoreCase("refresh")) {
            driver.navigate().refresh();
       }
    } catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING NAVIGATION ");
    }
    }

//Simple Alert, Confirm Alert, Prompt Alert
   
protected static void alertExecution(String action, String value) {
    try {

        Alert alert = driver.switchTo().alert();

        if (action.equalsIgnoreCase("accept")) {
            alert.accept();
        }
        else if (action.equalsIgnoreCase("dismiss")) {
            alert.dismiss();

        }
        else if (action.equalsIgnoreCase("gettext")) {
            System.out.println(alert.getText());

        }
        else if (action.equalsIgnoreCase("sendkeys")) 
            alert.sendKeys(value);
        }
    catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING ALERT HANDLING");
       }
       }

//Frame by index

protected static void frameByIndex(int index) {
    try {
        driver.switchTo().frame(index);
    } catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING FRAME SWITCH BY INDEX");
    }
}

//Frame by name or id

protected static void frameByNameOrId(String nameOrId) {
    try {
        driver.switchTo().frame(nameOrId);
    } catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING FRAME SWITCH BY NAME/ID");
    }
}

//frame by webelement

protected static void frameByElement(WebElement element) {
    try {
        driver.switchTo().frame(element);
    } catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING FRAME SWITCH BY ELEMENT");
    }
}

// frame default content

protected static void defaultContent() {
    try {
        driver.switchTo().defaultContent();
    } catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING SWITCH TO DEFAULT CONTENT");
    }
}

//Windowhandles()

protected static void windowsHandles(int num) {
    try {
        List<String> allWindows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindows.get(num));
    } catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING WINDOW HANDLING");
    }
}

//click(),contextclick(),doubleclick()
protected static void actionsMethods(WebElement element, String action) {
  try {

      Actions actions = new Actions(driver);

      if (action.equalsIgnoreCase("click")) {
          actions.click(element).perform();

      }
      else if (action.equalsIgnoreCase("doubleclick")) {
          actions.doubleClick(element).perform();

      } 
      else if (action.equalsIgnoreCase("rightclick")) {
          actions.contextClick(element).perform();
      } 
      } 
  catch (Exception e) {
      Assert.fail("ERROR : OCCURRED DURING ACTIONS EXECUTION");
      }
      }

//browser close

	protected static void browserClose() {
	    try {
	        driver.close();  
	    } catch (Exception e) {
	        Assert.fail("ERROR : OCCURRED DURING BROWSER CLOSE");
	    }
	}
	
//browser quit

protected static void browserTermination() {
    try {
        driver.quit();
    } catch (Exception e) {
        Assert.fail("ERROR : OCCURRED DURING BROWSER TERMINATION");
    }
    }
    }