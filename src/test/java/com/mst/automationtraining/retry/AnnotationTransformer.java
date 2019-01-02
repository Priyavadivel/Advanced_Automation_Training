package com.mst.automationtraining.retry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method; 

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.mst.automationtraining.retry.RetryAnalyser.RetryAnalyzer;

public class AnnotationTransformer implements IAnnotationTransformer{

		
		public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
			annotation.setRetryAnalyzer(RetryAnalyzer.class);
		}
	}
