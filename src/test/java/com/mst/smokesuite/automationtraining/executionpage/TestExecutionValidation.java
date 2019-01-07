package com.mst.smokesuite.automationtraining.executionpage;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mst.automationtraining.basetest.BaseTest;
import com.mst.automationtraining.constant.Constant;

import com.mst.automationtraining.extentreport.ReportGenerator;

import com.mst.automationtraining.pageobject.Form101Validation;
/**
 * 
 * @author Priya V 
 * Created Date: Dec,2018 
 * Last modified By: Priya V 
 * Purpose of the class: This class used to execute the smoke test case for Form101
 */
public class TestExecutionValidation extends BaseTest{
	@Test
	@Parameters({"browser"})	
	
	public  void formerrorvalidation(String browser,Method method)throws Exception{
		

		String className = this.getClass().getSimpleName();
		reporter = new ReportGenerator(browser,className);
		String methodName = method.getName();
		logger.info(methodName);
		reporter.childReport("Form 101 link passed in browser");
		driver.get(Constant.Form_URL);
		reporter.childReport("Clicked Submit button");
		Form101Validation FormValidation = PageFactory.initElements(driver,Form101Validation.class);
		FormValidation.Submit.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		logger.info("Submit button clicked");
		FormValidation.errorvalidation();
	}
}

		


