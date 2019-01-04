package com.mst.smokesuite.automationtraining.executionpage;
/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: TestExecution contains the id and xpath of the Form101 fields.
 *
 */
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mst.automationtraining.basetest.BaseTest;
import com.mst.automationtraining.constant.Constant;
import com.mst.automationtraining.customexception.Customexception;
import com.mst.automationtraining.excelutility.ExcelUtility;
import com.mst.automationtraining.extentreport.ExtentReportFactory;
import com.mst.automationtraining.extentreport.ReportGenerator;
import com.mst.automationtraining.mail.Mail_report;
import com.mst.automationtraining.pageobject.Form101;
import com.mst.automationtraining.utility.Utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestExecution extends BaseTest {

	@Test
	@Parameters({"browser"})	
	
	public  void form101Submission(String browser,Method method)throws Exception{
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String methodName = method.getName(), TC_Name = "TC001";
		String className = this.getClass().getSimpleName();
		reporter = new ReportGenerator(browser,className);
		driver.get(Constant.Form_URL);
		Form101 webform101  = PageFactory.initElements(driver,Form101.class);		
		reporter.childReport("Last Name Entered");
		webform101.lastName.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"LastName"));
		logger.info("Last Name Entered Successfully");
		reporter.childReport("First Name Entered");
		webform101.firstName.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"FirstName"));
		reporter.childReport("Social Security Number Entered");
		webform101.socialSecurityNumber.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"SSN"));
		reporter.childReport("Home Address Entered");
		webform101.homeAddress.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeAddress"));
		reporter.childReport("Home City Entered");
		webform101.homeCity.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeCity"));
		reporter.childReport("Home State Entered");
		webform101.homeState.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeState"));
		reporter.childReport("Home Zip Code Entered");
		webform101.homeZip.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeZip"));
		reporter.childReport("Phone Number Entered");
		webform101.homePhone.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomePhone"));
		reporter.childReport("DOB Entered");
		webform101.dob.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"DOB"));
		reporter.childReport("SEX Entered");
		webform101.sex.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"sex"));
		reporter.childReport("Marital Status Entered");
		webform101.maritalStatus.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"maritalStatus"));
				
		
		reporter.childReport("Employer Name Entered");
		webform101.EmployerName.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployerName"));
		
		
		reporter.childReport("Fien Number Entered");
		webform101.FienNumber.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"FienNumber"));
		reporter.childReport("OfficeAddress Entered");
		webform101.OfficeAddress.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeAddress"));
		reporter.childReport("Office City Entered");
		webform101.OfficeCity.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeCity"));
		reporter.childReport("Office State Entered");
		webform101.OfficeState.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeState"));
		reporter.childReport("Office Zip Entered");
		webform101.OfficeZip.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeZip"));
		reporter.childReport("OfficePhone Entered");
		webform101.OfficePhone.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficePhone"));
		
		reporter.childReport("DateofInjuiry Entered");
		webform101.DateofInjuiry.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"DateofInjuiry"));
		reporter.childReport("DateEmployerNotified Entered");
		webform101.DateEmployerNotified.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"DateEmployerNotified"));
		reporter.childReport("LastDayofWork Entered");
		webform101.LastDayofWork.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"LastDayofWork"));
		reporter.childReport("EmployerOccupation Entered");
		webform101.EmployerOccupation.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployerOccupation"));
		reporter.childReport("Injury occur on Employer premises Entered");
		webform101.Employerpremises.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"Employerpremises"));
		reporter.childReport("InjuryorIlleness Entered");
		webform101.InjuryorIlleness.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"InjuryorIlleness"));
		reporter.childReport("Part of Body Injured Entered");
		webform101.PartofBodyInjured.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"PartofBodyInjured"));
		reporter.childReport("Fatal Entered");
		webform101.Fatal.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"Fatal"));
		reporter.childReport("Employee Treated Entered");
		webform101.EmployeeTreated.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployeeTreated"));
		reporter.childReport("Employee Hospitalized Entered");
		webform101.EmployeeHospitalized.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployeeHospitalized"));
		reporter.childReport("Validity of Claim Entered");
		webform101.ValidityofClaim_dropdown.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"ValidityofClaim_dropdown"));
		reporter.childReport("Part of Body Injury Table");
		webform101.clickOnLookup2(ExcelUtility.readExcel(methodName,TC_Name,"PartofBodyInjury"));
		
	
		reporter.childReport("What Happened?");
		webform101.WhatHappened.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"WhatHappened"));
		reporter.childReport("What Object?");
		webform101.WhatObject.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"WhatObject"));
		reporter.childReport("Nature of Injury");
		webform101.clickOnLookup(ExcelUtility.readExcel(methodName,TC_Name,"NatureofInjury"));
		
		reporter.childReport("CauseofInjury");
		webform101.clickOnLookup1(ExcelUtility.readExcel(methodName,TC_Name,"CauseofInjury"));
				
		reporter.childReport("What Emp Doing?");
		webform101.Doing.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"Doing"));
		reporter.childReport("Date of Last Hire");
		webform101.DOLastHire.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"DOLastHire"));
		reporter.childReport("Was Worker?");
		webform101.Wasworkedemp.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"Wasworkedemp"));
		
		reporter.childReport("Actual Gross Earnings");
		webform101.GrossEarnings.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"GrossEarnings"));
		
		reporter.childReport("Submitter Email");
		webform101.SubmitterEmail.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"SubmitterEmail"));
		
		webform101.Agree.click();
		webform101.Submit.click();
		
		webform101.Verify();
			
	}
	

}
