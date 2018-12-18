package com.mst.automationtraining.customexception;
/**
 * 
 * @author Priya V
 * Created Date: Dec 5,2018
 * Last modified By: Priya V
 * Purpose of the class: Custom Exception will be thrown
 *
 */

public class Customexception extends RuntimeException {
	
	public Customexception() {}
	
	public Customexception(String message){
       super(message);
    }
}
