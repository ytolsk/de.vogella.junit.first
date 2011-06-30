package de.vogella.junit.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {
	public int multiply(int x, int y) {
		return x + y;
	}
	
	public void readFromFile(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner scan =   new Scanner(file);
		while(scan.hasNext()){
			System.out.print(scan.next());
		}
		
	}
}
