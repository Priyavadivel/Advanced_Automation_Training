package com.mst.automationtraining.pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.mst.automationtraining.customexception.Customexception;
import com.mst.automationtraining.driver.driverclass;
import com.mst.automationtraining.excelutility.ExcelUtility;

public class Form101 extends driverclass {

	// Employee Section

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id12:last']")
	public WebElement lastName;

	/*@FindBy(xpath= ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id12:last']")
	public WebElement lastNames;*/
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id15:first']")
	public WebElement firstName;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id20:social']")
	public WebElement socialSecurityNumber;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id23:birth']")
	public WebElement dob;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id26:home']")
	public WebElement homeAddress;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id29:CITY']")
	public WebElement homeCity;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id32:STATE']")
	public WebElement homeState;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id35:ZIPCODE']")
	public WebElement homeZip;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id38:TELEPHONE']")
	public WebElement homePhone;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id41:SEX']")
	public WebElement sex;

	public void sex(String employer_sex) {
		Select elementsex = new Select(sex);
		elementsex.selectByVisibleText(employer_sex);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id43:MARITALSTATUS']")
	public WebElement maritalStatus;

	public void status(String E_maritalStatus) {
		Select elementstatus = new Select(maritalStatus);
		elementstatus.selectByVisibleText(E_maritalStatus);
	}

	// Employer Section
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id45:j_id46:EMPLOYERNAME']")
	public WebElement EmployerName;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id45:j_id49:FEINNUMBER']")
	public WebElement FienNumber;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id45:j_id54:officeadd']")
	public WebElement OfficeAddress;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id45:j_id57:officecity']")
	public WebElement OfficeCity;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id45:j_id60:officstate']")
	public WebElement OfficeState;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id45:j_id63:officzip']")
	public WebElement OfficeZip;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id45:j_id66:telephone']")
	public WebElement OfficePhone;

	
	// Accident Details
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id70:doi']")
	public WebElement DateofInjuiry;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id73:empnotif']")
	public WebElement DateEmployerNotified;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id78:lastday']")
	public WebElement LastDayofWork;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id85:empcontri']")
	public WebElement EmployerOccupation;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id93:empconpre']")
	public WebElement Employerpremises;

	public void InjuryoccuronEmployerpremises_dropdown(String InjuryoccuronEmployerpremises) {
		Select element1 = new Select(Employerpremises);
		element1.selectByVisibleText(InjuryoccuronEmployerpremises);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id106:injurill']")
	public WebElement InjuryorIlleness;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id109:partofbody']")
	public WebElement PartofBodyInjured;

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id118:fatal']")
	public WebElement Fatal;

	public void Fatal_dropdown(String FatalValue) {
		Select element2 = new Select(Fatal);
		element2.selectByVisibleText(FatalValue);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id123:empemergency']")
	public WebElement EmployeeTreated;

	public void EmployeeTreated_dropdown(String ETreated) {
		Select element3 = new Select(EmployeeTreated);
		element3.selectByVisibleText(ETreated);
	}

	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id136:overnight']")
	public WebElement EmployeeHospitalized;

	public void EmployeeHospitalized_dropdown(String EHospitalized) {
		Select element4 = new Select(EmployeeHospitalized);
		element4.selectByVisibleText(EHospitalized);
	}

	@FindBy(xpath = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id149']")
	public WebElement ValidityofClaim_dropdown;

	public void ValidityofClaim_dropdown(String ValidityofClaim) {
		Select element5 = new Select(ValidityofClaim_dropdown);
		element5.selectByVisibleText(ValidityofClaim);
	}
	
	//	Accident Details - PART OF BODY INJURY TABLE - Lookup

	public void clickOnLookup2(String data) throws Exception {

		driver.findElement(By.xpath(".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id111:partofbodyinjury_lkwgt']/img")).click();

		String Parent_Window = driver.getWindowHandle();
		for (String Child_Window : driver.getWindowHandles()) {
			if (!Parent_Window.equals(Child_Window)) {
				driver.switchTo().window(Child_Window);
				driver.switchTo().frame("searchFrame");
				Thread.sleep(1000);

				driver.findElement(By.id("lksrch")).sendKeys("Head");
				driver.findElement(By.name("go")).click();
				Thread.sleep(1000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				WebElement table = driver.findElement(By.xpath("//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody"));
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				int rowscount = rows.size();
				for (int i = 0; i < rowscount; i++) {
					List<WebElement> columns = rows.get(i).findElements(By.tagName("th"));
					int columnscount = columns.size();
					for (int j = 0; j < columnscount; j++) {
						String var1 = columns.get(j).getText();
						System.out.println(var1);
						if (data.equals(var1)) {
							columns.get(j).findElement(By.tagName("a")).click();
							i = rowscount + 1;
							j = columnscount + 1;
						}
					}
				}
			}
		}
		driver.switchTo().window(Parent_Window);
	}
	
	//Cause of Accident section 
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id153:what']")
	public WebElement WhatHappened;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id156:whatsus']")
	public WebElement WhatObject;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id169:empdoing']")
	public WebElement Doing;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id176:datehire']")
	public WebElement DOLastHire;
	
	@FindBy(xpath = ".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id174:workemp']")
	public WebElement Wasworkedemp;

	public void wasworked_Dropdown(String wasempworked) {
		Select elementform = new Select(Wasworkedemp);
		elementform.selectByVisibleText(wasempworked);
	}
	
	// Cause of Accident - NATURE OF INJURY - Lookup
	public void clickOnLookup(String data) throws Exception {

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/span[1]/div[1]/span[1]/a[1]/img[1]")).click();

		String Parent_Window = driver.getWindowHandle();
		for (String Child_Window : driver.getWindowHandles()) {
			if (!Parent_Window.equals(Child_Window)) {
				driver.switchTo().window(Child_Window);
				driver.switchTo().frame("searchFrame");
				Thread.sleep(1000);

				driver.findElement(By.id("lksrch")).sendKeys("Specific");
				driver.findElement(By.name("go")).click();
				Thread.sleep(1000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				WebElement table = driver.findElement(By.xpath("//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody"));
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				int rowscount = rows.size();
				for (int i = 0; i < rowscount; i++) {
					List<WebElement> columns = rows.get(i).findElements(By.tagName("th"));
					int columnscount = columns.size();
					for (int j = 0; j < columnscount; j++) {
						String var1 = columns.get(j).getText();
						System.out.println(var1);
						if (data.equals(var1)) {
							columns.get(j).findElement(By.tagName("a")).click();
							i = rowscount + 1;
							j = columnscount + 1;
						}
					}
				}
			}
		}
		driver.switchTo().window(Parent_Window);
	}
	
	//Cause of Accident - CAUSE OF INJURY - Lookup
	public void clickOnLookup1(String data) throws Exception {

		driver.findElement(By.xpath(".//*[@id='j_id0:j_id5:j_id9:j_id152:j_id164:cause_lkwgt']/img")).click();

		String Parent_Window = driver.getWindowHandle();
		for (String Child_Window : driver.getWindowHandles()) {
			if (!Parent_Window.equals(Child_Window)) {
				driver.switchTo().window(Child_Window);
				driver.switchTo().frame("searchFrame");
				Thread.sleep(1000);

				driver.findElement(By.id("lksrch")).sendKeys("Motor");
				driver.findElement(By.name("go")).click();
				Thread.sleep(1000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame("resultsFrame");
				WebElement table = driver.findElement(By.xpath("//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody"));
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				int rowscount = rows.size();
				for (int i = 0; i < rowscount; i++) {
					List<WebElement> columns = rows.get(i).findElements(By.tagName("th"));
					int columnscount = columns.size();
					for (int j = 0; j < columnscount; j++) {
						String var1 = columns.get(j).getText();
						System.out.println(var1);
						if (data.equals(var1)) {
							columns.get(j).findElement(By.tagName("a")).click();
							i = rowscount + 1;
							j = columnscount + 1;
						}
					}
				}
			}
		}
		driver.switchTo().window(Parent_Window);
	}
	
	
	//EMPLOYEE'S WAGE DATA Section
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id178:j_id197:datehire']")
	public WebElement GrossEarnings;
	
	//AUTHORIZED SIGNATURE Section
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id224:j_id225:subemail']")
	public WebElement SubmitterEmail;
	
	//Agree Terms
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id242']/div/table/tbody/tr[2]/td/input")
	public WebElement Agree;
	
	//Submit Button
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9']/div[1]/div[15]/input")
	public WebElement Submit;
	
	 public void Verify() throws Exception{
		 try{
	   
		 WebElement element = driver.findElement(By.xpath(".//*[@id='j_id0:j_id2:j_id3']/div/table/tbody/tr/td/p"));
		 String expected = "Thank you for your submission!";
		 String actual = element.getText();
                  if(actual.equals(expected)){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("Actual Value:" +actual);
            System.out.println("Expected Value:" +expected);
           
         }
         else{
        	 throw new Customexception("The value "+actual+"is not matched with the given value "+expected);
        	 
        	 
         }
        	 
         }
        catch(Exception E){
        	throw E;
        }
	 }


	

	public Form101(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
}
