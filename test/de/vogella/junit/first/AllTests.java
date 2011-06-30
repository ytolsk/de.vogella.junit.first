package de.vogella.junit.first;

import junit.framework.Test;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { MyClassTest.class,MyClassTest2.class })

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for de.vogella.junit.first");
		suite.addTest((Test) new MyClassTest());
		suite.addTest( (Test) new MyClassTest2());
		
		//$JUnit-BEGIN$

		

		
		//$JUnit-END$
		return suite;
	}

}
