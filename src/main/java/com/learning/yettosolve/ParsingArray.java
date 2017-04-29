package com.learning.yettosolve;

public class ParsingArray {

	public static void main(String[] args) {

		// int array [] = {1,2,3,4,5,6,7,8,9};
		// int array [] = {9,8,7,6,5,4,3,2,1,-7};
		// int array [] = {9,8,7,6,5,4,3,2,1,7};
		int array [] = {9,8,7,6,-5,4,3,2,1,7};

		int flag = 0; // we will use the flag to decide to increasing order or
						// decreasign order

		for (int i = 1; i < array.length; i++) {
			if (! (array[i - 1] < 0)) {
				if ((array[i - 1] <= array[i]) && (flag == 0)) {
					flag = 0; // we have decided to go increase order
					System.out.println("increasign order" + array[i]);
				} else if (flag == 0) {
					flag = 1;
					System.out.println("Reached into Increase Order");
				}
				
				
				
				if (array[i - 1] >= array[i] && flag == 1) {
					flag = 1;
					System.out.println("decreasing order " + array[i]);
				} else if (flag == 1) {
					flag = -1;
					System.out.println("Reached into Decreasing Order");
				}

			}

		}

	}
}