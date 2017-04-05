package com.learning.problems.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.testng.annotations.Test;

public class SpiralTraversingMatrix {
	
	
	void spiralOrder(int[][] matrix)
	{
	     if(matrix.length == 0)
	         return;
	     // Initialize our four indexes
	     int top = 0;
	     int down = matrix.length - 1;
	     int left = 0;
	     int right = matrix[0].length - 1;
	 
	     while(true)
	     {
	         // Print top row
	         for(int j = left; j <= right; ++j) 
	        	 System.out.print(matrix[top][j] + " ");
	         top++;
	         if(top > down || left > right) break;
	         //Print the rightmost column
	         for(int i = top; i <= down; ++i) 
	        	 System.out.print(matrix[i][right] + " ");
	         right--;
	         if(top > down || left > right) break;
	         //Print the bottom row
	         for(int j = right; j >= left; --j) 
	        	 System.out.print(matrix[down][j] + " ");
	         down--;
	         if(top > down || left > right) break;
	         //Print the leftmost column
	         for(int i = down; i >= top; --i) 
	        	 System.out.print(matrix[i][left] + " ");
	         left++;
	         if(top > down || left > right) break;
	     }
	 }
	
	
	@Test
	public void testSpiralOrder(){
		
		spiralOrder(new int[][]{{1,2,3},{44,55,66},{77,88,99}});
		
		
	}

	    public static void main(String args[])
	    {
	        System.out.println("Enter The Value For N :");
	         
	        Scanner sc = new Scanner(System.in);
	         
	        int n = sc.nextInt();
	         
	        int[][] spiral = new int[n][n];
	         
	        int value = 1;
	         
	        int minCol = 0;
	         
	        int maxCol = n-1;
	         
	        int minRow = 0;
	         
	        int maxRow = n-1;
	         
	        while (value <= n*n)
	        {
	            for (int i = minCol; i <= maxCol; i++)
	            {
	                spiral[minRow][i] = value;
	                     
	                value++;
	            }
	             
	            for (int i = minRow+1; i <= maxRow; i++) 
	            { 
	                spiral[i][maxCol] = value; 
	                 
	                value++; 
	            } 
	             
	            for (int i = maxCol-1; i >= minCol; i--)
	            {
	                spiral[maxRow][i] = value;
	                             
	                value++;
	            }
	             
	            for (int i = maxRow-1; i >= minRow+1; i--) 
	            {
	                spiral[i][minCol] = value;
	                 
	                value++;
	            }
	             
	            minCol++;
	             
	            minRow++;
	             
	            maxCol--;
	             
	            maxRow--;
	        }
	         
	        for (int i = 0; i < spiral.length; i++)
	        {
	            for (int j = 0; j < spiral.length; j++)
	            {
	                System.out.print(spiral[i][j]+ "\t");
	            }
	             
	            System.out.println();
	        }
	    }
	}






