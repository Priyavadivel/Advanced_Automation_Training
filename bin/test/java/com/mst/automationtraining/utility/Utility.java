
/**
 * 
 */
package com.mst.automationtraining.utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

import com.mst.automationtraining.constant.Constant;
import com.mst.automationtraining.customexception.Customexception;
import com.mst.automationtraining.driver.driverclass;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


/**
 * This class contains the utility methods like screenshot.
 *
 */
public class Utility extends driverclass{

	public Utility(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void highlight(WebElement element, WebDriver driver) {
		try {
			scroll(element, driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: LightGreen;');",element);
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (Exception e1) {
			throw new Customexception(e1.getMessage());
		}
	}
	public static void highlightFailedElement(WebElement element, WebDriver driver) {
		try {
			scroll(element, driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: Red;');",element);
			TimeUnit.MILLISECONDS.sleep(100);
		} catch (Exception e1) {
			throw new Customexception(e1.getMessage());
		}
	}

	public static void scroll(WebElement element, WebDriver driver) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
		} catch (Exception e) {
			throw new Customexception("Mousehover not performed");
		}
	}

	public interface IRetryAnalyzer {
		public boolean retry(ITestResult result);
	}


}



