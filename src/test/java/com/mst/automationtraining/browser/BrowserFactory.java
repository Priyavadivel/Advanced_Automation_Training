package com.mst.automationtraining.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mst.automationtraining.constant.Constant;
import com.mst.automationtraining.customexception.Customexception;
/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: The Browser Factory is used to run different types of
 * browsers by using testng parameters.
 *
 */

public class BrowserFactory {

	static WebDriver driver;

	static ChromeOptions options;

	public static WebDriver getDriver(String browser){
		if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver",Constant.chromeDriver);
			options = new ChromeOptions();
			options.addArguments("disable-extensions");			
			//options.addArguments("--start-maximized");
			driver =new ChromeDriver(options);
		}
		else if(browser.equals("firefox")){
			driver = new FirefoxDriver();
			System.out.println("test2");

		}
		
		else{
			throw new Customexception("Browser is not correct");
		}
		return driver;
	}
}

