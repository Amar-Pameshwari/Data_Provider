package com.testing.listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampleDemoExample {

	@Test
	public void testOne(){
		System.out.println("I am TestOne");
	}
	
	@Test(dataProvider = "getData")
	public void testGetData(String s) {
		System.out.println("Test GetData method, input = " +s);
	}
	
	@DataProvider
	public Object[] getData() {
		return 	new Object[] {"A","B"};
	}
	
	@Test
	public void testThree(){
		Assert.assertEquals(5, 7);
	}
	
	@Test
	public void testFour(){
		System.out.println("I am testFour");
		throw new SkipException(null);
	}
}


