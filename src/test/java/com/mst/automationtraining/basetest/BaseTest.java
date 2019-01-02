package com.mst.automationtraining.basetest;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.mst.automationtraining.browser.BrowserFactory;
import com.mst.automationtraining.customexception.Customexception;
import com.mst.automationtraining.driver.driverclass;
import com.mst.automationtraining.extentreport.ReportGenerator;
import com.mst.automationtraining.mail.Mail_report;
import com.mst.automationtraining.utility.Utility;
import com.relevantcodes.extentreports.ExtentTest;

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
	protected ReportGenerator reporter; 
	protected static Logger logger = Logger.getLogger(BaseTest.class);

	/*@BeforeSuite (alwaysRun=true) 
	public void beforeSuite() throws IOException {
		PropertyConfigurator.configure("log4j.properties"); 
	}*/

	@BeforeMethod
	@Parameters({"browser"})
	public void getBrowser(String browser) throws Exception{
		driver = BrowserFactory.getDriver(browser);
		driver.manage().window().maximize();
	}

	@AfterMethod
	@Parameters({"browser"})
	public void tearDown(ITestResult result,String browser) throws Exception{
		String methodName=result.getMethod().getMethodName();
		if(result.getStatus()==ITestResult.FAILURE){
			String res=result.getThrowable().getMessage();
			reporter.logScreenshot(driver, methodName+browser,res);
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			String res = result.getThrowable().getMessage();
			try {
				reporter.logSkipTest(driver, methodName, res);
			} catch (Exception e) {
				logger.error(e);
			}
		}
		if (driver != null) {
			try {
				driver.manage().deleteAllCookies();
				logger.info("Cookies are deleted");
				driver.quit();
			} catch (Customexception e) {
				e.getLocalizedMessage();
				e.getMessage();
				logger.error("Custom Exception for tear down", e);
			} catch (Exception ex) {
				logger.error("tear Down", ex);
			}
		}
		else
			logger.error("Driver is null");		
		reporter.endTest();		
	} 


	@AfterSuite
	public void afterSuite(){
		reporter.flush();
		Mail_report.send_report();
	}


}
