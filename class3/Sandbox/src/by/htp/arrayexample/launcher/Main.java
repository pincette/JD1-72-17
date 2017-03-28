package by.htp.arrayexample.launcher;

import by.htp.arrayexample.classes.ArrayMethods; 

public class Main {

	public static void main(String[] args) {
		ArrayMethods arrayExample = new ArrayMethods();
		arrayExample.createArray();
		arrayExample.printArray();
		arrayExample.searchMaxValue();
		arrayExample.searchMinValue();
		arrayExample.sortArrayAscend();
		arrayExample.sortArrayDescend();
	} // main
	
} // class
