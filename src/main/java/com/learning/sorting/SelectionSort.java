package com.learning.sorting;

public class SelectionSort {

	private int[] theArray = new int[25];

	private int arraySize = 15;

	public void fillInitalRandomValuesIntoArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void selectionSort() {
	
		for (int i = 0; i < arraySize; i++) {
			int min = i;
			for (int j = i; j < arraySize; j++) {
				if (theArray[j] < theArray[min]) {
					min = j;
				}
			}
			swapValues(i, min);
			
			printHorzArray(i, -1);
		}
	}

	private void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

	public void printHorzArray(int i, int j) {

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + n + "  ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + theArray[n] + " ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		// END OF FIRST PART

		// ADDED FOR BUBBLE SORT

		if (j != -1) {

			// ADD THE +2 TO FIX SPACING

			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");

			System.out.print(j);

		}

		// THEN ADD THIS CODE

		if (i != -1) {

			// ADD THE -1 TO FIX SPACING

			for (int l = 0; l < (5 * (i - j) - 1); l++)
				System.out.print(" ");

			System.out.print(i);

		}

		System.out.println();

	}

	public static void main(String args[]) {

		SelectionSort bs = new SelectionSort();

		bs.fillInitalRandomValuesIntoArray();

		long before = System.nanoTime();

		System.err.println("Before: " + before);

		bs.selectionSort();


		long after = System.nanoTime();

		System.err.println("After: " + after);

		float f = (after - before) / 1000000000;

		System.err.println("Total Time took " + f);

	}

}
