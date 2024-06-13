package com.staragile.testngproject;

import org.testng.annotations.Test;

public class TestNGDependsOnMethod {
	@Test()
	public void dbconnection() {
		System.out.println("Connected to db");
	}
	@Test(dependsOnMethods = {"dbconnection"})
	public void query1() {
		System.out.println("quary execution");
	}
	

}
