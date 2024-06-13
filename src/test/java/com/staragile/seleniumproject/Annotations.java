package com.staragile.seleniumproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	@Test
	public void testcase1() {
		System.out.println("Testcase1 is executed");
	}


@Test
public void testcase2() {
	System.out.println("Testcase2 is executed");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("Launching of the browser");
	
}
@AfterMethod
public void aftermethod() {
	System.out.println("Closing of the browser");
}
@BeforeClass
public void beforeclass() {
	System.out.println("DB connection is opened");
}
@AfterClass
public void afterclass() {
	System.out.println("DB connection is closed");
}
}
