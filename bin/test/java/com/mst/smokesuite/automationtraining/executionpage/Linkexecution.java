package com.mst.smokesuite.automationtraining.executionpage;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mst.automationtraining.basetest.BaseTest;
import com.mst.automationtraining.constant.Constant;
import com.mst.automationtraining.extentreport.ReportGenerator;
import com.mst.automationtraining.pageobject.Linksvalidation;

public class Linkexecution extends BaseTest{
	
		@Test
		@Parameters({"browser"})	
		
		public  void formlinkvalidation(String browser,Method method)throws Exception{
			String className = this.getClass().getSimpleName();
			String methodName = method.getName();
			reporter = new ReportGenerator(browser,methodName);					
			logger.info(methodName);			
			reporter.childReport("Form 101 link passed in browser");
			driver.get(Constant.Form_URL);
			reporter.childReport("Part of Body Injured Link Clicked");
			Linksvalidation FormLinks = PageFactory.initElements(driver,Linksvalidation.class);
			FormLinks.PartofBodyLink.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			logger.info("Link clicked");
			FormLinks.PartofBodyValue();
			}		
}
