package com.staragile.testngproject;

import org.testng.annotations.Test;

public class TestngPriority {
	@Test(priority = 0, enabled = false)
	public void TestCase1() {
		System.out.println("testcase1 is executed");
	}

	@Test(priority = 2)
	public void TestCase2() {
		System.out.println("Testcase2 is executed");

	}

	@Test(priority = 1)
	public void TestCase3() {
		System.out.println("Testcase3 is executed");

	}

	@Test(priority = 3)
	public void TestCase4() {
		System.out.println("Testcase4 is executed");

	}

}
