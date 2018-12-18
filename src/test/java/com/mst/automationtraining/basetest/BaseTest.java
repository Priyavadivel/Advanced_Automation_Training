package com.mst.automationtraining.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mst.automationtraining.browser.BrowserFactory;

/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: Base test is used to run the testng methods like 
 * before method, after method, before test, after test, before suite and after suite
 *
 */

public class BaseTest {
	
	protected WebDriver driver;

	@BeforeMethod
	@Parameters({"browser"})
	public void getBrowser(String browser) throws Exception{
		driver = BrowserFactory.getDriver(browser);
		driver.manage().window().maximize();
	}

}
