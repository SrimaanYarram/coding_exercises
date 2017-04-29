package com.learning.collections.arrays;

public class ArrayOperations {
	
	
	private int[] array = new int[25];
	
	private int arraySize =15;
	
	//Will Insert at the end of Array
	public void insertValue(int value){
		
		array[arraySize] = value;
		arraySize++;
	}
	
	
	public int getValueAtIndex(int index){
		return array[index]; 		
	}
	
	
	public void deleteValueAtIndex(int index){
		
		for(int i=index;i<array.length-1;i++){
			
			array[i]=array[i+1];
			
			
		}
		
	}
	
	
	public String linearSearch(int value){
		
		String valuesAtIndex="";
		
		for(int i=0;i<arraySize;i++){
			
			if(array[i]==value){
				
				valuesAtIndex+=i+",";
				
			}
		}
		
		if(valuesAtIndex.isEmpty()){
			
			valuesAtIndex="None";
			
		}
		
		return valuesAtIndex;
		
		
	}
	
	public boolean searchValue(int value){
	
		boolean found =false;
		
		for(int i=0;i<arraySize;i++){
			
			if(array[i]==value){
				
				found= true;
				
			}
		}
		return found;
		
		
		
	}
	
	
	public void fillInitalRandomValuesIntoArray(){
		for(int i=0;i<arraySize;i++){
			array[i]=(int)(Math.random()*10)+10;
		}
	}

	public void printArrayContents(){
		System.out.println("----------");
		
			for(int i=0;i<arraySize;i++){
				System.out.print("| " + i + " | ");
				System.out.println(array[i] + " |");
				System.out.println("----------");
				
				
			}
	
			
	}
	
	
	public static void main(String args[]){
		
		ArrayOperations aop = new ArrayOperations();
		aop.fillInitalRandomValuesIntoArray();
		aop.printArrayContents();
		aop.insertValue(10);
		System.out.println(aop.linearSearch(12));
		                                        
	}
}
