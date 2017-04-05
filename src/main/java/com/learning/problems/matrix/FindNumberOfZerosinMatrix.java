package com.learning.problems.matrix;

public class FindNumberOfZerosinMatrix {
	
	static int array[][] = {{0,0,1},{0,1,1,1},{1,1,1}};
	
	public static void main(String args[]){
		int count = 0;
		for(int i=0;i<array.length;i++){
			count =0;
			for(int j=0;j<array.length;j++){
				if(array[i][j]!=0){
					break;
				}
				count ++;
			}
			System.out.println("Row =" + i + " Found Zeros = " + count);
		}
	}

}
