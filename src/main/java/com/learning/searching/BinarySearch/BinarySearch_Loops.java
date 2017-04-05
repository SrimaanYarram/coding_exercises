package com.learning.searching.BinarySearch;

public class BinarySearch_Loops {


	private int[] theArray = new int[15];
	private int arraySize =10;

	
	//We are using this function the fill the random values in the array
	public void fillInitalRandomValuesIntoArray(){
		for(int i=0;i<arraySize;i++){
			theArray[i]=(int)(Math.random()*10)+10;
		}
	}
	
	
	
	

public int binarySearch(int value) {
	int lowIndex = 0;
	int highIndex = arraySize - 1;
	while (lowIndex <= highIndex) {
		
		int middleIndex = (highIndex + lowIndex) / 2;
		System.out.println("-------------------------before-------------------------------");
		System.out.println("lowIndex=" + lowIndex);
		System.out.println("middle=" + middleIndex);
		System.out.println("highIndex=" + highIndex);
		System.out.println("value=" + value);
		System.out.println("theArray[middleIndex]=" + theArray[middleIndex]);
		
		System.out.println("-------------------------After-------------------------------");
		
		if ( value <theArray[middleIndex] ) {  //assuming that value is 15 and first time theArray[middleIndex] is 12
			lowIndex = middleIndex + 1;
			System.out.println("lowindex");
		} else if ( value > theArray[middleIndex] ) {
			highIndex = middleIndex - 1;
			System.out.println("highindex");
	} else if (theArray[middleIndex] == value) {
			return middleIndex;
	}
		System.out.println("lowIndex=" + lowIndex);
		System.out.println("middle=" + middleIndex);
		System.out.println("highIndex=" + highIndex);
		System.out.println("value=" + value);
		
	}
		return -1;
}

	public static void main(String args[]){
		BinarySearch_Loops ls = new BinarySearch_Loops();
		ls.fillInitalRandomValuesIntoArray();
		ls.bubbleSort();
		ls.printArrayContents();
		System.out.println(ls.binarySearch(15));
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
