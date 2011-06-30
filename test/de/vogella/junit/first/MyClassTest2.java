package de.vogella.junit.first;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class MyClassTest2 {

@Test(expected=FileNotFoundException.class)
	
	public void testFile()throws FileNotFoundException{
		MyClass tester2 = new MyClass();
		tester2.readFromFile("lala.txt");
	}
}
