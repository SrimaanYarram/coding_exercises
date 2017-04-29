package com.learning.problems.numbers;

import java.util.Scanner;

public class SumOfArray {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	         for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	         in.close();
		     
	        long total=0;
	        
	        for(int i=0;i<arr.length;i++){
	        	total+= arr[i];
	        }
	        System.out.println(total);
	        
	    }

}
