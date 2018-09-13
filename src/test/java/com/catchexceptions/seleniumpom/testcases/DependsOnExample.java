package com.catchexceptions.seleniumpom.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependsOnExample {
	
	@Test(dependsOnMethods = {"method2"})
	public void method1()
	{
		try {
		System.out.println("This is method 1");
		assertEquals(10, 20);
		}
		catch(AssertionError e) {
			System.out.println("Catch block is executed");
		}
	}
	
	@Test
	public void method2()
	
	{
		System.out.println("This is method 2");
	}
	

}
