package com.mst.automationtraining.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Form101 {
	
	//Employee Section
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id12:last']")
	public WebElement lastName; 
	
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
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id41:SEX']//option[3]")
	public WebElement sex; 	
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id11:j_id43:MARITALSTATUS']//Option[2]")
	public WebElement maritalStatus; 	
	
	//Employer
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
	
	public void InjuryoccuronEmployerpremises_dropdown(String InjuryoccuronEmployerpremises){
	Select element1 = new Select(Employerpremises);
	element1.selectByVisibleText(InjuryoccuronEmployerpremises);}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id106:injurill']")
	public WebElement InjuryorIlleness;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id109:partofbody']")
	public WebElement PartofBodyInjured;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id118:fatal']")
	public WebElement Fatal;
	
	public void Fatal_dropdown(String FatalValue){
    Select element2 = new Select(Fatal);
	element2.selectByVisibleText(FatalValue);}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id123:empemergency']")
	public WebElement EmployeeTreated;
	
	public void EmployeeTreated_dropdown(String ETreated){
	Select element3 = new Select(EmployeeTreated);
	element3.selectByVisibleText(ETreated);}
	
	
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id136:overnight']")
	public WebElement EmployeeHospitalized;
	
    public void EmployeeHospitalized_dropdown(String EHospitalized){
	Select element4 = new Select(EmployeeHospitalized);
	element4.selectByVisibleText(EHospitalized);
    }
	
	//@FindBy(xpath = "//span[text()='First Name']/following::span[1]")
	//public WebElement claimantFirstName;
 
	@FindBy(xpath = ".//*[@id='j_id0:j_id5:j_id9:j_id69:j_id149']")
	public WebElement ValidityofClaim_dropdown ; 
	
    public void ValidityofClaim_dropdown(String ValidityofClaim){
	Select element5 = new Select(ValidityofClaim_dropdown);
	element5.selectByVisibleText(ValidityofClaim);
	} 
		 
	
	//Lookup pending in this section
	
	
}
