package com.mst.automationtraining.extentreport;
/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: 
 *
 */

import com.mst.automationtraining.constant.Constant;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportFactory {
	private static ExtentReports reporter;

	public static synchronized ExtentReports getReporter() {
		if (reporter == null) {
			reporter = new ExtentReports(Constant.REPORTPATH, true, DisplayOrder.NEWEST_FIRST);
		}
		return reporter;
	}
}