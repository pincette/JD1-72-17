package by.htp.arrayexample.classes;

import java.util.Scanner;

public class ArrayMethods extends Array {
	Scanner sc = new Scanner(System.in);

	public void createArray() { // degradation }8-E
		System.out.println("Enter array elements or type \"stop\" to view results...");
		while (sc.hasNextLine()) {
			String arrayInput = sc.nextLine();
			if (arrayInput.matches("stop")) {
				increaseArraySize(true);
				return;
			} else if (arrayInput.matches("[-\\d].*")) {
				array[arrayIndex] = Integer.parseInt(arrayInput);
				arrayTrueLength++;
				/* MOBILE DEBUGGER !!!!!! */ 
				 System.out.println("Array Index: \"" + arrayIndex + "\"| Array Length: \"" + arrayLength + 
				 "\"| Array True Length: \"" + arrayTrueLength + "\"| Input: \"" +
				 array[arrayIndex] + "\"");
				 /*  MOBILE DEBUGGER !!!!!! */ 
				arrayIndex++;
				if (arrayIndex >= arrayLength - arrayIncreaseThreshold) {
					increaseArraySize(false);
				}
			} else {
				System.out.println("wrong input!");
			}
		}
	} // createArray;

	public void printArray() {
		if (array == null || arrayLength == 0) {
			someRelatedException();
		}
		System.out.print("Current array:");
		for (arrayIndex = 0; arrayIndex < arrayTrueLength; arrayIndex++) {
			System.out.print(" " + array[arrayIndex]);
		}
		System.out.println();
	} // printArray

	public void sortArrayAscend() {
		if (array == null || arrayLength == 0) {
			someRelatedException();
		}
		int a, b = 0;
		for (int i = 0; i < arrayLength; i++) {
			for (arrayIndex = 0; arrayIndex < arrayLength - 1; arrayIndex++) {
				a = array[arrayIndex];
				b = array[arrayIndex + 1];
				if (a > b) {
					array[arrayIndex] = b;
					array[arrayIndex + 1] = a;
				}
			}
		}
		System.out.print("Ascending sorting - ");
		printArray();
	} // sortArrayAscend

	public void sortArrayDescend() {
		if (array == null || arrayLength == 0) {
			someRelatedException();
		}
		int a, b = 0;
		for (int i = 0; i < arrayLength; i++) {
			for (arrayIndex = 0; arrayIndex < arrayLength - 1; arrayIndex++) {
				a = array[arrayIndex];
				b = array[arrayIndex + 1];
				if (a < b) {
					array[arrayIndex] = b;
					array[arrayIndex + 1] = a;
				}
			}
		}
		System.out.print("Descending sorting - ");
		printArray();
	} // sortArrayDescend

	public void searchMaxValue() {
		if (array == null || arrayLength == 0) {
			someRelatedException();
		}
		int maxValue = array[0];
		for (arrayIndex = 0; arrayIndex < arrayLength; arrayIndex++) {
			if (array[arrayIndex] > maxValue) {
				maxValue = array[arrayIndex];
			}
		}
		System.out.println("Max value: " + maxValue);
	} // searchMaxValue

	public void searchMinValue() {
		if (array == null || arrayLength == 0) {
			someRelatedException();
		}
		int minValue = array[0];
		for (arrayIndex = 0; arrayIndex < arrayLength; arrayIndex++) {
			if (array[arrayIndex] < minValue) {
				minValue = array[arrayIndex];
			}
		}
		System.out.println("Min value: " + minValue);
	} // searchMinValue

	void increaseArraySize(boolean enough) {
		if (enough) {
			arrayLength = arrayTrueLength;
		} else {
			arrayLength = arrayLength + arrayIncreaseSize;
		}
		if (switchArray) {
			int[] array2 = new int[arrayLength];
			for (int i = 0; i < arrayIndex; i++) {
				array2[i] = array[i];
			}
			switchArray = false;
			array = array2;
		} else {
			int[] array1 = new int[arrayLength];
			for (int i = 0; i < arrayIndex; i++) {
				array1[i] = array[i];
			}
			switchArray = true;
			array = array1;
		}
	}

	void someRelatedException() {
		System.out.println("SURPRISE!");
		java.lang.System.exit(13);
	}

} // class
