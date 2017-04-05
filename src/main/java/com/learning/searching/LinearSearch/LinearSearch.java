package com.learning.searching.LinearSearch;



public class LinearSearch {

	private int[] theArray = new int[15];
	private int arraySize =10;
	
	public void fillInitalRandomValuesIntoArray(){
		for(int i=0;i<arraySize;i++){
			theArray[i]=(int)(Math.random()*10)+10;
		}
	}
	
	
	public String linearSearch(int search){
		String searchIndex = "";
		for(int i=0;i<=arraySize;i++){
			if(theArray[i]==search){
				searchIndex+=i+",";
			}
		}
		return searchIndex;
	}
	
	
	public static void main(String args[]){
		LinearSearch ls = new LinearSearch();
		ls.fillInitalRandomValuesIntoArray();
		ls.printArrayContents();
		System.out.println(ls.linearSearch(12));
	}
	
	public void printArrayContents(){
		System.out.println("----------");
			for(int i=0;i<arraySize;i++){
				System.out.print("| " + i + " | ");
				System.out.println(theArray[i] + " |");
				System.out.println("----------");
			}
	}
	
	

}
