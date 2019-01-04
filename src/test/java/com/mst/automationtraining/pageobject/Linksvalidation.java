package com.mst.automationtraining.pageobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.mst.automationtraining.customexception.Customexception;
import com.mst.automationtraining.driver.driverclass;
import com.mst.automationtraining.utility.Utility;

public class Linksvalidation extends driverclass{
	public Linksvalidation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how = How.XPATH, using = "//label[contains(.,'PART OF BODY')]/following::a[2]")
	public WebElement PartofBodyLink;

	public void PartofBodyValue() throws Exception {

		String Expected = "Head - Multiple Head Injury";

		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for(String windowHandle  : handles)
		{
			if(!windowHandle.equals(parentWindow))
			{
				driver.switchTo().window(windowHandle);

				WebElement table = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]")); 

				List<WebElement> rows = table.findElements(By.tagName("tr"));
				int rowscount = rows.size();

				for (int i=0; i<rowscount; i++){
					List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
					int columnscount = columns.size();

					List<WebElement> columns2 = rows.get(i).findElements(By.tagName("span"));
					int columnscount2 = columns2.size();
					for (int k=0; k<columnscount2; k++){

						for(WebElement ele: columns2) {
							String Actual=  ele.getText();

							if(Expected.equals(Actual)) {
								Utility.highlight(ele, driver);
								TimeUnit.MILLISECONDS.sleep(100);
							}
							else {
								Utility.highlightFailedElement(ele, driver);
							}
						}
					}
				}
			}
		}
		driver.switchTo().window(parentWindow);
	}

}




