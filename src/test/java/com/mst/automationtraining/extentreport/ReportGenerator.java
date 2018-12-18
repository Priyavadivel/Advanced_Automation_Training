package com.mst.automationtraining.extentreport;
/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: 
 *
 */
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mst.automationtraining.constant.Constant;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ReportGenerator {
	ExtentTest childTest, parentTest;
	private static ExtentReports reporter = ExtentReportFactory.getReporter();

	public ReportGenerator (String browser, String methodName){
		parentReport(browser, methodName);
	}
	
	public void parentReport(String browser, String methodName) {
		parentTest = reporter.startTest(methodName+browser);
		parentTest.assignCategory(browser);
	
	}

	public void childReport(String methodName) {
		childTest = reporter.startTest(methodName);
		childTest.log(LogStatus.PASS, methodName);
		parentTest.appendChild(childTest);
	}

	public void flush(){
		reporter.flush();
	}
	public void endTest(){
		reporter.endTest(parentTest);
	}

}