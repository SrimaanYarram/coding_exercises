package com.learning.searching.BinarySearch;

public class BinarySearch_Recursive {
	
	int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then it can only
			// be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present in right
			// subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present in array
		return -1;
	}
	
	
	private int[] theArray = new int[15];
	private int arraySize =10;

	
	//We are using this function the fill the random values in the array
	public void fillInitalRandomValuesIntoArray(){
		for(int i=0;i<arraySize;i++){
			theArray[i]=(int)(Math.random()*10)+10;
		}
	}
	
	
	public static void main(String args[]){
		BinarySearch_Loops ls = new BinarySearch_Loops();
		ls.fillInitalRandomValuesIntoArray();
		ls.bubbleSort();
		ls.printArrayContents();
		System.out.println(ls.binarySearch(0));
	}

	public void printArrayContents(){
		System.out.println("----------");
		for(int i=0;i<arraySize;i++){
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");
		}
	}
	
	public void bubbleSort(){
		for(int i=arraySize-1;i>1;i--){
			for(int j=0;j<i;j++){
				if(theArray[j]>theArray[j+1]) {  //if(tehArray[j]<tehArray[j+1])  will do descending order
					swapValues(j,j+1);
				}
			}
		}
	}

	private void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}




}
