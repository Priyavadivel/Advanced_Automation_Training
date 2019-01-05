package com.mst.automationtraining.pageobject;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mst.automationtraining.abstractclass.driverclass;
import com.mst.automationtraining.constant.Constant;
import com.mst.automationtraining.customexception.Customexception;
import com.mst.automationtraining.extentreport.ReportGenerator;
import com.mst.automationtraining.utility.Utility;

public class Form101validation extends driverclass {

	// Submit Button
	@FindBy(how = How.XPATH, using = ".//*[@id='j_id0:j_id5:j_id9']/div[1]/div[15]/input")
	public WebElement Submit;

	public void errorvalidation() throws Exception {
		int i;
		String data;

		List<WebElement> forms = driver.findElements(By.className("errorMsg"));
		int count = forms.size();

		for (i = 0; i < count; i++) {

			for (WebElement e : forms) {

				data = e.getText();

				if (data.equals("Error: You must enter a value")) {
					Utility.highlight(e, driver);
				}
				i = count + 1;
			}
			
		}
		
	}

	public static void scroll(WebElement element, WebDriver driver) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(element);
			actions.perform();
		} catch (Exception e) {
			throw new Customexception("Mousehover not performed");
		}
	}

	public Form101validation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
}
