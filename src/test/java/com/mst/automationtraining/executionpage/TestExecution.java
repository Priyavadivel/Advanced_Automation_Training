package com.mst.automationtraining.executionpage;
/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: TestExecution contains the id and xpath of the Form101 fields.
 *
 */
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.mst.automationtraining.basetest.BaseTest;
import com.mst.automationtraining.constant.Constant;
import com.mst.automationtraining.customexception.Customexception;
import com.mst.automationtraining.excelutility.ExcelUtility;
import com.mst.automationtraining.extentreport.ExtentReportFactory;
import com.mst.automationtraining.mail.Mail_report;
import com.mst.automationtraining.pageobject.Form101;
import com.mst.automationtraining.utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestExecution extends BaseTest {

	ExtentTest parentTest,childTest;
	private static ExtentReports reporter = ExtentReportFactory.getReporter();

	@Test
	@Parameters({"browser"})

	public  void form101Submission(String browser,Method method)throws Exception{

		//System.out.println("test11");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String methodName = method.getName(), TC_Name = "TC001";
		parentReport(browser, methodName);		
		driver.get(Constant.Form_URL);
		Form101 webform101  = PageFactory.initElements(driver,Form101.class);
		childReport("Last Name Entered");
		webform101.lastName.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"LastName"));
		childReport("First Name Entered");
		webform101.firstName.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"FirstName"));
		childReport("Social Security Number Entered");
		webform101.socialSecurityNumber.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"SSN"));
		childReport("Home Address Entered");
		webform101.homeAddress.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeAddress"));
		childReport("Home City Entered");
		webform101.homeCity.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeCity"));
		childReport("Home State Entered");
		webform101.homeState.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeState"));
		childReport("Home Zip Code Entered");
		webform101.homeZip.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomeZip"));
		childReport("Phone Number Entered");
		webform101.homePhone.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"HomePhone"));
		childReport("DOB Entered");
		webform101.dob.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"DOB"));

		childReport("Employer Name Entered");
		webform101.EmployerName.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployerName"));
		childReport("Fien Number Entered");
		webform101.FienNumber.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"FienNumber"));
		childReport("OfficeAddress Entered");
		webform101.OfficeAddress.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeAddress"));
		childReport("Office City Entered");
		webform101.OfficeCity.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeCity"));
		childReport("Office State Entered");
		webform101.OfficeState.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeState"));
		childReport("Office Zip Entered");
		webform101.OfficeZip.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficeZip"));
		childReport("OfficePhone Entered");
		webform101.OfficePhone.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"OfficePhone"));
		
		childReport("DateofInjuiry Entered");
		webform101.DateofInjuiry.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"DateofInjuiry"));
		childReport("DateEmployerNotified Entered");
		webform101.DateEmployerNotified.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"DateEmployerNotified"));
		childReport("LastDayofWork Entered");
		webform101.LastDayofWork.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"LastDayofWork"));
		childReport("EmployerOccupation Entered");
		webform101.EmployerOccupation.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployerOccupation"));
		childReport("Injury occur on Employer premises Entered");
		webform101.Employerpremises.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"Employerpremises"));
		childReport("InjuryorIlleness Entered");
		webform101.InjuryorIlleness.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"InjuryorIlleness"));
		childReport("Part of Body Injured Entered");
		webform101.PartofBodyInjured.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"PartofBodyInjured"));
		childReport("Fatal Entered");
		webform101.Fatal.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"Fatal"));
		childReport("Employee Treated Entered");
		webform101.EmployeeTreated.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployeeTreated"));
		childReport("Employee Hospitalized Entered");
		webform101.EmployeeHospitalized.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"EmployeeHospitalized"));
		childReport("Validity of Claim Entered");
		webform101.ValidityofClaim_dropdown.sendKeys(ExcelUtility.readExcel(methodName,TC_Name,"ValidityofClaim_dropdown"));
	}
	


	private void parentReport(String browser, String methodName) {
		parentTest = reporter.startTest(methodName+browser);
		parentTest.assignCategory(browser);
	}
	private void childReport(String methodName) {
		childTest = reporter.startTest(methodName);
		childTest.log(LogStatus.PASS, methodName);
		parentTest.appendChild(childTest);
	}

	@AfterMethod
	@Parameters({"browser"})
	public void tearDown(ITestResult result,String browser) throws Exception{
		String methodName=result.getMethod().getMethodName();
		if(result.getStatus()==ITestResult.FAILURE){
			String res=result.getThrowable().getMessage();
			Utility.screenshot(driver, methodName+browser,childTest,res);
		}
		
		reporter.endTest(parentTest);
		this.driver.close();

	}


	@AfterSuite
	public void afterSuite(){
		reporter.flush();
		reporter.close();
		Mail_report.send_report();
	}


}
