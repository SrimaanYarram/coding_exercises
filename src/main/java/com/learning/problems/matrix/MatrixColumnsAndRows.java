package com.learning.problems.matrix;

public class MatrixColumnsAndRows {
	
	/**
	 * Printing the values columns and Rows instead of Rows and Columns
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int array[][] = {{1,2,3,4}, {4,5,6,7}};
		for(int i=0;i<=array[0].length-1;i++){
			for(int j=0;j<=array.length-1;j++){
				System.out.println(array[j][i]);
			}
		}
	}

}
