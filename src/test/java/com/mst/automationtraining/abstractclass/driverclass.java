package com.mst.automationtraining.abstractclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class driverclass {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Actions action;

	public driverclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
