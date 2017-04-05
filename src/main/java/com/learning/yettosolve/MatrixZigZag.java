package com.learning.yettosolve;

public class MatrixZigZag {
	
	//This is an example of reading a matrix in zig zag way
	// i.e Instead of going with Rows and then columns, we should go as columns and then rows
	//Example : 1, 2           output : 1,3,2,4
	//          3, 4
	public static void main(String args[]){
		int array[][] = {{1,2,3,4}, {4,5,6,7}};
		for(int i=0;i<=array[0].length-1;i++){
			for(int j=0;j<=array.length-1;j++){
				System.out.println(array[j][i]);
			}
		}
		
		
		
	}

}
