package com.junit.project;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	
	@Before
	public void before() {
		
		System.out.println("Before");
	}

	@Test
	public void sum() {
		
		MyMath myMath = new MyMath();
		
		assertEquals(6, myMath.sum(new int[] {1,2,3})); // alt+Shift+I => to create a inline occurance for a variable.
		
		
		
	}

}
