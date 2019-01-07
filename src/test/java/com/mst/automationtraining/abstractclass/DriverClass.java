package com.mst.automationtraining.abstractclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Priya V 
 * Created Date: Dec 5,2018 
 * Last modified By: Priya V 
 * Purpose of the class: driver class is used to extend the same driver in all the class
 */
public class DriverClass {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Actions action;

	public DriverClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
