package de.vogella.junit.first;

import java.io.FileNotFoundException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class MyClassTest {

	@Test
	
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}
	
	
}
